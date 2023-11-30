package mx.gob.imss.cit.mspmccommons.dto;

import lombok.Data;

@Data
public class MovimientoRequest {
	String objectId;
	String numNss;
	String numFolioMovtoOriginal;
	Integer cveSituacionRegistro;
	String desObservaciones;
	String cveCurp;
	Integer cveIdAccionRegistro;
}
