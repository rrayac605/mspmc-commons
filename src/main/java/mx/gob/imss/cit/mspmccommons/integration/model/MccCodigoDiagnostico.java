package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MCC_CODIGO_DIAGNOSTICO")
public class MccCodigoDiagnostico {

	@Getter
	@Setter
	private String cveIdCodigoDiagnostico;

	@Getter
	@Setter
	private String cveCieGenerico;

	@Getter
	@Setter
	private String desCodigoDiagnostico;

}
