package com.idat.msalumno.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumno;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String fechaNacimiento;
}
