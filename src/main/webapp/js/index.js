
var Datago = Datago || {} ;



Datago.redirect = (function() {
	var q = $("#q").val();
	if($.trim(q) == ''){
		return;
	}
	window.location.href = Datago.search_page + "?q=" + q;
});


Datago.init = (function() {
	Datago.search_page = 'http://' + window.location.host + "/datago/search.html";
	$("#q").focus();
	$('#search').click(Datago.redirect);
	$("#q").keydown(function() {
        if (event.keyCode == "13") {
        	Datago.redirect();
        }
    });
});

Datago.init();

