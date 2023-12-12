package org.aguzman.poointerface;

import java.util.List;
import org.aguzman.poointerface.modelo.Producto;
import org.aguzman.poointerface.repositorio.Direccion;
import org.aguzman.poointerface.repositorio.OrdenablePaginableCrudRepositorio;
import org.aguzman.poointerface.repositorio.excepciones.AccesoDatosException;
import org.aguzman.poointerface.repositorio.lista.ProductoListRepositorio;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {

        try {

            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();

            repo.crear(new Producto("Mesa", 50.52));
            repo.crear(new Producto("Silla", 20.6));
            repo.crear(new Producto("Lampara", 15.6));
            repo.crear(new Producto("notebook", 400.89));

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);

            System.out.println("====== Paginable =======");
            List<Producto> paginables = repo.listar(1, 4);
            paginables.forEach(System.out::println);

            System.out.println("====== Ordenar =======");
            List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
            productosOrdenAsc.forEach(System.out::println);

            System.out.println("====== Editar ======");
            Producto actualizarLampara = new Producto("Lampara escritorio", 23.5);
            actualizarLampara.setId(3);
            repo.editar(actualizarLampara);
            Producto lampara = repo.getId(3);
            System.out.println(lampara);

            System.out.println("==========");
            repo.listar("precio", Direccion.ASC).forEach(System.out::println);

            System.out.println("======= Eliminar ========");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println("====== total ======");
            System.out.println("Total registros: " + repo.total());

        } catch (AccesoDatosException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
