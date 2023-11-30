package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class IncapacidadResponse extends FechasAuditoriaResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@Setter
	@Getter
	private String objectIdIncapacidad;
	
	@Setter
	@Getter
	private Date fecInicio;
	
	@Setter
	@Getter
	private Date fecAtencion;
	
	@Setter
	@Getter
	private Date fecAccidente;
	
	@Setter
	@Getter
	private Date fecAltaIncapacidad;
	
	@Setter
	@Getter
	private Date fecExpDictamen;
	
	@Setter
	@Getter
	private Date fecFin;
	
	@Setter
	@Getter
	private Integer numDiasSubsidiados;
	
	@Setter
	@Getter
	private BigDecimal porPorcentajeIncapacidad;
	
	@Setter
	@Getter
	private String numCausaExterna;
	
	@Setter
	@Getter
	private String desCausaExterna;
	
	@Setter
	@Getter
	private String numRiesgoFisico;
	
	@Setter
	@Getter
	private String desRiesgoFisico;
	
	@Setter
	@Getter
	private String numActoInseguro;
	
	@Setter
	@Getter
	private String desActoInseguro;
	
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
	private String desCodigoDiagnostico;
	
	@Setter
	@Getter
	private Date fecIniPension;
	
	@Setter
	@Getter
	private String cveConsecuencia;
	
	@Setter
	@Getter
	private Integer cveLaudo;
	
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
	
	@Setter
	@Getter
	private Integer cveTipoIncapacidad;
	
	@Setter
	@Getter
	private String desTipoIncapacidad;
	
	@Setter
	@Getter
	private Integer cveTipoModifPatronal;
	
	@Setter
	@Getter
	private String desTipoModifPatronal;
	
	@Setter
	@Getter
	private boolean modifPatronal;


	@Setter
	@Getter
	private List<BitacoraDictamenResponse> bitacoraDictamen;
}
