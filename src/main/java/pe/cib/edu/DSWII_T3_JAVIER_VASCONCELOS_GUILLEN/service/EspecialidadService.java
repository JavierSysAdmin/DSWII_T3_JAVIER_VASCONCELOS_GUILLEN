package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Especialidad;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository.EspecialidadRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class EspecialidadService implements IEspecialidadService{
    private EspecialidadRepository especialidadRepository;
    @Override
    public List<Especialidad> listarEspecialidad() {
        return especialidadRepository.findAll();
    }
}
