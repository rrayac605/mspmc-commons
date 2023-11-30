package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

public class PatronResponse extends FechasAuditoriaResponse implements Serializable{

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
	private Integer cveClase;
	
	@Setter
	@Getter
	private Integer cveDelRegPatronal;
	
	@Setter
	@Getter
	private Integer cveFraccion;
	
	@Setter
	@Getter
	private BigDecimal numPrima;
	
	@Setter
	@Getter
	private Integer cveSubDelRegPatronal;
	
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

	@Setter
	@Getter
	private String cveDelegacionAux;

	@Setter
	@Getter
	private String cveModalidad;
	
}
