package org.cvarela.models.entities;

import org.bson.types.ObjectId;

public class Alumno {

    private ObjectId id;
    private String nombre;

    public Alumno(){}

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