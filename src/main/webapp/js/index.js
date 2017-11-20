
var Datago = Datago || {} ;



Datago.redirect = (function() {
	var q = $("#q").val();
	if($.trim(q) == ''){
		return;
	}
	window.location.href = Datago.search_page + "?q=" + q + "&productId=&productName=&categoryId=&categoryName=";
});


Datago.init = (function() {
	Datago.search_page = 'http://' + window.location.host + "/kmportal/search.html";
	$("#q").focus();
	$('#search').click(Datago.redirect);
	$("#q").keydown(function() {
        if (event.keyCode == "13") {
        	Datago.redirect();
        }
    });
});

Datago.init();

