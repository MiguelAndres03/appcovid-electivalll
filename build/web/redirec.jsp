<%-- 
    Document   : redirec
    Created on : 11-may-2020, 15:36:47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validación</title>
        
        <style type="text/css">
            body{
               margin: 0;
               padding: 0;
               position: absolute;
               overflow: hidden;
               height: 100vh;
               background-image: url(fondo.jpg);

           }
           
           .cap{
               width: 400px;
               background: #eafcfc;
               padding: 30px;
               margin: auto;
               margin-top: 200px;
               margin-left: 500px;
               border-radius: 4px;
               font-family: 'calibir';
               color: black;
               box-shadow: 7px 13px 37px #000;
           }

           
           
             .cap .boton{
               width: 100%;
               background: #000;
               border-radius: none;
               color: white;
               margin: 16px 0;
               font-size: 18px;
           }
           
            .va{
               width: 400px;
               padding: 0px;
               margin: auto;
               margin-top: -45px;
               margin-left: 530px;
               font-family: 'calibir';
               color: black;
           }
            .va .boton{
               width: 100%;
               background: #000;
               border-radius: none;;
               color: white;
               margin: 16px 0;
               font-size: 18px;
           }
        </style>
    </head>
    <body>
        <form class="cap" method="post" action="index.jsp">
            <p>
                Felicidades, ha realizado su registro de datos y sintomas exitosamente.<br>
                Si desea hacer un nuevo registro haga click en el boton "Nuevo registro" <br> <br>
                Si desea visualizar el conteo de personas que han indicado tener los sintomas asociados, haga click en el boton
                "Ver conteo
            </p>
             <input class="boton" type="submit" value="Nuevo registro">
        </form>
        
        <form class="va" method="post" action="conteo">
             <input  class="boton" type="submit" value="Ver conteo">
        </form>
    </body>
</html>
