package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class Asegurado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Setter
	@Getter
	private String numNss;
	@Setter
	@Getter
	private String refCurp;
	@Setter
	@Getter
	private String nomAsegurado;
	@Setter
	@Getter
	private String numSalarioDiario;
	@Setter
	@Getter
	private String numCicloAnual;
	@Setter
	@Getter
	private String refFolioOriginal;
	@Setter
	@Getter
	private String fecAlta;
	@Setter
	@Getter
	private String fecBaja;
	@Setter
	@Getter
	private String fecActualizacion;
	@Setter
	@Getter
	private String cveCasoRegistro;
	@Setter
	@Getter
	private String cveCodigoError;
	@Setter
	@Getter
	private String cveDelegacionAtencion;
	@Setter
	@Getter
	private String cveDelegacionNss;
	@Setter
	@Getter
	private String cveEstadoRegistro;
	@Setter
	@Getter
	private String cveSubDelAtencion;
	@Setter
	@Getter
	private String cveSubdelNss;
	@Setter
	@Getter
	private String cveUmfAdscripcion;
	@Setter
	@Getter
	private String cveUmfExp;
	@Setter
	@Getter
	private String cveUmfPagadora;
	@Setter
	@Getter
	private String cveOcupacion;
	@Setter
	@Getter
	private String objectIdArchivo;
	@Setter
	@Getter
	private String desCasoRegistro;
	@Setter
	@Getter
	private String desCodigoError;
	@Setter
	@Getter
	private String desDelegacionAtencion;
	@Setter
	@Getter
	private String desDelegacionNss;
	@Setter
	@Getter
	private String desEstadoRegistro;
	@Setter
	@Getter
	private String desOcupacion;
	@Setter
	@Getter
	private String desSubDelAtencion;
	@Setter
	@Getter
	private String desSubDelNss;
	@Setter
	@Getter
	private String desUmfAdscripcion;
	@Setter
	@Getter
	private String desUmfExp;
	@Setter
	@Getter
	private String desUmfPagadora;

}
