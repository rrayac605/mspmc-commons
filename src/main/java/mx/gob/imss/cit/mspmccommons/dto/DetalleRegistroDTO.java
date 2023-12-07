package mx.gob.imss.cit.mspmccommons.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.mspmccommons.support.CustomDateDeserializer;
import mx.gob.imss.cit.mspmccommons.utils.CustomDateSerializer;

@Document("MCT_MOVIMIENTO")
@JsonPropertyOrder({ "objectIdArchivoDetalle", "objectIdArchivoDetalle" })
public class DetalleRegistroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	private ObjectId objectIdArchivoDetalle;

	@Getter
	@Setter
	private ObjectId identificadorArchivo;

	@Getter
	@Setter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
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
	private AseguradoDTO aseguradoDTO;

	@Getter
	@Setter
	private PatronDTO patronDTO;

	@Getter
	@Setter
	private IncapacidadDTO incapacidadDTO;

	@Setter
	@Getter
	private List<BitacoraErroresDTO> bitacoraErroresDTO;

	@Setter
	@Getter
	private List<AuditoriaDTO> auditorias;

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
	/**
	 * Datos del archivo *Nota: Este campo solo es utilizado para consultar los
	 * datos del archivo cuando se hace el join de las tablas, en si no corresponde
	 * como tal al documento MCT_ARCHIVO_DETALLE
	 */
	private ArchivoDTO archivoDTO;

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
	
	@Getter
	private List<CambioDTO> cambiosDTO;

}
