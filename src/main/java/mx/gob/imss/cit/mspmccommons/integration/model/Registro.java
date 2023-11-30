package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.sanchez
 *
 */

public class Registro {

	/**
	 * 1-3 Identificador 3 Alfanumérico
	 */
	@Setter
	@Getter
	private String identificador;

	/**
	 * 4-11 Folio Movimiento Original 8 Alfanumérico
	 */
	@Setter
	@Getter
	private String refFolioOriginal;

	/**
	 * 12-13 Del NSS 2 Numérico
	 */
	@Setter
	@Getter
	private String cveDelegacionNss;

	/**
	 * 14-15 Sub NSS 2 Numérico
	 */
	@Setter
	@Getter
	private String cveSubdelNss;

	@Override
	public String toString() {
		return "Registro [identificador=" + identificador + ", refFolioOriginal=" + refFolioOriginal
				+ ", cveDelegacionNss=" + cveDelegacionNss + ", cveSubdelNss=" + cveSubdelNss + ", cveUmfAdscripcion="
				+ cveUmfAdscripcion + ", cveDelegacionAtencion=" + cveDelegacionAtencion + ", cveSubDelAtencion="
				+ cveSubDelAtencion + ", cveUmfExp=" + cveUmfExp + ", cveUmfPagadora=" + cveUmfPagadora
				+ ", refRegistroPatronal=" + refRegistroPatronal + ", numNss=" + numNss + ", refCurp=" + refCurp
				+ ", nomAsegurado=" + nomAsegurado + ", cveTipoRiesgo=" + cveTipoRiesgo + ", cveConsecuencia="
				+ cveConsecuencia + ", fecInicio=" + fecInicio + ", fecAtencion=" + fecAtencion + ", fecAccidente="
				+ fecAccidente + ", fecInicioPension=" + fecInicioPension + ", fecAlta=" + fecAlta
				+ ", fecExpedicionDictamen=" + fecExpedicionDictamen + ", fecFin=" + fecFin + ", numDiasSubsidiados="
				+ numDiasSubsidiados + ", porPorcentajeIncapacidad=" + porPorcentajeIncapacidad + ", numSalarioDiario="
				+ numSalarioDiario + ", numLaudo=" + numLaudo + ", numCodigoDiagnostico=" + numCodigoDiagnostico
				+ ", numMatriculaTratante=" + numMatriculaTratante + ", numMatriculaAutoriza=" + numMatriculaAutoriza
				+ ", cveCausaExterna=" + cveCausaExterna + ", cveNaturaleza=" + cveNaturaleza + ", cveRiesgoFisico="
				+ cveRiesgoFisico + ", cveActoInseguro=" + cveActoInseguro + ", cveOcupacion=" + cveOcupacion + "]";
	}

	/**
	 * 16-18 UMF Ads 3 Numérico
	 */
	@Setter
	@Getter
	private String cveUmfAdscripcion;

	/**
	 * 19-20 Del Atención NSS 2 Numérico
	 */
	@Setter
	@Getter
	private String cveDelegacionAtencion;

	/**
	 * 21-22 Sub Atención NSS 2 Numérico
	 */
	@Setter
	@Getter
	private String cveSubDelAtencion;

	/**
	 * 23-25 UMF Exp 3 Numérico
	 */
	@Setter
	@Getter
	private String cveUmfExp;

	/**
	 * 26-28 UMF Pagadora 3 Numérico
	 */
	@Setter
	@Getter
	private String cveUmfPagadora;

	/**
	 * 29-39 Registro Patronal 11 Alfanumérico
	 */
	@Setter
	@Getter
	private String refRegistroPatronal;

	/**
	 * 40-50 Número de Seguridad Social 11 Numérico
	 */
	@Getter
	@Setter
	private String numNss;

	/**
	 * 51-68 CURP 18 Alfanumérico
	 */
	@Setter
	@Getter
	private String refCurp;

	/**
	 * 69-118 Nombre 50 Alfanumérico
	 */
	@Setter
	@Getter
	private String nomAsegurado;

	/**
	 * 119 Tipo de Riesgo 1 Numérico
	 */
	@Setter
	@Getter
	private String cveTipoRiesgo;

	/**
	 * 120 Consecuencia 1 Numérico
	 */
	@Setter
	@Getter
	private String cveConsecuencia;

	/**
	 * 121-128 Fecha de Inicio 8 Numérico
	 */
	@Setter
	@Getter
	private String fecInicio;

	/**
	 * 129-136 Fecha de Atención/Recepción del paciente 8 Numérico
	 */
	@Setter
	@Getter
	private String fecAtencion;

	/**
	 * 137- 144 Fecha de accidente 8 Numérico
	 */
	@Setter
	@Getter
	private String fecAccidente;

	/**
	 * 145-152 Fecha de Inicio de Pensión 8 Numérico
	 */
	@Setter
	@Getter
	private String fecInicioPension;

	/**
	 * 153-160 Fecha de Alta 8 Numérico
	 */
	@Setter
	@Getter
	private String fecAlta;

	/**
	 * 161- 168 Fecha de expedición del Dictamen 8 Numérico
	 */
	@Setter
	@Getter
	private String fecExpedicionDictamen;

	/**
	 * 169-176 Fecha fin 8 Numérico
	 */
	@Setter
	@Getter
	private String fecFin;

	/**
	 * 177- 179 Días Subsidiados 3 Numérico
	 */
	@Setter
	@Getter
	private String numDiasSubsidiados;

	/**
	 * 180-182 Porcentaje de Incapacidad 3 Numérico
	 */
	@Setter
	@Getter
	private String porPorcentajeIncapacidad;

	/**
	 * 183-189 Salario Diario 7 Numérico
	 */
	@Setter
	@Getter
	private String numSalarioDiario;

	/**
	 * 190 Laudo 1 Numérico
	 */
	@Setter
	@Getter
	private String numLaudo;

	/**
	 * 191-194 Código de diagnostico 4 Numérico
	 */
	@Setter
	@Getter
	private String numCodigoDiagnostico;

	/**
	 * 195- 203 Matricula del médico tratante 9 Numérico
	 */
	@Setter
	@Getter
	private String numMatriculaTratante;

	/**
	 * 204- 212 Matrícula del médico que autoriza CDST 9 Numérico
	 */
	@Setter
	@Getter
	private String numMatriculaAutoriza;

	/**
	 * 213-216 Causa Externa 4 Numérico
	 */
	@Setter
	@Getter
	private String cveCausaExterna;

	/**
	 * 217- 220 Naturaleza 4 Numérico
	 */
	@Setter
	@Getter
	private String cveNaturaleza;

	/**
	 * 221- 224 Riesgo Físico 4 Numérico
	 */
	@Setter
	@Getter
	private String cveRiesgoFisico;

	/**
	 * 225- 228 Acto Inseguro 4 Numérico
	 */
	@Setter
	@Getter
	private String cveActoInseguro;

	/**
	 * 229-233 Ocupación 5 Numérico
	 */
	@Setter
	@Getter
	private String cveOcupacion;

	@Setter
	@Getter
	private String cveClase;

	@Setter
	@Getter
	private String cveFraccion;

}
