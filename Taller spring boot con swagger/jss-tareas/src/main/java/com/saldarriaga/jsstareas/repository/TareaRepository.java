package com.saldarriaga.jsstareas.repository;

import com.saldarriaga.jsstareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}

