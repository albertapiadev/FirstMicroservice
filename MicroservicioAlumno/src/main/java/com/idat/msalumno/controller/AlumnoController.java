package com.idat.msalumno.controller;

import com.idat.msalumno.model.Alumno;
import com.idat.msalumno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

//    @GetMapping("/")
//    public @ResponseBody String getAlumno() {
//        return "alumno";
//    }

    @GetMapping("/listar")
    public @ResponseBody List<Alumno> listarAlumnos() {

        return alumnoService.listarAlumnos();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody String obtnerAlumno(@PathVariable Integer id) {

        return alumnoService.obtnerAlumno(id);
    }

    @PostMapping("/guardar")
    public void guardarAlumno(@RequestBody Alumno alumno) {

        alumnoService.guardarAlumno(alumno);
    }

    @PutMapping("/actualizar")
    public void actualizarAlumno(@RequestBody Alumno alumno) {

        alumnoService.actualizarAlumno(alumno);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarAlumno(@PathVariable Integer id) {

        alumnoService.eliminarAlumno(id);
    }
}
