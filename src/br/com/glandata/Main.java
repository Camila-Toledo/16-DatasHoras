package br.com.glandata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// Formata e exibe a data atual
		LocalDate dataAgora = LocalDate.now();
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(formataData.format(dataAgora));

		// Formata e exibe a data e a hora atual
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy HH:mm:ss.ms");
		System.out.println(formataDataHora.format(dataHoraAgora));

	}

}
