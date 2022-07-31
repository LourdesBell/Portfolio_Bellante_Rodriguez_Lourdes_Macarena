package com.portfolio.lourdes.Service;

import com.portfolio.lourdes.Entity.Proyectos;
import com.portfolio.lourdes.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
      @Autowired
     RProyectos rProyectos;
     
     public List<Proyectos>list(){
         return rProyectos.findAll();
     }
     
     public Optional<Proyectos>getOne(int id){
         return rProyectos.findById(id);
     }
     
     public Optional<Proyectos>getByNombreProyectos(String nombreProyectos){
         return rProyectos.findByNombreProyectos(nombreProyectos);
     }
     
     public void save(Proyectos pro){
         rProyectos.save(pro);
     }
     
     public void delete(int id){
         rProyectos.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyectos.existsById(id);
     }
     
     public boolean existsByNombreProyectos(String nombreProyectos){
         return rProyectos.existsByNombreProyectos(nombreProyectos);
     }
}
