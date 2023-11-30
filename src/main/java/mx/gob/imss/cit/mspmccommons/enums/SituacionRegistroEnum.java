package mx.gob.imss.cit.mspmccommons.enums;

import java.util.Arrays;
import java.util.Optional;

public enum SituacionRegistroEnum {

	APROBADO(1, "Aprobado"), RECHAZADO(3, "Rechazado"), PENDIENTE(2, "Pendiente de aprobar")

	;

	public int getClave() {
		return clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	private int clave;
	private String descripcion;

	SituacionRegistroEnum(Integer clave, String descripcion) {
		this.clave = clave;
		this.descripcion = descripcion;
	}

	public static Optional<SituacionRegistroEnum> findByCve(int cve) {
		return Arrays.stream(SituacionRegistroEnum.values()).filter(ar -> ar.clave == cve).findFirst();
	}

}
