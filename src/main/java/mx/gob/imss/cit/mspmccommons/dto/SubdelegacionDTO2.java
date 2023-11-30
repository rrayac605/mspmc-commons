package mx.gob.imss.cit.mspmccommons.dto;

import lombok.Getter;
import lombok.Setter;

public class SubdelegacionDTO2 {
	@Setter
	@Getter
	private Boolean checked;

	@Setter
	@Getter
	private String clave;

	@Setter
	@Getter
	private DelegacionDTO2 delegacion;

	@Setter
	@Getter
	private String descripcion;

	@Setter
	@Getter
	private String errorFormGeneral;

	@Setter
	@Getter
	private Integer id;

}
