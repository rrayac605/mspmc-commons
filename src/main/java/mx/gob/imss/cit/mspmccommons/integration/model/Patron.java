package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
public class Patron implements Serializable {

	private static final long serialVersionUID = 1L;
	@Setter
	@Getter
	private String refRegistroPatronal;
	@Setter
	@Getter
	private String desRazonSocial;
	@Setter
	@Getter
	private String desRfc;
	@Setter
	@Getter
	private String objectIdPatron;
	@Setter
	@Getter
	private String fecAlta;
	@Setter
	@Getter
	private String fecBaja;
	@Setter
	@Getter
	private String fecActualizacion;
	@Setter
	@Getter
	private String cveClase;
	@Setter
	@Getter
	private String cveDelRegPatronal;
	@Setter
	@Getter
	private String cveFraccion;
	@Setter
	@Getter
	private String cvePrima;
	@Setter
	@Getter
	private String cveSubDelRegPatronal;
	@Setter
	@Getter
	private String desClase;
	@Setter
	@Getter
	private String desDelRegPatronal;
	@Setter
	@Getter
	private String desFraccion;
	@Setter
	@Getter
	private String desPrima;
	@Setter
	@Getter
	private String desSubDelRegPatronal;

}
