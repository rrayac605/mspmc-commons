package mx.gob.imss.cit.mspmccommons.utils;

import java.util.List;
import java.util.Optional;

public class ObjectUtils {

    public static boolean existeValor(final Object obj) {

        if (obj instanceof String) {
            return !((String) obj).isEmpty();
        }

        if (obj instanceof List) {
            return !((List<?>) obj).isEmpty();
        }

        if (obj instanceof String[]) {
            return (((String[]) obj).length > 0);
        }

        if (obj instanceof Integer) {
           return ((int) obj > 0);
        }

        return Optional.ofNullable(obj).isPresent();

    }
	
}
