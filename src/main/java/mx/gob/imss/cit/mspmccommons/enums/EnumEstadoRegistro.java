package mx.gob.imss.cit.mspmccommons.enums;

public enum EnumEstadoRegistro {

	CORRECTO(1, "CORRECTO"),

	ERRONEO(2, "ERRÓNEOS"),

	DUPLICADOS(3, "DUPLICADOS"),

	SUSCEPTIBLES_AJUSTES(4, "SUSCEPTIBLES DE AJUSTES"),

	CORRECTOS_OTRAS_DELEGACIONES(5, "CORRECTOS OTRAS DELEGACIONES"),

	ERRONEOS_OTRAS_DELEGACIONES(6, "ERRÓNEOS OTRAS DELEGACIONES"),

	DUPLICADOS_OTRAS_DELEGACIONES(7, "DUPLICADOS OTRAS DELEGACIONES"),

	SUSCEPTIBLES_AJUSTE_OTRAS_DELEGACIONES(8, "SUSCEPTIBLES DE AJUSTE OTRAS DELEGACIONES"),

	DUPLICADOS_OTRAS_DELEGACIONES_2(9, "DUPLICADOS OTRAS DELEGACIONES"),

	BAJA(10, "BAJA"),

	BAJA_OTRAS_DELEGACIONES(11, "BAJA_OTRAS_DELEGACIONES");

	private Integer code;
	private String description;

	EnumEstadoRegistro(Integer code, String description) {
		this.code = code;
		this.description = description;

	}

	public Integer getCode() {
		return this.code;
	}

	public String getDescription() {
		return this.description;
	}

}
