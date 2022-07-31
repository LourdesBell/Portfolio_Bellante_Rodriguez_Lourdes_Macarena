package com.portfolio.lourdes.Service;

import com.portfolio.lourdes.Entity.SobreMi;
import com.portfolio.lourdes.Repository.RSobreMi;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSobreMi {
      @Autowired
     RSobreMi rSobreMi;
     
     public List<SobreMi>list(){
         return rSobreMi.findAll();
     }
     
     public Optional<SobreMi>getOne(int id){
         return rSobreMi.findById(id);
     }
     
     public Optional<SobreMi>getByNombreSobreMi(String nombreSobreMi){
         return rSobreMi.findByNombreSobreMi(nombreSobreMi);
     }
     
     public void save(SobreMi sobreMi){
         rSobreMi.save(sobreMi);
     }
     
     public void delete(int id){
         rSobreMi.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rSobreMi.existsById(id);
     }
     
     public boolean existsByNombreSobreMi(String nombreSobreMi){
         return rSobreMi.existsByNombreSobreMi(nombreSobreMi);
     }
}