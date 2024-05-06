package org.cvarela.controllers;

import jakarta.servlet.annotation.WebServlet;
import org.cvarela.repositories.*;
import org.cvarela.models.entities.Bar;
import org.cvarela.models.entities.Camarero;
import org.cvarela.models.entities.Grupo;
import org.cvarela.models.entities.Pedido;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/", "/index", "/index.html", "/index.jsp"})
public class IndexServlet extends HttpServlet {

    PedidoDao pedidoDao = new PedidoDao();
    GrupoDao grupoDao = new GrupoDao();
    BarDao barDao = new BarDao();
    AlumnoDao alumnoDao = new AlumnoDao();
    CamareroDao camareroDao = new CamareroDao();
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pedido> pedidosLista = pedidoDao.getAll();
        List<Camarero> camarerosLista = camareroDao.getAll();
        
        for(Pedido p : pedidosLista) {
        	
        	Grupo grupo = grupoDao.getById(p.getGrupoId());
        	p.setGrupo(grupo);
        	       
        	Bar bar = barDao.getById(p.getBarId()); 
        	p.setBar(bar);
            
        }

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
