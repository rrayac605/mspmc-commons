package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class DetalleConsultaConcecuenciaDTO implements Comparable<DetalleConsultaConcecuenciaDTO>{
	
	

	private int clave;
	private String descripcion;
	private Long numConcecuencia;
	private Long numRegistro;
	private Long numDias;
	private Long porcentaje;

	@Override
	public String toString() {
		return "DetalleConsultaConcecuenciaDTO [clave=" + clave + ", descripcion=" + descripcion + ", numConcecuencia="
				+ numConcecuencia + ", numRegistro=" + numRegistro + ", numDias=" + numDias + ", porcentaje="
				+ porcentaje + "]";
	}

	public DetalleConsultaConcecuenciaDTO() {
		super();
		this.numConcecuencia = new Long(0);
		this.numRegistro = new Long(0);
		this.numDias = new Long(0);
		this.porcentaje = new Long(0);
	}

	@Override
	public int compareTo(DetalleConsultaConcecuenciaDTO o) {
		if (clave < o.clave) {
			return -1;			
		}
		if (clave > o.clave) {
			return 1;		
		}				
		return 0;
	}

}
