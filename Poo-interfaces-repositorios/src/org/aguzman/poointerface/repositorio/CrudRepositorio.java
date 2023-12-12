package org.aguzman.poointerface.repositorio;

import java.util.List;

import org.aguzman.poointerface.repositorio.excepciones.AccesoDatosException;


public interface CrudRepositorio<T> {
    List<T> listar();

    T getId(Integer id) throws AccesoDatosException;

    void crear(T cliente) throws AccesoDatosException;

    void editar(T cliente) throws AccesoDatosException;

    void eliminar(Integer id) throws AccesoDatosException;

}
