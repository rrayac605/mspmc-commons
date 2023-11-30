package mx.gob.imss.cit.mspmccommons.resp;

import java.io.Serializable;

import com.mongodb.lang.Nullable;

import lombok.Getter;
import lombok.Setter;

public class BitacoraErroresResponse extends FechasAuditoriaResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private String cveError;

	@Setter
	@Getter
	private String desError;

	@Setter
	@Getter
	private String cveTipoError;

	@Setter
	@Getter
	private String desTipoError;

	@Setter
	@Getter
	private String cveIdCodigoError;

	@Setter
	@Getter
	private String desCodigoError;

	@Setter
	@Getter
	private String desCampo;

	@Setter
	@Getter
	private String desValorOriginal;
	
}
