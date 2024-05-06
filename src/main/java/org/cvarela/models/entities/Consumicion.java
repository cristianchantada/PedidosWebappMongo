package org.cvarela.models.entities;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.cvarela.models.EstadoCobroConsumicion;

public class Consumicion {

    private ObjectId id;
    @BsonProperty(value = "alumno_id")
    private ObjectId alumnoId;
    @BsonProperty(value = "producto_id")
    private ObjectId productoId;
    private Alumno aAlumno;
    private Producto aProducto;
    @BsonProperty(value = "estado_cobro")
    private EstadoCobroConsumicion estadoCobro = EstadoCobroConsumicion.PENDIENTE;

    public Consumicion(){}

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(ObjectId alumnoId) {
        this.alumnoId = alumnoId;
    }

    public ObjectId getProductoId() {
        return productoId;
    }

    public void setProductoId(ObjectId productoId) {
        this.productoId = productoId;
    }

    public Alumno getAlumno() {
        return aAlumno;
    }

    public void setAlumno(Alumno alumno) {
        this.aAlumno = alumno;
    }

    public Producto getProducto() {
        return aProducto;
    }

    public void setProducto(Producto producto) {
        this.aProducto = producto;
    }

    public EstadoCobroConsumicion getEstadoCobro() {
        return estadoCobro;
    }

    public void setEstadoCobro(EstadoCobroConsumicion estadoCobro) {
        this.estadoCobro = estadoCobro;
    }
}
