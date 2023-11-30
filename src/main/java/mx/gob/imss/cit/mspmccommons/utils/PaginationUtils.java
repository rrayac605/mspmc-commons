package mx.gob.imss.cit.mspmccommons.utils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mx.gob.imss.cit.mspmccommons.dto.MovimientosOutputDTO;
import mx.gob.imss.cit.mspmccommons.integration.model.ResponseDTO;

public class PaginationUtils {

	public static final String DEATH_CONSEQUENCE = "4";

	public static Long getSkipElements(Long page, Long size) {
		return page == null ? 0 : (page - 1) * size;
	}

	public static Long validatePage(Long page) {
		return page != null ? page : 1L;
	}

	public static Long validateSkipOffset(Long skipOffset) {
		return skipOffset != null ? skipOffset : 0L;
	}

	public static Long getTotalRows(Long totalElements, Long size) {
		return totalElements % size == 0 ? Math.floorDiv(totalElements, size) : Math.floorDiv(totalElements, size) + 1;
	}

	public static Long calculatePages(Long totalElements, Long size) {
		return totalElements == null || totalElements.compareTo(1L) < 0 ? 0 : getTotalRows(totalElements, size);
	}

	public static Long calculateSubConsultPage(Long actualPage, Long subConsultFirstPage) {
		long calculatedPage = actualPage - subConsultFirstPage + 1;
		if (calculatedPage > 1) {
			return calculatedPage - 1;
		}
		return calculatedPage;
	}

	public static Long calculateSkipOffset(Long actualPage, Long subConsultFirstPage, Long size, Long skipElements) {
		if (actualPage - subConsultFirstPage > 0) {
			return size - skipElements;
		}
		return 0L;
	}

	public static void completePage(ResponseDTO<List<MovimientosOutputDTO>> response,
			ResponseDTO<List<MovimientosOutputDTO>> responseToAdd, long size) {
		int recordsToDiscard = NumberUtils.longToInt(response.getRecordsToDiscard());
		if (responseToAdd.getData() != null && !responseToAdd.getData().isEmpty()) {
			if (response.getData() != null && !response.getData().isEmpty()) {
				long toIndex = size - response.getData().size() + recordsToDiscard;
				if (responseToAdd.getData().size() > toIndex) {
					response.getData().addAll(responseToAdd.getData().subList(recordsToDiscard, (int) toIndex));
				} else {
					if (responseToAdd.getData().size() > recordsToDiscard) {
						response.getData().addAll(
								responseToAdd.getData().subList(recordsToDiscard, responseToAdd.getData().size()));
					}
				}
			} else {
				if (responseToAdd.getData().size() > size) {
					if (responseToAdd.getData().size() > size + recordsToDiscard) {
						response.setData(
								responseToAdd.getData().subList(recordsToDiscard, (int) size + recordsToDiscard));
					} else if (responseToAdd.getData().size() > recordsToDiscard) {
						response.setData(
								responseToAdd.getData().subList(recordsToDiscard, responseToAdd.getData().size()));
					}
				} else if (responseToAdd.getData().size() > recordsToDiscard) {
					response.setData(responseToAdd.getData().subList(recordsToDiscard, responseToAdd.getData().size()));
				}
			}
		}
	}

	public static void safeAddList(ResponseDTO<List<MovimientosOutputDTO>> unifiedResponse,
			List<MovimientosOutputDTO> listToAdd) {
		if (listToAdd != null && !listToAdd.isEmpty()) {
			if (unifiedResponse.getData() != null) {
				unifiedResponse.getData().addAll(listToAdd);
			} else {
				unifiedResponse.setData(listToAdd);
			}
		}
	}

	public static List<MovimientosOutputDTO> sortList(List<MovimientosOutputDTO> unifiedList) {
		unifiedList = unifiedList.stream().peek(m -> {
			m.setPorcentajeIncapacidadLong(NumberUtils.safetyParseLong(m.getPorcentajeIncapacidad()));
			m.setNumDiasSubsidiados(m.getNumDiasSubsidiados() != null ? m.getNumDiasSubsidiados() : 0);
		}).collect(Collectors.toList());
		List<MovimientosOutputDTO> consequence4 = unifiedList.stream().filter(
				movement -> DEATH_CONSEQUENCE.equals(movement.getCveConsecuencia()))
				.collect(Collectors.toList());
		List<MovimientosOutputDTO> consequenceNot4 = unifiedList.stream().filter(
				movement -> !DEATH_CONSEQUENCE.equals(movement.getCveConsecuencia()))
				.collect(Collectors.toList());
		consequence4 = consequence4.stream()
				.sorted(Comparator.comparing(MovimientosOutputDTO::getPorcentajeIncapacidadLong).reversed())
				.sorted(Comparator.comparing(MovimientosOutputDTO::getNumDiasSubsidiados).reversed())
				.collect(Collectors.toList());
		consequenceNot4 = consequenceNot4.stream()
				.sorted(Comparator.comparing(MovimientosOutputDTO::getPorcentajeIncapacidadLong).reversed())
				.sorted(Comparator.comparing(MovimientosOutputDTO::getNumDiasSubsidiados).reversed())
				.collect(Collectors.toList());
		return Stream.concat(consequence4.stream(), consequenceNot4.stream())
				.sorted(Comparator.comparing(MovimientosOutputDTO::getNumNss)).collect(Collectors.toList());
	}

}
