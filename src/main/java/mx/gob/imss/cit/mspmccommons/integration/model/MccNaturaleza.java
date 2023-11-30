package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_NATURALEZA")
public class MccNaturaleza {

	@Getter
	@Setter
	private String cveIdNaturaleza;

	@Getter
	@Setter
	private String desNaturaleza;
}
