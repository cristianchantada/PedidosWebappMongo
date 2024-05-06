package org.cvarela.models.entities;

import org.bson.types.ObjectId;

public class Camarero {

    private ObjectId id;
    private String nombre;

    public Camarero(){}

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
