package org.cvarela.servlets;

import jakarta.servlet.annotation.WebServlet;
import org.bson.types.ObjectId;
import org.cvarela.controllers.PedidoDao;
import org.cvarela.models.estadoCobro;
import org.cvarela.models.pedido;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/", "/index", "/index.html", "/index.jsp"})
public class IndexServlet extends HttpServlet {

    PedidoDao pedidoDao = new PedidoDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<pedido> pedidosLista = pedidoDao.getAll();

        /*pedido aPedido = new pedido();
        aPedido.setImporteTotal(12.32F);
        aPedido.setEstadoCobro(estadoCobro.NADA);
        pedidoDao.save(aPedido);*/

        /*ObjectId objectId = new ObjectId("662f569f0b4bb853c507fbc1");

        pedido aPedido = pedidoDao.getById(objectId);*/



        resp.getWriter().println("pedidosLista = " + pedidosLista);

        req.setAttribute("pedidosLista", pedidosLista);
        getServletContext().getRequestDispatcher("/pedidos.jsp").forward(req, resp);
    }
}
