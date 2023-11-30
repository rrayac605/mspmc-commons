package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_CONSECUENCIA")
public class MccConsecuencia {

	@Getter
	@Setter
	private String cveIdConsecuencia;

	@Getter
	@Setter
	private String desConsecuencia;
}
