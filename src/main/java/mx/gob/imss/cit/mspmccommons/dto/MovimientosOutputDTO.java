package mx.gob.imss.cit.mspmccommons.dto;

import java.util.Date;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class MovimientosOutputDTO {

	String numNss;
	String nomCompletoAsegurado;
	String refRegistroPatronal;
	String fecInicio;
	String desConsecuencia;
	String cveConsecuencia;
	String desTipoRiesgo;
	String cveTipoRiesgo;
	Integer numDiasSubsidiados;
	String porcentajeIncapacidad;
	Long porcentajeIncapacidadLong;
	String fecFin;
	String desEstadoRegistro;
	Integer cveEstadoRegistro;
	String desSituacionRegistro;
	Integer cveSituacionRegistro;
	String numFolioMovtoOriginal;
	String objectId;
	Integer position;
	String objectIdOrigen;
	String objectIdArchivo;
	Boolean isChange;
	Date fecActualizacion;
	ObjectId idOrigenAlta;
	
}
