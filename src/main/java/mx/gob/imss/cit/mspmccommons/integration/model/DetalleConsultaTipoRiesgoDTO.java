package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class DetalleConsultaTipoRiesgoDTO {

	private String descripcion;
	private int clave;
	private Long numAnteriores;
	private Long numInmediato;
	private Long numActual;
	private Long numPosterior;
	private Long numTotal;

	public DetalleConsultaTipoRiesgoDTO() {
		super();
		this.numAnteriores = new Long(0);
		this.numInmediato = new Long(0);
		this.numActual = new Long(0);
		this.numPosterior = new Long(0);
		this.numTotal = new Long(0);
	}
	
	public DetalleConsultaTipoRiesgoDTO(String descripcion, int clave) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
		this.numAnteriores = new Long(0);
		this.numInmediato = new Long(0);
		this.numActual = new Long(0);
		this.numPosterior = new Long(0);
		this.numTotal = new Long(0);
	}

	@Override
	public String toString() {
		return "DetalleConsultaTipoRiesgoDTO [descripcion=" + descripcion + ", clave=" + clave + ", numAnteriores="
				+ numAnteriores + ", numInmediato=" + numInmediato + ", numActual=" + numActual + ", numPosterior="
				+ numPosterior + ", numTotal=" + numTotal + "]";
	}

}
