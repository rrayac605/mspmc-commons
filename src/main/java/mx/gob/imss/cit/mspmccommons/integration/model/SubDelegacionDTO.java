package mx.gob.imss.cit.mspmccommons.integration.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
public class SubDelegacionDTO {

	@Setter
	@Getter
	private int clave;

	@Setter
	@Getter
	private DelegacionDTO delegacion;

	@Setter
	@Getter
	private String descripcion;

	@Setter
	@Getter
	private int id;

}
