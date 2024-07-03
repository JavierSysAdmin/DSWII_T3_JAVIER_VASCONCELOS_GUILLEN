package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.dto.DtoEntity;

@Component
public class DtoUtil {
    public DtoEntity convertirADto(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertirDtoAEntity(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(mapper, obj.getClass());
    }
}
