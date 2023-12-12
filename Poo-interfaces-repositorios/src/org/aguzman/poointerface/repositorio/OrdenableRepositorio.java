package org.aguzman.poointerface.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
