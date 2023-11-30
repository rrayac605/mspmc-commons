package mx.gob.imss.cit.mspmccommons.integration.model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@EqualsAndHashCode(callSuper = false)
public class CifrasControlDTO extends FechasAuditoriaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5855265134193383054L;

	public CifrasControlDTO() {
		this.numTotalRegistros = 0L;
		this.numRegistrosCorrectos = 0L;
		this.numRegistrosCorrectosOtras = 0L;
		this.numRegistrosErrorOtras = 0L;
		this.numRegistrosError = 0L;
		this.numRegistrosSusOtras = 0L;
		this.numRegistrosDupOtras = 0L;
		this.numRegistrosBaja = 0L;
		this.numRegistrosBajaOtras = 0L;
		this.numRegistrosDup = 0L;
		this.numRegistrosSus = 0L;
		this.numTotalElementsPage = 0L;
		this.numTotalPages = 0L;
	}

	/**
	 * 
	 */



	@Setter
	@Getter
	private Long numTotalRegistros;
	@Setter
	@Getter
	private Long numRegistrosCorrectos;
	@Setter
	@Getter
	private Long numRegistrosCorrectosOtras;
	@Setter
	@Getter
	private Long numRegistrosErrorOtras;
	@Setter
	@Getter
	private Long numRegistrosError;
	@Setter
	@Getter
	private Long numRegistrosSusOtras;
	@Setter
	@Getter
	private Long numRegistrosDupOtras;
	@Setter
	@Getter
	private Long numRegistrosBaja;
	@Setter
	@Getter
	private Long numRegistrosBajaOtras;
	@Setter
	@Getter
	private Long numRegistrosDup;
	@Setter
	@Getter
	private Long numRegistrosSus;
	private Long numTotalElementsPage;
	private Long numTotalPages;

	@Override
	public String toString() {
		return "CifrasControlDTO [numTotalRegistros=" + numTotalRegistros + ", numRegistrosCorrectos="
				+ numRegistrosCorrectos + ", numRegistrosCorrectosOtras=" + numRegistrosCorrectosOtras
				+ ", numRegistrosErrorOtras=" + numRegistrosErrorOtras + ", numRegistrosError=" + numRegistrosError
				+ ", numRegistrosSusOtras=" + numRegistrosSusOtras + ", numRegistrosDupOtras=" + numRegistrosDupOtras
				+ ", numRegistrosBaja=" + numRegistrosBaja + ", numRegistrosBajaOtras=" + numRegistrosBajaOtras
				+ ", numRegistrosDup=" + numRegistrosDup + ", numRegistrosSus=" + numRegistrosSus + "]";
	}

}
