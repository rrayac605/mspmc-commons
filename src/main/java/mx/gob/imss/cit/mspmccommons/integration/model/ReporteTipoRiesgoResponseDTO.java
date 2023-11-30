package mx.gob.imss.cit.mspmccommons.integration.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.bson.types.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.io.*;
import java.util.*;

public class ReporteTipoRiesgoResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> rActual;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> rInmediatoAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> rAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> rPosterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dsActual;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dsInmediatoAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dsAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dsPosterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> piActual;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> piInmediatoAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> piAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> piPosterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dActual;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dInmediatoAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dAnterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> dPosterior;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> conteoCorrectosActual;

	@Getter
	@Setter
	private List<ReporteTipoRiesgoDetalleDTO> conteoCorrectosAnterior;

}
