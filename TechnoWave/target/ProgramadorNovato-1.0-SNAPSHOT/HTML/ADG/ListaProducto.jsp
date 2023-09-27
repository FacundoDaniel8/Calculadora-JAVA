<%-- 
    Document   : ListaProducto
    Created on : 26 sep. 2023, 17:46:34
    Author     : Luca
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link reel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css">
        <link reel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/dataTables.bootstrap5.min.css">
        
    

    </head>
    <body>
        <h1>Productos</h1>
        <div class="main-container">

          <div class="container mt-5">
              <div class="row">
                  <div class="col-sm">
                      <table class="table">
                          <thead>
                              <tr>
                                  <th scope="col">ID</th>
                                  <th scope="col">Nombre</th>
                                  <th scope="col">Precio</th>
                                  <th scope="col">Stock</th>
                                  <th scope="col">Opciones</th>
          
                              </tr>
                          </thead>
                          <tbody>


                              <%
            
                                  //esto podria entrar dentro del SERVLET "USUARIOS"
                                  try {
                                      Conexion conexion = new Conexion();
                                      conexion.conectar();
                                      ResultSet rs = conexion.Productos();
                                      while (rs.next()) {
                                          out.print("<tr>"
                                                  + "<th scope=\"row\">" + rs.getString("id_producto") + "</th>"
                                                 
                                                  + "<td>" + rs.getString("nombre") + "</td>"
                                                  + "<td>" + rs.getInt("precio_venta") + "</td>"
                                                  + "<td>" + rs.getInt("stock") + "</td>"
                            
                                                   
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
     
    </body>
</html>
    