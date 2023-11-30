package mx.gob.imss.cit.mspmccommons.dto;

import lombok.Getter;
import lombok.Setter;

public class AseguradoDTO2 {
	@Setter
	@Getter
	private String curp;

	@Setter
	@Getter
	private int cveIdPersona;

	@Setter
	@Getter
	private String nombre;

	@Setter
	@Getter
	private String primerApellido;

	@Setter
	@Getter
	private String segundoApellido;
		

	@Setter
	@Getter
	private String agregadoAfiliacion;

	@Setter
	@Getter
	private String agregadoMedico;

	@Setter
	@Getter
	private Boolean bajaNss;

	@Setter
	@Getter
	private String consultorio;

	@Setter
	@Getter
	private Boolean cubeta;

	@Setter
	@Getter
	private String cveIdAsignacionNssGrupoFamiliar;

	@Setter
	@Getter
	private String datosPersonaRenapo;

	@Setter
	@Getter
	private String domicilio;

	@Setter
	@Getter
	private String estadoCivil;

	@Setter
	@Getter
	private String estadoDerechohabiente;

	@Setter
	@Getter
	private String fechaDefuncion;

	@Setter
	@Getter
	private String fechaFinVigencia;

	@Setter
	@Getter
	private String fechaInicioVigencia;

	@Setter
	@Getter
	private String fechaNacimiento;
	
	@Setter
	@Getter
	private String lugarNacimiento;
	
	@Setter
	@Getter
	private String nss;
	
	@Setter
	@Getter
	private String nssCabezaGrupoFamiliar;
	
	@Setter
	@Getter
	private String pais;
	
	@Setter
	@Getter
	private String parentesco;
	
	@Setter
	@Getter
	private String rfc;
	
	@Setter
	@Getter
	private String sexo;
	
	@Setter
	@Getter
	private SubdelegacionDTO2 subdelegacion;
	
	@Setter
	@Getter
	private UMFJsonDTO umf;

	
	

}
