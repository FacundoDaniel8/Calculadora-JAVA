
<%@page import="Utils.Encriptar"%>
<%@page import="java.math.BigInteger"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.sql.*"%>
<%@page import="conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ingresar</title>
        <meta charset="UTF-3">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- link al CSS -->
        <link href="../../CSS/general.css" rel="stylesheet" type="text/css"/>
        <link href="../../CSS/cuentas.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta+twbs4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://unpkg.com/flickity@2/dist/flickity.min.css">
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();            
            
            if (sesion.getAttribute("logueado") != null || sesion.getAttribute("logueado").equals("1")) {
                out.print("ERROR ERROR ERROR");
                //response.sendRedirect("index.jsp");
            }
        %>
        
        
        <%
            
            String urlServletCrearUsuario = "/ProgramadorNovato/SvCrearUsuario";
            String urlServletIngresarUsuarioYaCreado = "/ProgramadorNovato/SvIngresarConUsuarioYaCreado";            
            
        %>
        
        <nav class="Menu_principal"><!-- Inicio del Menu de Arriba-->
            <nav class="Menu_principal_cajas">

                <div class="logo">
                    <a href="#">
                        <img class="foto_logo_twave" src="../../Imagenes/negro_t-wave.png" alt="logo">
                    </a> 
                </div>

                <!--esta parte es la del buscador en si-->
                <div class="Caja_contenedora">
                    <div class="Caja_busqueda">
                        <input type="text" placeholder="Busqueda...">
                        <label class="icon">
                            <i class="fa-solid fa-magnifying-glass"></i>
                        </label>  
                    </div>  
                </div>
                <!--Fin del buscador-->
                <ul>
                    <li> <a href="#"> <img class="img-navbar user" src="../../Imagenes/user.png" alt="alt"/></a> </li>
                    <li> <a href="#"> <img class="img-navbar" src="../../Imagenes/carrito.png" alt="alt"/></a> </li>
                </ul>
            </nav>
        </nav><!-- Fin del Menu de arriba -->


        <nav class="Articulos"><!-- Inicio del menu de compras-->
            <nav class="Articulos_aux">
                <div> <a href="#"> <i class="fa-solid fa-fan"></i> <p class="texto"> Ventiladores </p> </a> </div>
                <div> <a href="#"> <i class="fa-solid fa-soap"></i> <p class="texto"> Hogar</p> </a> </div>
                <div> <a href="#"> <i class="fa-solid fa-print"></i> <p class="texto"> Impresoras</p> </a> </div>
                <div> <a href="#"> <i class="fa-solid fa-tv"></i> <p class="texto"> Televisores</p> </a></div>
                <div> <a href="#"> <i class="fa-solid fa-kitchen-set"></i> <p class="texto"> Heladeras </p> </a> </div>
                <div> <a href="#"> <i class="fa-solid fa-computer"></i> <p class="texto"> Computadoras </p> </a></div> 
            </nav>
        </nav><!-- Fin del Menu de Arriba-->





        <!-- Inicio del contenedor de registros -->
        <div class="contedor_principal">
            
            <!--< jsp:include page="/SvFormularioDeIngreso"/>-->
            
            <div class="contenedor_registros">
                <div id="registroForm" style="display: none;">
                    <form action="<%=urlServletCrearUsuario%>" method="post">
                        <h1 class="a">Crear usuario</h1>
                        <p><a href="#a" onclick="mostrarIngreso()">Ya tienes una cuenta? Ingresa</a></p>
                        <div class="mb-3 nombre">
                            <label for="exampleInputEmail1" class="form-label"><p>Nombre</p></label>
                            <input type="text" class="form-control" aria-describedby="textHelp" required="required">
                        </div>
                        <div class="mb-3 apellido">
                            <label for="exampleInputEmail1" class="form-label"><p>Apellido</p></label>
                            <input type="text" class="form-control" aria-describedby="textHelp" required="required">
                        </div>
                        
                        
                        <div class="mb-3 nombre">
                            <label for="exampleInputEmail1" class="form-label"><p>Usuario</p></label>
                            <input type="text" class="form-control" id="user" name="userRegistro" aria-describedby="textHelp" required="required">
                        </div>

                        <div class="mb-3 gmail">
                            <label for="exampleInputEmail1" class="form-label"><p>Email</p></label>
                            <input type="email" class="form-control" id="email" name="emailRegistro" aria-describedby="emailHelp" required="required">
                        </div>

                        <div class="mb-3 contraseña">
                            <label for="exampleInputPassword1" class="form-label"><p>Contraseña</p></label>
                            <input type="password" class="form-control" id="password" name="passwordRegistro" required="required">
                        </div>

                        <div class="mb-3 nombre">
                            <label for="exampleInputPassword1" class="form-label"><p>Teléfono</p></label>
                            <input type="text" class="form-control" id="telefono" name="telefonoRegistro" required="required">
                        </div>

                        <div class="mb-3 form-check">
                            <input name="notificacionesIngreso" type="checkbox" class="form-check-input" id="exampleCheck2">
                            <label class="form-check-label" for="exampleCheck2"><p>Recibir notificaciones</p></label>
                        </div>
                        
                        <button type="submit" name="Registro" class="btn btn-primary">Crear usuario</button>
                    </form>
                </div>
                
                
                
                <div id="ingresoForm">
                    <form method="POST" action="<%=urlServletIngresarUsuarioYaCreado%>">
                        <h1 class="a">Ingresar</h1>
                        <p><a href="#a" onclick="mostrarRegistro()">No tienes una cuenta? Regístrate</a></p>
                        <div class="mb-3 gmail">
                            <label for="exampleInputEmail1" class="form-label"><p>Email</p></label>
                            <input name="emailIngreso" type="email" class="form-control" id="exampleInputEmail1">
                        </div>

                        <div class="mb-3 contraseña">
                            <label for="exampleInputPassword1" class="form-label"><p>Contraseña</p></label>
                            <input name="passwordIngreso" type="password" class="form-control" id="exampleInputPassword1">
                        </div>

                        <div class="mb-3 form-check">
                            <input name="notificacionesIngreso" type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1"><p>Recibir notificaciones</p></label>
                        </div>                        

                        <button name="Ingreso" type="submit" class="btn btn-primary">Ingresar</button>                        
                    </form>
                </div>                                                                
                    
                    
                <script>
                    function mostrarRegistro() {
                        document.getElementById('registroForm').style.display = 'block';
                        document.getElementById('ingresoForm').style.display = 'none';
                    }

                    function mostrarIngreso() {
                        document.getElementById('registroForm').style.display = 'none';
                        document.getElementById('ingresoForm').style.display = 'block';
                    }
                </script>
            </div>
                        
                        
                        
        </div>
        <!--fin del contenedor de registros-->


    </div>
</div>
</div>
</body>

<%
    /*metodo anterior para ingresar: 
    if (request.getParameter("login") != null) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Conexion aux = new Conexion();
        aux.conectar();
        //toma los datos de Usuario
        ResultSet userTag = aux.selectAllFromUsuario(password, email);

        HttpSession sesion = request.getSession();

        if (userTag.next()) {
            if (email.equals(userTag.getString("mail")) && password.equals(userTag.getString("contrasenia"))) {
                sesion.setAttribute("logueado", "1");
                sesion.setAttribute("email", email);
                sesion.setAttribute("usuario", userTag.getString("nombre"));
                response.sendRedirect("../index.jsp");
            }
        } else {
            out.print("Email o Contraseña incorrectos");
        }
    }
        
     */
%>
</html>