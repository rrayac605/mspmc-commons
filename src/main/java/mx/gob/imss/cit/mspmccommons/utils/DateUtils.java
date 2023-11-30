package mx.gob.imss.cit.mspmccommons.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.mspmccommons.dto.CasoRegistroDTO;
import mx.gob.imss.cit.mspmccommons.dto.FechaInhabilDTO;
import mx.gob.imss.cit.mspmccommons.enums.CasoRegistroEnum;
import mx.gob.imss.cit.mspmccommons.enums.CicloEnum;

public class DateUtils {

	private final static Logger logger = LoggerFactory.getLogger(DateUtils.class);

	private static final String PATTERN_HORA = "HH:mm ";
	private static final String PATTERN_FECHA = "dd 'de' MMMM 'del' yyyy";
	private static final String PATTERN_DDMMYYYY = "ddMMyyyy";
	private static final String PATTERN_DDMMYYYY_MS = "dd/MM/yyyy";
	private static final String PATTERN_YYYYMMDD = "yyyy-MM-dd";
	private static final String PATTERN_DDMMYYYY_TIME = "ddMMyyyy HH:mm:ss";
	private static final String PATTERN_YYYYMMDD_TIME = "yyyy-MMM-dd HH:mm:ss";
	private static final String PATTERN_REGEX_DDMMYYYY = "(0[1-9]|[12]\\d|3[01])((0[1-9]|1[0-2])[12]\\d{3})";
	private static final String ZERO = "0";
	private static final String TIMEZONE = "UTC";
	private static final String TIMEZONE_MEXICO = "America/Mexico_City";
	private static final String BEGIN_HOURS = " 00:00:00";
	private static final String END_HOURS = " 23:59:59";
	private static final Integer HOURS_TO_ADD = 6;
	private static final Integer FIFTEEN = 15;
	private static final Integer ONE = 1;

	/**
	 * Se genera la fecha con formato 10 de febrero del 2020
	 * 
	 * @return string de fecha
	 */
	public static String getFechaActual() {
		String pattern = PATTERN_FECHA;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("es", "MX"));
		String date = simpleDateFormat.format(new Date());
		return date;
	}

	public static String getCurrentMexicoDateString() {
		TimeZone tz = TimeZone.getTimeZone(TIMEZONE_MEXICO);
		DateFormat df = new SimpleDateFormat(PATTERN_DDMMYYYY_TIME);
		df.setTimeZone(tz);
		return df.format(new Date());
	}

	public static Date getCurrentMexicoDate() {
		try {
			return new SimpleDateFormat(PATTERN_DDMMYYYY_TIME).parse(getCurrentMexicoDateString());
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Se genera la hora con formato a 24 hrs
	 * 
	 * @return
	 */
	public static String getHoraActual() {
		String pattern2 = PATTERN_HORA;
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String hora = simpleDateFormat2.format(new Date());
		return hora;
	}

	public static Date getSysDateMongoISO() {
		SimpleDateFormat formatter1 = new SimpleDateFormat(PATTERN_DDMMYYYY_TIME, new Locale("es", "MX"));
		SimpleDateFormat formatter2 = new SimpleDateFormat(PATTERN_DDMMYYYY_TIME, new Locale("es", "MX"));

		Date fecha = null;
		try {
			String fechaCadena = formatter1.format(new Date());
			fecha = formatter2.parse(fechaCadena);
		} catch (Exception e) {
			// logger.error(e.getMessage(), e);
		}
		return fecha;
	}
	
	public static String getFechaActualDDMMYYYY() {
		String pattern = PATTERN_DDMMYYYY;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("es", "MX"));
		String date = simpleDateFormat.format(new Date());
		return date;
	}

	public static Date parserFromString(String fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat(PATTERN_DDMMYYYY_MS);

		Date date = null;
		try {
			date = formatter.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date parserFromStringMongo(String fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat(PATTERN_DDMMYYYY);

		Date date = null;
		try {
			if (Pattern.matches(PATTERN_REGEX_DDMMYYYY, fecha)) {
				date = formatter.parse(fecha);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date parserFromStringCuentaIndividual(String fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat(PATTERN_YYYYMMDD);

		Date date = null;
		try {
			date = formatter.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String parserDatetoString(Date fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat(PATTERN_DDMMYYYY);

		String date = "";
		try {
			date = formatter.format(fecha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String parserDatetoString(Date fecha, String patron) {
		SimpleDateFormat formatter = new SimpleDateFormat(patron);

		String date = "";
		if (fecha != null) {
			try {
				date = formatter.format(fecha);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return date;
	}

	public static Date parserFromStringISOMOngo(String fecha) {
		SimpleDateFormat formatter1 = new SimpleDateFormat(PATTERN_DDMMYYYY);
		Date date = null;
		try {
			if (Pattern.matches(PATTERN_REGEX_DDMMYYYY, fecha)) {
				date = formatter1.parse(fecha);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date obtenerFechaActualDate() {
		Date date = null;
		try {

			date = Calendar.getInstance().getTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date obtenerFecha30Date() {
		Date date = null;
		try {

			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.YEAR, -30);
			date = cal.getTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date obtenerFecha62Date(Date fecha) {
		Date date = null;
		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(fecha);
			cal.add(Calendar.DATE, 62);
			date = cal.getTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date obtenerFecha30Date(Date fecha) {
		Date date = null;
		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(fecha);
			cal.add(Calendar.YEAR, -30);
			date = cal.getTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date obtenerFecha62Date() {
		Date date = null;
		try {

			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, 62);
			date = cal.getTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date obtenerFecha3Date() {
		Date date = null;
		try {

			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.YEAR, -3);
			date = cal.getTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date fechaHabil(Date fecha, List<FechaInhabilDTO> fechas, int dias) {

		Calendar fechaCal = Calendar.getInstance();
		fechaCal.setTime(fecha);
		int diasLocal = Math.abs(dias);
		try {
			while (diasLocal != 0) {
				int quitarDias = 1;
				if (fechaCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
						|| fechaCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					quitarDias = 0;
				} else {
					for (FechaInhabilDTO fechaInhabil : fechas) {
						if (fechaInhabil.getFecInhabil().equals(fechaCal.getTime())) {
							quitarDias = 0;
							break;
						}
					}
				}
				diasLocal = diasLocal - quitarDias;
				fechaCal.add(Calendar.DATE, dias < 0 ? -1 : 1);
			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return fechaCal.getTime();
	}

	public static CasoRegistroDTO getRegisterCase(Date endDate) {
		Calendar calendarCurrent = Calendar.getInstance();
		calendarCurrent.setTimeZone(TimeZone.getTimeZone(TIMEZONE_MEXICO));
		calendarCurrent.setTime(new Date());

		Calendar calendarEnd = Calendar.getInstance();
		calendarEnd.setTimeZone(TimeZone.getTimeZone(TIMEZONE_MEXICO));
		calendarEnd.setTime(endDate);
		calendarEnd.add(Calendar.HOUR, 7);

		int currentYear = calendarCurrent.get(Calendar.YEAR);
		int currentMonth = calendarCurrent.get(Calendar.MONTH);
		int currentDay = calendarCurrent.get(Calendar.DAY_OF_MONTH);

		int endYear = calendarEnd.get(Calendar.YEAR);
		int endMonth = calendarEnd.get(Calendar.MONTH);
		int endDay = calendarEnd.get(Calendar.DAY_OF_MONTH);

		boolean validationNextYear = endYear == currentYear + ONE && (endMonth < Calendar.MARCH ||
				(endMonth == Calendar.MARCH && endDay <= FIFTEEN));

		CasoRegistroDTO registerCase = new CasoRegistroDTO();

		if (currentMonth < Calendar.MARCH || (currentMonth == Calendar.MARCH && currentDay <= FIFTEEN)) {
			if (endYear == currentYear - ONE || endYear == currentYear || validationNextYear) {
				registerCase.setDescripcion(CasoRegistroEnum.OPORTUNO.getDescripcion());
				registerCase.setIdCaso(CasoRegistroEnum.OPORTUNO.getId());
			} else {
				registerCase.setDescripcion(CasoRegistroEnum.EXTEMPORANEO.getDescripcion());
				registerCase.setIdCaso(CasoRegistroEnum.EXTEMPORANEO.getId());
			}
		} else {
			if(endYear == currentYear || validationNextYear) {
				registerCase.setDescripcion(CasoRegistroEnum.OPORTUNO.getDescripcion());
				registerCase.setIdCaso(CasoRegistroEnum.OPORTUNO.getId());
			} else {
				registerCase.setDescripcion(CasoRegistroEnum.EXTEMPORANEO.getDescripcion());
				registerCase.setIdCaso(CasoRegistroEnum.EXTEMPORANEO.getId());
			}
		}
		return registerCase;
	}

	public static CasoRegistroDTO obtenerCasoRegistro(Date fecha) {
		CasoRegistroDTO caso = new CasoRegistroDTO();
		LocalDate localDate = LocalDate.now();
		long millisLocalDate = localDate.atStartOfDay().toInstant(OffsetDateTime.now().getOffset()).toEpochMilli();
		try {

			Calendar fechaProceso = Calendar.getInstance();
			fechaProceso.setTimeInMillis(millisLocalDate);

			Calendar cal = Calendar.getInstance();
			cal.setTime(fecha);

			Calendar fechaFinal = Calendar.getInstance();
			fechaFinal.set(Calendar.DATE, CicloEnum.DIA_FIN_CICLO.getClave());
			fechaFinal.set(Calendar.MONTH, CicloEnum.MES_FIN_CICLO.getClave());
			fechaFinal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + 1);

			Calendar fechaInicial = Calendar.getInstance();
			fechaInicial.set(Calendar.DATE, CicloEnum.DIA_INICIO_CLICO.getClave());
			fechaInicial.set(Calendar.MONTH, CicloEnum.MES_INNICIO_CICLO.getClave());
			fechaFinal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + 1);
			if (fechaProceso.compareTo(fechaInicial) >= 0 && fechaProceso.compareTo(fechaFinal) <= 0) {
				caso.setDescripcion(CasoRegistroEnum.OPORTUNO.getDescripcion());
				caso.setIdCaso(CasoRegistroEnum.OPORTUNO.getId());
			} else {
				caso.setDescripcion(CasoRegistroEnum.EXTEMPORANEO.getDescripcion());
				caso.setIdCaso(CasoRegistroEnum.EXTEMPORANEO.getId());
			}

		} catch (Exception e) {
			//logger.error(e.getMessage(), e);
		}
		return caso;
	}

	public static LocalDateTime calcularFechaPoceso(String month, String year) {
		return LocalDateTime.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(1), 00, 00, 00, 00);
	}

	public static LocalDateTime calcularFechaPocesoFin(String month, String year) {

		LocalDateTime initial = LocalDateTime.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(1), 23,
				59, 59, 59);
		LocalDateTime lastDayOfMonth = initial.with(TemporalAdjusters.lastDayOfMonth());
		return LocalDateTime.of(Integer.valueOf(year), Integer.valueOf(month), lastDayOfMonth.getDayOfMonth(), 23, 59,
				59, 59);
	}

	public static LocalDate calcularFecPoceso(String month, String year) {
		return LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(1));
	}

	public static LocalDate calcularFecPocesoFin(String month, String year) {

		LocalDate initial = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(1));
		LocalDate lastDayOfMonth = initial.with(TemporalAdjusters.lastDayOfMonth());
		return LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), lastDayOfMonth.getDayOfMonth());
	}
	
	/**
	 * Utileria que genera la fecha con las horas adecuadas para realizar la
	 * consulta de movimientos, se agregan 6 horas a esta fecha dado que al momento
	 * de realizar la busqueda mongodb agrega 6 horas y con estas se compenza la
	 * busqueda de la misma
	 */
	public static Date calculateBeginDate(String year, String month, String day) {
		String stringDate = getFormattedDay(day, null).concat(getFormattedMonth(month)).concat(year)
				.concat(BEGIN_HOURS);
		TimeZone tz = TimeZone.getTimeZone(TIMEZONE);
		DateFormat df = new SimpleDateFormat(PATTERN_DDMMYYYY_TIME);
		df.setTimeZone(tz);
		try {
			Date formattedDate = df.parse(stringDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(formattedDate);
			calendar.add(Calendar.HOUR, HOURS_TO_ADD);
			return calendar.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Utileria que genera la fecha con las horas adecuadas para realizar la
	 * consulta de movimientos, se agregan 6 horas a esta fecha dado que al momento
	 * de realizar la busqueda mongodb agrega 6 horas y con estas se compenza la
	 * busqueda de la misma
	 */
	public static Date calculateEndDate(String year, String month, String day) {
		LocalDateTime initial = LocalDateTime.of(Integer.parseInt(year), Integer.parseInt(month), 10, 23, 59, 59, 59);
		initial = initial.with(TemporalAdjusters.lastDayOfMonth());
		String stringDate = getFormattedDay(day, String.valueOf(initial.getDayOfMonth()))
				.concat(getFormattedMonth(month)).concat(year).concat(END_HOURS);
		TimeZone tz = TimeZone.getTimeZone(TIMEZONE);
		DateFormat df = new SimpleDateFormat(PATTERN_DDMMYYYY_TIME);
		df.setTimeZone(tz);
		try {
			Date formattedDate = df.parse(stringDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(formattedDate);
			calendar.add(Calendar.HOUR, HOURS_TO_ADD);
			return calendar.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String getFormattedDay(String day, String lastDayOfMonth) {
		return day != null && !day.equals("null") ? Integer.parseInt(day) < 10 ? ZERO.concat(day) : day
				: lastDayOfMonth != null ? lastDayOfMonth : "01";
	}

	private static String getFormattedMonth(String month) {
		return month.length() < 2 ? ZERO.concat(month) : month;
	}

	public static Integer[] obetenerCliclo() {
		Integer[] ciclo = new Integer[2];
		Date fechaActual = Calendar.getInstance().getTime();
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.set(Calendar.DATE, CicloEnum.DIA_FIN_CICLO.getClave());
		fechaFinal.set(Calendar.MONTH, CicloEnum.MES_FIN_CICLO.getClave());

		Calendar fechaInicial = Calendar.getInstance();
		fechaInicial.set(Calendar.DATE, CicloEnum.DIA_INICIO_CLICO.getClave());
		fechaInicial.set(Calendar.MONTH, CicloEnum.MES_INNICIO_CICLO.getClave());
		fechaInicial.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR) - 1);
		if (fechaInicial.getTime().compareTo(fechaActual) < 0 && fechaFinal.getTime().compareTo(fechaActual) > 0) {
			ciclo[0] = Calendar.getInstance().get(Calendar.YEAR) - 1;
			ciclo[1] = Calendar.getInstance().get(Calendar.YEAR);
		} else {
			ciclo[0] = Calendar.getInstance().get(Calendar.YEAR);
		}
		return ciclo;
	}
	
    public static Date getCurrentUtcTime(Date fecha) throws ParseException {   
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_YYYYMMDD_TIME);  
        sdf.setTimeZone(TimeZone.getTimeZone(TIMEZONE));  
        SimpleDateFormat ldf = new SimpleDateFormat(PATTERN_YYYYMMDD_TIME);    
        Date d1 = null;    
        try {    
            d1 = ldf.parse(sdf.format(fecha));  
        }     
        catch (java.text.ParseException e) {    
            e.printStackTrace();  
            System.out.println(e.getMessage());  
        }  
        return d1;  
    }
    
	public static String parserDatetoStringUTC(Date fecha, String patron) {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_YYYYMMDD_TIME);  
        sdf.setTimeZone(TimeZone.getTimeZone(TIMEZONE));  
        SimpleDateFormat ldf = new SimpleDateFormat(PATTERN_YYYYMMDD_TIME);    
        Date d1 = null;    
        try {    
            d1 = ldf.parse(sdf.format(fecha));  
        }     
        catch (java.text.ParseException e) {    
            e.printStackTrace();  
            System.out.println(e.getMessage());  
        }  

    	SimpleDateFormat formatter = new SimpleDateFormat(patron);

    	String date = "";
    	if (d1 != null) {
    		try {
    			date = formatter.format(d1);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	return date;
	}

}
