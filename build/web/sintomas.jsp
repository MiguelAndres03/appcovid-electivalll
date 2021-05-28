<%-- 
    Document   : sintomas
    Created on : 08-may-2020, 17:17:58
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sintomas</title>
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
        </style>
    </head>
    <body>
        
        <form class="cap" method="post" action="DatosSintomas">
            <p>
                A Continuación se presenta un listado de los sintomas que comunmente son asociados al COVID-19, seleccione las
                casillas indicando si usted presenta alguno de estos sintomas.
            </p>
        <input type="checkbox" name="cbox1" id="cbox1" value="checkbox1"> <label for="cbox1"> Fiebre</label><br>
        <input type="checkbox" name="cbox2" id="cbox2" value="checkbox2"> <label for="cbox2">Toz seca</label><br>
        <input type="checkbox" name="cbox3" id="cbox3" value="checkbox3"> <label for="cbox3">Cansancio</label><br>
        <input type="checkbox" name="cbox4" id="cbox4" value="checkbox4"> <label for="cbox4">Dolor muscular</label><br>
        <input type="checkbox" name="cbox5" id="cbox5" value="checkbox5"> <label for="cbox5">Dificultad para respirar</label><br>   
        <input class="boton" type="submit" value="Enviar">
        </form>
        
    </body>
</html>
