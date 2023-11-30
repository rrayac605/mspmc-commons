package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_ACCION_REGISTRO")
@JsonPropertyOrder({ "cveIdAccionRegistro", "desAccionRegistro" })
public class MccAccionRegistro implements Serializable {
	private static final long serialVersionUID = 7868037847657235949L;

	@Getter
	@Setter
	private Integer cveIdAccionRegistro;

	@Getter
	@Setter
	private String desAccionRegistro;

}
