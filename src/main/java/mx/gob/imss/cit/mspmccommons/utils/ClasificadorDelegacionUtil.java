package mx.gob.imss.cit.mspmccommons.utils;

import mx.gob.imss.cit.mspmccommons.enums.EnumDelegaciones;
import mx.gob.imss.cit.mspmccommons.integration.model.DetalleRegistroDTO;

public class ClasificadorDelegacionUtil {

	public static boolean esRegistroAguascalientes(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.AGUASCALIENTES
				.getCode()
				|| (validaDato(detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal())
						&& detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
								.equals(EnumDelegaciones.AGUASCALIENTES.getCode()))) {
			return true;
		}
		return false;
	}

	private static boolean validaDato(Integer dato) {
		if (dato != null) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroBajaCalifornia(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.BAJA_CALIFORNIA
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.BAJA_CALIFORNIA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroBajaCaliforniaSur(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss()
				.intValue() == EnumDelegaciones.BAJA_CALIFORNIA_SUR.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.BAJA_CALIFORNIA_SUR.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroCampeche(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.CAMPECHE.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.CAMPECHE.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroCoahuila(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.COAHUILA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.COAHUILA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroColima(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.COLIMA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.COLIMA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroChiapas(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.CHIAPAS.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.CHIAPAS.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroChihuahua(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.CHIHUAHUA
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.CHIHUAHUA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroDurango(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.DURANGO.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.DURANGO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroGuanajuato(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.GUANAJUATO
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.GUANAJUATO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroGuerrero(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.GUERRERO.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.GUERRERO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroHidalgo(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.JALISCO.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.JALISCO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroJalisco(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.JALISCO.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.JALISCO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroEdoMexOriente(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss()
				.intValue() == EnumDelegaciones.ESTADO_DE_MÉXICO_ORIENTE.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.ESTADO_DE_MÉXICO_ORIENTE.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroEdoMexPoniente(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss()
				.intValue() == EnumDelegaciones.ESTADO_DE_MÉXICO_PONIENTE.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.ESTADO_DE_MÉXICO_PONIENTE.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroMichoacan(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.MICHOACAN
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.MICHOACAN.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroMorelos(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.MORELOS.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.MORELOS.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroNayarit(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.NAYARIT.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.NAYARIT.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroNuevoLeon(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.NUEVO_LEON
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.NUEVO_LEON.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroOaxaca(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.OAXACA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.OAXACA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroPuebla(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.PUEBLA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.PUEBLA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroQueretaro(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.QUERETARO
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.QUERETARO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroQuintnaRoo(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.QUINTANA_ROO
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.QUINTANA_ROO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroSanLuisPotosi(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.SAN_LUIS_POTOSI
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.SAN_LUIS_POTOSI.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroSinaloa(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.SINALOA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.SINALOA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroSonora(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.SONORA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.SONORA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroTabasco(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.TABASCO.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.TABASCO.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroTamaulipas(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.TAMAULIPAS
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.TAMAULIPAS.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroTlaxcala(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.TLAXCALA.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.TLAXCALA.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroVeracruzNte(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.VERACRUZ_NORTE
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.VERACRUZ_NORTE.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroVeracruzSur(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.VERACRUZ_SUR
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.VERACRUZ_SUR.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroYucatan(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.YUCATAN.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.YUCATAN.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroZacatecas(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss().intValue() == EnumDelegaciones.ZACATECAS
				.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.ZACATECAS.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroNorteDF(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss()
				.intValue() == EnumDelegaciones.DELEGACION_NORTE_DEL_DISTRITO_FEDERAL.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal().equals(
						EnumDelegaciones.DELEGACION_NORTE_DEL_DISTRITO_FEDERAL.getCode())) {
			return true;
		}
		return false;
	}

	public static boolean esRegistroSurDF(DetalleRegistroDTO detalleRegistroDTO) {
		if (detalleRegistroDTO.getAseguradoDTO().getCveDelegacionNss()
				.intValue() == EnumDelegaciones.DELEGACION_SUR_DEL_DISTRITO_FEDERAL.getCode()
				|| detalleRegistroDTO.getPatronDTO().getCveDelRegPatronal()
						.equals(EnumDelegaciones.DELEGACION_SUR_DEL_DISTRITO_FEDERAL.getCode())) {
			return true;
		}
		return false;
	}

}
