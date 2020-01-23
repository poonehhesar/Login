<%@page import="a.Package.aBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Stylesheet.css" />
</head>
<body>

<p> </p>


<%


aBean bean=(aBean)request.getAttribute("bean"); 
String img = bean.getImg();

String profilePic = ("profilePic");
	out.print("<img src=\""+img+".jpg\">" +bean.getName());


  
    %>	
	
	
	


