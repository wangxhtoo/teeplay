function login() {
    $.ajax({
        type: "POST",
        dataType: "json",
        data: $("#loginForm").serialize(),
        url: "/login",
        success: function(data) {
            alert(data);
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {}
    });
};