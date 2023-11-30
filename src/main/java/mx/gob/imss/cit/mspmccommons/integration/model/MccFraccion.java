package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_FRACCION")
public class MccFraccion {

	@Getter
	@Setter
	private String cveFraccion;

	@Getter
	@Setter
	private String desFraccion;
}
