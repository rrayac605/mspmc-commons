package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class BitacoraDictamenResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter	
	private String tipoDictamen;
	
	@Getter
	@Setter
	private String numFolio;

	@Getter
	@Setter
	private String nomArchivo;
	
	@Getter
	@Setter
	private String ubicacionArchivo;
	
	@Getter
	@Setter
	private boolean activo;

	@Getter
	@Setter
	private Date fecAlta;

	@Getter
	@Setter
	private Date fecBaja;
	
}
