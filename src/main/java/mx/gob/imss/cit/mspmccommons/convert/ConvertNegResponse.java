package mx.gob.imss.cit.mspmccommons.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mx.gob.imss.cit.mspmccommons.dto.ArchivoDTO;
import mx.gob.imss.cit.mspmccommons.dto.AseguradoDTO;
import mx.gob.imss.cit.mspmccommons.dto.AuditoriaDTO;
import mx.gob.imss.cit.mspmccommons.dto.BitacoraDictamenDTO;
import mx.gob.imss.cit.mspmccommons.dto.BitacoraErroresDTO;
import mx.gob.imss.cit.mspmccommons.dto.CamposOriginalesDTO;
import mx.gob.imss.cit.mspmccommons.dto.CifrasControlDTO;
import mx.gob.imss.cit.mspmccommons.dto.DetalleRegistroDTO;
import mx.gob.imss.cit.mspmccommons.dto.IncapacidadDTO;
import mx.gob.imss.cit.mspmccommons.dto.PatronDTO;
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

public class ConvertNegResponse {

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
		detResp.setExisteCambios(detNeg.isExisteCambios());
		detResp.setExisteRelacionLaboral(detNeg.getExisteRelacionLaboral());
		detResp.setFecProcesoCarga(detNeg.getFecProcesoCarga());
		detResp.setIdArchivoDetalleSUS(detNeg.getIdArchivoDetalleSUS());
		detResp.setIdentificador(detNeg.getIdentificador());
		detResp.setIdentificadorArchivo(detNeg.getIdentificadorArchivo());
		detResp.setIdOrigenAlta(detNeg.getIdOrigenAlta());
		detResp.setIsPending(detNeg.getIsPending());
		detResp.setListaSuceptible(detNeg.getListaSuceptible());
		detResp.setNumNss(detNeg.getNumNss());
		detResp.setObjectIdArchivoDetalle(detNeg.getObjectIdArchivoDetalle());
		detResp.setObjectIdOrigen(detNeg.getObjectIdOrigen());
		detResp.setOrigenAlta(detNeg.getOrigenAlta());
		detResp.setOrigenPantalla(detNeg.getOrigenPantalla());
		
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
		aseResp.setCveIdSubdelNss(aseguradoDTO.getCveIdSubdelNss());
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
		aseResp.setFechaBaja(aseguradoDTO.getFechaBaja());
		aseResp.setIdSubDelNss(aseguradoDTO.getIdSubDelNss());
		aseResp.setMarcaAfiliatoria(aseguradoDTO.getMarcaAfiliatoria());
		aseResp.setMarcaBaja(aseguradoDTO.getMarcaBaja());
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
	
	private final CamposOriginalesResponse getCamposOriginalesResp(final CamposOriginalesDTO camposOriginalesDTO) {
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
		incapacidadResp.setCveConsecuencia(incapacidadDTO.getCveConsecuencia());
		incapacidadResp.setCveLaudo(incapacidadDTO.getCveLaudo());
		incapacidadResp.setCveNaturaleza(incapacidadDTO.getCveNaturaleza());
		incapacidadResp.setCveReevaluacion(incapacidadDTO.getCveReevaluacion());
		incapacidadResp.setCveTipoIncapacidad(incapacidadDTO.getCveTipoIncapacidad());
		incapacidadResp.setCveTipoRiesgo(incapacidadDTO.getCveTipoRiesgo());
		incapacidadResp.setCveTipoModifPatronal(incapacidadDTO.getCveTipoModifPatronal());
		incapacidadResp.setDesTipoModifPatronal(incapacidadDTO.getDesTipoModifPatronal());
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
		incapacidadResp.setDesActoInseguro(incapacidadDTO.getDesActoInseguro());
		incapacidadResp.setNumCausaExterna(incapacidadDTO.getNumCausaExterna());
		incapacidadResp.setDesCausaExterna(incapacidadDTO.getDesCausaExterna());
		incapacidadResp.setNumCodigoDiagnostico(incapacidadDTO.getNumCodigoDiagnostico());
		incapacidadResp.setDesCodigoDiagnostico(incapacidadDTO.getDesCodigoDiagnostico());
		incapacidadResp.setNumDiasSubsidiados(incapacidadDTO.getNumDiasSubsidiados());
		incapacidadResp.setNumMatMedAutCdst(incapacidadDTO.getNumMatMedAutCdst());
		incapacidadResp.setNumMatMedTratante(incapacidadDTO.getNumMatMedTratante());
		incapacidadResp.setNumRiesgoFisico(incapacidadDTO.getNumRiesgoFisico());
		incapacidadResp.setDesRiesgoFisico(incapacidadDTO.getDesRiesgoFisico());
		incapacidadResp.setObjectIdIncapacidad(incapacidadDTO.getObjectIdIncapacidad());
		incapacidadResp.setPorPorcentajeIncapacidad(incapacidadDTO.getPorPorcentajeIncapacidad());
		incapacidadResp.setModifPatronal(incapacidadDTO.isModifPatronal());
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
	
	/////////////////////////////////////////
	
	public final DetalleRegistroDTO getDetalleNeg(final DetalleRegistroResponse detResp) {
		if(!ObjectUtils.existeValor(detResp)) {
			return null;
		}
		
		DetalleRegistroDTO detNeg = new DetalleRegistroDTO();
		
		detNeg.setAseguradoDTO(getAseguradoNeg(detResp.getAseguradoDTO()));
		detNeg.setAuditorias(getAuditoriasNeg(detResp.getAuditorias()));
		detNeg.setBitacoraErroresDTO(getBitacoraErrorNeg(detResp.getBitacoraErroresDTO()));
		detNeg.setIncapacidadDTO(getIncapacidadNeg(detResp.getIncapacidadDTO()));
		detNeg.setPatronDTO(getPatronNeg(detResp.getPatronDTO()));
		
		detNeg.setConfirmarSinCambios(detResp.getConfirmarSinCambios());
		detNeg.setCveOrigenArchivo(detResp.getCveOrigenArchivo());
		detNeg.setCveSituacionRegistro(detResp.getCveSituacionRegistro());
		detNeg.setDesObservacionesAprobador(detResp.getDesObservacionesAprobador());
		detNeg.setDesObservacionesSol(detResp.getDesObservacionesSol());
		detNeg.setDesSituacionRegistro(detResp.getDesSituacionRegistro());
		detNeg.setFecProcesoCarga(detResp.getFecProcesoCarga());
		detNeg.setIdentificadorArchivo(detResp.getIdentificadorArchivo());
		detNeg.setIsPending(detResp.getIsPending());
		detNeg.setObjectIdArchivoDetalle(detResp.getObjectIdArchivoDetalle());
		detNeg.setObjectIdOrigen(detResp.getObjectIdOrigen());
		
		return detNeg;
	}

	private final AseguradoDTO getAseguradoNeg(final AseguradoResponse aseguradoResp) {
		if(!ObjectUtils.existeValor(aseguradoResp)) {
			return null;
		}
		
		AseguradoDTO aseguradoDTO = new AseguradoDTO();
		
		aseguradoDTO.setCveCasoRegistro(aseguradoResp.getCveCasoRegistro());
		aseguradoDTO.setCveCodigoError(aseguradoResp.getCveCodigoError());
		aseguradoDTO.setCveDelegacionAtencion(aseguradoResp.getCveDelegacionAtencion());
		aseguradoDTO.setCveDelegacionNss(aseguradoResp.getCveDelegacionNss());
		aseguradoDTO.setCveEstadoRegistro(aseguradoResp.getCveEstadoRegistro());
		aseguradoDTO.setCveIdPersona(aseguradoResp.getCveIdPersona());
		aseguradoDTO.setCveOcupacion(aseguradoResp.getCveOcupacion());
		aseguradoDTO.setCveSubDelAtencion(aseguradoResp.getCveSubDelAtencion());
		aseguradoDTO.setCveSubdelNss(aseguradoResp.getCveSubdelNss());
		aseguradoDTO.setCveUmfAdscripcion(aseguradoResp.getCveUmfAdscripcion());
		aseguradoDTO.setCveUmfExp(aseguradoResp.getCveUmfExp());
		aseguradoDTO.setCveUmfPagadora(aseguradoResp.getCveUmfPagadora());
		aseguradoDTO.setDesCasoRegistro(aseguradoResp.getDesCasoRegistro());
		aseguradoDTO.setDesCodigoError(aseguradoResp.getDesCodigoError());
		aseguradoDTO.setDesDelegacionAtencion(aseguradoResp.getDesDelegacionAtencion());
		aseguradoDTO.setDesDelegacionNss(aseguradoResp.getDesDelegacionNss());
		aseguradoDTO.setDesEstadoRegistro(aseguradoResp.getDesEstadoRegistro());
		aseguradoDTO.setDesOcupacion(aseguradoResp.getDesOcupacion());
		aseguradoDTO.setDesSubDelAtencion(aseguradoResp.getDesSubDelAtencion());
		aseguradoDTO.setDesSubDelNss(aseguradoResp.getDesSubDelNss());
		aseguradoDTO.setDesUmfAdscripcion(aseguradoResp.getDesUmfAdscripcion());
		aseguradoDTO.setDesUmfExp(aseguradoResp.getDesUmfExp());
		aseguradoDTO.setDesUmfPagadora(aseguradoResp.getDesUmfPagadora());
		aseguradoDTO.setFecActualizacion(aseguradoResp.getFecActualizacion());
		aseguradoDTO.setFecAlta(aseguradoResp.getFecAlta());
		aseguradoDTO.setFecBaja(aseguradoResp.getFecBaja());
		aseguradoDTO.setMarcaAfiliatoria(aseguradoResp.getMarcaAfiliatoria());
		aseguradoDTO.setNomAsegurado(aseguradoResp.getNomAsegurado());
		aseguradoDTO.setNumCicloAnual(aseguradoResp.getNumCicloAnual());
		aseguradoDTO.setNumIndice(aseguradoResp.getNumIndice());
		aseguradoDTO.setNumNss(aseguradoResp.getNumNss());
		aseguradoDTO.setNumSalarioDiario(aseguradoResp.getNumSalarioDiario());
		aseguradoDTO.setObjectIdArchivo(aseguradoResp.getObjectIdArchivo());
		aseguradoDTO.setRefCurp(aseguradoResp.getRefCurp());
		aseguradoDTO.setRefFolioOriginal(aseguradoResp.getRefFolioOriginal());
		aseguradoDTO.setRefPrimerApellido(aseguradoResp.getRefPrimerApellido());
		aseguradoDTO.setRefSegundoApellido(aseguradoResp.getRefSegundoApellido());
		aseguradoDTO.setSinUMF(aseguradoResp.getSinUMF());
		aseguradoDTO.setUsuarioModificador(aseguradoResp.getUsuarioModificador());
		
		return aseguradoDTO;
	}
	

	private final List<AuditoriaDTO> getAuditoriasNeg(final List<AuditoriaResponse> auditorias) {
		if(!ObjectUtils.existeValor(auditorias)) {
			return null;
		}
		
		List<AuditoriaDTO> auditoriasNeg = new ArrayList<>();
		
		auditoriasNeg = auditorias.stream().map(au->{
			AuditoriaDTO resp = new AuditoriaDTO();
			resp.setAccion(au.getAccion());
			resp.setCamposOriginalesDTO(getCamposOriginalesNeg(au.getCamposOriginalesDTO()));
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
		
		return auditoriasNeg;
	}
	
	private final CamposOriginalesDTO getCamposOriginalesNeg(final CamposOriginalesResponse camposOriginalesResp) {
		if(!ObjectUtils.existeValor(camposOriginalesResp)) {
			return null;
		}
		
		CamposOriginalesDTO camOriNeg = new CamposOriginalesDTO();
		camOriNeg.setCambioNss(camposOriginalesResp.getCambioNss());
		camOriNeg.setCambioRp(camposOriginalesResp.getCambioRp());
		camOriNeg.setConsecuencia(camposOriginalesResp.getConsecuencia());
		camOriNeg.setDiasSubsidiados(camposOriginalesResp.getDiasSubsidiados());
		camOriNeg.setFechaFin(camposOriginalesResp.getFechaFin());
		camOriNeg.setFechaInicio(camposOriginalesResp.getFechaInicio());
		camOriNeg.setNss(camposOriginalesResp.getNss());
		camOriNeg.setProcentaje(camposOriginalesResp.getProcentaje());
		camOriNeg.setRp(camposOriginalesResp.getRp());
		camOriNeg.setTipoRiesgo(camposOriginalesResp.getTipoRiesgo());
		
		return camOriNeg;
	}

	private final List<BitacoraErroresDTO> getBitacoraErrorNeg(final List<BitacoraErroresResponse> bitacoraErroresResp) {
		if(!ObjectUtils.existeValor(bitacoraErroresResp)) {
			return null;
		}
		
		List<BitacoraErroresDTO> bitacoraNeg = new ArrayList<>();
		bitacoraNeg = bitacoraErroresResp.stream().map(b->{
			BitacoraErroresDTO resp = new BitacoraErroresDTO();
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
		return bitacoraNeg;
	}

	private final IncapacidadDTO getIncapacidadNeg(final IncapacidadResponse incapacidadResp) {
		if(!ObjectUtils.existeValor(incapacidadResp)) {
			return null;
		}
		
		IncapacidadDTO incapacidadDto = new IncapacidadDTO();
		incapacidadDto.setBitacoraDictamen(getBitacoraDicNeg(incapacidadResp.getBitacoraDictamen()));
		incapacidadDto.setCveConsecuencia(incapacidadResp.getCveConsecuencia());
		incapacidadDto.setCveLaudo(incapacidadResp.getCveLaudo());
		incapacidadDto.setCveNaturaleza(incapacidadResp.getCveNaturaleza());
		incapacidadDto.setCveReevaluacion(incapacidadResp.getCveReevaluacion());
		incapacidadDto.setCveTipoIncapacidad(incapacidadResp.getCveTipoIncapacidad());
		incapacidadDto.setCveTipoRiesgo(incapacidadResp.getCveTipoRiesgo());
		incapacidadDto.setDesConsecuencia(incapacidadResp.getDesConsecuencia());
		incapacidadDto.setDesLaudo(incapacidadResp.getDesLaudo());
		incapacidadDto.setDesNaturaleza(incapacidadResp.getDesNaturaleza());
		incapacidadDto.setDesTipoIncapacidad(incapacidadResp.getDesTipoIncapacidad());
		incapacidadDto.setDesTipoRiesgo(incapacidadResp.getDesTipoRiesgo());
		incapacidadDto.setFecAccidente(incapacidadResp.getFecAccidente());
		incapacidadDto.setFecActualizacion(incapacidadResp.getFecActualizacion());
		incapacidadDto.setFecAlta(incapacidadResp.getFecAlta());
		incapacidadDto.setFecAltaIncapacidad(incapacidadResp.getFecAltaIncapacidad());
		incapacidadDto.setFecAtencion(incapacidadResp.getFecAtencion());
		incapacidadDto.setFecBaja(incapacidadResp.getFecBaja());
		incapacidadDto.setFecExpDictamen(incapacidadResp.getFecExpDictamen());
		incapacidadDto.setFecFin(incapacidadResp.getFecFin());
		incapacidadDto.setFecInicio(incapacidadResp.getFecInicio());
		incapacidadDto.setFecIniPension(incapacidadResp.getFecIniPension());
		incapacidadDto.setNumActoInseguro(incapacidadResp.getNumActoInseguro());
		incapacidadDto.setNumCausaExterna(incapacidadResp.getNumCausaExterna());
		incapacidadDto.setNumCodigoDiagnostico(incapacidadResp.getNumCodigoDiagnostico());
		incapacidadDto.setNumDiasSubsidiados(incapacidadResp.getNumDiasSubsidiados());
		incapacidadDto.setNumMatMedAutCdst(incapacidadResp.getNumMatMedAutCdst());
		incapacidadDto.setNumMatMedTratante(incapacidadResp.getNumMatMedTratante());
		incapacidadDto.setNumRiesgoFisico(incapacidadResp.getNumRiesgoFisico());
		incapacidadDto.setObjectIdIncapacidad(incapacidadResp.getObjectIdIncapacidad());
		incapacidadDto.setPorPorcentajeIncapacidad(incapacidadResp.getPorPorcentajeIncapacidad());
		return incapacidadDto;
	}
	
	private final List<BitacoraDictamenDTO> getBitacoraDicNeg(final List<BitacoraDictamenResponse> list) {
		if(!ObjectUtils.existeValor(list)) {
			return null;
		}
		
		List<BitacoraDictamenDTO> bitacoraNeg = new ArrayList<>();
		bitacoraNeg = list.stream().map(b->{
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
		
		return bitacoraNeg;
	}

	private final PatronDTO getPatronNeg(final PatronResponse patronResp) {
		if(!ObjectUtils.existeValor(patronResp)) {
			return null;
		}
		
		PatronDTO patronDto = new PatronDTO();
		patronDto.setCveClase(patronResp.getCveClase());
		patronDto.setCveDelegacionAux(patronResp.getCveDelegacionAux());
		patronDto.setCveDelRegPatronal(patronResp.getCveDelRegPatronal());
		patronDto.setCveFraccion(patronResp.getCveFraccion());
		patronDto.setCveModalidad(patronResp.getCveModalidad());
		patronDto.setCveSubDelRegPatronal(patronResp.getCveSubDelRegPatronal());
		patronDto.setDesClase(patronResp.getDesClase());
		patronDto.setDesDelRegPatronal(patronResp.getDesDelRegPatronal());
		patronDto.setDesFraccion(patronResp.getDesFraccion());
		patronDto.setDesPrima(patronResp.getDesPrima());
		patronDto.setDesRazonSocial(patronResp.getDesRazonSocial());
		patronDto.setDesRfc(patronResp.getDesRfc());
		patronDto.setDesSubDelRegPatronal(patronResp.getDesSubDelRegPatronal());
		patronDto.setNumPrima(patronResp.getNumPrima());
		patronDto.setObjectIdPatron(patronResp.getObjectIdPatron());
		patronDto.setRefRegistroPatronal(patronResp.getRefRegistroPatronal());
		patronDto.setFecActualizacion(patronResp.getFecActualizacion());
		patronDto.setFecAlta(patronResp.getFecAlta());
		patronDto.setFecBaja(patronResp.getFecBaja());
		return patronDto;
	}
}




















