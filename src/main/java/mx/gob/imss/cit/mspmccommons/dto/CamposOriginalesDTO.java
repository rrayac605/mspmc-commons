package mx.gob.imss.cit.mspmccommons.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.mspmccommons.support.CustomDateDeserializer;
import mx.gob.imss.cit.mspmccommons.utils.CustomDateSerializer;

public class CamposOriginalesDTO {

	@Getter
	@Setter
	private String nss;

	@Getter
	@Setter
	private String rp;

	@Getter
	@Setter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fechaInicio;

	@Getter
	@Setter
	private String tipoRiesgo;

	@Getter
	@Setter
	private String consecuencia;

	@Getter
	@Setter
	private String diasSubsidiados;

	@Getter
	@Setter
	private String procentaje;

	@Getter
	@Setter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fechaFin;

	@Getter
	@Setter
	private Boolean cambioNss;

	@Getter
	@Setter
	private Boolean cambioRp;

	@Getter
	@Setter
	private Integer cveEstadoRegistro;

	@Getter
	@Setter
	private String desEstadoRegistro;

}
