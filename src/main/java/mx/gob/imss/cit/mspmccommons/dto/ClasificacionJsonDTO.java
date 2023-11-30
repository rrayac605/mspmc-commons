package mx.gob.imss.cit.mspmccommons.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
public class ClasificacionJsonDTO {

	@Setter
	@Getter
	private String giro;

	@Setter
	@Getter
	private FraccionJsonDTO fraccion;

	@Setter
	@Getter
	private BigDecimal primaSRTActual;

}
