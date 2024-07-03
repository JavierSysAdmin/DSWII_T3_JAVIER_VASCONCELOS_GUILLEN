package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Curso;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository.CursoRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class CursoService implements ICursoService{
    private CursoRepository cursoRepository;
    @Override
    public List<Curso> listarCurso() {
        return cursoRepository.findAll();
    }
}
