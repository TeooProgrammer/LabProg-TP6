package com.oficinas.crudservicios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oficinas.crudservicios.modelo.ServicioEntity;

@Repository
public interface ServicioRepositorio extends JpaRepository<ServicioEntity, Integer> {

}