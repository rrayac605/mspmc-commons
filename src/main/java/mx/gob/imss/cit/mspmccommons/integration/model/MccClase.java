package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_CLASE")
public class MccClase {

	@Getter
	@Setter
	private String cveIdClase;

	@Getter
	@Setter
	private String desClase;
}
