package com.portfolio.lourdes.Interface;
import com.portfolio.lourdes.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();
    
    // Guardar un obj de tipo persona
    public void savePersona(Persona persona);
    
    // Eliminar un usuario por ID
    public void deletePersona(Long id);
    
    // Buscar persona por ID
    public Persona findPersona(Long id);
}
