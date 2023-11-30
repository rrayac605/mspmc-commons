package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class ReporteCodigoErrorResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String _id;

	@Getter
	@Setter
	private String desError;

	@Getter
	@Setter
	private Long RTT_D;

	@Getter
	@Setter
	private Long RTT_O;

	@Getter
	@Setter
	private Long ST3_D;

	@Getter
	@Setter
	private Long ST3_O;

	@Getter
	@Setter
	private Long ST5_D;

	@Getter
	@Setter
	private Long ST5_O;

	@Getter
	@Setter
	private Long AJU_D;

	@Getter
	@Setter
	private Long AJU_O;

	@Getter
	@Setter
	private Long COD_D;

	@Getter
	@Setter
	private Long COD_O;

	@Getter
	@Setter
	private Long ROD_D;

	@Getter
	@Setter
	private Long ROD_O;
	
	@Getter
	@Setter
	private Long conteo;
	
}
