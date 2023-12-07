package mx.gob.imss.cit.mspmccommons.model;

import lombok.Getter;
import lombok.Setter;

public class ModelVersion {
	
	
	private final static String VERSION_SERVICE_COMMONS = "mspmc-commons-1.0.3";
	
	private final static String FOLIO_SERVICE_COMMONS = "INC112455";
	
	private final static String NOTA_SERVICE_COMMONS = "Optimizar reporte general";
	
	public ModelVersion() {
		this.setVersion_service(VERSION_SERVICE_COMMONS);
		this.setFolios(FOLIO_SERVICE_COMMONS);
		this.setNotas(NOTA_SERVICE_COMMONS);
	}
	
	public ModelVersion(String version, String folio, String nota) {
		this.setVersion_service(version);
		this.setFolios(folio);
		this.setNotas(nota);
	}
	
	@Getter
	@Setter
	private String version_service;

	@Getter
	@Setter
	private String folios;
	
	@Getter
	@Setter
	private String notas;
	
}