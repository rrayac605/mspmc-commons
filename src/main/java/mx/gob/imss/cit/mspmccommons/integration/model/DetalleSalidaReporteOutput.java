package mx.gob.imss.cit.mspmccommons.integration.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class DetalleSalidaReporteOutput {
	
	

	@Getter
	@Setter
	private List<DetalleConsultaCodErrorDTO> detalleConsultaCodError = new ArrayList<DetalleConsultaCodErrorDTO>();
	
	
	@Getter
	@Setter
	private DetalleTotalesCodErrorDTO detalleTotalesCodErrorDTO;
	
	/*
	 * @Getter
	 * 
	 * @Setter private DetalleConsultaTipoRiesgoDTO detalleConsultaTipoRiesgo;
	 * 
	 * @Getter
	 * 
	 * @Setter private DetalleConsultaConcecuenciaDTO detalleConsultaConcecuencia;
	 */

}
