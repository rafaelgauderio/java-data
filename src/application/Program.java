package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Timezone\n"
				+ "\tGMT - Greenwich Mean Tome - Hor�rio de Londres.\n"
				+ "\tTamb�m conhecido por Z Time, ou Zulu\n"
				+ "Padr�o ISO 8601"
				+ "\tEspecifica como representar dados e horas na fomra de texto.\n"
				+ "\tData-[hora] loca: 2022-06-22T15:22\n"
				+ "\tData-hora global: 2022-06-25T14:50:59Z\n" // hor�rio de londres
				+ "\tData-hora global: 2022-06-25T14:50:59-03:00\\n"); //fuso hor�rio de -03 horas do hor�rio de londres
		
		System.out.println("\nInstanciando Horas");
		
		LocalDate agora = LocalDate.now();
		LocalDateTime agoraHora = LocalDateTime.now();
		Instant instante = Instant.now(); // emite data com o timezone de Londres
		
		LocalDate d01 = LocalDate.parse("2022-05-22"); //texto tem que estar em um hora no formato ISO 8601
		LocalDateTime d02 = LocalDateTime.parse("2022-05-22T13:40:21");
		Instant d03 = Instant.parse("2022-05-22T13:40:21Z"); //Z no final para indicar que � o hor�rio de londres.
		Instant d04 = Instant.parse("2022-05-22T13:40:21-03:00"); //Z no final para indicar que � o hor�rio do TIMEZONE DO brasil
		
		
		System.out.println(agora);
		System.out.println(agoraHora);
		System.out.println("Data hora glogal: " + instante);
		System.out.println(d01);
		System.out.println("Data com hora: " + d02.toString()); // implicitamente chama o toString nos objetos de datas concatenadas
		System.out.println("Data com hor�rio de Londres" + d03);
		System.out.println("Data com hor�rio do Brasil: " + d04);
		
		
		
		
				
	}

}
