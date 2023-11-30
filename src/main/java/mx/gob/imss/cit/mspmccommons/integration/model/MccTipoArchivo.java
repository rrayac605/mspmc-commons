package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_TIPO_ARCHIVO")
public class MccTipoArchivo {
	@Getter
	@Setter
	private String cveIdTipoArchivo;

	@Getter
	@Setter
	private String desArchivo;
}
