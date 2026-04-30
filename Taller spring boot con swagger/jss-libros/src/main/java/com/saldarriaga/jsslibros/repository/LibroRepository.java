package com.saldarriaga.jsslibros.repository;

import com.saldarriaga.jsslibros.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByAutor(String autor);
}

