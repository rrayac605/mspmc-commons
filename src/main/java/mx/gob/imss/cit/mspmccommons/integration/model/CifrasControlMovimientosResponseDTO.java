package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

public class CifrasControlMovimientosResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String _id;

	@Getter
	@Setter
	private Long correcto;

	@Getter
	@Setter
	private Long erroneo;

	@Getter
	@Setter
	private Long duplicado;

	@Getter
	@Setter
	private Long susceptible;

	@Getter
	@Setter
	private Long correctoOtras;

	@Getter
	@Setter
	private Long erroneoOtras;

	@Getter
	@Setter
	private Long duplicadoOtras;

	@Getter
	@Setter
	private Long susceptibleOtras;

	@Getter
	@Setter
	private Long baja;

	@Getter
	@Setter
	private Long bajaOtrasDelegaciones;

	@Getter
	@Setter
	private Long total;

	@Getter
	@Setter
	private String cveOrigenArchivo;

}
