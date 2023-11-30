package mx.gob.imss.cit.mspmccommons.integration.model;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCT_AUDITORIA")
public class AuditoriaDTO extends FechasAuditoriaDTO {

	@Getter
	@Setter
	private String nomUsuario;

	@Getter
	@Setter
	private String numFolioMovOriginal;

	@Getter
	@Setter
	private String desObservacionesAprobador;

	@Getter
	@Setter
	private String desObservacionesSol;

	@Getter
	@Setter
	private Integer cveIdAccionRegistro;

	@Getter
	@Setter
	private String desAccionRegistro;

	@Getter
	@Setter
	private String desCambio;

	@Getter
	@Setter
	private String accion;
	
	@Getter
	@Setter
	private String desSituacionRegistro;
	
	@Getter
	@Setter
	private Integer cveSituacionRegistro;

	@Getter
	@Setter
	private CamposOriginalesDTO camposOriginalesDTO;

	@Setter
	@Getter
	private List<BitacoraErroresDTO> bitacoraErroresDTO;

}
