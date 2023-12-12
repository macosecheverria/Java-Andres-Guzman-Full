package org.aguzman.poointerface.repositorio;

import org.aguzman.poointerface.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
