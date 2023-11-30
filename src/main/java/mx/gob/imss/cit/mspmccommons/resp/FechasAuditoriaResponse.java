package mx.gob.imss.cit.mspmccommons.resp;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class FechasAuditoriaResponse {

	@Setter
	@Getter
	private Date fecAlta;
	
	@Setter
	@Getter
	private Date fecBaja;
	
	@Setter
	@Getter
	private Date fecActualizacion;
}
