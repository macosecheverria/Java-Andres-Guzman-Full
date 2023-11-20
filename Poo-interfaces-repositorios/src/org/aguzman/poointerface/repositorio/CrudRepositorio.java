package org.aguzman.poointerface.repositorio;

import org.aguzman.poointerface.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente getId(Integer id);
    void postCliente(Cliente cliente);
    void putCliente(Cliente cliente);
    void deleteCliente(Integer id);

}
