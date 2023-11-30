package mx.gob.imss.cit.mspmccommons.enums;

import lombok.Getter;
import lombok.Setter;

public enum RelacionLaboralEnum {

	EXISTE(1, "Existe relaci\u00F3n laboral"),

	NOEXISTE(2, "No existe relaci\u00F3n laboral");

	@Setter
	@Getter
	private Integer cveRelacion;

	@Setter
	@Getter
	private String desRelacion;

	RelacionLaboralEnum(Integer cveRelacion, String desRelacion) {
		this.cveRelacion = cveRelacion;
		this.desRelacion = desRelacion;

	}
}
