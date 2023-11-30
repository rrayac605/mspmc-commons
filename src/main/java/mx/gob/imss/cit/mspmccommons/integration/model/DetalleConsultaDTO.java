package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class DetalleConsultaDTO {

	private String tipoArchivo;
	private String desDelegacion;
	private Long numTotalRegistros;
	private Long numRegistrosCorrectos;
	private Long numRegistrosCorrectosOtras;
	private Long numRegistrosErrorOtras;
	private Long numRegistrosError;
	private Long numRegistrosSusOtras;
	private Long numRegistrosDupOtras;
	private Long numRegistrosBaja;
	private Long numRegistrosBajaOtras;
	private Long numRegistrosDup;
	private Long numRegistrosSus;
}
