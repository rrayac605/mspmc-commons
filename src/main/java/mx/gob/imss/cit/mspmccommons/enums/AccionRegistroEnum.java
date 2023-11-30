package mx.gob.imss.cit.mspmccommons.enums;

import java.util.Arrays;
import java.util.Optional;

public enum AccionRegistroEnum {
	ALTA(1, "Alta"),
	MODIFICACION(2, "Modificacion"), 
	ELIMINACION(3, "Eliminacion"),
	ALTA_PENDIENTE(4, "Alta pendiente"),
	MODIFICACION_PENDIENTE(5, "Modificacion pendiente"),
	BAJA_PENDIENTE(6, "Baja pendiente"), 
	MODIFICACION_RECHAZADO(8, "Modificacion rechazado"),
	BAJA_RECHAZADO(9, "Baja rechazado"),
	ALTA_RECHAZADO(7, "Alta rechazado"),
	PENDIENTE_APROBAR(10,"Pendiente de Aprobar"),
	CONFIRMAR_PENDIENTE(11,"Confirmar sin cambios pendiente"),
	CONFIRMAR(12,"Confirmar sin cambios"),
	CONFIRMAR_RECHAZADO(13,"Confirmar sin cambios rechazado");
	

	public int getClave() {
		return clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	private int clave;
	private String descripcion;

	AccionRegistroEnum(Integer clave, String descripcion) {
		this.clave = clave;
		this.descripcion = descripcion;
	}

	public static Optional<AccionRegistroEnum> findByCve(int cve) {
		return Arrays.stream(AccionRegistroEnum.values()).filter(ar -> ar.clave == cve).findFirst();
	}

}
