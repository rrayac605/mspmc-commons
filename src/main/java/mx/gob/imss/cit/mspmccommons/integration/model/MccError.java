package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_ERROR")
public class MccError {

	@Getter
	@Setter
	private String cveIdCodigoError;

	@Getter
	@Setter
	private String desCodigoError;
}
