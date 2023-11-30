package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_OCUPACION_SISAT")
public class MccOcupacionSisat {

	@Getter
	@Setter
	private String cveOcupacion;

	@Getter
	@Setter
	private String desOcupacion;

}
