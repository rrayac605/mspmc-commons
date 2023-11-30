package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class MovimientosOutputDTO {
	
	String numNss;
	String nomCompletoAsegurado;
	String refRegistroPatronal;
	String fecInicio;
	String desConsecuencia;
	Integer cveConsecuencia;
	String desTipoRiesgo;
	Integer cveTipoRiesgo;
	Integer numDiasSubsidiados;
	String porcentajeIncapacidad;
	String fecFin;
	String desEstadoRegistro;
	Integer cveEstadoRegistro;
	String numFolioMovtoOriginal;
	String objectId;
	Integer position;
	String objectIdOrigen;
	String objectIdArchivo;
	
}
