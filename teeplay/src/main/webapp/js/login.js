function login() {
    $.ajax({
        type: "POST",
        dataType: "json",
        data: $("#loginForm").serialize(),
        url: "/login",
        success: function(data) {
            if(data.success == true){
            		$("#logininfo").hide();
            		$("#userinfo").show();
            		var name = $.cookie("teeplay_cookie_username");
            		alert(name);
            }
            alert(data.message);
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {}
    });
};