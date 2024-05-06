package org.cvarela.models;

import java.util.Objects;

public enum EstadoCobroConsumicion {

    PENDIENTE("Pendiente"),
    PAGADO("Pagado");

    private String estado;

    EstadoCobroConsumicion(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean isPaid(EstadoCobroConsumicion estadoCobroConsumicion) {
        return estadoCobroConsumicion == PAGADO;
    }

    public static org.cvarela.models.Estado porCodigo(String estadoPedido) {
        for (org.cvarela.models.Estado estado : org.cvarela.models.Estado.values()) {
            if (Objects.equals(estado.getEstado(), estadoPedido)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Código de estado inválido: " + estadoPedido);
    }


}