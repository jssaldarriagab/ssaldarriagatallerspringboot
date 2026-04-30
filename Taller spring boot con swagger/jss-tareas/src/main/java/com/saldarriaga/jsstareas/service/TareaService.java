package com.saldarriaga.jsstareas.service;

import com.saldarriaga.jsstareas.modelo.Tarea;
import com.saldarriaga.jsstareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    private final TareaRepository repository;

    @Autowired
    public TareaService(TareaRepository repository) {
        this.repository = repository;
    }

    public Tarea agregar(Tarea tarea) {
        return repository.save(tarea);
    }

    public List<Tarea> listar() {
        return repository.findAll();
    }

    public Optional<Tarea> buscar(Long id) {
        return repository.findById(id);
    }

    public Tarea actualizar(Long id, Tarea tareaActualizada) {
        return repository.findById(id).map(tarea -> {
            tarea.setTitulo(tareaActualizada.getTitulo());
            tarea.setDescripcion(tareaActualizada.getDescripcion());
            tarea.setEstado(tareaActualizada.getEstado());
            return repository.save(tarea);
        }).orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

