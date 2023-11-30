package mx.gob.imss.cit.mspmccommons.enums;

public enum TipoReporteEnum {
	CODIGO_ERROR(1, "Codigo error"),
	TIPO_RIESGO(2, "Tipo riesgo"),
	CASUISTICA_CONSECUENCIA(3, "Casuistica consecuencia");

	public int getClave() {
		return clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	private int clave;
	private String descripcion;

	TipoReporteEnum(Integer clave, String descripcion) {
		this.clave = clave;
		this.descripcion = descripcion;
	}

}
