<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="txt/html; charset= UTF-8">
<link href="style.css" rel="stylesheet" type= "text/css">
	
<title>Check weather </title>
</head>
<body>
	<div id= "container"> 
		<form action="weathercheck"  method="post">
		
			<label> Choose city to check the weather </label><br/>
			<label> Warsaw 			<input type ="radio" name="cityName" value="Warsaw" required> </label><br/>
			<label> Gdansk 			<input type ="radio" name="cityName" value="Gdansk" required> </label><br/>
			<label> Cracow 			<input type ="radio" name="cityName" value="Cracow" required> </label><br/>
			<label> Wroclaw 		<input type ="radio" name="cityName" value="Wroclaw" required> </label><br/>
			<label> Poznan			<input type ="radio" name="cityName" value="Poznan" required> </label><br/>
			<label> Lodz			<input type ="radio" name="cityName" value="Lodz" 	required> </label><br/>
			<label> Katowice		<input type ="radio" name="cityName" value="Katowice" required> </label><br/>
			<input type="submit" name="send" value="wyślij">
		</form>
	</div>



</body>
</html>