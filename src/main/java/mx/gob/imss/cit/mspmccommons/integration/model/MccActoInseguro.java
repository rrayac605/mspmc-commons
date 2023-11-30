package mx.gob.imss.cit.mspmccommons.integration.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Document(collection = "MCC_ACTO_INSEGURO")
public class MccActoInseguro {

		@Getter
		@Setter
		private String cveIdActoInseguro;
		
		@Getter
		@Setter
		private String desDescripcion;
	}
