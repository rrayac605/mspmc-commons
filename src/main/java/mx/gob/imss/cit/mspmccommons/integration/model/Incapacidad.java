package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class Incapacidad implements Serializable {

	private static final long serialVersionUID = 1L;
	@Setter
	@Getter
	private String objectIdIncapacidad;
	@Setter
	@Getter
	private String fecInicio;
	@Setter
	@Getter
	private String fecAtencion;
	@Setter
	@Getter
	private String fecAccidente;
	@Setter
	@Getter
	private String fecAltaIncapacidad;
	@Setter
	@Getter
	private String fecExpDictamen;
	@Setter
	@Getter
	private String fecFin;
	@Setter
	@Getter
	private String numDiasSubsidiados;
	@Setter
	@Getter
	private String porPorcentajeIncapacidad;
	@Setter
	@Getter
	private String numCausaExterna;
	@Setter
	@Getter
	private String numRiesgoFisico;
	@Setter
	@Getter
	private String numActoInseguro;
	@Setter
	@Getter
	private String numMatMedAutCdst;
	@Setter
	@Getter
	private String numMatMedTratante;
	@Setter
	@Getter
	private String numCodigoDiagnostico;
	@Setter
	@Getter
	private String fecIniPension;
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
	private String objectIdAsegurado;
	@Setter
	@Getter
	private String cveConsecuencia;
	@Setter
	@Getter
	private String cveLaudo;
	@Setter
	@Getter
	private String cveTipoRiesgo;
	@Setter
	@Getter
	private String cveNaturaleza;
	@Setter
	@Getter
	private String desConsecuencia;
	@Setter
	@Getter
	private String desLaudo;
	@Setter
	@Getter
	private String desNaturaleza;
	@Setter
	@Getter
	private String desTipoRiesgo;
	@Setter
	@Getter
	private String cveReevaluacion;

}
