package mx.gob.imss.cit.mspmccommons.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mongodb.lang.Nullable;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.mspmccommons.support.CustomDateDeserializer;
import mx.gob.imss.cit.mspmccommons.utils.CustomDateSerializer;

public class FechasAuditoriaDTO {

	@Setter
	@Getter
	@Nullable
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecAlta;
	
	@Setter
	@Getter
	@Nullable
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecBaja;
	
	@Setter
	@Getter
	@Nullable
	@JsonDeserialize(using = CustomDateDeserializer.class)
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date fecActualizacion;

}
