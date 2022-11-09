package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Timezone\n"
				+ "\tGMT - Greenwich Mean Tome - Horário de Londres.\n"
				+ "\tTambém conhecido por Z Time, ou Zulu\n"
				+ "Padrão ISO 8601"
				+ "\tEspecifica como representar dados e horas na fomra de texto.\n"
				+ "\tData-[hora] loca: 2022-06-22T15:22\n"
				+ "\tData-hora global: 2022-06-25T14:50:59Z\n" // horário de londres
				+ "\tData-hora global: 2022-06-25T14:50:59-03:00\\n"); //fuso horário de -03 horas do horário de londres
		
		System.out.println("\nInstanciando Horas");
		
		LocalDate agora = LocalDate.now();
		LocalDateTime agoraHora = LocalDateTime.now();
		Instant instante = Instant.now(); // emite data com o timezone de Londres
		
		LocalDate d01 = LocalDate.parse("2022-05-22"); //texto tem que estar em um hora no formato ISO 8601
		LocalDateTime d02 = LocalDateTime.parse("2022-05-22T13:40:21");
		Instant d03 = Instant.parse("2022-05-22T13:40:21Z"); //Z no final para indicar que é o horário de londres.
		Instant d04 = Instant.parse("2022-05-22T13:40:21-03:00"); //Z no final para indicar que é o horário do TIMEZONE DO brasil	
		
		
		System.out.println(agora);
		System.out.println(agoraHora);
		System.out.println("Data hora glogal: " + instante);
		System.out.println(d01);
		System.out.println("Data com hora: " + d02.toString()); // implicitamente chama o toString nos objetos de datas concatenadas
		System.out.println("Data com horário de Londres" + d03);
		System.out.println("Data com horário do Brasil: " + d04);
		
		
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		System.out.println("\nFormatando datas");
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d05 = LocalDate.parse("17/12/1982",format1);
		
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d06 = LocalDateTime.parse("17/12/1982 12:30",format2);
		
		LocalDateTime d07 = LocalDateTime.parse("24/12/1989 23:59",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println("Data formatada: " + d05);
		System.out.println("Data formatada com hora: " + d06);
		System.out.println("Natal de 1989: " + d07);
		
		LocalDate dataDadosIsolados = LocalDate.of(2022,05,30);
		LocalDateTime dataTempoDadosIsolados = LocalDateTime.of(2021,06,29,1,40);
		System.out.println(dataDadosIsolados);
		System.out.println(dataTempoDadosIsolados);
		
				
	}

}
