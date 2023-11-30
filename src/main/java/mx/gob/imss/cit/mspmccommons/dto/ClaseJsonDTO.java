package mx.gob.imss.cit.mspmccommons.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
public class ClaseJsonDTO {

	@Setter
	@Getter
	private int clave;

	@Setter
	@Getter
	private String descripcion;

}
