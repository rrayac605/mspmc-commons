package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_OCUPACION_NSSA")
public class MccOcupacionNssa {

	@Getter
	@Setter
	private String cveOcupacion;

	@Getter
	@Setter
	private String desOcupacion;

}
