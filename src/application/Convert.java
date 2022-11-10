package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convert {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-05-21");
		LocalDateTime d02 = LocalDateTime.parse("2022-05-21T02:45:00");
		Instant d03 = Instant.parse("2022-05-21T15:45:00Z"); // horario global - para converter para texto tem que informar o fuso
		Instant d04 = Instant.parse("2022-05-21T15:45:00-03:00"); //horário de brasília
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //puxa o fuso da aplicação que estiver rodando a aplicacao
		DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE_TIME; // data local que não tem fuso horário
		DateTimeFormatter format5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("\nFormatando datas LocalDate\n");
		System.out.println("Data formato ISO 8601: " + d01);
		System.out.println("Formato personalizado: " + d01.format(format1));
		System.out.println("Formato personalizado: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Formato personalizado: " + format1.format(d01));
		
		
		System.out.println("\nFormatando datas LocalDateTime\n");
		System.out.println("Data formato ISO 8601: " + d02);
		System.out.println("Formato personalizado: " + d02.format(format2));
		System.out.println("Formato personalizado: " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Formato personalizado: " + format2.format(d02));
		System.out.println("Formato personalizado (ISO_DATE_TIME): " + format4.format(d02));
		
		System.out.println("\nConverte Instant para texto\n");		
		System.out.println(format3.format(d03));
		System.out.println("No horário brasileiro vai ser 3 horas a frente com relação a Londres");
		System.out.println(format3.format(d04));
		System.out.println("Formato personalizado (ISO_INSTANT): " + format5.format(d03));
		System.out.println("Formato personalizado (ISO_INSTANT): " + format5.format(d04));
		
		
		

	}

}
