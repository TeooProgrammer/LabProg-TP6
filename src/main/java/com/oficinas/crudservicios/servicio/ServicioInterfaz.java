package com.oficinas.crudservicios.servicio;

import java.util.List;

import com.oficinas.crudservicios.modelo.ServicioEntity;

public interface ServicioInterfaz {

    public List<ServicioEntity> listar();

    public ServicioEntity guardarServicio(ServicioEntity servicio);

    public ServicioEntity obtenerServicioPorId(Integer id);

    public ServicioEntity actualizarServicio(ServicioEntity servicio);

    public void eliminarServicio(Integer id);

}