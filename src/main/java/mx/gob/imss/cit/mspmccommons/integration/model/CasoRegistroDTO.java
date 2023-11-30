package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class CasoRegistroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private int idCaso;

	@Setter
	@Getter
	private String descripcion;

}
