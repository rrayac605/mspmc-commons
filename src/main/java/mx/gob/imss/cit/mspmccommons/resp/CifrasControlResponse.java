package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class CifrasControlResponse extends FechasAuditoriaResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@Setter
	@Getter
	private long numTotalRegistros;
	@Setter
	@Getter
	private long numRegistrosCorrectos;
	@Setter
	@Getter
	private long numRegistrosCorrectosOtras;
	@Setter
	@Getter
	private long numRegistrosErrorOtras;
	@Setter
	@Getter
	private long numRegistrosError;
	@Setter
	@Getter
	private long numRegistrosSusOtras;
	@Setter
	@Getter
	private long numRegistrosDupOtras;
	@Setter
	@Getter
	private long numRegistrosBaja;
	@Setter
	@Getter
	private long numRegistrosBajaOtras;
	@Setter
	@Getter
	private long numRegistrosDup;
	@Setter
	@Getter
	private long numRegistrosSus;
	
}
