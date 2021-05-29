<%-- 
    Document   : index
    Created on : 08-may-2020, 12:06:57
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        
       <style type="text/css">
          
           *{
               margin:0;
               padding:0;
               box-sizing: border-box;
           }
           
           .form-register{
               width: 400px;
               background: #eafcfc;
               padding: 30px;
               margin: auto;
               margin-top: 100px;
               margin-left: 900px;
               border-radius: 4px;
               font-family: 'calibir';
               color: black;
               box-shadow: 7px 13px 37px #000;
           }
           
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
           
           .form-register .boton{
               width: 100%;
               background: #000;
               border-radius: none;
               color: white;
               margin: 16px 0;
               font-size: 18px;
           }
           
           
           .cont{
               width: 800px;
               background: #eafcfc;
               padding: 78px;
               margin: auto;
               margin-top: -470px;
               margin-left: 30px;
               border-radius: 4px;
               font-family: 'calibir';
               color: white;
               box-shadow: 7px 13px 37px #000;
           }
           
             .cont .boton{
               width: 100%;
               background: #000;
               border-radius: none;
               color: white;
               margin: 16px 0;
               font-size: 18px;
           }
           .cont p{
             width: 100%;
             color: black;
             align-content: center;
             text-align: justify;
           }
           
           body{
               margin: 0;
               padding: 0;
               position: absolute;
               overflow: hidden;
               height: 100vh;
               background-image: url(fondo.jpg);

           }
           
           h1{
               margin-left: 400px;
               font-size: 90px;
               font-family: 'rockwell';
           }
       </style>
        
        <script>
            
        function letras(e)
        {
            key= e.keyCode || e.which;
            teclado = String.fromCharCode(key).toLowerCase();
            caracter = "abcdefghijklmnopqrstuvwxyzñ "

            if(caracter.indexOf(teclado)==-1 )
            {
                return false;
            }
            
            
        }
        function numeros(e)
        {
            key= e.keyCode || e.which;
            
            teclado = String.fromCharCode(key);
            caracter = "0123456789";
            
            if(caracter.indexOf(teclado)==-1)
            {
                return false;
            }
            
            
        }


        </script>
        
       
    </head>
    <body>
        <h1>BIENVENIDOS</h1>
        <br/>
        
        <form  method="post" action="DatosRegistro" class="form-register">
            <p>Nombre(s) & Apellido(s)</p>
            <input class="controls" type="text" name="nombre" onkeypress="return letras(event) "> <br>
            <p>Fecha de nacimiento</p>
            <input class="controls" type="date" name="apellido" > <br>
            <p>Número de cédula</p>
            <input class="controls" type="text" name="cedula"  onkeypress="return numeros(event) "> <br>
            <p>Correo electrónico</p>
            <input class="controls" type="email" name="correo"> <br>
           
                
           
            <input class="boton" type="submit" value="Enviar">
            <input class="boton" type="reset" value="Borrar"> 
         
        </form>
        
        <form class="cont" method="post" action="conteo">
          <p> Los coronavirus (CoV) son virus que surgen periódicamente en diferentes áreas del mundo y que causan Infección Respiratoria Aguda (IRA), es decir gripa, que pueden llegar a ser leve, moderada o grave.

El nuevo Coronavirus (COVID-19) ha sido catalogado por la Organización Mundial de la Salud como una emergencia en salud pública de importancia internacional (ESPII). Se han identificado casos en todos los continentes y, el 6 de marzo se confirmó el primer caso en Colombia.

<br><br> La infección se produce cuando una persona enferma tose o estornuda y expulsa partículas del virus que entran en contacto con otras personas.
          
<br><br> A continuación podrá ver un conteo de las personas que han indicado tener sintomas asociados al COVID-19</p>
          <input class="boton" type="submit" value="Ver conteo de sintomas">
        </form>
        
        
    </body>
</html>
