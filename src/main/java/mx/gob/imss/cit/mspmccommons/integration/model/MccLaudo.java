package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_LAUDO")
public class MccLaudo {

	@Getter
	@Setter
	private String cveIdLaudo;

	@Getter
	@Setter
	private String desLaudo;
}
