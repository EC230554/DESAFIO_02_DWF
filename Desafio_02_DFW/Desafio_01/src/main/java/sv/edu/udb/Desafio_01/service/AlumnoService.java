package sv.edu.udb.Desafio_01.service;

import sv.edu.udb.Desafio_01.Alumno;

import java.util.List;
import java.util.Optional;

public interface AlumnoService {
    List<Alumno> listarAlumnos();
    Optional<Alumno> obtenerAlumnoPorId(Long id);
    Alumno guardarAlumno(Alumno alumno);
    Alumno actualizarAlumno(Long id, Alumno alumno);
    void eliminarAlumno(Long id);
}
