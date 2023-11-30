package mx.gob.imss.cit.mspmccommons.dto;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DetalleRegistroTO {

    private ObjectId objectIdArchivoDetalle;
    private ObjectId identificadorArchivo;
    private Date fecProcesoCarga;
    private String desObservacionesSol;
    private String desObservacionesAprobador;
    private Integer cveSituacionRegistro;
    private String desSituacionRegistro;
    private String cveOrigenArchivo;
    private String objectIdOrigen;
    private ObjectId idOrigenAlta;
    private String idArchivoDetalleSUS;
    private AseguradoDTO aseguradoDTO;
    private PatronDTO patronDTO;
    private IncapacidadDTO incapacidadDTO;
    private List<BitacoraErroresDTO> bitacoraErroresDTO;
    private List<AuditoriaDTO> auditorias;
    private List<String> listaSuceptible;
    private String origenAlta;
    private String numNss;
    private boolean existeCambios;
    private String  origenPantalla ;
    private ArchivoDTO archivoDTO;
    private Boolean isPending;
    private String identificador;

}
