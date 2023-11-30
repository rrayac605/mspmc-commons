package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_TIPO_RIESGO")
public class MccTipoRiesgo {

	@Getter
	@Setter
	private String cveIdTipoRegistro;

	@Getter
	@Setter
	private String desDescripcion;

}
