package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_TIPO_INCAPACIDAD")
public class MccTipoIncapacidad {

	@Getter
	@Setter
	private Integer cveTipoIncapacidad;

	@Getter
	@Setter
	private String desDescripcion;
}
