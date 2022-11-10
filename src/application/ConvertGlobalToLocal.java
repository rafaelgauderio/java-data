package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertGlobalToLocal {
	
	public static void main (String [] args) {
		
		LocalDate d01 = LocalDate.parse("2022-05-21");
		LocalDateTime d02 = LocalDateTime.parse("2022-05-21T02:45:00");
		Instant d03 = Instant.parse("2022-05-21T00:45:00Z"); // horario global - para converter para texto tem que informar o fuso
		Instant d04 = Instant.parse("2022-05-21T15:45:00-03:00"); //horário de brasília
		LocalDate dataNascimento = LocalDate.parse("1982-12-17");
		
		System.out.println("Imprimindo os Fusos customizados\n");
		for(String local : ZoneId.getAvailableZoneIds() ) {
			System.out.println(local);
		}
		
		LocalDate localDate1 = LocalDate.ofInstant(d04, ZoneId.systemDefault()); //convertando para uma data local considerando o fuso do computador
		LocalDate localDate2 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // data de londres as 00 horas, vai ser um dia antes no Brasil devido ao fuso
		LocalDate localDate3 = LocalDate.ofInstant(d03, ZoneId.of("Europe/Vienna"));
		
		System.out.println("\nConvertendo de Data Global para Local");
		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println("Dia no fuso de Viena: " + localDate3);
		
		
		
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(d04, ZoneId.systemDefault()); 
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault()); 
		LocalDateTime localDateTime3 = LocalDateTime.ofInstant(d03, ZoneId.of("Asia/Tokyo"));
		
		System.out.println("\nConvertendo de DataHora Global para Local");
		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
		System.out.println("Dia e hora no fuso de Tokyo no Japão: " + localDateTime3);
		
		System.out.println("\nPegando dados separados de uma data.");
		System.out.println("Dia do nascimento: "+ dataNascimento.getDayOfMonth());
		System.out.println("Mês do nascimento: "+ dataNascimento.getMonthValue());
		System.out.println("Ano do nascimento: " + dataNascimento.getYear());
		
		System.out.println("\nPegando as horas e minutos de uma LocalDateTime.");
		System.out.println(d02.toString());
		System.out.println("Horas:" + d02.getHour());
		System.out.println("Minutos:" + d02.getMinute());
		
		
		
		
		
		
	}

}
