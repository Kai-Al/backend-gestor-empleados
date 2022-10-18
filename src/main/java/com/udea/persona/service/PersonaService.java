package com.udea.persona.service;

import com.udea.persona.dao.IPersonaDao;
import com.udea.persona.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private IPersonaDao personaDao;

    public void guardarPersona(Persona persona) {
        personaDao.save(persona);

    }

    public void eliminarPersona(Persona persona) {
        personaDao.delete(persona);
    }

    public void actualizarPersona(Persona persona) {
        personaDao.save(persona);
    }

    public Iterable<Persona> listarPersonas() {
        return personaDao.findAll();
    }

    public Optional<Persona> buscarPersonaPorId(Long id) {
        return personaDao.findById(id);
    }

}
