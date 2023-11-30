package mx.gob.imss.cit.mspmccommons.utils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import java.util.Optional;

import mx.gob.imss.cit.mspmccommons.dto.*;
import org.bson.types.ObjectId;

public class Utils {	
	public static String obtenerNombreArchivo(String id) {
		DateFormat df = new SimpleDateFormat("ddMMyyyy");
		Calendar calendar = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append("_");
		sb.append(df.format(calendar.getTime()));
		sb.append(".txt");
		return sb.toString();
	}

	public static int validaEntero(String cadena) {
		int valor = 0;
		try {
			if(ObjectUtils.existeValor(cadena)) {
				valor = cadena.contains(".") ? Double.valueOf(cadena).intValue() : Integer.valueOf(cadena);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return valor;
	}
	
	public static String validaCadena(String cadena) {
		String cadenaSalida = null;
		try {
			cadenaSalida = cadena != null && !cadena.trim().equals("") ? cadena : null;
		} catch (NumberFormatException e) {
			// logger.error("validaCadena Valor: {}", cadena, e.getMessage());
		}
		return cadenaSalida;
	}

	public static BigDecimal validaBigDecimal(String cadena) {
		BigDecimal valor = BigDecimal.ZERO;
		try {
			valor = new BigDecimal(cadena);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return valor;
	}
	
	public static String enteroACadena(BigDecimal cadena) {
		String cadenaSalida = null;
		try {
			cadenaSalida = cadena != null ? cadena.toString() : null;
		} catch (Exception e) {
			// logger.error("validaCadena Valor: {}", cadena, e.getMessage());
		}
		return cadenaSalida;
	}

	public static String[] separaNombres(String nombre) {
		String[] nombres = nombre.split("\\$");
		return nombres;
	}

	public static String obtenerCurp(RegistroDTO registroDTO) {
		return registroDTO.isErrorCurp()
				&& (registroDTO.getRefCurpBDTU() != null && !registroDTO.getRefCurpBDTU().trim().equals(""))
						? registroDTO.getRefCurpBDTU()
						: registroDTO.getRefCurp();
	}

	/**
	 * • Si los datos del identificador, folio, fecha de recepción y consecuencia
	 * son diferentes, asignarle al estado del registro: “Susceptibles de ajuste”.
	 * 
	 * @param susceptibles
	 * @param susceptible
	 * @return
	 */
	public static boolean susceptibleUno(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (!susceptibleLista.getRefFolioOriginal().equals(susceptible.getRefFolioOriginal())
					&& !susceptibleLista.getFecAtencion().equals(susceptible.getFecAtencion())
					&& !susceptibleLista.getCveConsecuencia().equals(susceptible.getCveConsecuencia())) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	public static boolean susceptibleDos(List<RegistroDTO> susceptibles, RegistroDTO susceptible, Date fechaHabilInicio,
			Date fechaHabilFin) {
		boolean esSusceptible = false;

		if (DateUtils.parserFromString(susceptible.getFecInicio()).compareTo(fechaHabilInicio) < 0
				&& DateUtils.parserFromString(susceptible.getFecFin()).compareTo(fechaHabilFin) > 0) {
			esSusceptible = true;
		}

		return esSusceptible;
	}

	/**
	 * • Cuando además coincidan los campos: Registro Patronal, Tipo de riesgo y
	 * fecha de inicio con diferente consecuencia se le asignará al estado del
	 * registro: “Susceptibles de ajuste”. Cuando se encuentren más de dos registros
	 * con porcentaje de incapacidad se tomará el del número de folio mayor (más
	 * reciente). para efecto de evitar ambigüedades y se le asignará el mismo
	 * estado del registro (susceptible de ajuste).
	 * 
	 * @param susceptibles
	 * @param susceptible
	 * @return
	 */
	public static boolean susceptibleTres(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (susceptibleLista.getRefRegistroPatronal().equals(susceptible.getRefRegistroPatronal())
					&& susceptibleLista.getCveTipoRiesgo().equals(susceptible.getCveTipoRiesgo())
					&& susceptibleLista.getFecInicio().equals(susceptible.getFecInicio())
					&& !susceptibleLista.getCveConsecuencia().equals(susceptible.getCveConsecuencia())) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	/**
	 * 
	 * @param susceptibles
	 * @param susceptible
	 * @return
	 */
	public static boolean susceptibleCuatro(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (susceptibleLista.getRefRegistroPatronal().equals(susceptible.getRefRegistroPatronal())
					&& susceptibleLista.getCveTipoRiesgo().equals(susceptible.getCveTipoRiesgo())
					&& susceptibleLista.getFecInicio().equals(susceptible.getFecInicio())
					&& !susceptibleLista.getCveConsecuencia().equals(susceptible.getCveConsecuencia())) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	/**
	 * • Cuando además coincidan los campos: Registro Patronal, Fecha de inicio,
	 * fecha fin y Tipo de riesgo siendo diferentes las consecuencias, días
	 * subsidiados y/o porcentaje de incapacidad, asignarle al estado del registro:
	 * “Susceptibles de ajuste”.
	 * 
	 * @param susceptibles
	 * @param susceptible
	 * @return
	 */
	public static boolean susceptibleCinco(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (susceptibleLista.getRefRegistroPatronal().equals(susceptible.getRefRegistroPatronal())
					&& susceptibleLista.getFecInicio().equals(susceptible.getFecInicio())
					&& susceptibleLista.getFecFin().equals(susceptible.getFecFin())
					&& susceptibleLista.getCveTipoRiesgo().equals(susceptible.getCveTipoRiesgo())
					&& (!susceptibleLista.getCveConsecuencia().equals(susceptible.getCveConsecuencia())
							|| !susceptibleLista.getNumDiasSubsidiados().equals(susceptible.getNumDiasSubsidiados()))
					|| !susceptibleLista.getPorPorcentajeIncapacidad()
							.equals(susceptible.getPorPorcentajeIncapacidad())) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	/**
	 * • Cuando además coincidan los campos: Registro Patronal, Tipo de riesgo y
	 * consecuencia, y el archivo de origen sea “RTT”, pero las fechas de inicio y
	 * termino sean diferentes, asignarle al estado del registro: “Susceptibles de
	 * ajuste”. * @param susceptibles
	 * 
	 * @param susceptible
	 * @return
	 */
	public static boolean susceptibleRTT(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (susceptibleLista.getRefRegistroPatronal().equals(susceptible.getRefRegistroPatronal())
					&& susceptibleLista.getCveTipoRiesgo().equals(susceptible.getCveTipoRiesgo())
					&& susceptibleLista.getCveConsecuencia().equals(susceptible.getCveConsecuencia())
					&& !susceptibleLista.getFecInicio().equals(susceptible.getFecInicio())
					&& !susceptibleLista.getFecFin().equals(susceptible.getFecFin())) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	/**
	 * • Cuando además coincidan los campos: Registro Patronal y Tipo de riesgo, y
	 * el archivo de origen sea “ST3 o ST5”, pero las fechas de inicio y termino
	 * sean diferentes, asignarle al estado del registro: “Susceptibles de ajuste”.
	 * 
	 * @param susceptibles
	 * @param susceptible
	 * @return
	 * 
	 */
	public static boolean susceptibleST3ST5(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (susceptibleLista.getRefRegistroPatronal().equals(susceptible.getRefRegistroPatronal())
					&& susceptibleLista.getCveTipoRiesgo().equals(susceptible.getCveTipoRiesgo())
					&& !susceptibleLista.getFecInicio().equals(susceptible.getFecInicio())
					&& !susceptibleLista.getFecFin().equals(susceptible.getFecFin())) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	public static boolean susceptibleSeis(List<RegistroDTO> susceptibles, RegistroDTO susceptible) {
		boolean esSusceptible = false;
		for (RegistroDTO susceptibleLista : susceptibles) {
			if (susceptibleLista.getRefRegistroPatronal().equals(susceptible.getRefRegistroPatronal())
					&& susceptibleLista.getCveTipoRiesgo().equals(susceptible.getCveTipoRiesgo())
					&& !susceptibleLista.getCveConsecuencia().equals(susceptible.getCveConsecuencia())
					&& !susceptibleLista.getFecInicio().equals(susceptible.getFecInicio())
					&& !susceptibleLista.getFecFin().equals(susceptible.getFecFin())
					&& (!susceptible.getNumDiasSubsidiados().trim().equals("")
							|| !susceptible.getPorPorcentajeIncapacidad().trim().equals(""))) {
				esSusceptible = true;
				break;
			}
		}
		return esSusceptible;
	}

	public static RegistroDTO detalleRegistroDTOtoRegistroDTO(DetalleRegistroDTO detalleRegistroDTO) {
		RegistroDTO registroDTO = new RegistroDTO();
		registroDTO.setRefFolioOriginal(detalleRegistroDTO.getAseguradoDTO().getRefFolioOriginal());
		registroDTO
				.setFecAtencion(DateUtils.parserDatetoString(detalleRegistroDTO.getIncapacidadDTO().getFecAtencion()));
		registroDTO.setFecInicio(DateUtils.parserDatetoString(detalleRegistroDTO.getIncapacidadDTO().getFecInicio()));
		registroDTO.setFecFin(DateUtils.parserDatetoString(detalleRegistroDTO.getIncapacidadDTO().getFecFin()));
		registroDTO.setCveTipoRiesgo(String.valueOf(detalleRegistroDTO.getIncapacidadDTO().getCveTipoRiesgo()));
		registroDTO.setCveConsecuencia(String.valueOf(detalleRegistroDTO.getIncapacidadDTO().getCveConsecuencia()));
		registroDTO.setRefRegistroPatronal(detalleRegistroDTO.getPatronDTO().getRefRegistroPatronal());
		registroDTO
				.setNumDiasSubsidiados(String.valueOf(detalleRegistroDTO.getIncapacidadDTO().getNumDiasSubsidiados()));
		registroDTO.setPorPorcentajeIncapacidad(
				String.valueOf(detalleRegistroDTO.getIncapacidadDTO().getPorPorcentajeIncapacidad()));
		return registroDTO;
	}

	public static CambioDTO detalleRegistroDTOtoCambioDTO(DetalleRegistroDTO detalleRegistroDTO) {
		return fillChange(detalleRegistroDTO.getAseguradoDTO(), detalleRegistroDTO.getPatronDTO(), detalleRegistroDTO.getIncapacidadDTO(),
				detalleRegistroDTO.getFecProcesoCarga(), detalleRegistroDTO.getObjectIdOrigen(), detalleRegistroDTO.getOrigenAlta(),
				detalleRegistroDTO.getCveOrigenArchivo(), detalleRegistroDTO.getIdOrigenAlta(), detalleRegistroDTO.getAuditorias(),
				detalleRegistroDTO.getDesSituacionRegistro());
	}

	public static CambioDTO detalleRegistroDTOtoCambioDTO(DetalleRegistroTO detalleRegistroDTO) {
		return fillChange(detalleRegistroDTO.getAseguradoDTO(), detalleRegistroDTO.getPatronDTO(), detalleRegistroDTO.getIncapacidadDTO(),
				detalleRegistroDTO.getFecProcesoCarga(), detalleRegistroDTO.getObjectIdOrigen(), detalleRegistroDTO.getOrigenAlta(),
				detalleRegistroDTO.getCveOrigenArchivo(), detalleRegistroDTO.getIdOrigenAlta(), detalleRegistroDTO.getAuditorias(),
				detalleRegistroDTO.getDesSituacionRegistro());
	}

	private static CambioDTO fillChange(AseguradoDTO asegurado, PatronDTO patron, IncapacidadDTO incapacidad, Date fecProcesoCarga,
								 String objectIdOrigen, String origenAlta, String origenArchivo, ObjectId idOrigenAlta,
								 List<AuditoriaDTO> auditorias, String descSituacion) {
		CambioDTO cambio = new CambioDTO();
		cambio.setNumNss(StringUtils.safetyValidateString(asegurado.getNumNss()));
		cambio.setRefCurp(StringUtils.safetyValidateString(asegurado.getRefCurp()));
		cambio.setNomAsegurado(StringUtils.safetyValidateString(asegurado.getNomAsegurado()));
		cambio.setNumSalarioDiario(NumberUtils.safetyValidateBigDecimal(asegurado.getNumSalarioDiario()));
		cambio.setNumCicloAnual(StringUtils.safetyValidateString(asegurado.getNumCicloAnual()));
		cambio.setRefFolioOriginal(StringUtils.safetyValidateString(asegurado.getRefFolioOriginal()));
		cambio.setCveCasoRegistro(NumberUtils.safetyValidateInteger(asegurado.getCveCasoRegistro()));
		cambio.setCveCodigoError(StringUtils.safetyValidateString(asegurado.getCveCodigoError()));
		cambio.setCveDelegacionAtencion(NumberUtils.safetyValidateInteger(asegurado.getCveDelegacionAtencion()));
		cambio.setCveDelegacionNss(NumberUtils.safetyValidateInteger(asegurado.getCveDelegacionNss()));
		cambio.setCveEstadoRegistro(NumberUtils.safetyValidateInteger(asegurado.getCveEstadoRegistro()));
		cambio.setCveSubDelAtencion(NumberUtils.safetyValidateInteger(asegurado.getCveSubDelAtencion()));
		cambio.setCveSubdelNss(NumberUtils.safetyValidateInteger(asegurado.getCveSubdelNss()));
		cambio.setCveUmfAdscripcion(NumberUtils.safetyValidateInteger(asegurado.getCveUmfAdscripcion()));
		cambio.setCveUmfExp(NumberUtils.safetyValidateInteger(asegurado.getCveUmfExp()));
		cambio.setCveUmfPagadora(NumberUtils.safetyValidateInteger(asegurado.getCveUmfPagadora()));
		cambio.setCveOcupacion(StringUtils.safetyValidateString(asegurado.getCveOcupacion()));
		cambio.setObjectIdPatron(StringUtils.safetyValidateString(asegurado.getObjectIdArchivo()));
		cambio.setDesCasoRegistro(StringUtils.safetyValidateString(asegurado.getDesCasoRegistro()));
		cambio.setDesCodigoError(StringUtils.safetyValidateString(asegurado.getDesCodigoError()));
		cambio.setDesDelegacionAtencion(StringUtils.safetyValidateString(asegurado.getDesDelegacionAtencion()));
		cambio.setDesDelegacionNss(StringUtils.safetyValidateString(asegurado.getDesDelegacionNss()));
		cambio.setDesEstadoRegistro(StringUtils.safetyValidateString(asegurado.getDesEstadoRegistro()));
		cambio.setDesOcupacion(StringUtils.safetyValidateString(asegurado.getDesOcupacion()));
		cambio.setDesSubDelAtencion(StringUtils.safetyValidateString(asegurado.getDesSubDelAtencion()));
		cambio.setDesSubDelNss(StringUtils.safetyValidateString(asegurado.getDesSubDelNss()));
		cambio.setDesUmfAdscripcion(StringUtils.safetyValidateString(asegurado.getDesUmfAdscripcion()));
		cambio.setDesUmfExp(StringUtils.safetyValidateString(asegurado.getDesUmfExp()));
		cambio.setDesUmfPagadora(StringUtils.safetyValidateString(asegurado.getDesUmfPagadora()));
		cambio.setRefPrimerApellido(StringUtils.safetyValidateString(asegurado.getRefPrimerApellido()));
		cambio.setRefSegundoApellido(StringUtils.safetyValidateString(asegurado.getRefSegundoApellido()));
		
		cambio.setDesSituacionRegistro(StringUtils.safetyValidateString(descSituacion));
		cambio.setUsuarioModificador(StringUtils.safetyValidateString(asegurado.getUsuarioModificador()));
		cambio.setFecActualizacion(asegurado.getFecActualizacion());
		
		cambio.setCveIdPersona(NumberUtils.safetyValidateInteger(asegurado.getCveIdPersona()));
		cambio.setRefRegistroPatronal(StringUtils.safetyValidateString(patron.getRefRegistroPatronal()));
		cambio.setDesRazonSocial(StringUtils.safetyValidateString(patron.getDesRazonSocial()));
		cambio.setCveClase(NumberUtils.safetyValidateInteger(patron.getCveClase()));
		cambio.setCveDelRegPatronal(NumberUtils.safetyValidateInteger(patron.getCveDelRegPatronal()));
		cambio.setCveFraccion(NumberUtils.safetyValidateInteger(patron.getCveFraccion()));
		cambio.setNumPrima(NumberUtils.safetyValidateBigDecimal(patron.getNumPrima()));
		cambio.setCveSubDelRegPatronal(NumberUtils.safetyValidateInteger(patron.getCveSubDelRegPatronal()));
		cambio.setDesClase(StringUtils.safetyValidateString(patron.getDesClase()));
		cambio.setDesDelRegPatronal(StringUtils.safetyValidateString(patron.getDesDelRegPatronal()));
		cambio.setDesFraccion(StringUtils.safetyValidateString(patron.getDesFraccion()));
		cambio.setDesPrima(StringUtils.safetyValidateString(patron.getDesPrima()));
		cambio.setDesSubDelRegPatronal(StringUtils.safetyValidateString(patron.getDesSubDelRegPatronal()));
		cambio.setFecInicio(incapacidad.getFecInicio());
		cambio.setFecAtencion(incapacidad.getFecAtencion());
		cambio.setFecAccidente(incapacidad.getFecAccidente());
		cambio.setFecAltaIncapacidad(incapacidad.getFecAltaIncapacidad());
		cambio.setFecExpedicionDictamen(incapacidad.getFecExpDictamen());
		cambio.setFecFin(incapacidad.getFecFin());
		cambio.setNumDiasSubsidiados(NumberUtils.safetyValidateInteger(incapacidad.getNumDiasSubsidiados()));
		cambio.setPorcentajeIncapacidad(NumberUtils.safetyValidateBigDecimal(incapacidad.getPorPorcentajeIncapacidad()));
		cambio.setNumCausaExterna(StringUtils.safetyValidateString(incapacidad.getNumCausaExterna()));
		cambio.setNumRiesgoFisico(StringUtils.safetyValidateString(incapacidad.getNumRiesgoFisico()));
		cambio.setNumActoInseguro(StringUtils.safetyValidateString(incapacidad.getNumActoInseguro()));
		cambio.setNumMatMedAutCdst(StringUtils.safetyValidateString(incapacidad.getNumMatMedAutCdst()));
		cambio.setNumMatMedTratante(StringUtils.safetyValidateString(incapacidad.getNumMatMedTratante()));
		cambio.setNumCodigoDiagnostico(StringUtils.safetyValidateString(incapacidad.getNumCodigoDiagnostico()));
		cambio.setFecIniPension(incapacidad.getFecIniPension());
		cambio.setCveConsecuencia(validaEntero(StringUtils.safetyValidateString(incapacidad.getCveConsecuencia())));
		cambio.setCveLaudo(NumberUtils.safetyValidateInteger(incapacidad.getCveLaudo()));
		cambio.setCveTipoRiesgo(validaEntero(StringUtils.safetyValidateString(incapacidad.getCveTipoRiesgo())));
		cambio.setCveNaturaleza(StringUtils.safetyValidateString(incapacidad.getCveNaturaleza()));
		cambio.setDesConsecuencia(StringUtils.safetyValidateString(incapacidad.getDesConsecuencia()));
		cambio.setDesLaudo(StringUtils.safetyValidateString(incapacidad.getDesLaudo()));
		cambio.setDesNaturaleza(StringUtils.safetyValidateString(incapacidad.getDesNaturaleza()));
		cambio.setDesTipoRiesgo(StringUtils.safetyValidateString(incapacidad.getDesTipoRiesgo()));
		cambio.setCveReevaluacion(StringUtils.safetyValidateString(incapacidad.getCveReevaluacion()));
		cambio.setFecProcesoCarga(fecProcesoCarga);
		cambio.setObjectIdOrigen(StringUtils.safetyValidateString(objectIdOrigen) == null ?
				null : new ObjectId(objectIdOrigen));
		cambio.setNumIndice(NumberUtils.safetyValidateInteger(asegurado.getNumIndice()));
		cambio.setDesCausaExterna(StringUtils.safetyValidateString(incapacidad.getDesCausaExterna()));
		cambio.setDesActoInseguro(StringUtils.safetyValidateString(incapacidad.getDesActoInseguro()));
		cambio.setDesOcupacion(StringUtils.safetyValidateString(asegurado.getDesOcupacion()));
		cambio.setDesRiesgoFisico(StringUtils.safetyValidateString(incapacidad.getDesRiesgoFisico()));
		cambio.setDesTipoIncapacidad(StringUtils.safetyValidateString(incapacidad.getDesTipoIncapacidad()));
		cambio.setDesRiesgoFisico(StringUtils.safetyValidateString(incapacidad.getDesRiesgoFisico()));
		cambio.setDesCodigoDiagnostico(StringUtils.safetyValidateString(incapacidad.getDesCodigoDiagnostico()));
		cambio.setDesRfc(StringUtils.safetyValidateString(patron.getDesRfc()));
		cambio.setOrigenAlta(StringUtils.safetyValidateString(origenAlta));
		cambio.setCveOrigenArchivo(StringUtils.safetyValidateString(origenArchivo));
		// Se agrega el id de origen para un alta manual
		cambio.setIdOrigenAlta(idOrigenAlta);
		
		cambio.setCveTipoModifPatronal(NumberUtils.safetyValidateInteger(incapacidad.getCveTipoModifPatronal()));
		cambio.setModifPatronal(incapacidad.isModifPatronal());
		if (auditorias != null) {
			cambio.setAuditorias(auditorias);
		}
		
		cambio.setBitacoraDictamen(getBitacoraDictamen(incapacidad));
		
		return cambio;
	}

	private static List<BitacoraDictamenDTO> getBitacoraDictamen(IncapacidadDTO incapacidad) {
		List<BitacoraDictamenDTO> listBitacoraDic = new ArrayList<>();
		if(incapacidad.getBitacoraDictamen()!= null && !incapacidad.getBitacoraDictamen().isEmpty()) {
			BitacoraDictamenDTO dictamenIncapacidad = incapacidad.getBitacoraDictamen().get(0);
			if(dictamenIncapacidad != null) {
				listBitacoraDic.add(dictamenIncapacidad);
				return listBitacoraDic;
			}	
		}
		
		return null;
	}
	
	public static DetalleRegistroDTO cambioDTOtoDetalleRegistroDTO(CambioDTO cambioDTO, Integer position) {
		DetalleRegistroDTO detalleRegistroDTO = new DetalleRegistroDTO();
		AseguradoDTO aseguradoDTO = new AseguradoDTO();
		PatronDTO patronDTO = new PatronDTO();
		IncapacidadDTO incapacidadDTO = new IncapacidadDTO();
		if (cambioDTO.getObjectIdCambio() != null && cambioDTO.getObjectIdCambio().trim().length() > 0) {
			detalleRegistroDTO.setIdentificador(cambioDTO.getObjectIdCambio());
		}
		aseguradoDTO.setCveCasoRegistro(cambioDTO.getCveCasoRegistro());
		aseguradoDTO.setCveCodigoError(cambioDTO.getCveCodigoError());
		aseguradoDTO.setCveDelegacionAtencion(cambioDTO.getCveDelegacionAtencion());
		aseguradoDTO.setCveDelegacionNss(cambioDTO.getCveDelegacionNss());
		aseguradoDTO.setCveEstadoRegistro(cambioDTO.getCveEstadoRegistro());
		aseguradoDTO.setCveIdPersona(cambioDTO.getCveIdPersona());
		aseguradoDTO.setCveOcupacion(cambioDTO.getCveOcupacion());
		aseguradoDTO.setCveSubDelAtencion(cambioDTO.getCveSubDelAtencion());
		aseguradoDTO.setCveSubdelNss(cambioDTO.getCveSubdelNss());
		aseguradoDTO.setCveUmfAdscripcion(cambioDTO.getCveUmfAdscripcion());
		aseguradoDTO.setCveUmfExp(cambioDTO.getCveUmfExp());
		aseguradoDTO.setCveUmfPagadora(cambioDTO.getCveUmfPagadora());
		aseguradoDTO.setDesCasoRegistro(cambioDTO.getDesCasoRegistro());
		aseguradoDTO.setDesCodigoError(cambioDTO.getCveCodigoError());
		aseguradoDTO.setDesDelegacionAtencion(cambioDTO.getDesDelegacionAtencion());
		aseguradoDTO.setDesDelegacionNss(cambioDTO.getDesDelegacionNss());
		aseguradoDTO.setDesEstadoRegistro(cambioDTO.getDesEstadoRegistro());
		aseguradoDTO.setDesOcupacion(cambioDTO.getDesOcupacion());
		aseguradoDTO.setDesSubDelAtencion(cambioDTO.getDesSubDelAtencion());
		aseguradoDTO.setDesSubDelNss(cambioDTO.getDesSubDelNss());
		aseguradoDTO.setDesUmfAdscripcion(cambioDTO.getDesUmfAdscripcion());
		aseguradoDTO.setDesUmfExp(cambioDTO.getDesUmfExp());
		aseguradoDTO.setDesUmfPagadora(cambioDTO.getDesUmfPagadora());
		aseguradoDTO.setFecActualizacion(cambioDTO.getFecActualizacion());
		aseguradoDTO.setFecAlta(cambioDTO.getFecAlta());
		aseguradoDTO.setFecBaja(cambioDTO.getFecBaja());
		aseguradoDTO.setRefCurp(cambioDTO.getRefCurp());
		aseguradoDTO.setRefFolioOriginal(cambioDTO.getRefFolioOriginal());
		aseguradoDTO.setRefPrimerApellido(cambioDTO.getRefPrimerApellido());
		aseguradoDTO.setRefSegundoApellido(cambioDTO.getRefSegundoApellido());
		aseguradoDTO.setNomAsegurado(cambioDTO.getNomAsegurado());
		aseguradoDTO.setNumCicloAnual(cambioDTO.getNumCicloAnual());
		aseguradoDTO.setNumNss(cambioDTO.getNumNss());
		aseguradoDTO.setNumSalarioDiario(cambioDTO.getNumSalarioDiario());
		aseguradoDTO.setNumIndice(position);
		aseguradoDTO.setDesOcupacion(cambioDTO.getDesOcupacion());
		
		aseguradoDTO.setUsuarioModificador(cambioDTO.getUsuarioModificador());
		
		detalleRegistroDTO.setAseguradoDTO(aseguradoDTO);

		patronDTO.setCveClase(cambioDTO.getCveClase());
		patronDTO.setCveDelegacionAux(cambioDTO.getCveDelegacionAux());
		patronDTO.setCveDelRegPatronal(cambioDTO.getCveDelRegPatronal());
		patronDTO.setCveFraccion(cambioDTO.getCveFraccion());
		patronDTO.setCveModalidad(cambioDTO.getCveModalidad());
		patronDTO.setCveSubDelRegPatronal(cambioDTO.getCveSubDelRegPatronal());
		patronDTO.setDesClase(cambioDTO.getDesClase());
		patronDTO.setDesDelRegPatronal(cambioDTO.getDesDelRegPatronal());
		patronDTO.setDesFraccion(cambioDTO.getDesFraccion());
		patronDTO.setDesPrima(cambioDTO.getDesPrima());
		patronDTO.setDesRazonSocial(cambioDTO.getDesRazonSocial());
		patronDTO.setDesRfc(cambioDTO.getDesRfc());
		patronDTO.setDesSubDelRegPatronal(cambioDTO.getDesSubDelRegPatronal());
		patronDTO.setFecActualizacion(cambioDTO.getFecActualizacion());
		patronDTO.setFecAlta(cambioDTO.getFecAlta());
		patronDTO.setFecBaja(cambioDTO.getFecBaja());
		patronDTO.setNumPrima(cambioDTO.getNumPrima());
		patronDTO.setRefRegistroPatronal(cambioDTO.getRefRegistroPatronal());
		detalleRegistroDTO.setPatronDTO(patronDTO);

		incapacidadDTO.setCveConsecuencia(String.valueOf(cambioDTO.getCveConsecuencia()));
		incapacidadDTO.setCveLaudo(cambioDTO.getCveLaudo());
		incapacidadDTO.setCveNaturaleza(cambioDTO.getCveNaturaleza());
		incapacidadDTO.setCveReevaluacion(cambioDTO.getCveReevaluacion());
		incapacidadDTO.setCveTipoRiesgo(String.valueOf(cambioDTO.getCveTipoRiesgo()));
		incapacidadDTO.setDesConsecuencia(cambioDTO.getDesConsecuencia());
		incapacidadDTO.setDesLaudo(cambioDTO.getDesLaudo());
		incapacidadDTO.setDesNaturaleza(cambioDTO.getDesNaturaleza());
		incapacidadDTO.setDesTipoRiesgo(cambioDTO.getDesTipoRiesgo());
		incapacidadDTO.setFecAccidente(cambioDTO.getFecAccidente());
		incapacidadDTO.setFecActualizacion(cambioDTO.getFecActualizacion());
		incapacidadDTO.setFecAlta(cambioDTO.getFecAlta());
		incapacidadDTO.setFecAltaIncapacidad(cambioDTO.getFecAltaIncapacidad());
		incapacidadDTO.setFecAtencion(cambioDTO.getFecAtencion());
		incapacidadDTO.setFecBaja(cambioDTO.getFecBaja());
		incapacidadDTO.setFecExpDictamen(cambioDTO.getFecExpedicionDictamen());
		incapacidadDTO.setFecFin(cambioDTO.getFecFin());
		incapacidadDTO.setFecInicio(cambioDTO.getFecInicio());
		incapacidadDTO.setFecIniPension(cambioDTO.getFecIniPension());
		incapacidadDTO.setPorPorcentajeIncapacidad(cambioDTO.getPorcentajeIncapacidad());
		incapacidadDTO.setNumDiasSubsidiados(cambioDTO.getNumDiasSubsidiados());
		incapacidadDTO.setObjectIdIncapacidad(cambioDTO.getObjectIdCambio());
		incapacidadDTO.setCveTipoIncapacidad(cambioDTO.getCveTipoIncapacidad());
		incapacidadDTO.setDesTipoIncapacidad(cambioDTO.getDesTipoIncapacidad());
		incapacidadDTO.setNumCausaExterna(cambioDTO.getNumCausaExterna());
		incapacidadDTO.setDesCausaExterna(cambioDTO.getDesCausaExterna());
		incapacidadDTO.setNumActoInseguro(cambioDTO.getNumActoInseguro());
		incapacidadDTO.setDesActoInseguro(cambioDTO.getDesActoInseguro());
		incapacidadDTO.setNumRiesgoFisico(cambioDTO.getNumRiesgoFisico());
		incapacidadDTO.setDesRiesgoFisico(cambioDTO.getDesRiesgoFisico());
		incapacidadDTO.setNumCodigoDiagnostico(cambioDTO.getNumCodigoDiagnostico());
		incapacidadDTO.setDesCodigoDiagnostico(cambioDTO.getDesCodigoDiagnostico());
		incapacidadDTO.setNumMatMedAutCdst(cambioDTO.getNumMatMedAutCdst());
		incapacidadDTO.setNumMatMedTratante(cambioDTO.getNumMatMedTratante());
		detalleRegistroDTO.setFecProcesoCarga(cambioDTO.getFecProcesoCarga());
		incapacidadDTO.setCveTipoModifPatronal(cambioDTO.getCveTipoModifPatronal());
		incapacidadDTO.setModifPatronal(cambioDTO.isModifPatronal());
		incapacidadDTO.setBitacoraDictamen(cambioDTO.getBitacoraDictamen());
		detalleRegistroDTO.setIncapacidadDTO(incapacidadDTO);
		
		detalleRegistroDTO.setDesObservacionesSol(cambioDTO.getAuditorias() != null ?
				getDesObservacionesSol(cambioDTO.getAuditorias()) : null);
		detalleRegistroDTO.setDesObservacionesAprobador(cambioDTO.getAuditorias() != null ?
				getDesObservacionesAprobador(cambioDTO.getAuditorias()) : null);
		detalleRegistroDTO.setObjectIdOrigen(cambioDTO.getObjectIdOrigen() != null ? cambioDTO.getObjectIdOrigen().toString() : null);
		detalleRegistroDTO.setIdOrigenAlta(cambioDTO.getIdOrigenAlta());
		detalleRegistroDTO.setCveSituacionRegistro(cambioDTO.getCveSituacionRegistro());
		detalleRegistroDTO.setDesSituacionRegistro(cambioDTO.getDesSituacionRegistro());
		detalleRegistroDTO.setCveOrigenArchivo(cambioDTO.getCveOrigenArchivo());
		detalleRegistroDTO.setIsPending(cambioDTO.getIsPending());
		detalleRegistroDTO.setConfirmarSinCambios(cambioDTO.getConfirmarSinCambios());
		List<AuditoriaDTO> auds = cambioDTO.getAuditorias();
		detalleRegistroDTO.setAuditorias(auds);
		// Se agregan los campos de fecha de actualizacion y usuario modificador a la respuesta
		if (cambioDTO.getAuditorias() != null && !cambioDTO.getAuditorias().isEmpty()) {
			Optional<AuditoriaDTO> audit = cambioDTO.getAuditorias().stream().filter(a -> a.getFecBaja() == null).findFirst();
			if (audit.isPresent()) {
				detalleRegistroDTO.getAseguradoDTO().setFecActualizacion(audit.get().getFecAlta());
				detalleRegistroDTO.getAseguradoDTO().setUsuarioModificador(audit.get().getNomUsuario());
			}
		}
		return detalleRegistroDTO;
	}

	private static String getDesObservacionesSol(List<AuditoriaDTO> auditorias) {
		for (AuditoriaDTO auditoriaDTO : auditorias) {
			if (auditoriaDTO != null) {
				return auditoriaDTO.getDesObservacionesSol();
			}
		}
		return null;
	}

	private static String getDesObservacionesAprobador(List<AuditoriaDTO> auditorias) {
		for (AuditoriaDTO auditoriaDTO : auditorias) {
			if (auditoriaDTO != null) {
				return auditoriaDTO.getDesObservacionesAprobador();
			}
		}
		return null;
	}

}