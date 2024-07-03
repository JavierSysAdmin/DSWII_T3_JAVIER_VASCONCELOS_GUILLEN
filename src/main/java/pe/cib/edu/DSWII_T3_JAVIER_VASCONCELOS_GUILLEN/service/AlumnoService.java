package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Alumno;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository.AlumnoRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class AlumnoService implements IAlumnoService{
    private AlumnoRepository alumnoRepository;
    @Override
    public List<Alumno> listarAlumno() {
        return alumnoRepository.findAll();
    }
}
