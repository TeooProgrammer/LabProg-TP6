// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.oficinas.crudservicios.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(
   name = "servicios"
)
public class ServicioEntity {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Integer id;
   @Column(
      name = "descripcion",
      nullable = false,
      length = 50
   )
   private String descripcion;
   @Column(
      name = "problema",
      nullable = false,
      length = 100
   )
   private String problema;
   @Column(
      name = "diagnostico",
      nullable = false,
      length = 100
   )
   private String diagnostico;
   @Column(
      name = "resuelto",
      nullable = false
   )
   private boolean resuelto;
   @ManyToOne(
      fetch = FetchType.LAZY,
      optional = false
   )
   @JoinColumn(
      name = "oficina_id",
      nullable = false
   )
   private OficinaEntity oficina;

   public ServicioEntity() {
   }

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getDescripcion() {
      return this.descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public String getProblema() {
      return this.problema;
   }

   public void setProblema(String problema) {
      this.problema = problema;
   }

   public String getDiagnostico() {
      return this.diagnostico;
   }

   public void setDiagnostico(String diagnostico) {
      this.diagnostico = diagnostico;
   }

   public boolean isResuelto() {
      return this.resuelto;
   }

   public void setResuelto(boolean resuelto) {
      this.resuelto = resuelto;
   }

   public OficinaEntity getOficina() {
      return this.oficina;
   }

   public void setOficina(OficinaEntity oficina) {
      this.oficina = oficina;
   }
}
