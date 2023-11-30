package mx.gob.imss.cit.mspmccommons.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class DatosModificadosDTO {

	String nssModificado;
	String rpModificado;
	Date fecInicioModificado;
	Integer cveTipoRiesgoModificado;
	String desTipoRiesgoModificado;
	String desConsecuenciaModificado;
	String cveConsecuecniaModificado;
	Integer numDiasSubsidiadosModificado;
	BigDecimal porcentajeIncapacidadModificado;
	Date fecFinModificado;
	String objectIdOrigen;
	Integer position;
	String numFolioMovtoOriginal;
	Integer cveEstadoRegistro;
	Integer cveIdAccionRegistro;
	String desEstadoRegistro;
	String usuarioModificador;
	CambioDTO cambioDTO;
	List<BitacoraDictamenDTO> bitacoraDictamen;

}
