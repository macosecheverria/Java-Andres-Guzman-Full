package org.aguzman.poointerface.repositorio;

import org.aguzman.poointerface.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {

        dataSource.sort((a, b) -> {

            int resultado = 0;

            if (dir == Direccion.ASC) {

                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                }

            }

            if (dir == Direccion.DESC) {

                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                }

            }

            return resultado;
        });

        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return this.dataSource.subList(desde,hasta);
    }

    @Override
    public Cliente getId(Integer id) {
        Cliente resultado = null;

        for (Cliente el : dataSource) {
            if (el.getId().equals(id)) {
                resultado = el;
                break;
            }
        }


        return resultado;
    }

    @Override
    public void postCliente(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void putCliente(Cliente cliente) {
        Cliente  c = this.getId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void deleteCliente(Integer id) {
        this.dataSource.remove(this.getId(id));
    }
}
