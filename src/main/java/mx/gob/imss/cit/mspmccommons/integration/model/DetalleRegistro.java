package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class DetalleRegistro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private Asegurado asegurado;

	@Getter
	@Setter
	private Patron patron;

	@Getter
	@Setter
	private Incapacidad incapacidad;

}
