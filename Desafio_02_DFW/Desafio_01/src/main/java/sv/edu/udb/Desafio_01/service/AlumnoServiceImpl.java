package sv.edu.udb.Desafio_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.Desafio_01.Alumno;
import sv.edu.udb.Desafio_01.repository.AlumnoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Optional<Alumno> obtenerAlumnoPorId(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno actualizarAlumno(Long id, Alumno alumno) {
        alumno.setId(id);
        return alumnoRepository.save(alumno);
    }

    @Override
    public void eliminarAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }
}
