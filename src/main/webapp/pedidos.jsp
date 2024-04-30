<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.reflect.*" %>
<%@ page import="org.cvarela.controllers.PedidoDao, org.cvarela.models.pedido"%>

<%

    List<pedido> pedidosLista = (List<pedido>) request.getAttribute("pedidosLista");
    //String nombreBar = pedidosLista.get(0).getBar().getNombre();

%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Listado pedidos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <header>
            <h2 class="my-2">Listado de productos</h2>
        </header>
        <main>
            <table class="table table-hover table-striped my-2">
                <tr>
                    <th>Fecha y hora entrada</th>
                    <th>Estado</th>
                    <th>Grupo</th>
                    <th>Camarero</th>
                    <th>Importe pendiente</th>
                    <th></th>
                    <th></th>
                </tr>
            <% for(pedido aPedido : pedidosLista){ %>
                <a href="./pedidoServlet"><tr>
                    <td><%= aPedido.getFechaHoraPedido() != null ? aPedido.getFechaHoraPedido() : "" %></td>
                    <td><%= aPedido.getEstado() != null ?aPedido.getEstado() : "" %></td>
                    <td><%= aPedido.getGrupo() != null ? aPedido.getGrupo().getNombre() : "" %></td>
                    <td><%= aPedido.getCamarero() != null ? aPedido.getCamarero().getNombre() : "" %></td>
                    <td> ImportePendiente aquí </td>
                </tr></a>
            <% } %>
            </table>
        </main>
    </div>
</body>
</html>