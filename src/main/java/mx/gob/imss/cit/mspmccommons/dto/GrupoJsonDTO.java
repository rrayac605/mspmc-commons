package mx.gob.imss.cit.mspmccommons.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
public class GrupoJsonDTO {

	@Setter
	@Getter
	private int id;

	@Setter
	@Getter
	private String descripcion;
	
	
	
	@Setter
	@Getter
	private DivisionDTO  division;
	
	@Setter
	@Getter
	private int numGrupo;

}
