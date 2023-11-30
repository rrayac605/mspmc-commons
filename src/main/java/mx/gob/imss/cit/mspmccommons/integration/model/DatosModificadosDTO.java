package mx.gob.imss.cit.mspmccommons.integration.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.mspmccommons.dto.BitacoraDictamenDTO;
import mx.gob.imss.cit.mspmccommons.dto.CambioDTO;

import lombok.Data;

@Data
public class DatosModificadosDTO {

	String nssModificado;
	String rpModificado;
	Date fecInicioModificado; 
	Integer cveTipoRiesgoModificado;
	String desTipoRiesgoModificado;
	String desConsecuenciaModificado;
	Integer cveConsecuecniaModificado;
	Integer numDiasSubsidiadosModificado;
	BigDecimal porcentajeIncapacidadModificado;
	Date fecFinModificado;
	String objectIdOrigen;
	Integer position;
	String numFolioMovtoOriginal;
	Integer cveIdAccionRegistro;
	Integer cveEstadoRegistro;
	String desEstadoRegistro;
	String usuarioModificador;
	CambioDTO cambioDTO;
	List<BitacoraDictamenDTO> bitacoraDictamen;
}
