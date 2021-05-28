<%-- 
    Document   : conteo
    Created on : 19-may-2020, 20:13:20
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conteo</title>
        <style type="text/css">
         .controls {
               width: 100%;
               background: #eafcfc;
               padding: 10px; 
               border-radius: 4px;
               margin-bottom: 16px;
               border: 1px solid #1f53c5;
               font-family: 'calibri';
               font-size: 18px;
                   
           }
          
        body{
               margin: 0;
               padding: 0;
               position: absolute;
               overflow: hidden;
               height: 100vh;
               background-image: url(fondo.jpg);

           }
           
           
          .form-register{
               width: 400px;
               background: #eafcfc;
               padding: 30px;
               margin: auto;
               margin-top: 100px;
               margin-left: 350px;
               border-radius: 4px;
               font-family: 'calibir';
               color: black;
               box-shadow: 7px 13px 37px #000;
           }
           
          .form-register .boton{
               width: 100%;
               background: #000;
               border-radius: none;
               color: white;
               margin: 16px 0;
               font-size: 18px;
           }
           
           h1{
               margin-left: 60px;
               font-size: 70px;
               font-family: 'rockwell';
           }
           
        </style>
    
    </head>
    <body>
    <h1>INFORME DE CONTEO DE SINTOMAS</h1>
    <form method="post" action="index.jsp" class="form-register">
        <input type="text" class="controls" name="fibre" value="<c:out value="${fiebre}"/>" readonly="">
        <input type="text" class="controls" name="toz" value="<c:out value="${toz}"/>" readonly="">
        <input type="text" class="controls" name="cansancio" value="<c:out value="${cansancio}"/>" readonly="">
        <input type="text" class="controls" name="dolor" value="<c:out value="${dolor}"/>" readonly="">
        <input type="text" class="controls" name="dResperirar" value="<c:out value="${dResperirar}"/>" readonly="">
    <input class="boton" type="submit" value="Ir al inicio">
    </form>  
    </body>
</html> 
