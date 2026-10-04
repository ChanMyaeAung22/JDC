package com.jdc.solid.bad;

import java.time.LocalDateTime;

public record Invoice(
		LocalDateTime saaleAt,
		String counterCode,
		String salePerson,
		InvoiceItem[] items
 		) {
}
