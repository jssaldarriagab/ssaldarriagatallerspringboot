package com.saldarriaga.jsstareas.control;

import com.saldarriaga.jsstareas.modelo.Tarea;
import com.saldarriaga.jsstareas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaService service;

    @Autowired
    public TareaController(TareaService service) {
        this.service = service;
    }

    @PostMapping
    public Tarea agregar(@RequestBody Tarea tarea) {
        return service.agregar(tarea);
    }

    @GetMapping
    public List<Tarea> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public Tarea actualizar(@PathVariable Long id, @RequestBody Tarea tarea) {
        return service.actualizar(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}


