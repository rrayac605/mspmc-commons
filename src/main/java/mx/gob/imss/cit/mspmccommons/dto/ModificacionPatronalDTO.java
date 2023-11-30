package mx.gob.imss.cit.mspmccommons.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_MODIFICACION_PATRONAL")
public class ModificacionPatronalDTO {


	@Getter
	@Setter
	private String cveIdModifPatron;
	
	@Getter
	@Setter
	private String desModifPatron;
}