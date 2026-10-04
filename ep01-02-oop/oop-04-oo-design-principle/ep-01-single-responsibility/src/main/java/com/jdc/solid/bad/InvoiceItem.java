package com.jdc.solid.bad;

public record InvoiceItem(
		Product product,
		int unitPrice,
		int quantity) {

}
