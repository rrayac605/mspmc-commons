package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Getter;
import lombok.Setter;

public class DetalleMovimientoCasuisticaDTO {

	@Getter
	@Setter
	private String tipoEntrada;
	@Getter
	@Setter
	private String desDelegacion;

	@Getter
	@Setter
	private Long numRegistrosCorrectos;
	@Getter
	@Setter
	private Long numRegistrosErroneos;
	@Getter
	@Setter
	private Long numRegistrosDuplicados;
	@Getter
	@Setter
	private Long numRegistrosSusAjuste;
	@Getter
	@Setter
	private Long numTotalRegistros;

	@Getter
	@Setter
	private Long numRegistrosCorrectosOtrDel;
	@Getter
	@Setter
	private Long numRegistrosErroneosOtrDel;
	@Getter
	@Setter
	private Long numRegistrosDuplicadosOtrDel;
	@Getter
	@Setter
	private Long numRegistrosSusAjusteOtrDel;
	@Getter
	@Setter
	private Long numTotalRegistrosOtrDel;

	@Getter
	@Setter
	private Long numTotalGenerales;

}
