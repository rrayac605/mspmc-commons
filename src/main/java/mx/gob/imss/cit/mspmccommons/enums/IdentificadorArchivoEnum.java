package mx.gob.imss.cit.mspmccommons.enums;

import lombok.Getter;
import lombok.Setter;

public enum IdentificadorArchivoEnum {

	ARCHIVO_SISAT("ST3"), ARCHIVO_SUI55("ST5"), ARCHIVO_NSSA("RTT"), MANUAL("MN");

	@Getter
	@Setter
	private String identificador;

	private IdentificadorArchivoEnum(String identificador) {
		this.identificador = identificador;
	}

}
