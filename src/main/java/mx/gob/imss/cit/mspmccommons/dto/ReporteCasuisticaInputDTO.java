package mx.gob.imss.cit.mspmccommons.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ReporteCasuisticaInputDTO implements Serializable {
	private static final long serialVersionUID = -7487604294842365676L;

	@Getter
	@Setter
	String objectId;
	@Getter
	@Setter
	String numNss;
	@Getter
	@Setter
	Integer position;
	@Getter
	@Setter
	String numFolioMovtoOriginal;
	@Getter
	@Setter
	Integer cveDelegacion;
	@Getter
	@Setter
	Integer cveSubdelegacion;
	@Getter
	@Setter
	String desDelegacion;
	@Getter
	@Setter
	String desSubdelegacion;
	@Getter
	@Setter
	Integer cveTipoRiesgo;
	@Getter
	@Setter
	Integer cveConsecuencia;
	@Getter
	@Setter
	Integer cveCasoRegistro;
	@Getter
	@Setter
	String fromDay;
	@Getter
	@Setter
	String fromMonth;
	@Getter
	@Setter
	String fromYear;
	@Getter
	@Setter
	String toDay;
	@Getter
	@Setter
	String toMonth;
	@Getter
	@Setter
	String toYear;
	@Getter
	@Setter
	Integer cveEstadoRegistro;
	@Getter
	@Setter
	List<Integer> cveEstadoRegistroList;
	@Getter
	@Setter
	String refRegistroPatronal;
	@Getter
	@Setter
	String cveSituacionRegistro;
	@Getter
	@Setter
	Integer cveIdAccionRegistro;
	@Getter
	@Setter
	String rfc;
	@Getter
	@Setter
	Integer cveClase;
	@Getter
	@Setter
	Integer cveFraccion;
	@Getter
	@Setter
	Integer cveLaudo;
	@Getter
	@Setter
	String origenAlta;
	@Getter
	Boolean isChange;
	@Getter
	@Setter
	private Boolean isOperative;
	@Getter
	@Setter
	private Boolean isApprover;
	@Getter
	@Setter
	private Boolean isCasuistry;

	@Override
	public String toString() {
		return "ReporteCasuisticaInputDTO [objectId=" + objectId + ", numNss=" + numNss + ", position=" + position
				+ ", numFolioMovtoOriginal=" + numFolioMovtoOriginal + ", cveDelegacion=" + cveDelegacion
				+ ", cveSubdelegacion=" + cveSubdelegacion + ", cveTipoRiesgo=" + cveTipoRiesgo + ", cveConsecuencia="
				+ cveConsecuencia + ", cveCasoRegistro=" + cveCasoRegistro + ", fromDay=" + fromDay + ", fromMonth="
				+ fromMonth + ", fromYear=" + fromYear + ", toDay=" + toDay + ", toMonth=" + toMonth + ", toYear="
				+ toYear + ", cveEstadoRegistro=" + cveEstadoRegistro + ", refRegistroPatronal=" + refRegistroPatronal
				+ ", cveSituacionRegistro=" + cveSituacionRegistro + ", cveIdAccionRegistro=" + cveIdAccionRegistro
				+ ", rfc=" + rfc + ", cveClase=" + cveClase + ", cveFraccion=" + cveFraccion + ", cveLaudo=" + cveLaudo
				+ "]";
	}
}
