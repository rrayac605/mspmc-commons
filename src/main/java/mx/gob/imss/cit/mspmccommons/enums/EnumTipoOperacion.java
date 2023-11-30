package mx.gob.imss.cit.mspmccommons.enums;

public enum EnumTipoOperacion {

	CONSULTAR_MOVIMIENTOS("movimientos"), CONSULTAR_DETALLE_MOVIMIENTO("detalleMovimiento");

	private String valor;

	private EnumTipoOperacion(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
