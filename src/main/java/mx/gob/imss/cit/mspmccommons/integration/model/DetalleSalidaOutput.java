package mx.gob.imss.cit.mspmccommons.integration.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class DetalleSalidaOutput {

	@Getter
	@Setter
	private List<DetalleConsultaDTO> detalleConsultaDTO;
	@Getter
	@Setter
	private CifrasControlDTO cifrasControlTotales;

}
