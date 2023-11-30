package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.Setter;

public class DetalleRegistroResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private ObjectId objectIdArchivoDetalle;

	@Getter
	@Setter
	private ObjectId identificadorArchivo;

	@Getter
	@Setter
	private Date fecProcesoCarga;

	@Getter
	@Setter
	private String desObservacionesSol;

	@Getter
	@Setter
	private String desObservacionesAprobador;

	@Getter
	@Setter
	private Integer cveSituacionRegistro;

	@Getter
	@Setter
	private String desSituacionRegistro;

	@Getter
	@Setter
	private String cveOrigenArchivo;

	@Getter
	@Setter
	private String objectIdOrigen;

	@Getter
	@Setter
	private ObjectId idOrigenAlta;

	@Getter
	@Setter
	private String idArchivoDetalleSUS;

	@Getter
	@Setter
	private AseguradoResponse aseguradoDTO;

	@Getter
	@Setter
	private PatronResponse patronDTO;

	@Getter
	@Setter
	private IncapacidadResponse incapacidadDTO;

	@Setter
	@Getter
	private List<BitacoraErroresResponse> bitacoraErroresDTO;

	@Setter
	@Getter
	private List<AuditoriaResponse> auditorias;

	@Setter
	@Getter
	private List<String> listaSuceptible;

	@Setter
	@Getter
	private String origenAlta;

	@Setter
	@Getter
	private String numNss;

	@Setter
	@Getter
	private boolean existeCambios;

	@Setter
	@Getter
	private String origenPantalla;

	@Getter
	@Setter
	private ArchivoResponse archivoDTO;

	@Getter
	@Setter
	private Boolean isPending;

	@Getter
	@Setter
	private Boolean existeRelacionLaboral;

	@Getter
	@Setter
	private String identificador;
	
	@Getter
	@Setter
	private Boolean confirmarSinCambios;
	
}
