package mx.gob.imss.cit.mspmccommons.integration.model;

import lombok.Data;

@Data
public class DetalleConsultaCodErrorDTO implements Comparable<DetalleConsultaCodErrorDTO>{
	//Errores
	private String descripcion;
	private String numError;
	//RTT
	private Long numRTT;
	private Long numRTTOtras;
	//ST3
	private Long numST3;
	private Long numST3Otras;
	//ST5
	private Long numST5;
	private Long numST5Otras;
	//AJU
	private Long numAJU;
	private Long numAJUOtras;
	//COD
	private Long numCOD;
	private Long numCODOtras;
	//ROD
	private Long numROD;
	private Long numRODOtras;
	//Totales
	private Long numTotal;
	private Long numTotalOtras;
	private Long numAnterior;
	private Long numNuevos;

	public DetalleConsultaCodErrorDTO() {
		this.numRTT = 0L;
		this.numRTTOtras = 0L;
		this.numST3 = 0L;
		this.numST3Otras = 0L;
		this.numST5 = 0L;
		this.numST5Otras = 0L;
		this.numAJU = 0L;
		this.numAJUOtras = 0L;
		this.numCOD = 0L;
		this.numCODOtras = 0L;
		this.numROD = 0L;
		this.numRODOtras = 0L;
		this.numTotal = 0L;
		this.numTotalOtras = 0L;
		this.numAnterior = 0L;
		this.numNuevos = 0L;
	}

	@Override
	public int compareTo(DetalleConsultaCodErrorDTO o) {
		if(Integer.parseInt(numError)< Integer.parseInt(o.numError)) {
			return -1;
		}
		if(Integer.parseInt(numError)> Integer.parseInt(o.numError)) {
			return 1;
		}
		return 0;
	}

}