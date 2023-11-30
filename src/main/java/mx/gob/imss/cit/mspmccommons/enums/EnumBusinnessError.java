package mx.gob.imss.cit.mspmccommons.enums;

import lombok.Getter;
import lombok.Setter;

public enum EnumBusinnessError {

	SERVER_ERROR_INTERNAL(500, "Error interno."), SERVER_ERROR_VIGENCIA(500, "Error en vigencia."),
	SERVER_ERROR_CLABENSSA(500, "Error en el servicio externo Clabe NSSA.");

	@Getter
	@Setter
	private Integer codigo;
	@Getter
	@Setter
	private String descripcion;

	EnumBusinnessError(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;

	}
}
