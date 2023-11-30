package mx.gob.imss.cit.mspmccommons.integration.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class MovimientoCasuisticaOutput {

	@Getter
	@Setter
	private List<DetalleMovimientoCasuisticaDTO> detalleConsultaDTO;
	@Getter
	@Setter
	private DetalleMovimientoCasuisticaDTO totalesCasuisticaDTO;

}
