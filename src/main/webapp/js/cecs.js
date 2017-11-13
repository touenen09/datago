var CECS = CECS || {} ;

CECS.createAppLink = (function() {
	var docId = '';
	var url = location.search;
	if (url.indexOf('?') != -1) {
		docId = url.substr(1);
	}

	var reqBody = {
		"assignedUser": CECS.userId,
		"role": "downloader"
	};

	$.ajax({
			type: "POST",
			async:false,
			crossDomain: true,
			headers: {
				'Authorization': CECS.cec_token,
				'Accept':' application/json',
			},
			url: CECS.applink_api + docId,
			dataType:'json',
			data: JSON.stringify(reqBody),
			success: function(response) {
				$('#applink_iframe').attr("src", response.appLinkUrl);
				CECS.appLink =  response;
			},
			error:function(obj) {
				console.log(obj.responseText);
				layer.open({content: 'open document failed'});
			}
		});
});

CECS.init = (function() {
	CECS.cec_token = "Basic c2hhcm9uLmxpQG9yYWNsZS5jb206UDNyZjNjNGRAeSE="; //admin user
	CECS.applink_api = 'https://testenvjp-a18025.documents.us2.oraclecloud.com/documents/api/1.2/applinks/file/';
	CECS.userId = 'U585833E08296360C660BCCBDC5412FC8BB6'; // normal user
	CECS.appLink = '';

	CECS.createAppLink();

	function OnMessage (evt) {
		if (evt.data.message === 'appLinkReady') {
			
			var iframe= $('#applink_iframe')[0];
			var iframewindow= iframe.contentWindow ? iframe.contentWindow : iframe.contentDocument.defaultView;

			var msg = {
				message: 'setAppLinkTokens',
				appLinkRefreshToken:CECS.appLink.refreshToken,
				appLinkAccessToken:CECS.appLink.accessToken,
				appLinkRoleName:CECS.appLink.role,
				embedPreview: true
			}

			iframewindow.postMessage(msg, '*');
 		}
	};
	window.addEventListener && window.addEventListener('message', OnMessage, false);
});

CECS.init();
