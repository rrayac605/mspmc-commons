package mx.gob.imss.cit.mspmccommons.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CustomDateDeserializer extends JsonDeserializer<Date>  {

    private final Logger log = LoggerFactory.getLogger(CustomDateDeserializer.class);
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    private static final Locale LOCALE_MX = new Locale("es", "MX");
    private static final TimeZone TIME_ZONE = TimeZone.getTimeZone("Etc/Universal");

    @Override
    public Date deserialize(JsonParser jsonparser, DeserializationContext context) throws IOException {

        log.info("Entrando a [CustomDateDeserializer] {{}}", jsonparser.getText());
        String dateAsString = jsonparser.getText();
        if (dateAsString.isEmpty() || " ".equals(dateAsString.trim())){
            return null;
        }
        try {
            Calendar calendar = Calendar.getInstance(TIME_ZONE, LOCALE_MX);
            calendar.setTime(FORMATTER.parse(dateAsString));
            log.info("Saliendo con: " + calendar.getTime());
            return calendar.getTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
	
}