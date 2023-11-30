package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class CifrasControl implements Serializable {

	private static final long serialVersionUID = 1L;
	@Setter
	@Getter
	private String numTotalRegistros;
	@Setter
	@Getter
	private String numRegistrosCorrectos;
	@Setter
	@Getter
	private String numRegistrosCorrectosOtras;
	@Setter
	@Getter
	private String numRegistrosErrorOtras;
	@Setter
	@Getter
	private String numRegistrosError;
	@Setter
	@Getter
	private String numRegistrosSusOtras;
	@Setter
	@Getter
	private String numRegistrosDupOtras;
	@Setter
	@Getter
	private String numRegistrosBaja;
	@Setter
	@Getter
	private String numRegistrosBajaOtras;
	@Setter
	@Getter
	private String numRegistrosDup;
	@Setter
	@Getter
	private String numRegistrosSus;

}
