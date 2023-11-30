package mx.gob.imss.cit.mspmccommons.enums;

import lombok.Getter;
import lombok.Setter;

public enum CamposAseguradoEnum {

	TIPO_ARCHIVO("cveOrigenArchivo"), FOLIO_ORIGINAL("aseguradoDTO.refFolioOriginal"),
	DELEGACION_NSS("aseguradoDTO.cveDelegacionNss"),
	FECHA_ALTA("aseguradoDTO.fecAlta"),
	FECHA_BAJA("aseguradoDTO.fecBaja"),
	SUBDELEGACION_NSS("aseguradoDTO.cveSubdelNss"),
	UMF_ADSCRIPCION("aseguradoDTO.cveUmfAdscripcion"),
	DELEGACION_ATENCION("aseguradoDTO.cveDelegacionAtencion"),
	SUBDELEGACION_ATENCION("aseguradoDTO.cveSubDelAtencion"),
	UMF_EXPEDIDORA("aseguradoDTO.cveUmfExp"),
	UMF_PAGADORA("aseguradoDTO.cveUmfPagadora"), NSS("aseguradoDTO.numNss"),
	CURP("aseguradoDTO.refCurp"), NOMBRE("aseguradoDTO.nomAsegurado"),
	PRIMER_APELLIDO("aseguradoDTO.refPrimerApellido"),
	SEGUNDO_APELLIDO("aseguradoDTO.refSegundoApellido"),
	OCUPACION("aseguradoDTO.cveOcupacion"),
	SALARIO_DIARIO("aseguradoDTO.numSalarioDiario"),
	CODIGO_ERROR("aseguradoDTO.cveCodigoError"),
	FECHA_BAJA_CAMBIO("fecBaja"),
	ESTADO_REGISTRO("aseguradoDTO.cveEstadoRegistro");

	@Setter
	@Getter
	private String nombreCampo;

	private CamposAseguradoEnum(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

}
