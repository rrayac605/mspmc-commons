package mx.gob.imss.cit.mspmccommons.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
public class PersonaFisicaJsonDTO {

	@Getter
	@Setter
	private String nombre;
	
	@Getter
	@Setter
	private String primerApellido;
	
	@Getter
	@Setter
	private String segundoApellido;

	@Getter
	@Setter
	private String rfc;

}
