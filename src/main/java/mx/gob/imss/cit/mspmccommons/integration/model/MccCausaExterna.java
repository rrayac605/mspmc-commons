package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_CAUSA_EXTERNA")
public class MccCausaExterna {

	@Getter
	@Setter
	private String cveIdCausaExterna;

	@Getter
	@Setter
	private String desCausaExterna;

}
