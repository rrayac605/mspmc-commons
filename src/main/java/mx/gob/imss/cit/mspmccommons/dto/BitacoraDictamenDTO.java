package mx.gob.imss.cit.mspmccommons.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.mspmccommons.support.CustomDateDeserializer;
import mx.gob.imss.cit.mspmccommons.utils.CustomDateSerializer;

public class BitacoraDictamenDTO implements Serializable{

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
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAlta;

	@Getter
	@Setter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecBaja;
}
