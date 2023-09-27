<%-- 
    Document   : ListaUsuario
    Created on : 26 sept 2023, 14:56:32
    Author     : Alumno
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>T-Wave - Administrador General Busqueda</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   

    <link href="C:\Users\Alumno\Downloads\demo-repository-main\Twave\css\listado-usuario.css" rel="stylesheet" type="text/css"/>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta+twbs4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://unpkg.com/flickity@2/dist/flickity.min.css">

    <link rel="stylesheet" href="../css/dropdown-carrito-usuario.css">
    <link rel="stylesheet" href="../css/nav-footer.css">

    <link rel="icon" href="../img/logo-sin-fondo.png" type="png" sizes= "16px">
    
    <!--Fuente montserrat-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">

</head>
<body>
    <nav class="Menu_principal"><!-- Inicio del Menu de Arriba-->
        <nav class="Menu_principal_cajas">
         <div class="logo"> <a href="#"> <img src="https://images.freeimages.com/uploads/11086355/2ce7daba-8b20-4aeb-98e3-b28d2db04fbf.png" alt="logo" height="140px" width="240px" style="margin-top: 10px;"></a> </div>
         <!--esta parte es la del buscador en si-->
         <div class="Caja_contenedora" style="margin-right: 200px;">
          <div class="Caja_busqueda">
           <input type="text" placeholder="Busqueda...">
           <label for="" class="icon">
             <i class="fa-solid fa-magnifying-glass"></i>
           </label>  
          </div>  
         </div>
           <!--Fin del buscador-->
           
           <div class="btn-usuario" style="margin-right: 10px !important;">
             <label for="btn-usuario" class="icon-usuario"><i class="fa-solid fa-user-tie"></i></label>
           </div>
        
       </nav>
    
      <!--Listado de usuario-->
    <input type="checkbox" id="btn-usuario">

    <div class="contenedor-usuario">
      <div class="cont-usuario">
        <nav>
          <div class="text-center" style="margin-bottom: 20px;">
            <i class="fa-solid fa-user-tie" id="logo-usuario"></i>
          </div>

          <h3 style="color: #0EAC8C; font-size: 30px; text-align: center; margin-bottom: 20px;"><i><b>Administrador General</b></i></h3>

          <a href="#">Configuración</a>
          <a href="#">Gestionar cuentas</a>
          <a href="#">Cerrar sesión</a>
        </nav>

        <label for="btn-usuario"><i class="fa-solid fa-x"></i></label>
      </div>
    </div>

    <label class="click-fondo" for="btn-usuario"></label>
    
      </nav><!-- Fin del Menu de arriba -->
    
      <nav class="Articulos"><!-- Inicio del menu de compras-->
        <nav class="Articulos_aux">
          <div> <a href="#"> <i class="fa-solid fa-fan"></i> <p class="texto"> Ventiladores </p> </a> </div>
          <div> <a href="#"> <i class="fa-solid fa-headphones"></i> <p class="texto"> Auriculares </p> </a> </div>
          <div> <a href="#"> <i class="fa-solid fa-print"></i> <p class="texto"> Impresora</p> </a> </div>
          <div> <a href="#"> <i class="fa-solid fa-tv"></i> <p class="texto"> Televisores</p> </a></div>
          <div> <a href="#"> <i class="fa-solid fa-blender"></i> <p class="texto"> Licuadoras </p> </a> </div>
          <div> <a href="#"> <i class="fa-solid fa-computer"></i> <p class="texto"> Computadoras </p> </a></div>
        </nav>
      </nav><!-- fin del Menu de compras-->

      <h1>Listado de usuarios</h1>

      <!-- Contenedor principal -->
      <div class="main-container">

          <div class="container mt-5">
              <div class="row">
                  <div class="col-sm">
                      <table class="table">
                          <thead>
                              <tr>
                                  <th scope="col">ID</th>
                                  <th scope="col">Usuario</th>
                                  <th scope="col">Mail</th>
                                  <th scope="col">Teléfono</th>
                                  <th scope="col">Contraseña</th>
                                  <th scope="col">Configurción</th>
                              </tr>
                          </thead>
                          <tbody>


                              <%
            
                                  //esto podria entrar dentro del SERVLET "USUARIOS"
                                  try {
                                      Conexion conexion = new Conexion();
                                      conexion.conectar();
                                      ResultSet rs = conexion.registrosMostrar();
                                      while (rs.next()) {
                                          out.print("<tr>"
                                                  + "<th scope=\"row\">" + rs.getString("id_usuario") + "</th>"
                                                  + "<td>" + rs.getString("nombre") + "</td>"
                                                  + "<td>" + rs.getString("mail") + "</td>"
                                                  + "<td>" + rs.getString("telefono") + "</td>"
                                                  + "<td>" + rs.getString("contrasenia") + "</td>"
                                                  + "<td>"
                                                  + "  <a href=\"HTML/Usuario/editarUsuario.jsp?id=" + rs.getString("id_usuario") + "&usuario=" + rs.getString("nombre") + "&mail=" + rs.getString("mail") + "&telefono=" + rs.getString("telefono") + "\">Editar</a>"
                                                  + "  <a href=\"HTML/Usuario/borrarUsuario.jsp?id=" + rs.getString("id_usuario") + "\">Eliminar</a>"
                                                  + "</td>"
                                                  + "</tr>"
                                          );

                                      }
                                      rs.close();
                                  } catch (Exception e) {
                                      out.print(e);
                                  }
             
                              %>
                          </tbody>
                      </table>
                  </div>
              </div>
          </div>



      </div>


      <!-- Inicio del pie de pagina -->
      <div class="pie_pagina">
        <div class="iconos"> 
          <div> <a href="#"> <i class="fa-brands fa-instagram"></i> </a> </div>
          <div> <a href="#"> <i class="fa-brands fa-square-facebook"></i> </a> </div>
          <div> <a href="#"> <i class="fa-brands fa-square-twitter"></i> </a> </div> 
        </div>
        <div class="info_pie">
         <div> <a href="#">Mas Informacion </a></div>
         <div> <a href="#">Herramientas y Api</a></div>
         <div> <a href="#">Asistencia</a></div>
         <div> <a href="#">Empresa</a></div>
        </div>
       </div>
</body>
</html>
