package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Notas;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository.NotasRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class NotasService implements INotasService{
    private NotasRepository notasRepository;
    @Override
    public List<Notas> listarNotas() {
        return notasRepository.findAll();
    }
}
