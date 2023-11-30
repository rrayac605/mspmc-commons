package mx.gob.imss.cit.mspmccommons.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mx.gob.imss.cit.mspmccommons.dto.BitacoraDictamenDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.ArchivoDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.AseguradoDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.AuditoriaDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.BitacoraErroresDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.CamposOriginalesDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.CifrasControlDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.DetalleRegistroDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.IncapacidadDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.PatronDTO;
import mx.gob.imss.cit.mspmccommons.resp.ArchivoResponse;
import mx.gob.imss.cit.mspmccommons.resp.AseguradoResponse;
import mx.gob.imss.cit.mspmccommons.resp.AuditoriaResponse;
import mx.gob.imss.cit.mspmccommons.resp.BitacoraDictamenResponse;
import mx.gob.imss.cit.mspmccommons.resp.BitacoraErroresResponse;
import mx.gob.imss.cit.mspmccommons.resp.CamposOriginalesResponse;
import mx.gob.imss.cit.mspmccommons.resp.CifrasControlResponse;
import mx.gob.imss.cit.mspmccommons.resp.DetalleRegistroResponse;
import mx.gob.imss.cit.mspmccommons.resp.IncapacidadResponse;
import mx.gob.imss.cit.mspmccommons.resp.PatronResponse;
import mx.gob.imss.cit.mspmccommons.utils.ObjectUtils;

public class ConvertNegIntResponse {
	
	public final DetalleRegistroResponse getDetalleResp(final DetalleRegistroDTO detNeg) {
		if(!ObjectUtils.existeValor(detNeg)) {
			return null;
		}
		
		DetalleRegistroResponse detResp = new DetalleRegistroResponse();
		
		detResp.setArchivoDTO(getArchivoResp(detNeg.getArchivoDTO()));
		detResp.setAseguradoDTO(getAseguradoResp(detNeg.getAseguradoDTO()));
		detResp.setAuditorias(getAuditoriasResp(detNeg.getAuditorias()));
		detResp.setBitacoraErroresDTO(getBitacoraErrorResp(detNeg.getBitacoraErroresDTO()));
		detResp.setIncapacidadDTO(getIncapacidadResp(detNeg.getIncapacidadDTO()));
		detResp.setPatronDTO(getPatronResp(detNeg.getPatronDTO()));
		
		detResp.setConfirmarSinCambios(detNeg.getConfirmarSinCambios());
		detResp.setCveOrigenArchivo(detNeg.getCveOrigenArchivo());
		detResp.setCveSituacionRegistro(detNeg.getCveSituacionRegistro());
		detResp.setDesObservacionesAprobador(detNeg.getDesObservacionesAprobador());
		detResp.setDesObservacionesSol(detNeg.getDesObservacionesSol());
		detResp.setDesSituacionRegistro(detNeg.getDesSituacionRegistro());
		detResp.setFecProcesoCarga(detNeg.getFecProcesoCarga());
		detResp.setIdentificadorArchivo(detNeg.getIdentificadorArchivo());
		detResp.setIsPending(detNeg.getIsPending());
		detResp.setObjectIdArchivoDetalle(detNeg.getObjectIdArchivoDetalle());
		detResp.setObjectIdOrigen(detNeg.getObjectIdOrigen());
		
		return detResp;
	}

	private final ArchivoResponse getArchivoResp(final ArchivoDTO archivoDTO) {
		if(!ObjectUtils.existeValor(archivoDTO)) {
			return null;
		}
		
		ArchivoResponse arcResp = new ArchivoResponse();
		arcResp.setCifrasControlDTO(getCifrasResp(archivoDTO.getCifrasControlDTO()));
		arcResp.setCveEstadoArchivo(archivoDTO.getCveEstadoArchivo());
		arcResp.setCveOrigenArchivo(archivoDTO.getCveOrigenArchivo());
		arcResp.setDesArchivo(archivoDTO.getDesArchivo());
		arcResp.setDesError(archivoDTO.getDesError());
		arcResp.setDesEstadoArchivo(archivoDTO.getDesEstadoArchivo());
		arcResp.setDesIdArchivo(archivoDTO.getDesIdArchivo());
		arcResp.setDesOrigenArchivo(archivoDTO.getDesOrigenArchivo());
		arcResp.setFecProcesoCarga(archivoDTO.getFecProcesoCarga());
		arcResp.setNomArchivo(archivoDTO.getNomArchivo());
		arcResp.setNumTotalRegistros(archivoDTO.getNumTotalRegistros());
		arcResp.setObjectIdArchivo(archivoDTO.getObjectIdArchivo());
		arcResp.setFecActualizacion(archivoDTO.getFecActualizacion());
		arcResp.setFecAlta(archivoDTO.getFecAlta());
		arcResp.setFecBaja(archivoDTO.getFecBaja());
		
		return arcResp;
	}
	
	private final CifrasControlResponse getCifrasResp(final CifrasControlDTO cifrasControlDTO) {
		if(!ObjectUtils.existeValor(cifrasControlDTO)) {
			return null;
		}
		
		CifrasControlResponse cifraResp = new CifrasControlResponse();
		cifraResp.setNumRegistrosBaja(cifrasControlDTO.getNumRegistrosBaja());
		cifraResp.setNumRegistrosBajaOtras(cifrasControlDTO.getNumRegistrosBajaOtras());
		cifraResp.setNumRegistrosCorrectos(cifrasControlDTO.getNumRegistrosCorrectos());
		cifraResp.setNumRegistrosCorrectosOtras(cifrasControlDTO.getNumRegistrosCorrectosOtras());
		cifraResp.setNumRegistrosDup(cifrasControlDTO.getNumRegistrosDup());
		cifraResp.setNumRegistrosDupOtras(cifrasControlDTO.getNumRegistrosDupOtras());
		cifraResp.setNumRegistrosError(cifrasControlDTO.getNumRegistrosError());
		cifraResp.setNumRegistrosErrorOtras(cifrasControlDTO.getNumRegistrosErrorOtras());
		cifraResp.setNumRegistrosSus(cifrasControlDTO.getNumRegistrosSus());
		cifraResp.setNumRegistrosSusOtras(cifrasControlDTO.getNumRegistrosSusOtras());
		cifraResp.setNumTotalRegistros(cifrasControlDTO.getNumTotalRegistros());
		cifraResp.setFecActualizacion(cifrasControlDTO.getFecActualizacion());
		cifraResp.setFecAlta(cifrasControlDTO.getFecAlta());
		cifraResp.setFecBaja(cifrasControlDTO.getFecBaja());
		
		return cifraResp;
	}

	private final AseguradoResponse getAseguradoResp(final AseguradoDTO aseguradoDTO) {
		if(!ObjectUtils.existeValor(aseguradoDTO)) {
			return null;
		}
		
		AseguradoResponse aseResp = new AseguradoResponse();
		aseResp.setCveCasoRegistro(aseguradoDTO.getCveCasoRegistro());
		aseResp.setCveCodigoError(aseguradoDTO.getCveCodigoError());
		aseResp.setCveDelegacionAtencion(aseguradoDTO.getCveDelegacionAtencion());
		aseResp.setCveDelegacionNss(aseguradoDTO.getCveDelegacionNss());
		aseResp.setCveEstadoRegistro(aseguradoDTO.getCveEstadoRegistro());
		aseResp.setCveIdPersona(aseguradoDTO.getCveIdPersona());
		aseResp.setCveOcupacion(aseguradoDTO.getCveOcupacion());
		aseResp.setCveSubDelAtencion(aseguradoDTO.getCveSubDelAtencion());
		aseResp.setCveSubdelNss(aseguradoDTO.getCveSubdelNss());
		aseResp.setCveUmfAdscripcion(aseguradoDTO.getCveUmfAdscripcion());
		aseResp.setCveUmfExp(aseguradoDTO.getCveUmfExp());
		aseResp.setCveUmfPagadora(aseguradoDTO.getCveUmfPagadora());
		aseResp.setDesCasoRegistro(aseguradoDTO.getDesCasoRegistro());
		aseResp.setDesCodigoError(aseguradoDTO.getDesCodigoError());
		aseResp.setDesDelegacionAtencion(aseguradoDTO.getDesDelegacionAtencion());
		aseResp.setDesDelegacionNss(aseguradoDTO.getDesDelegacionNss());
		aseResp.setDesEstadoRegistro(aseguradoDTO.getDesEstadoRegistro());
		aseResp.setDesOcupacion(aseguradoDTO.getDesOcupacion());
		aseResp.setDesSubDelAtencion(aseguradoDTO.getDesSubDelAtencion());
		aseResp.setDesSubDelNss(aseguradoDTO.getDesSubDelNss());
		aseResp.setDesUmfAdscripcion(aseguradoDTO.getDesUmfAdscripcion());
		aseResp.setDesUmfExp(aseguradoDTO.getDesUmfExp());
		aseResp.setDesUmfPagadora(aseguradoDTO.getDesUmfPagadora());
		aseResp.setFecActualizacion(aseguradoDTO.getFecActualizacion());
		aseResp.setFecAlta(aseguradoDTO.getFecAlta());
		aseResp.setFecBaja(aseguradoDTO.getFecBaja());
		aseResp.setIdSubDelNss(aseguradoDTO.getCveSubdelNss());
		aseResp.setMarcaAfiliatoria(aseguradoDTO.getMarcaAfiliatoria());
		aseResp.setNomAsegurado(aseguradoDTO.getNomAsegurado());
		aseResp.setNumCicloAnual(aseguradoDTO.getNumCicloAnual());
		aseResp.setNumIndice(aseguradoDTO.getNumIndice());
		aseResp.setNumNss(aseguradoDTO.getNumNss());
		aseResp.setNumSalarioDiario(aseguradoDTO.getNumSalarioDiario());
		aseResp.setObjectIdArchivo(aseguradoDTO.getObjectIdArchivo());
		aseResp.setRefCurp(aseguradoDTO.getRefCurp());
		aseResp.setRefFolioOriginal(aseguradoDTO.getRefFolioOriginal());
		aseResp.setRefPrimerApellido(aseguradoDTO.getRefPrimerApellido());
		aseResp.setRefSegundoApellido(aseguradoDTO.getRefSegundoApellido());
		aseResp.setSinUMF(aseguradoDTO.getSinUMF());
		aseResp.setUsuarioModificador(aseguradoDTO.getUsuarioModificador());
		
		return aseResp;
	}
	

	private final List<AuditoriaResponse> getAuditoriasResp(final List<AuditoriaDTO> auditorias) {
		if(!ObjectUtils.existeValor(auditorias)) {
			return null;
		}
		
		List<AuditoriaResponse> auditoriasResp = new ArrayList<>();
		
		auditoriasResp = auditorias.stream().map(au->{
			AuditoriaResponse resp = new AuditoriaResponse();
			resp.setAccion(au.getAccion());
			resp.setCamposOriginalesDTO(getCamposOriginalesResp(au.getCamposOriginalesDTO()));
			resp.setCveIdAccionRegistro(au.getCveIdAccionRegistro());
			resp.setCveSituacionRegistro(au.getCveSituacionRegistro());
			resp.setDesAccionRegistro(au.getDesAccionRegistro());
			resp.setDesCambio(au.getDesCambio());
			resp.setDesObservacionesAprobador(au.getDesObservacionesAprobador());
			resp.setDesObservacionesSol(au.getDesObservacionesSol());
			resp.setDesSituacionRegistro(au.getDesSituacionRegistro());
			resp.setFecActualizacion(au.getFecActualizacion());
			resp.setFecAlta(au.getFecAlta());
			resp.setFecBaja(au.getFecBaja());
			resp.setNomUsuario(au.getNomUsuario());
			resp.setNumFolioMovOriginal(au.getNumFolioMovOriginal());
			return resp;
		}).collect(Collectors.toList());
		
		return auditoriasResp;
	}
	
	private final CamposOriginalesResponse getCamposOriginalesResp(final CamposOriginalesDTO camposOriginalesDTO) {
		if(!ObjectUtils.existeValor(camposOriginalesDTO)) {
			return null;
		}
		
		CamposOriginalesResponse camOriResp = new CamposOriginalesResponse();
		camOriResp.setCambioNss(camposOriginalesDTO.getCambioNss());
		camOriResp.setCambioRp(camposOriginalesDTO.getCambioRp());
		camOriResp.setConsecuencia(camposOriginalesDTO.getConsecuencia());
		camOriResp.setDiasSubsidiados(camposOriginalesDTO.getDiasSubsidiados());
		camOriResp.setFechaFin(camposOriginalesDTO.getFechaFin());
		camOriResp.setFechaInicio(camposOriginalesDTO.getFechaInicio());
		camOriResp.setNss(camposOriginalesDTO.getNss());
		camOriResp.setProcentaje(camposOriginalesDTO.getProcentaje());
		camOriResp.setRp(camposOriginalesDTO.getRp());
		camOriResp.setTipoRiesgo(camposOriginalesDTO.getTipoRiesgo());
		
		return camOriResp;
	}

	private final List<BitacoraErroresResponse> getBitacoraErrorResp(final List<BitacoraErroresDTO> bitacoraErroresDTO) {
		if(!ObjectUtils.existeValor(bitacoraErroresDTO)) {
			return null;
		}
		
		List<BitacoraErroresResponse> bitacoraResp = new ArrayList<>();
		bitacoraResp = bitacoraErroresDTO.stream().map(b->{
			BitacoraErroresResponse resp = new BitacoraErroresResponse();
			resp.setCveError(b.getCveError());
			resp.setCveIdCodigoError(b.getCveIdCodigoError());
			resp.setCveTipoError(b.getCveTipoError());
			resp.setDesCampo(b.getDesCampo());
			resp.setDesCodigoError(b.getDesCodigoError());
			resp.setDesError(b.getDesError());
			resp.setDesTipoError(b.getDesTipoError());
			resp.setDesValorOriginal(b.getDesValorOriginal());
			resp.setFecActualizacion(b.getFecActualizacion());
			resp.setFecAlta(b.getFecAlta());
			resp.setFecBaja(b.getFecBaja());
			return resp;
		}).collect(Collectors.toList());
		return bitacoraResp;
	}

	private final IncapacidadResponse getIncapacidadResp(final IncapacidadDTO incapacidadDTO) {
		if(!ObjectUtils.existeValor(incapacidadDTO)) {
			return null;
		}
		
		IncapacidadResponse incapacidadResp = new IncapacidadResponse();
		incapacidadResp.setBitacoraDictamen(getBitacoraDicResp(incapacidadDTO.getBitacoraDictamen()));
		
		if(incapacidadDTO.getCveConsecuencia() != null) {
			incapacidadResp.setCveConsecuencia(incapacidadDTO.getCveConsecuencia().toString());
		}
		
		incapacidadResp.setCveLaudo(incapacidadDTO.getCveLaudo());
		incapacidadResp.setCveNaturaleza(incapacidadDTO.getCveNaturaleza());
		incapacidadResp.setCveReevaluacion(incapacidadDTO.getCveReevaluacion());
		incapacidadResp.setCveTipoIncapacidad(incapacidadDTO.getCveTipoIncapacidad());
		incapacidadResp.setCveTipoRiesgo(incapacidadDTO.getCveTipoRiesgo());
		incapacidadResp.setDesConsecuencia(incapacidadDTO.getDesConsecuencia());
		incapacidadResp.setDesLaudo(incapacidadDTO.getDesLaudo());
		incapacidadResp.setDesNaturaleza(incapacidadDTO.getDesNaturaleza());
		incapacidadResp.setDesTipoIncapacidad(incapacidadDTO.getDesTipoIncapacidad());
		incapacidadResp.setDesTipoRiesgo(incapacidadDTO.getDesTipoRiesgo());
		incapacidadResp.setFecAccidente(incapacidadDTO.getFecAccidente());
		incapacidadResp.setFecActualizacion(incapacidadDTO.getFecActualizacion());
		incapacidadResp.setFecAlta(incapacidadDTO.getFecAlta());
		incapacidadResp.setFecAltaIncapacidad(incapacidadDTO.getFecAltaIncapacidad());
		incapacidadResp.setFecAtencion(incapacidadDTO.getFecAtencion());
		incapacidadResp.setFecBaja(incapacidadDTO.getFecBaja());
		incapacidadResp.setFecExpDictamen(incapacidadDTO.getFecExpDictamen());
		incapacidadResp.setFecFin(incapacidadDTO.getFecFin());
		incapacidadResp.setFecInicio(incapacidadDTO.getFecInicio());
		incapacidadResp.setFecIniPension(incapacidadDTO.getFecIniPension());
		incapacidadResp.setNumActoInseguro(incapacidadDTO.getNumActoInseguro());
		incapacidadResp.setNumCausaExterna(incapacidadDTO.getNumCausaExterna());
		incapacidadResp.setNumCodigoDiagnostico(incapacidadDTO.getNumCodigoDiagnostico());
		incapacidadResp.setNumDiasSubsidiados(incapacidadDTO.getNumDiasSubsidiados());
		incapacidadResp.setNumMatMedAutCdst(incapacidadDTO.getNumMatMedAutCdst());
		incapacidadResp.setNumMatMedTratante(incapacidadDTO.getNumMatMedTratante());
		incapacidadResp.setNumRiesgoFisico(incapacidadDTO.getNumRiesgoFisico());
		incapacidadResp.setObjectIdIncapacidad(incapacidadDTO.getObjectIdIncapacidad());
		incapacidadResp.setPorPorcentajeIncapacidad(incapacidadDTO.getPorPorcentajeIncapacidad());
		return incapacidadResp;
	}
	
	private final List<BitacoraDictamenResponse> getBitacoraDicResp(final List<BitacoraDictamenDTO> list) {
		if(!ObjectUtils.existeValor(list)) {
			return null;
		}
		
		List<BitacoraDictamenResponse> bitacoraResp = new ArrayList<>();
		bitacoraResp = list.stream().map(b->{
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

	private final PatronResponse getPatronResp(final PatronDTO patronDTO) {
		if(!ObjectUtils.existeValor(patronDTO)) {
			return null;
		}
		
		PatronResponse patronResp = new PatronResponse();
		patronResp.setCveClase(patronDTO.getCveClase());
		patronResp.setCveDelegacionAux(patronDTO.getCveDelegacionAux());
		patronResp.setCveDelRegPatronal(patronDTO.getCveDelRegPatronal());
		patronResp.setCveFraccion(patronDTO.getCveFraccion());
		patronResp.setCveModalidad(patronDTO.getCveModalidad());
		patronResp.setCveSubDelRegPatronal(patronDTO.getCveSubDelRegPatronal());
		patronResp.setDesClase(patronDTO.getDesClase());
		patronResp.setDesDelRegPatronal(patronDTO.getDesDelRegPatronal());
		patronResp.setDesFraccion(patronDTO.getDesFraccion());
		patronResp.setDesPrima(patronDTO.getDesPrima());
		patronResp.setDesRazonSocial(patronDTO.getDesRazonSocial());
		patronResp.setDesRfc(patronDTO.getDesRfc());
		patronResp.setDesSubDelRegPatronal(patronDTO.getDesSubDelRegPatronal());
		patronResp.setNumPrima(patronDTO.getNumPrima());
		patronResp.setObjectIdPatron(patronDTO.getObjectIdPatron());
		patronResp.setRefRegistroPatronal(patronDTO.getRefRegistroPatronal());
		patronResp.setFecActualizacion(patronDTO.getFecActualizacion());
		patronResp.setFecAlta(patronDTO.getFecAlta());
		patronResp.setFecBaja(patronDTO.getFecBaja());
		return patronResp;
	}
	
}
