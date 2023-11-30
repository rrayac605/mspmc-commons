package mx.gob.imss.cit.mspmccommons.utils;

import java.util.List;

public class ListUtils {

    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isNotEmpty(List<?> list) {
        return !isEmpty(list);
    }

}
