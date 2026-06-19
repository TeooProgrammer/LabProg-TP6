package com.oficinas.crudservicios.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oficinas.crudservicios.modelo.OficinaEntity;
import com.oficinas.crudservicios.repositorio.OficinaRepositorio;
// Las clases usan los repositorios para manejar la lógica de la BDD.
// service = usa metodos repository para aplicar la lógica del programa.
@Service
public class OficinaServicio implements OficinaServicioInterfaz {

    private final OficinaRepositorio repositorio;

    public OficinaServicio(OficinaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<OficinaEntity> listar() {
        return repositorio.findAll();
    }

}
