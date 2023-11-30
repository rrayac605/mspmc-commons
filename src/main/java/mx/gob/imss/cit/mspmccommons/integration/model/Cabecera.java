package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Cabecera implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5652348313917467420L;

	/**
	 * Número de registros Numérico 7
	 */
	@Setter
	@Getter
	private BigDecimal numRegistros;

	/**
	 * Fecha de proceso Numérico 8
	 */
	@Setter
	@Getter
	private Date fecProceso;

	/**
	 * Identificador Archivo Alfanumérico 3
	 */
	@Setter
	@Getter
	private String cveArchivo;

	@Override
	public String toString() {
		return "Cabecera [numRegistros=" + numRegistros + ", fecProceso=" + fecProceso + ", cveArchivo=" + cveArchivo
				+ "]";
	}

}
