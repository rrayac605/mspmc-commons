package mx.gob.imss.cit.mspmccommons.enums;

import lombok.Getter;
import lombok.Setter;

public enum CamposPatronEnum {

	RP("patronDTO.refRegistroPatronal"),
	DELEGACION("patronDTO.cveDelRegPatronal"),
	SUBDELEGACION("patronDTO.cveSubDelRegPatronal");

	@Setter
	@Getter
	private String nombreCampo;

	private CamposPatronEnum(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

}
