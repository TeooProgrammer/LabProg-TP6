package com.oficinas.crudservicios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.oficinas.crudservicios.modelo.ServicioEntity;
import com.oficinas.crudservicios.servicio.OficinaServicio;
import com.oficinas.crudservicios.servicio.Servicio;

// la clase recibe las peticiones y llama al servicio

@Controller
public class ServicioControlador {

    private final Servicio servicio;
    private final OficinaServicio oficinaServicio;

    public ServicioControlador(Servicio servicio, OficinaServicio oficinaServicio) {
        this.servicio = servicio;
        this.oficinaServicio = oficinaServicio;
    }

    @GetMapping({"/", "/servicios"})
    public String listarServicios(Model modelo) {
        modelo.addAttribute("servicios", servicio.listar());
        return "index";
    }

    @GetMapping("/servicios/nuevo")
    public String mostrarFormularioCrear(Model modelo) {
        ServicioEntity servicioEntity = new ServicioEntity();

        modelo.addAttribute("servicio", servicioEntity);
        modelo.addAttribute("listaOficinas", oficinaServicio.listar());

        return "crear";
    }

    @PostMapping("/servicios")
    public String guardarServicio(@ModelAttribute("servicio") ServicioEntity servicioEntity) {
        servicio.guardarServicio(servicioEntity);
        return "redirect:/servicios";
    }

    @GetMapping("/servicios/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Integer id, Model modelo) {
        modelo.addAttribute("servicio", servicio.obtenerServicioPorId(id));
        modelo.addAttribute("listaOficinas", oficinaServicio.listar());

        return "editar";
    }

    @PostMapping("/servicios/{id}")
    public String actualizarServicio(@PathVariable Integer id, @ModelAttribute("servicio") ServicioEntity servicioEntity) {

        ServicioEntity servicioExistente = servicio.obtenerServicioPorId(id);

        servicioExistente.setId(id);
        servicioExistente.setDescripcion(servicioEntity.getDescripcion());
        servicioExistente.setProblema(servicioEntity.getProblema());
        servicioExistente.setDiagnostico(servicioEntity.getDiagnostico());
        servicioExistente.setResuelto(servicioEntity.isResuelto());
        servicioExistente.setOficina(servicioEntity.getOficina());

        servicio.actualizarServicio(servicioExistente);

        return "redirect:/servicios";
    }

    @GetMapping("/servicios/{id}")
    public String eliminarServicio(@PathVariable Integer id) {
        servicio.eliminarServicio(id);
        return "redirect:/servicios";
    }
}