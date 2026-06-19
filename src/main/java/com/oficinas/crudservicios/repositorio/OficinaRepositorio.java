package com.oficinas.crudservicios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oficinas.crudservicios.modelo.OficinaEntity;
//las interfaces permiten acceder a la bdd sin SQL ni JDBC, permitiendo metodos automaticos en la bdd
//repository = métodos automáticos para la bdd

@Repository
public interface OficinaRepositorio extends JpaRepository<OficinaEntity, Integer> {

}