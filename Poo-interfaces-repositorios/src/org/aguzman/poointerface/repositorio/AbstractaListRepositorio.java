package org.aguzman.poointerface.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.aguzman.poointerface.modelo.BaseEntity;
import org.aguzman.poointerface.repositorio.excepciones.*;

public abstract class AbstractaListRepositorio<T extends BaseEntity>
        implements OrdenablePaginableCrudRepositorio<T> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T getId(Integer id) throws LecturaAccesoDatoException {
        if (id == null || id == 0) {
            throw new LecturaAccesoDatoException("id" + id + " tiene que ser mayor que cero y no de de ser nulo");
        }

        T result = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                result = cli;
            }
        }
        if (result == null) {
            throw new LecturaAccesoDatoException("No se ha podido encontrar el usuario con el id: " + id);
        }

        return result;
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public void crear(T t) throws RegistroDuplicadoAccesoDato {
        if (t == null) {
            throw new RegistroDuplicadoAccesoDato("Error al insertar un objeto null");
        }

        if(this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDato("Error el objeto con id: "+ t.getId() + " existe en el repositorio");
        }
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        this.dataSource.remove(this.getId(id));
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
