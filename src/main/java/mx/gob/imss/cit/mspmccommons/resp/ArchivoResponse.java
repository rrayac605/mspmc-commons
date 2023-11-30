package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class ArchivoResponse extends FechasAuditoriaResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String objectIdArchivo;

	@Getter
	@Setter
	private String desIdArchivo;

	@Getter
	@Setter
	private String nomArchivo;

	@Getter
	@Setter
	private Date fecProcesoCarga;

	@Getter
	@Setter
	private String desArchivo;

	@Getter
	@Setter
	private String desError;

	@Getter
	@Setter
	private String numTotalRegistros;

	@Getter
	@Setter
	private String cveEstadoArchivo;

	@Getter
	@Setter
	private String desEstadoArchivo;

	@Getter
	@Setter
	private String cveOrigenArchivo;

	@Getter
	@Setter
	private String desOrigenArchivo;

	@Getter
	@Setter
	private CifrasControlResponse cifrasControlDTO;
	
}
