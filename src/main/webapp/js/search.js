
var Datago = Datago || {} ;

Datago.getParam = (function(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return decodeURI(r[2]);
	return null;
});

Datago.createSid = (function() {
  return 'xxxxxxxx-xxxx-4xxx-yxxx'.replace(/[xy]/g, function(c) {
    var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
    return v.toString(16);
  });
});

Datago.search = (function() {
	var q = Datago.getParam('q');
	if(q == null || $.trim(q) == ''){
		return;
	}
	$("#q").val(q);
	Datago.log('search_by_keywords', q);
	
	layer.open({
	    type: 2
	    ,content: 'Searching'
	});
	
	// document
//	$.ajax({
//	   type: "GET",
//	   url: Datago.document_api + "?q=" + q,
//	   dataType:'json',
//	   success: function(res){
//			// result
//		   $("#document-content").setTemplateElement("document-template");
//			$("#document-content").processTemplate(res);
//			
//			// result count
//			var	result_info = '0 results';
//			if(res && res.documents){
//				result_info =  res.documents.length + ' results';
//			}
//			$("#document-info").html(result_info);
//	   },
//	   error:function(){
//		   layer.open({content: 'search document failed'});
//	   }
//	});

	
	$.ajax({
	   type: "GET",
	   async:false,
	   crossDomain: true,
	   headers: {
			'Authorization': Datago.cec_token,
			'Accept':' application/json',
				},
	   url: Datago.document_api + "?fulltext=" + q,
	   dataType:'json',
	   success: function(res){
			// result
		   $("#document-content").setTemplateElement("document-template");
			$("#document-content").processTemplate(res);
			
			// result count
			var	result_info = '0 results';
			if(res && res.count > 0){
				var len = 0;
				for (var i = 0; i < res.count; i++) {
					if(res.items[i].type == "file") len ++;
				}
//				debugger
				result_info =  len + ' results';
			}
			$("#document-info").html(result_info);
	   },
	   error:function(){
		   layer.open({content: 'search document failed'});
	   }
	});
	
	
	// faq
	$.ajax({
		type: "GET",
		url: Datago.faq_api + "?q=" + q,
		dataType:'json',
		success: function(res){
			// result
			$("#faq-content").setTemplateElement("faq-template");
			$("#faq-content").processTemplate(res);
			
			// result count
			var	result_info = '0 results';
			if(res && res.faqs){
				result_info = res.faqs.length + ' results';
			}
			$("#faq-info").html(result_info);
			layer.closeAll();
		},
		error:function(){
			layer.closeAll();
			layer.open({content: 'search faq failed'});
		}
	});
	// suggest
	$.ajax({
		type: "GET",
		url: Datago.suggest_api + "?q=" + q,
		dataType:'json',
		success: function(res){
			// result
			$("#suggest-content").setTemplateElement("suggest-template");
			$("#suggest-content").processTemplate(res);
			
			// result count
			var	result_info = '0 results';
			if(res && res.suggests){
				result_info = res.suggests.length + ' results';
			}
			$("#suggest-info").html(result_info);
			layer.closeAll();
		},
		error:function(){
			layer.closeAll();
			layer.open({content: 'search suggest failed'});
		}
	});
});

Datago.redirect = (function() {
	var q = $("#q").val();
	if($.trim(q) == ''){
		return;
	}
	window.location.href = Datago.search_page + "?q=" + q + "&sid=" + Datago.sid;
});

//Datago.clickDocument = (function(obj) {
//	var docId = $(obj).attr("docId");
//	var url = $(obj).attr("url");
//	console.log('click document:' + docId);
//	window.open(url);
//	Datago.log('select_doc', docId);
//});


Datago.downloadDocument = (function(obj) {
	var docId = $(obj).attr("docId");
	var url = '';
	console.log('download document:' + docId);
	$.ajax({
		   type: "GET",
		   url: Datago.download_api  + "?q=" +  docId,
		   dataType:'json',
		   success: function(res){
			   if(res && res.url){
				   url = 'http://' + window.location.host + '/datago' + res.url;
				   window.open(url);
			   }
		   },
		   error:function(){
			   layer.open({content: 'download document failed'});
		   }
		});

	
	Datago.log('select_doc', docId);
});


Datago.clickDocument = (function(obj) {
	var docId = $(obj).attr("docId");
	var url = '';
	console.log('click document:' + docId);

	window.open('http://' + window.location.host + "/datago/file_preview.html?" + docId);

//	$.ajax({
//		   type: "GET",
//		   async:false,
//		   crossDomain: true,
//		   headers: {
//				'Authorization': Datago.token,
//				'Accept':' application/json',
//					},
//		   url: Datago.preview_doc_req + docId +'/previewPath',
//		   dataType:'json',
//		   success: function(res){
//			   if(res && res.previewUrl){
//				   url = res.previewUrl;
//			   }
//		   },
//		   error:function(){
//			   layer.open({content: 'open document failed'});
//		   }
//		});
//
//	window.open(url);
	Datago.log('select_doc', docId);
});

Datago.clickFaq = (function(obj) {
	var faqId = $(obj).attr("faqId");
	var url = $(obj).attr("url");
	console.log('click faq:' + faqId);
	window.open(url);
	Datago.log('select_faq', faqId);
});

Datago.clickSuggest = (function(obj) {
	var associatedKeyword = $(obj).attr("associatedKeyword");
	console.log('click suggest:' + associatedKeyword);
	Datago.log('select_suggestion', associatedKeyword);
	window.location.href = Datago.search_page + "?q=" + associatedKeyword + "&sid=" + Datago.sid;
});

Datago.clickFaqPage = (function(obj) {
	var q = $("#q").val();
	console.log('click faq page');
	window.open(Datago.faq_page + q);
	Datago.log('move_to_faq_list', q);
});

Datago.log = (function(type, value) {
	var json = JSON.stringify({sid:Datago.sid, type: type, value: value});
	console.log('log:' + json);
	$.ajax({
		type:"POST",
		url:Datago.log_api,
		contentType:"application/json",
		data:json
	});
});


Datago.init = (function() {
	Datago.search_page = 'http://' + window.location.host + '/datago/search.html';
//	Datago.document_api = 'http://' + window.location.host + '/datago/api/document';
	Datago.download_api = 'http://' + window.location.host + '/datago/api/document/download';
	Datago.document_api = 'https://testenvjp-a18025.documents.us2.oraclecloud.com/documents/api/1.2/folders/search/items';
	Datago.faq_api = 'http://' + window.location.host + '/datago/api/faq';
	Datago.suggest_api = 'http://' + window.location.host + '/datago/api/suggest';
	Datago.faq_page = 'https://rnowgse00537-jp.rightnowdemo.com/app/answers/list/kw/';
	Datago.cec_token = "Basic c2hhcm9uLmxpQG9yYWNsZS5jb206UDNyZjNjNGRAeSE=";
//	Datago.preview_doc_req = 'https://testenvjp-a18025.documents.us2.oraclecloud.com/documents/api/1.2/files/';
	Datago.log_api = 'http://' + window.location.host + '/datago/api/log';
	Datago.sid = Datago.getParam('sid');
	if(!Datago.sid){
		Datago.sid = Datago.createSid();
	}
	Datago.search();
	$("#q").focus();
	$('#search').click(Datago.redirect);
	$("#q").keydown(function() {
        if (event.keyCode == "13") {
        	Datago.redirect();
        }
    });
});

Datago.init();

