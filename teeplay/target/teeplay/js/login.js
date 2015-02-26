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
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {}
    });
};