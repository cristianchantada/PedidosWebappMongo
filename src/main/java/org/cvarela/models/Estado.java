package org.cvarela.models;

public enum Estado {
    EN_COLA("En cola"),
    EN_PROCESO("En proceso"),
    DESPACHADO("Despachado"),
    CERRADO("Cerrado"),
    EN_MODIFICACION("En modificación");

    private String estado;

    Estado(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return this.estado;
    }

    public boolean isClosed(org.cvarela.models.Estado estado){
        return estado == CERRADO;
    }

}
