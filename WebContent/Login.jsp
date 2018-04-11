<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="http://getbootstrap.com/docs-assets/ico/favicon.png">
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
    <title>Signin</title>

    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <style>
    body {
      background-image: url(https://i.ytimg.com/vi/1MPRbX7ACh8/maxresdefault.jpg);
      background-size: 1600px;
      background-repeat: no-repeat; 
    }
    h1 {
        color: aqua;
        text-align: center;
    }
    .form-signin {
      max-width: 330px;
      padding: 25px;
      margin: 0 auto;
    }
    .form-signin .form-signin-heading,
    .form-signin .checkbox {
      margin-bottom: 10px;
    }
    .form-signin .checkbox {
      font-weight: normal;
    }
    .form-signin .form-control {
      position: relative;
      font-size: 16px;
      height: auto;
      padding: 10px;
      -webkit-box-sizing: border-box;
         -moz-box-sizing: border-box;
              box-sizing: border-box;
    }
    .form-signin .form-control:focus {
      z-index: 2;
    }
    .form-signin input[type="text"] {
      margin-bottom: -1px;
      border-bottom-left-radius: 0;
      border-bottom-right-radius: 0;
    }
    .form-signin input[type="password"] {
      margin-bottom: 10px;
      border-top-left-radius: 0;
      border-top-right-radius: 0;
    }
    .nowrap {
	  white-space: nowrap ;
	}
	input[type="checkbox"] {
    
	    display:block;
	}

	label {
	    cursor: pointer;
	    color: white;
	    padding: 0px;
	    margin: 1px;
	}
    </style>

  </head>

  <body>
  	<h1 ><span class="nowrap">MEDICAL INVENTORY MANAGEMENT SYSTEM</span></h1>
    <div class="container">

      <form class="form-signin" action="Controller.jsp" method="post">
        <h1 class="form-signin-heading"></h1>
        <input type="text" name="uname" class="form-control" placeholder="USERNAME" required autofocus>
        <input type="password" name="pass" class="form-control" placeholder="PASSWORD" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me">Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div>

  </body>

</html>