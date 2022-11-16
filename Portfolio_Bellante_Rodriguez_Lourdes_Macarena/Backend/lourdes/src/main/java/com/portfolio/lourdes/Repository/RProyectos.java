package com.portfolio.lourdes.Repository;

import com.portfolio.lourdes.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    public Optional<Proyectos>findByNombreProyectos(String nombreProyectos);
    public boolean existsByNombreProyectos(String NombreProyectos);
}
