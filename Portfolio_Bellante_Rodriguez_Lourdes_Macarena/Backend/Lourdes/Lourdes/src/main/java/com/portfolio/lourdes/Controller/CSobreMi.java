package com.portfolio.lourdes.Controller;

import com.portfolio.lourdes.Dto.dtoSobreMi;
import com.portfolio.lourdes.Entity.SobreMi;
import com.portfolio.lourdes.Security.Controller.Mensaje;
import com.portfolio.lourdes.Service.SSobreMi;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sobremi")
@CrossOrigin(origins = "http://localhost:4200")
public class CSobreMi {
    
    @Autowired
    SSobreMi sSobreMi;
    
    @GetMapping("/lista")
    public ResponseEntity<List<SobreMi>> list(){
        List<SobreMi> list = sSobreMi.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<SobreMi> getById(@PathVariable("id") int id){
        if(!sSobreMi.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        SobreMi sobreMi = sSobreMi.getOne(id).get();
        return new ResponseEntity(sobreMi, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSobreMi.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sSobreMi.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSobreMi dtosobremi){      
        if(StringUtils.isBlank(dtosobremi.getTituloSobreMi()))
            return new ResponseEntity(new Mensaje("El Titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sSobreMi.existsByTituloSobreMi(dtosobremi.getTituloSobreMi()))
            return new ResponseEntity(new Mensaje("Esa info existe"), HttpStatus.BAD_REQUEST);
        
        SobreMi sobreMi = new SobreMi(dtosobremi.getTituloSobreMi(), dtosobremi.getDescripcionSobreMi());
        sSobreMi.save(sobreMi);
        
        return new ResponseEntity(new Mensaje("Sobre Mi agregado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSobreMi dtosobremi){
        //Validamos si existe el ID
        if(!sSobreMi.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        
        if(sSobreMi.existsByTituloSobreMi(dtosobremi.getTituloSobreMi()) && sSobreMi.getByTituloSobreMi(dtosobremi.getTituloSobreMi()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese Sobre Mi ya existe"), HttpStatus.BAD_REQUEST);
        
        //No puede estar vacio
        if(StringUtils.isBlank(dtosobremi.getTituloSobreMi()))
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        
        SobreMi sobreMi = sSobreMi.getOne(id).get();
        sobreMi.setTituloSobreMi(dtosobremi.getTituloSobreMi());
        sobreMi.setDescripcionSobreMi((dtosobremi.getDescripcionSobreMi()));
        
        sSobreMi.save(sobreMi);
        return new ResponseEntity(new Mensaje("SobreMi actualizada"), HttpStatus.OK);
             
    }
    
}
