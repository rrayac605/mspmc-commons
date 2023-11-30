package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class DetalleTotalesCodErrorDTO {

	private String codError;
	private String descripcioError;
	private Long numError;
	private Long numTotalRTT;
	private Long numTotalST3;
	private Long numTotalST5;
	private Long numTotalTipoError;
	private Long numErrorOtras;
	private Long numTotalRTTOtras;
	private Long numTotalST3Otras;
	private Long numTotalST5Otras;
	private Long numTotalTipoErrorOtras;

}
