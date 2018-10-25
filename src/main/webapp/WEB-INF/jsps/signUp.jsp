<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="ISO-8859-1"> -->
<meta name="viewport" content="width=device-width,initial-scale=1" />
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
	integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
	crossorigin="anonymous">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	
<title>Sign up</title>
</head>
<body>
	<div class="container">
		<div class="logo"></div>
		<div class="header"></div>
		<div class="content">
			<div class="div-content">
				<div class="row">
					<div class="col-sm-6">
						Email: <input id="email" type="text" name="Email" value=""><br>
						Password: <input id="password" type="text" name="Password" value=""><br>
						Securiry code: <input id="securityCode" type="text" name="SecuriryCode" value=""><br>
						Retype code: <input type="text" name="" value=""><br>
					</div>
					<div class="col-sm-6">
						Full name: <input id="fullName" type="text" name="Fullname" value=""><br>
						CMND: <input id="cmnd" type="text" name="CMND" value=""><br>
						Birthday (date and time): <input id="birthDay" type="date" name="bdaytime" value="">
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6">
						Presenter Name: <input id="presentName" type="text" name="presenterName" value=""><br>
						Presenter Link: <input id="presentLink" type="text" name="presenterLink" value=""><br>
					</div>
					<div class="col-sm-6">Create USDT GO</div>
				</div>
				<div class="div-submit">
					<button type="submit" id="submit" value="Submit">Submit</button>
				</div>
			</div>
		</div>
		<div class="footer"></div>
	</div>
	<style>
.container {
	width: 100%;
	margin: 0 auto;
}

.logo {
	width: 100%;
	float: left;
	margin: 0 auto;
}

.header {
	width: 100%;
	float: left;
	margin: 0 auto;
}

.content {
	width: 100%;
	float: left;
	margin: 0 auto;
}

.div-content {
	width: 80%;
	margin: 0 auto;
}

.footer {
	width: 100%;
	float: left;
	margin: 0 auto;
}
</style>
	<script>
	$("#submit").click(function(){
        var user = {
        		email: $("#email").val(),
                password:$("#password").val(),
                securityCode:$("#securityCode").val(),
                fullName:$("#fullName").val(),
                id:$("#cmnd").val(),
                birthDay:$("#birthDay").val(),
                presentName:$("#presentName").val(),
                presentLink:$("#presentLink").val()
        }
		console.log(user);
        $.ajax({
            url: '/signUp',
            type: 'POST',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
            	console.log(data);
            },
            data: JSON.stringify(user)
        });
    });
	</script>
</body>
</html>