package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_ESTADO_ARCHIVO")
public class MccEstadoArchivo {

	@Getter
	@Setter
	private String cveIdEstadoArchivo;

	@Getter
	@Setter
	private String desEstadoArchivo;
}
