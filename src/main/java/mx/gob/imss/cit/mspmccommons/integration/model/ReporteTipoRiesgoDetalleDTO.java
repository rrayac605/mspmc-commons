package mx.gob.imss.cit.mspmccommons.integration.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.bson.types.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.io.*;
import java.util.*;

public class ReporteTipoRiesgoDetalleDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private Integer _id;
	
	@Getter
	@Setter
	private Long conteo;

}
