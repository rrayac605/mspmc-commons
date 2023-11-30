package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.*;

import java.io.*;
import java.util.*;

public class ReporteCasuisticaConsecuenciaResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private List<ReporteCasuisticaConsecuenciaDetalleDTO> registros;

	@Getter
	@Setter
	private List<ReporteCasuisticaConsecuenciaDetalleDTO> diasSubsidiados;

	@Getter
	@Setter
	private List<ReporteCasuisticaConsecuenciaDetalleDTO> porcentajeIncapacidad;

}
