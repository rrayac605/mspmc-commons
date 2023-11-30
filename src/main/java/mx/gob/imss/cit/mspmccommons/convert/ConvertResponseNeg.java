package mx.gob.imss.cit.mspmccommons.convert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;

import mx.gob.imss.cit.mspmccommons.dto.AuditoriaDTO;
import mx.gob.imss.cit.mspmccommons.dto.BitacoraDictamenDTO;
import mx.gob.imss.cit.mspmccommons.dto.CambioDTO;
import mx.gob.imss.cit.mspmccommons.dto.CamposOriginalesDTO;
import mx.gob.imss.cit.mspmccommons.resp.AseguradoResponse;
import mx.gob.imss.cit.mspmccommons.resp.AuditoriaResponse;
import mx.gob.imss.cit.mspmccommons.resp.BitacoraDictamenResponse;
import mx.gob.imss.cit.mspmccommons.resp.CamposOriginalesResponse;
import mx.gob.imss.cit.mspmccommons.resp.DetalleRegistroResponse;
import mx.gob.imss.cit.mspmccommons.resp.IncapacidadResponse;
import mx.gob.imss.cit.mspmccommons.resp.PatronResponse;
import mx.gob.imss.cit.mspmccommons.utils.NumberUtils;
import mx.gob.imss.cit.mspmccommons.utils.ObjectUtils;
import mx.gob.imss.cit.mspmccommons.utils.StringUtils;
import mx.gob.imss.cit.mspmccommons.utils.Utils;

public class ConvertResponseNeg {

	public CambioDTO detalleRegistroDTOtoCambioDTO(DetalleRegistroResponse detalleRegistroDTO) {
		return convertDetalleCambio(detalleRegistroDTO.getAseguradoDTO(), detalleRegistroDTO.getPatronDTO(), detalleRegistroDTO.getIncapacidadDTO(),
				detalleRegistroDTO.getFecProcesoCarga(), detalleRegistroDTO.getObjectIdOrigen(), detalleRegistroDTO.getOrigenAlta(),
				detalleRegistroDTO.getCveOrigenArchivo(), detalleRegistroDTO.getIdOrigenAlta(), detalleRegistroDTO.getAuditorias(),
				detalleRegistroDTO.getDesSituacionRegistro());
	}
	
	private CambioDTO convertDetalleCambio(AseguradoResponse asegurado, PatronResponse patron, IncapacidadResponse incapacidad,
			Date fecProcesoCarga, String objectIdOrigen, String origenAlta, String origenArchivo, ObjectId idOrigenAlta,
			List<AuditoriaResponse> auditorias, String descSituacion) {
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
		cambio.setPorcentajeIncapacidad(
				NumberUtils.safetyValidateBigDecimal(incapacidad.getPorPorcentajeIncapacidad()));
		cambio.setNumCausaExterna(StringUtils.safetyValidateString(incapacidad.getNumCausaExterna()));
		cambio.setNumRiesgoFisico(StringUtils.safetyValidateString(incapacidad.getNumRiesgoFisico()));
		cambio.setNumActoInseguro(StringUtils.safetyValidateString(incapacidad.getNumActoInseguro()));
		cambio.setNumMatMedAutCdst(StringUtils.safetyValidateString(incapacidad.getNumMatMedAutCdst()));
		cambio.setNumMatMedTratante(StringUtils.safetyValidateString(incapacidad.getNumMatMedTratante()));
		cambio.setNumCodigoDiagnostico(StringUtils.safetyValidateString(incapacidad.getNumCodigoDiagnostico()));
		cambio.setFecIniPension(incapacidad.getFecIniPension());
		cambio.setCveConsecuencia(Utils.validaEntero(StringUtils.safetyValidateString(incapacidad.getCveConsecuencia())));
		cambio.setCveLaudo(NumberUtils.safetyValidateInteger(incapacidad.getCveLaudo()));
		cambio.setCveTipoRiesgo(Utils.validaEntero(StringUtils.safetyValidateString(incapacidad.getCveTipoRiesgo())));
		cambio.setCveNaturaleza(StringUtils.safetyValidateString(incapacidad.getCveNaturaleza()));
		cambio.setDesConsecuencia(StringUtils.safetyValidateString(incapacidad.getDesConsecuencia()));
		cambio.setDesLaudo(StringUtils.safetyValidateString(incapacidad.getDesLaudo()));
		cambio.setDesNaturaleza(StringUtils.safetyValidateString(incapacidad.getDesNaturaleza()));
		cambio.setDesTipoRiesgo(StringUtils.safetyValidateString(incapacidad.getDesTipoRiesgo()));
		cambio.setCveReevaluacion(StringUtils.safetyValidateString(incapacidad.getCveReevaluacion()));
		cambio.setFecProcesoCarga(fecProcesoCarga);
		cambio.setObjectIdOrigen(
				StringUtils.safetyValidateString(objectIdOrigen) == null ? null : new ObjectId(objectIdOrigen));
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
		if (ObjectUtils.existeValor(auditorias)) {
			cambio.setAuditorias(getAuditoriasCambio(auditorias));
		}

		cambio.setBitacoraDictamen(getBitacoraDictamenCambio(incapacidad));

		return cambio;
	}

	private List<AuditoriaDTO> getAuditoriasCambio(List<AuditoriaResponse> auditorias) {
		if(!ObjectUtils.existeValor(auditorias)) {
			return null;
		}
		
		List<AuditoriaDTO> auditoriasResp = new ArrayList<>();
		
		auditoriasResp = auditorias.stream().map(au->{
			AuditoriaDTO resp = new AuditoriaDTO();
			resp.setAccion(au.getAccion());
			resp.setCamposOriginalesDTO(getCamposOriginalesCambio(au.getCamposOriginalesDTO()));
			resp.setCveEstadoRegistro(au.getCveEstadoRegistro());
			resp.setCveIdAccionRegistro(au.getCveIdAccionRegistro());
			resp.setCveSituacionRegistro(au.getCveSituacionRegistro());
			resp.setDesAccionRegistro(au.getDesAccionRegistro());
			resp.setDesCambio(au.getDesCambio());
			resp.setDesEstadoRegistro(au.getDesEstadoRegistro());
			resp.setDesObservacionesAprobador(au.getDesObservacionesAprobador());
			resp.setDesObservacionesSol(au.getDesObservacionesSol());
			resp.setDesSituacionRegistro(au.getDesSituacionRegistro());
			resp.setFecActualizacion(au.getFecActualizacion());
			resp.setFecAlta(au.getFecAlta());
			resp.setFecBaja(au.getFecBaja());
			resp.setNomUsuario(au.getNomUsuario());
			resp.setNumFolioMovOriginal(au.getNumFolioMovOriginal());
			resp.setOrdenEjecucion(au.getOrdenEjecucion());
			return resp;
		}).collect(Collectors.toList());
		return auditoriasResp;
	}

	private CamposOriginalesDTO getCamposOriginalesCambio(CamposOriginalesResponse camposOriginalesDTO) {
		if(!ObjectUtils.existeValor(camposOriginalesDTO)) {
			return null;
		}
		
		CamposOriginalesDTO camOriResp = new CamposOriginalesDTO();
		camOriResp.setCambioNss(camposOriginalesDTO.getCambioNss());
		camOriResp.setCambioRp(camposOriginalesDTO.getCambioRp());
		camOriResp.setConsecuencia(camposOriginalesDTO.getConsecuencia());
		camOriResp.setCveEstadoRegistro(camposOriginalesDTO.getCveEstadoRegistro());
		camOriResp.setDesEstadoRegistro(camposOriginalesDTO.getDesEstadoRegistro());
		camOriResp.setDiasSubsidiados(camposOriginalesDTO.getDiasSubsidiados());
		camOriResp.setFechaFin(camposOriginalesDTO.getFechaFin());
		camOriResp.setFechaInicio(camposOriginalesDTO.getFechaInicio());
		camOriResp.setNss(camposOriginalesDTO.getNss());
		camOriResp.setProcentaje(camposOriginalesDTO.getProcentaje());
		camOriResp.setRp(camposOriginalesDTO.getRp());
		camOriResp.setTipoRiesgo(camposOriginalesDTO.getTipoRiesgo());
		
		return camOriResp;
	}

	private List<BitacoraDictamenDTO> getBitacoraDictamenCambio(IncapacidadResponse incapacidad) {
		if(!ObjectUtils.existeValor(incapacidad.getBitacoraDictamen())) {
			return null;
		}
		
		List<BitacoraDictamenDTO> bitacoraResp = new ArrayList<>();
		bitacoraResp = incapacidad.getBitacoraDictamen().stream().map(b->{
			BitacoraDictamenDTO resp = new BitacoraDictamenDTO();
			resp.setActivo(b.isActivo());
			resp.setFecAlta(b.getFecAlta());
			resp.setFecBaja(b.getFecBaja());
			resp.setNomArchivo(b.getNomArchivo());
			resp.setNumFolio(b.getNumFolio());
			resp.setTipoDictamen(b.getTipoDictamen());
			resp.setUbicacionArchivo(b.getUbicacionArchivo());
			return resp;
		}).collect(Collectors.toList());
		
		return bitacoraResp;
	}
	
	///////////////////////////
	
	public DetalleRegistroResponse cambioDTOtoDetalleRegistroDTO(CambioDTO cambioDTO, Integer position) {
		DetalleRegistroResponse detalleRegistroDTO = new DetalleRegistroResponse();
		AseguradoResponse aseguradoDTO = new AseguradoResponse();
		PatronResponse patronDTO = new PatronResponse();
		IncapacidadResponse incapacidadDTO = new IncapacidadResponse();
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
		incapacidadDTO.setBitacoraDictamen(getBitacoraDictamenResp(cambioDTO.getBitacoraDictamen()));
		detalleRegistroDTO.setIncapacidadDTO(incapacidadDTO);
		
		detalleRegistroDTO.setDesObservacionesSol(getDesObservacionesSol(cambioDTO.getAuditorias()));
		detalleRegistroDTO.setDesObservacionesAprobador(getDesObservacionesAprobador(cambioDTO.getAuditorias()));
		detalleRegistroDTO.setObjectIdOrigen(cambioDTO.getObjectIdOrigen() != null ? cambioDTO.getObjectIdOrigen().toString() : null);
		detalleRegistroDTO.setIdOrigenAlta(cambioDTO.getIdOrigenAlta());
		detalleRegistroDTO.setCveSituacionRegistro(cambioDTO.getCveSituacionRegistro());
		detalleRegistroDTO.setDesSituacionRegistro(cambioDTO.getDesSituacionRegistro());
		detalleRegistroDTO.setCveOrigenArchivo(cambioDTO.getCveOrigenArchivo());
		detalleRegistroDTO.setIsPending(cambioDTO.getIsPending());
		detalleRegistroDTO.setConfirmarSinCambios(cambioDTO.getConfirmarSinCambios());
		detalleRegistroDTO.setAuditorias(getAuditoriasResp(cambioDTO.getAuditorias()));
		// Se agregan los campos de fecha de actualizacion y usuario modificador a la respuesta
		if (ObjectUtils.existeValor(cambioDTO.getAuditorias())) {
			Optional<AuditoriaDTO> audit = cambioDTO.getAuditorias().stream().filter(a -> a.getFecBaja() == null).findFirst();
			if (audit.isPresent()) {
				detalleRegistroDTO.getAseguradoDTO().setFecActualizacion(audit.get().getFecAlta());
				detalleRegistroDTO.getAseguradoDTO().setUsuarioModificador(audit.get().getNomUsuario());
			}
		}
		return detalleRegistroDTO;
	}

	private List<AuditoriaResponse> getAuditoriasResp(List<AuditoriaDTO> auditorias) {
		List<AuditoriaResponse> audResp = new ArrayList<>();
		if(!ObjectUtils.existeValor(auditorias)) {
			return null;
		}
		
		audResp = auditorias.stream().map(au->{
			AuditoriaResponse resp = new AuditoriaResponse();
			resp.setAccion(au.getAccion());
			resp.setCamposOriginalesDTO(getCamposOriginalesResp(au.getCamposOriginalesDTO()));
			resp.setCveEstadoRegistro(au.getCveEstadoRegistro());
			resp.setCveIdAccionRegistro(au.getCveIdAccionRegistro());
			resp.setCveSituacionRegistro(au.getCveSituacionRegistro());
			resp.setDesAccionRegistro(au.getDesAccionRegistro());
			resp.setDesCambio(au.getDesCambio());
			resp.setDesEstadoRegistro(au.getDesEstadoRegistro());
			resp.setDesObservacionesAprobador(au.getDesObservacionesAprobador());
			resp.setDesObservacionesSol(au.getDesObservacionesSol());
			resp.setDesSituacionRegistro(au.getDesSituacionRegistro());
			resp.setFecActualizacion(au.getFecActualizacion());
			resp.setFecAlta(au.getFecAlta());
			resp.setFecBaja(au.getFecBaja());
			resp.setNomUsuario(au.getNomUsuario());
			resp.setNumFolioMovOriginal(au.getNumFolioMovOriginal());
			resp.setOrdenEjecucion(au.getOrdenEjecucion());
			return resp;
		}).collect(Collectors.toList());
		
		return audResp;
	}
	
	private CamposOriginalesResponse getCamposOriginalesResp(CamposOriginalesDTO camposOriginalesDTO) {
		if(!ObjectUtils.existeValor(camposOriginalesDTO)) {
			return null;
		}
		
		CamposOriginalesResponse camOriResp = new CamposOriginalesResponse();
		camOriResp.setCambioNss(camposOriginalesDTO.getCambioNss());
		camOriResp.setCambioRp(camposOriginalesDTO.getCambioRp());
		camOriResp.setConsecuencia(camposOriginalesDTO.getConsecuencia());
		camOriResp.setCveEstadoRegistro(camposOriginalesDTO.getCveEstadoRegistro());
		camOriResp.setDesEstadoRegistro(camposOriginalesDTO.getDesEstadoRegistro());
		camOriResp.setDiasSubsidiados(camposOriginalesDTO.getDiasSubsidiados());
		camOriResp.setFechaFin(camposOriginalesDTO.getFechaFin());
		camOriResp.setFechaInicio(camposOriginalesDTO.getFechaInicio());
		camOriResp.setNss(camposOriginalesDTO.getNss());
		camOriResp.setProcentaje(camposOriginalesDTO.getProcentaje());
		camOriResp.setRp(camposOriginalesDTO.getRp());
		camOriResp.setTipoRiesgo(camposOriginalesDTO.getTipoRiesgo());
		
		return camOriResp;
	}

	private List<BitacoraDictamenResponse> getBitacoraDictamenResp(List<BitacoraDictamenDTO> bitacoraDictamen) {
		if(!ObjectUtils.existeValor(bitacoraDictamen)) {
			return null;
		}
		
		List<BitacoraDictamenResponse> bitacoraResp = new ArrayList<>();
		bitacoraResp = bitacoraDictamen.stream().map(b->{
			BitacoraDictamenResponse resp = new BitacoraDictamenResponse();
			resp.setActivo(b.isActivo());
			resp.setFecAlta(b.getFecAlta());
			resp.setFecBaja(b.getFecBaja());
			resp.setNomArchivo(b.getNomArchivo());
			resp.setNumFolio(b.getNumFolio());
			resp.setTipoDictamen(b.getTipoDictamen());
			resp.setUbicacionArchivo(b.getUbicacionArchivo());
			return resp;
		}).collect(Collectors.toList());
		
		return bitacoraResp;
	}
	
	private String getDesObservacionesSol(List<AuditoriaDTO> auditorias) {
		if(!ObjectUtils.existeValor(auditorias)) {
			return null;
		}
		
		Optional<AuditoriaDTO> auditoria = auditorias.stream().filter(au->au.getFecBaja() == null).findFirst();
		if(auditoria.isPresent()) {
			return auditoria.get().getDesObservacionesSol();
		}
		
		return null;
	}

	private String getDesObservacionesAprobador(List<AuditoriaDTO> auditorias) {
		if(!ObjectUtils.existeValor(auditorias)) {
			return null;
		}
		
		Optional<AuditoriaDTO> auditoria = auditorias.stream().filter(au->au.getFecBaja() == null).findFirst();
		if(auditoria.isPresent()) {
			return auditoria.get().getDesObservacionesAprobador();
		}
		
		return null;
	}
}
