package mx.gob.imss.cit.mspmccommons.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mongodb.lang.Nullable;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.mspmccommons.support.CustomDateDeserializer;
import mx.gob.imss.cit.mspmccommons.utils.CustomDateSerializer;

/**
 * @author david.sanchez
 *
 */

@Document(collection = "MCT_CAMBIOS")
public class CambioDTO extends RegistroBDDTO {

	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private List<AuditoriaDTO> auditorias;

	@Setter
	@Getter
	private List<BitacoraErroresDTO> bitacoraErroresDTO;

	/**
	 * 225- 228 Acto Inseguro 4 Numérico
	 */
	@Setter
	@Getter
	private String cveActoInseguro;

	@Setter
	@Getter
	private Integer cveCasoRegistro;

	/**
	 * 213-216 Causa Externa 4 Numérico
	 */
	@Setter
	@Getter
	private String cveCausaExterna;

	@Setter
	@Getter
	private String cveCodigoError;

	/**
	 * 120 Consecuencia 1 Numérico
	 */
	@Setter
	@Getter
	private int cveConsecuencia;

	/**
	 * 19-20 Del Atención NSS 2 Numérico
	 */
	@Setter
	@Getter
	private Integer cveDelegacionAtencion;

	/**
	 * 12-13 Del NSS 2 Numérico
	 */
	@Setter
	@Getter
	private Integer cveDelegacionNss;

	/**
	 * Campo auxiliar para el estado del registro
	 */
	@Setter
	@Getter
	private Integer cveEstadoRegistro;

	@Setter
	@Getter
	private Integer cveIdPersona;

	/**
	 * 190 Laudo 1 Numérico
	 */
	@Setter
	@Getter
	private Integer cveLaudo;
	/**
	 * 217- 220 Naturaleza 4 Numérico
	 */
	@Setter
	@Getter
	private String cveNaturaleza;

	/**
	 * 229-233 Ocupación 5 Numérico
	 */
	@Setter
	@Getter
	private String cveOcupacion;

	/**
	 * 120 Consecuencia 1 Numérico
	 */
	@Setter
	@Getter
	private String cveOrigenArchivo;

	@Setter
	@Getter
	private String cveReevaluacion;

	/**
	 * 221- 224 Riesgo Físico 4 Numérico
	 */
	@Setter
	@Getter
	private String cveRiesgoFisico;

	@Setter
	@Getter
	private Integer cveSituacionRegistro;

	/**
	 * 21-22 Sub Atención NSS 2 Numérico
	 */
	@Setter
	@Getter
	private Integer cveSubDelAtencion;

	/**
	 * 14-15 Sub NSS 2 Numérico
	 */
	@Setter
	@Getter
	private Integer cveSubdelNss;

	@Setter
	@Getter
	private int cveTipoIncapacidad;

	/**
	 * 119 Tipo de Riesgo 1 Numérico
	 */
	@Setter
	@Getter
	private int cveTipoRiesgo;

	/**
	 * 16-18 UMF Ads 3 Numérico
	 */
	@Setter
	@Getter
	private Integer cveUmfAdscripcion;

	/**
	 * 23-25 UMF Exp 3 Numérico
	 */
	@Setter
	@Getter
	private Integer cveUmfExp;

	/**
	 * 26-28 UMF Pagadora 3 Numérico
	 */
	@Setter
	@Getter
	private Integer cveUmfPagadora;

	@Setter
	@Getter
	private String desAccionRegistro;
	
	@Setter
	@Getter
	private String desActoInseguro;

	@Setter
	@Getter
	private String desCasoRegistro;

	@Setter
	@Getter
	private String desCausaExterna;

	@Setter
	@Getter
	private String desCodigoDiagnostico;

	@Setter
	@Getter
	private String desCodigoError;

	@Setter
	@Getter
	private String desConsecuencia;

	@Setter
	@Getter
	private String desDelegacionAtencion;

	@Setter
	@Getter
	private String desDelegacionNss;

	@Setter
	@Getter
	private String desEstadoRegistro;

	@Setter
	@Getter
	private String desLaudo;

	@Setter
	@Getter
	private String desNaturaleza;

	@Setter
	@Getter
	private String desOcupacion;

	@Setter
	@Getter
	private String desRiesgoFisico;

	@Setter
	@Getter
	private String desSituacionRegistro;

	@Setter
	@Getter
	private String desSubDelAtencion;

	@Setter
	@Getter
	private String desSubDelNss;

	@Setter
	@Getter
	private String desTipoIncapacidad;

	@Setter
	@Getter
	private String desTipoRiesgo;

	@Setter
	@Getter
	private String desUmfAdscripcion;

	@Setter
	@Getter
	private String desUmfExp;

	@Setter
	@Getter
	private String desUmfPagadora;

	@Setter
	@Getter
	private Boolean duplicado;

	@Setter
	@Getter
	private Boolean errorCurp;

	@Setter
	@Getter
	private Boolean errorNombre;

	/**
	 * 137- 144 Fecha de accidente 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAccidente;

	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAltaIncapacidad;

	/**
	 * 153-160 Fecha de Alta 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAltaRegistro;

	/**
	 * 129-136 Fecha de Atención/Recepción del paciente 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAtencion;

	/**
	 * 161- 168 Fecha de expedición del Dictamen 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecExpedicionDictamen;

	/**
	 * 169-176 Fecha fin 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecFin;

	/**
	 * 121-128 Fecha de Inicio 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecInicio;

	/**
	 * 145-152 Fecha de Inicio de Pensión 8 Numérico
	 */
	@Setter
	@Getter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecIniPension;

	@Getter
	@Setter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecProcesoCarga;

	/**
	 * 1-3 Identificador 3 Alfanumérico
	 */
	@Setter
	@Getter
	private String identificador;
	/**
	 * 69-118 Nombre 50 Alfanumérico
	 */
	@Setter
	@Getter
	private String nomAsegurado;

	@Setter
	@Getter
	private String numActoInseguro;
	@Setter
	@Getter
	private String numCausaExterna;
	@Setter
	@Getter
	private String numCicloAnual;
	/**
	 * 191-194 Código de diagnostico 4 Numérico
	 */
	@Setter
	@Getter
	private String numCodigoDiagnostico;
	/**
	 * 177- 179 Días Subsidiados 3 Numérico
	 */
	@Setter
	@Getter
	private Integer numDiasSubsidiados;

	@Getter
	@Setter
	private Integer numIndice;
	/**
	 * 204- 212 Matrícula del médico que autoriza CDST 9 Numérico
	 */
	@Setter
	@Getter
	private String numMatMedAutCdst;
	/**
	 * 195- 203 Matricula del médico tratante 9 Numérico
	 */
	@Setter
	@Getter
	private String numMatMedTratante;

	/**
	 * 40-50 Número de Seguridad Social 11 Numérico
	 */
	@Getter
	@Setter
	private String numNss;

	@Setter
	@Getter
	private String numRiesgoFisico;

	/**
	 * 183-189 Salario Diario 7 Numérico
	 */
	@Setter
	@Getter
	private BigDecimal numSalarioDiario;

	/**
	 * Id mongo
	 */
	@Getter
	@Setter
	@Id
	private String objectIdCambio;

	@Getter
	@Setter
	/** Object id del movimiento */
	private ObjectId objectIdOrigen;

	/**
	 * 180-182 Porcentaje de Incapacidad 3 Numérico
	 */
	@Setter
	@Getter
	private BigDecimal porcentajeIncapacidad;
	/**
	 * 51-68 CURP 18 Alfanumérico
	 */
	@Setter
	@Getter
	private String refCurp;
	@Setter
	@Getter
	private String refCurpBDTU;

	/**
	 * 4-11 Folio Movimiento Original 8 Alfanumérico
	 */
	@Setter
	@Getter
	private String refFolioOriginal;

	@Setter
	@Getter
	private String refNombreBDTU;

	@Setter
	@Getter
	private String refPrimerApellido;

	@Setter
	@Getter
	private String refSegundoApellido;

	@Setter
	@Getter
	private List<CambioDTO> susceptibles;
	@Setter
	@Getter
	private List<CambioDTO> susceptiblesNss;
	
	@Setter
	@Getter
	private String origenAlta;
	
	@Getter
	@Setter
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fechaAccion;

	@Getter
	@Setter
	private String usuarioAccion;

	@Getter
	@Setter
	private Boolean isPending;
	
	@Getter
	@Setter
	private Integer cveRelacionLaboral;
	
	@Getter
	@Setter
	private String desRelacionLaboral;

	@Getter
	@Setter
	private ObjectId idOrigenAlta;

	@Setter
	@Getter
	@Nullable	
	private String usuarioModificador;
	@Setter
	@Getter
	private Integer cveTipoModifPatronal;
	
	@Setter
	@Getter
	private String desTipoModifPatronal;
	
	@Setter
	@Getter
	private boolean modifPatronal;
	
	@Setter
	@Getter
	private Boolean sinUMF;
	
	@Setter
	@Getter
	private Boolean marcaAfiliatoria;
	
	@Setter
	@Getter
	private Boolean confirmarSinCambios;
	
	@Setter
	@Getter
	private List<BitacoraDictamenDTO> bitacoraDictamen;
	
}
