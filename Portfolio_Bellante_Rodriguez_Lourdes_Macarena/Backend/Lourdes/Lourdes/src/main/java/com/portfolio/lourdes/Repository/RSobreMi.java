package com.portfolio.lourdes.Repository;

import com.portfolio.lourdes.Entity.SobreMi;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobreMi extends JpaRepository<SobreMi, Integer>{
    public Optional<SobreMi>findByNombreSobreMi(String nombreSobreMi);
    public boolean existsByNombreSobreMi(String nombreSobreMi);
}
