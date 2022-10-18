package com.udea.persona.controller;

import com.udea.persona.exception.ModelNotFound;
import com.udea.persona.model.Persona;
import com.udea.persona.service.PersonaService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/guardar")
    public long guardarPersona(@RequestBody Persona persona){
        personaService.guardarPersona(persona);
        return persona.getId();
    }

    @GetMapping("/listar")
    public Iterable<Persona> listarPersonas(){
        return personaService.listarPersonas();
    }

    @GetMapping("/buscar/{id}")
    public Persona buscarPersonaPorId(@PathVariable("id") Long id){
        Optional<Persona> persona = personaService.buscarPersonaPorId(id);
        if(persona.isPresent()){
            return persona.get();
        }
        throw new ModelNotFound("No se encontro la persona con el id: " + id);
        }

    @PutMapping("/actualizar")
    public void actualizarPersona(@RequestBody Persona persona){
        personaService.actualizarPersona(persona);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarPersona(@PathVariable("id") Long id){
        Optional<Persona> persona = personaService.buscarPersonaPorId(id);
        if(persona.isPresent()){
            personaService.eliminarPersona(persona.get());
        }
        throw new ModelNotFound("No se encontro la persona con el id: " + id);
    }

}
