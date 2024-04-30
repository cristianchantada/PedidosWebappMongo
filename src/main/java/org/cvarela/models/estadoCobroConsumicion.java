package org.cvarela.models;

import java.util.Objects;

public enum estadoCobroConsumicion {

    PENDIENTE("Pendiente"),
    PAGADO("Pagado");

    private String estado;

    estadoCobroConsumicion(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean isPaid(estadoCobroConsumicion estadoCobroConsumicion) {
        return estadoCobroConsumicion == PAGADO;
    }

    public static org.cvarela.models.estado porCodigo(String estadoPedido) {
        for (org.cvarela.models.estado estado : org.cvarela.models.estado.values()) {
            if (Objects.equals(estado.getEstado(), estadoPedido)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Código de estado inválido: " + estadoPedido);
    }


}