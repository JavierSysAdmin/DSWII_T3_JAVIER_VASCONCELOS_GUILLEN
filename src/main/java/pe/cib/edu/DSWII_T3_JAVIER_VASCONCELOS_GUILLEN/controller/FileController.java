package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.dto.ArchivoDto;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service.FileService;

import java.util.List;

@PreAuthorize("hasRole('ADMIN')")
@AllArgsConstructor
@RestController
@RequestMapping(path = "/files")
public class FileController {

    private final FileService fileService;

    @PostMapping("")
    public ResponseEntity<ArchivoDto> subirArchivos(
            @RequestParam("filesdoc")List<MultipartFile> multipartFileList
    ) throws Exception{
        fileService.guardarArchivos(multipartFileList);
        return new ResponseEntity<>(ArchivoDto.builder()
                .mensaje("Archivos subidos correctamente").build(),
                HttpStatus.OK);
    }
}
