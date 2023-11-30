/**
 * 
 */
package mx.gob.imss.cit.mspmccommons.integration.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * @author roberto.raya
 *
 */
@Document(collection = "MCT_ARCHIVO")
public class MctArchivo {

	@Getter
	@Setter
	@Id
	private String objectIdArchivo;

	@Getter
	@Setter
	private String desIdArchivo;

	@Getter
	@Setter
	private String nomArchivo;

	@Getter
	@Setter
	private String fecProcesoCarga;

	@Getter
	@Setter
	private String desArchivo;

	@Getter
	@Setter
	private String desError;

	@Getter
	@Setter
	private String numTotalRegistros;

	@Getter
	@Setter
	private String fecAlta;

	@Getter
	@Setter
	private String fecBaja;

	@Getter
	@Setter
	private String fecActualizacion;

	@Getter
	@Setter
	private String cveEstadoArchivo;

	@Getter
	@Setter
	private String desEstadoArchivo;

	@Getter
	@Setter
	private String cveOrigenArchivo;

	@Getter
	@Setter
	private String desOrigenArchivo;

	@Getter
	@Setter
	private CifrasControl cifrasControl;

	@Getter
	@Setter
	private List<DetalleRegistro> detalleRegistro;

}
