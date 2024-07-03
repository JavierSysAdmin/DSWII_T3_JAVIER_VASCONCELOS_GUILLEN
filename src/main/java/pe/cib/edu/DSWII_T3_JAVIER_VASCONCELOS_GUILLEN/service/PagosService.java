package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Pagos;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository.PagosRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class PagosService implements IPagosService{
    private PagosRepository pagosRepository;
    @Override
    public List<Pagos> listarPagos() {
        return pagosRepository.findAll();
    }
}
