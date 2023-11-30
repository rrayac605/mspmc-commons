package mx.gob.imss.cit.mspmccommons.resp;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class CamposOriginalesResponse {

	@Getter
	@Setter
	private String nss;

	@Getter
	@Setter
	private String rp;

	@Getter
	@Setter
	private Date fechaInicio;

	@Getter
	@Setter
	private String tipoRiesgo;

	@Getter
	@Setter
	private String consecuencia;

	@Getter
	@Setter
	private String diasSubsidiados;

	@Getter
	@Setter
	private String procentaje;

	@Getter
	@Setter
	private Date fechaFin;

	@Getter
	@Setter
	private Boolean cambioNss;

	@Getter
	@Setter
	private Boolean cambioRp;

	@Getter
	@Setter
	private Integer cveEstadoRegistro;

	@Getter
	@Setter
	private String desEstadoRegistro;
	
}
