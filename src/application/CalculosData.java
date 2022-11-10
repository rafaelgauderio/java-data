package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosData {

	public static void main(String[] args) {
		
		System.out.println("Data e hora uma vez instanciados, estes objetos são imutáveis.\n"
				+ "É necessário criar novos objetos do tipo LocalDate ou LocalDateTime para realizar os cálculos.");
		
		LocalDate d01 = LocalDate.parse("2021-12-17");
		LocalDateTime d02 = LocalDateTime.parse("2021-12-17T12:30:00");
		Instant d03 = Instant.parse("2021-12-17T12:30:00-03:00");
		
		LocalDate semanaPassada = d01.minusDays(7);
		LocalDate proximaSemana = d01.plusDays(7);
		LocalDate proximoMes = d01.plusMonths(1);
		
		System.out.println("Dezessete de dezembro: " + d01);
		System.out.println("Semana passada a data informada:  " + semanaPassada);
		System.out.println("Próxima semana a data informada:  " + proximaSemana);
		System.out.println("Próximo mês: " + proximoMes);
		
		LocalDateTime maisDuasHoras = d02.plusHours(2);
		LocalDateTime menosVinteCincoMinutos = d02.minusMinutes(25);
		
		System.out.println("\nData com hora: " + d02);
		System.out.println("Mais 2 horas: " + maisDuasHoras);
		System.out.println("Menos 25 minutoes: " + menosVinteCincoMinutos);
		System.out.println();
		
		//minus(amountToSubtract, TemporalUnit)
		Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("\nData com Instant");
		System.out.println(d03);
		System.out.println("Semana Passada: " + semanaPassadaInstant);
		System.out.println("Próxima Semana " + proximaSemanaInstant);
		
				
		Duration dur01 = Duration.between(semanaPassadaInstant, proximaSemanaInstant);
		
		System.out.println("\n***Duration**");
		System.out.println("Intervalo entre duas datas em dias: " + dur01.toDays());
		
		System.out.println("\nConvertendo de LocalDate para LocalDateTime");
		Duration dur02 = Duration.between(d01.atTime(00,00), LocalDateTime.now());
		Duration dur03 = Duration.between(d01.atStartOfDay(), LocalDateTime.now()); // atStartOfDay = a zero horas e zero minutos
		Duration dur04 = Duration.between(d03, Instant.now());
		
		System.out.println("Intervalo em horas: " + dur02.toHours());
		System.out.println("Intervalo em horas: " + dur03.toHours());
		System.out.println("Intervalo em horas (Instant): " + dur04.toHours());
		
	}

}
