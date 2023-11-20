package org.aguzman.poointerface.repositorio;

import org.aguzman.poointerface.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
