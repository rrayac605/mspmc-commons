package mx.gob.imss.cit.mspmccommons.enums;

public enum EnumDelegaciones {

	AGUASCALIENTES (1, "AGUASCALIENTES"),
	
	BAJA_CALIFORNIA (2, "BAJA CALIFORNIA"),
	
	BAJA_CALIFORNIA_SUR (3, "BAJA CALIFORNIA SUR"),
	
	CAMPECHE (4, "CAMPECHE"),

	COAHUILA (5, "COAHUILA"),

	COLIMA (6, "COLIMA"),
	
	CHIAPAS (7, "CHIAPAS"),
	
	CHIHUAHUA (8, "CHIHUAHUA"),

	DURANGO (10, "DURANGO"),
	
	GUANAJUATO (11, "GUANAJUATO"),
	
	GUERRERO (12, "GUERRERO"), 
	
	HIDALGO (13, "HIDALGO"), 
	
	JALISCO (14, "JALISCO"),
	
	ESTADO_DE_MÉXICO_ORIENTE (15, "ESTADO DE MÉXICO ORIENTE"),
	
	ESTADO_DE_MÉXICO_PONIENTE (16, "ESTADO DE MÉXICO PONIENTE" ), 
	
	MICHOACAN (17, "MICHOACÁN" ),
	
	MORELOS (18, "MORELOS"),
	
	NAYARIT (19, "NAYARIT"),
	
	NUEVO_LEON (20, "NUEVO LEÓN"),

	OAXACA (21, "OAXACA"),
	
	PUEBLA (22, "PUEBLA"),
	
	QUERETARO (23, "QUERÉTARO"),
	
	QUINTANA_ROO (24, "QUINTANA ROO"),
	
	SAN_LUIS_POTOSI (25, "SAN LUIS POTOSÍ"),
	
	SINALOA (26, "SINALOA"),
	
	SONORA (27, "SONORA"),
	
	TABASCO (28, "TABASCO"),
	
	TAMAULIPAS (29, "TAMAULIPAS"),
	
	TLAXCALA (30, "TLAXCALA"),
	
	VERACRUZ_NORTE (31, "VERACRUZ NORTE"),
	
	VERACRUZ_SUR (32, "VERACRUZ SUR"),
	
	YUCATAN (33, "YUCATÁN"),
	
	ZACATECAS (34, "ZACATECAS"),
	
	DELEGACION_NORTE_DEL_DISTRITO_FEDERAL (39, "DELEGACIÓN NORTE DEL DISTRITO FEDERAL"),
	
	DELEGACION_SUR_DEL_DISTRITO_FEDERAL (40, "DELEGACIÓN SUR DEL DISTRITO FEDERAL");
	
	private Integer code;
	private String description;
	
	EnumDelegaciones(Integer code, String description)
	{
		this.code = code;
		this.description = description;
		
	}
	
	public Integer getCode()
	{
		return this.code;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
}
