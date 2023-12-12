package org.aguzman.poointerface;

import org.aguzman.poointerface.modelo.Cliente;
import org.aguzman.poointerface.repositorio.*;
import org.aguzman.poointerface.repositorio.excepciones.AccesoDatosException;
import org.aguzman.poointerface.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Juan", "Echeverria"));
            repo.crear(new Cliente("Marcos", "Echeverria"));
            repo.crear(new Cliente("Erik", "Medina"));
            repo.crear(new Cliente("Andres", "Guzman"));

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("====== paginable ======");

            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("====== ordenable ======");

            List<Cliente> clienteOrdenAsc = repo.listar(
                    "nombre", Direccion.ASC);
            clienteOrdenAsc.forEach(System.out::println);

            System.out.println("===== editar =====");

            Cliente marcosActualizar = new Cliente("Marquinho", "Echeverria");
            marcosActualizar.setId(2);
            repo.editar(marcosActualizar);

            Cliente marcos = repo.getId(2);
            System.out.println(marcos);

            repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

            System.out.println("====== eliminar ======");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println("===== total =====");
            System.out.println("Total de Registros: " + repo.total());
        } catch (AccesoDatosException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
