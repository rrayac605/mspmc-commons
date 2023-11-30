package mx.gob.imss.cit.mspmccommons.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

import mx.gob.imss.cit.mspmccommons.support.CustomDateDeserializer;
import mx.gob.imss.cit.mspmccommons.utils.CustomDateSerializer;

@Document
public class IncapacidadDTO extends FechasAuditoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Setter
	@Getter
	private String objectIdIncapacidad;
	
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecInicio;
	
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAtencion;
	
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAccidente;
	
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAltaIncapacidad;
	
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecExpDictamen;
	
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
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
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
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
	private List<BitacoraDictamenDTO> bitacoraDictamen;
}
