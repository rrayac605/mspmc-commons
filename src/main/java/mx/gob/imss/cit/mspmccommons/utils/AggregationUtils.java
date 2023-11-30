package mx.gob.imss.cit.mspmccommons.utils;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;

public class AggregationUtils {
	
	public static final MatchOperation validateMatchOp(Criteria criterio) {
		return criterio != null ? Aggregation.match(criterio) : null;
	}

}
