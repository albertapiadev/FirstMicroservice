package com.idat.msalumno.service;

import com.idat.msalumno.model.Alumno;
import com.idat.msalumno.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        alumnoRepository.findAll().forEach(alumnos::add);
        return alumnos;
    }

    @Override
    public String obtnerAlumno(Integer id) {
        Alumno alumno = alumnoRepository.findById(id).orElse(null);
        return alumno.toString();
    }

    @Override
    public void guardarAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }


    @Override
    public void actualizarAlumno(Alumno alumno) {
        alumnoRepository.saveAndFlush(alumno);
    }


    @Override
    public void eliminarAlumno(Integer id) {
        alumnoRepository.deleteById(id);
    }
}
