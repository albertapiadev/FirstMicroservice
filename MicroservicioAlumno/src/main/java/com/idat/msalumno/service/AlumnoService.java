package com.idat.msalumno.service;

import com.idat.msalumno.model.Alumno;

import java.util.List;

public interface AlumnoService {

    public List<Alumno> listarAlumnos();
    public String obtnerAlumno(Integer id);
    public void guardarAlumno(Alumno alumno);
    public void actualizarAlumno(Alumno alumno);
    public void eliminarAlumno(Integer id);
}
