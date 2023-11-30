package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_ESTADO_REGISTRO")
public class MccEstadoRegistro {

	@Getter
	@Setter
	private String cveIdEstadoRegistro;

	@Getter
	@Setter
	private String desEstadoRegistro;

}
