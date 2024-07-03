package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.dto.DtoEntity;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.dto.NotasDto;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service.INotasService;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/pubs")
@PreAuthorize("hasRole('Supervisor')")
public class NotasController {

    private final INotasService iNotasService;

    @GetMapping("")
    public ResponseEntity<List<DtoEntity>> listarNotas() {
        List<DtoEntity> notasDtoList = iNotasService.listarNotas()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x, new NotasDto()))
                .collect(Collectors.toList());

        if (notasDtoList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(notasDtoList, HttpStatus.OK);
    }
}