package com.oficinas.crudservicios.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oficinas.crudservicios.modelo.ServicioEntity;
import com.oficinas.crudservicios.repositorio.ServicioRepositorio;

@Service
public class Servicio implements ServicioInterfaz {

    private final ServicioRepositorio repositorio;

    public Servicio(ServicioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<ServicioEntity> listar() {
        return repositorio.findAll();
    }

    @Override
    public ServicioEntity guardarServicio(ServicioEntity servicio) {
        return repositorio.save(servicio);
    }

    @Override
    public ServicioEntity obtenerServicioPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ServicioEntity actualizarServicio(ServicioEntity servicio) {
        return repositorio.save(servicio);
    }

    @Override
    public void eliminarServicio(Integer id) {
        repositorio.deleteById(id);
    }
    
}