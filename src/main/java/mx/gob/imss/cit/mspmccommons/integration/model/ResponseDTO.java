package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class ResponseDTO<T> {

	private T data;
	
	private Long totalRows;

	/** Numero total de registros, en la busqueda de casuistica se refiere al
	 *  numero total de registros tanto de cambios como de movimientos */
	private Long totalElements;

	/** Numero total de registros de movimientos para esta consulta */
	private Long totalElementsMovement		;

	/** Numero de registros de cambios que tienen nss mas pequenios que los mas pequenios de movimientos */
	private Long changesMinorThanMovements;

	/** Numero de nss que se ocuparon en la consulta incompleta */
	private Long recordsToDiscard;

	private Long page;
	
	private Long size;
	
}
