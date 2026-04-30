package com.saldarriaga.jsslibros.service;

import com.saldarriaga.jsslibros.modelo.Libro;
import com.saldarriaga.jsslibros.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository repository;

    @Autowired
    public LibroService(LibroRepository repository) {
        this.repository = repository;
    }

    public Libro agregar(Libro libro) {
        return repository.save(libro);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return repository.findByAutor(autor);
    }
}

