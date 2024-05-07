package org.cvarela.controllers;

import jakarta.inject.Inject;
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
import org.cvarela.services.CamareroService;
import org.cvarela.services.PedidoService;

import java.io.IOException;
import java.util.List;

@WebServlet({"/", "/index", "/index.html", "/index.jsp"})
public class IndexServlet extends HttpServlet {

    @Inject
    private PedidoService service;

    @Inject
    private CamareroService camareroService;
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pedido> pedidos = service.getAll();
        List<Camarero> camareros = camareroService.getAll();


        /*for(Pedido p : pedidosLista) {
        	
        	Grupo grupo = grupoDao.getById(p.getGrupoId());
        	p.setGrupo(grupo);
        	       
        	Bar bar = barDao.getById(p.getBarId()); 
        	p.setBar(bar);
            
        }

        pedido aPedido = new pedido();
        aPedido.setImporteTotal(12.32F);
        aPedido.setEstadoCobro(estadoCobro.NADA);
        pedidoDao.save(aPedido);*/

        /*ObjectId objectId = new ObjectId("662f569f0b4bb853c507fbc1");

        pedido aPedido = pedidoDao.getById(objectId);*/

        req.setAttribute("camareros", camareros);
        req.setAttribute("pedidos", pedidos);
        getServletContext().getRequestDispatcher("/pedidos.jsp").forward(req, resp);


    }
}
