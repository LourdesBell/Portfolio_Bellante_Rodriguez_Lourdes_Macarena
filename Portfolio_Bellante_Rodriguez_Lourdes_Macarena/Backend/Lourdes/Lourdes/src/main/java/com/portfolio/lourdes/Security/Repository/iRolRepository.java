package com.portfolio.lourdes.Security.Repository;

import com.portfolio.lourdes.Security.Entity.Rol;
import com.portfolio.lourdes.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
