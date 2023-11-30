package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_SITUACION_REGISTRO")
public class MccSituacionRegistro {

	@Getter
	@Setter
	private String cveIdSituacionRegistro;

	@Getter
	@Setter
	private String desSituacionRegistro;

}
