package mx.gob.imss.cit.mspmccommons.integration.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class DetalleSalidaReporteTipoOut {
//	private List<DetalleConsultaCodErrorDTO> detalleConsultaCodError = new ArrayList<DetalleConsultaCodErrorDTO>();
	
	
	  @Getter
      @Setter 
      private List<DetalleConsultaTipoRiesgoDTO> detalleRiesgo1 = new ArrayList<DetalleConsultaTipoRiesgoDTO>();
  	
	  @Getter
      @Setter 
      private List<DetalleConsultaTipoRiesgoDTO> detalleRiesgo2 = new ArrayList<DetalleConsultaTipoRiesgoDTO>();
  	
	  @Getter
      @Setter 
      private List<DetalleConsultaTipoRiesgoDTO> detalleRiesgo3 = new ArrayList<DetalleConsultaTipoRiesgoDTO>();
  	
	  @Getter
      @Setter 
      private List<DetalleConsultaTipoRiesgoDTO> detalleRiesgo4 = new ArrayList<DetalleConsultaTipoRiesgoDTO>();
  	
      
	
	  
	  @Getter
      @Setter 
	    private Long   numTotalAnterior;
	  @Getter
      @Setter 
	    private Long   numTotralNuevo;


}
