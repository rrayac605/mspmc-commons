package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_CASO_REGISTRO")
public class MccCasoRegistro {

	@Getter
	@Setter
	private String cveIdCasoRegistro;

	@Getter
	@Setter
	private String desCasoRegistro;

}
