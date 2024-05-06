package org.cvarela.services;

import jakarta.inject.Inject;
import org.cvarela.configs.Service;
import org.cvarela.interceptors.TransactionalMongo;
import org.cvarela.models.entities.Producto;
import org.cvarela.repositories.CrudRepositoryInterface;
import org.cvarela.repositories.RepositoryJpa;

import java.util.List;
import java.util.Optional;

@Service
@TransactionalMongo
public class ProductoServiceMongoImpl implements ProductoService {

    @Inject
    @RepositoryJpa
    private CrudRepositoryInterface<Producto> repository;

    @Override
    public List<Producto> getAll() {
        try {
            return repository.getAll();
        } catch (Exception throwables) {
            throw new ServiceJdbcException(throwables.getMessage(), throwables.getCause());
        }
    }

    @Override
    public Optional<Producto> get(Integer id) {
        try {
            return Optional.ofNullable(repository.get(id));
        } catch (Exception throwables) {
            throw new ServiceJdbcException(throwables.getMessage(), throwables.getCause());
        }
    }

    @Override
    public void save(Producto producto) {
        try {
            repository.save(producto);
        } catch (Exception throwables) {
            throw new ServiceJdbcException(throwables.getMessage(), throwables.getCause());
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            repository.delete(id);
        } catch (Exception throwables) {
            throw new ServiceJdbcException(throwables.getMessage(), throwables.getCause());
        }
    }
}
