package org.cvarela.repositories;


import com.mongodb.client.MongoCollection;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.cvarela.models.entities.Producto;
import org.cvarela.utils.ConexionBaseDatos;

import java.util.List;

import static com.mongodb.client.model.Filters.eq;


public class ProductoDao implements CrudRepositoryInterface<Producto> {

    private final String COLLECTION_NAME = "camareros";
    private final String DATABASE_NAME = "pedidos_app";
    ConexionBaseDatos<Producto> conn = new ConexionBaseDatos<>(DATABASE_NAME, COLLECTION_NAME, Producto.class);
    MongoCollection<Producto> collection = conn.getCollection();

    public Producto getById(ObjectId id){
        Bson equalComp = eq("_id", id);
        return collection.find(equalComp).first();
    }

    @Override
    public Producto get(int id) throws Exception {
        return null;
    }

    @Override
    public List<Producto> getAll() throws Exception {
        return null;
    }

    @Override
    public void save(Producto producto) throws Exception {

    }

    @Override
    public void delete(int id) throws Exception {

    }
}
