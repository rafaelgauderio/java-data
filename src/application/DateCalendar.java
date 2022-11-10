package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateCalendar {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 =new Date(System.currentTimeMillis());
		//horas em milisegundos  a partir de 01/01/1970
		Date x3=new Date(995900000L);
		Date x4= new Date(1000L * 60 * 60* 5);
		
		Date y1 = sdf1.parse("07/08/2019");
		Date y2 = sdf2.parse("07/08/2019 13:13:08");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		//Data sem formatação
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		System.out.println("x3: "+x3);
		//5 da manha de 1970, seria 2 manha no Brasil devido ao fuso horário
		System.out.println("x4: "+x4);
		System.out.println("y1 "+ y1);
		System.out.println("y2 " + y2);
		System.out.println("y3 " + y3);
		
		System.out.println("----------------------------------");
		
		//Data na formatação horário da Brazil
		System.out.println("x1: "+sdf1.format(x1));
		System.out.println("x1: "+sdf2.format(x1));
		System.out.println("x2: "+sdf2.format(x2));
		System.out.println("x3: "+sdf2.format(x3));
		//5 da manha de 1970, seria 2 manha no Brasil devido ao fuso horário
		System.out.println("x4: "+sdf2.format(x4));
		System.out.println("y1 "+ sdf2.format(y1));
		System.out.println("y2 " + sdf2.format(y2));
		System.out.println("y3 " + sdf2.format(y3));
		
		System.out.println("----------------------------------");
		
		//Data Impressa na timezone "GMT"
		System.out.println("x1: "+sdf3.format(x1));
		System.out.println("x1: "+sdf3.format(x1));
		System.out.println("x2: "+sdf3.format(x2));
		System.out.println("x3: "+sdf3.format(x3));
		//5 da manha de 1970, seria 2 manha no Brasil devido ao fuso horário
		System.out.println("x4: "+sdf3.format(x4));
		System.out.println("y1 "+ sdf3.format(y1));
		System.out.println("y2 " + sdf3.format(y2));
		System.out.println("y3 " + sdf3.format(y3));
		
		
		System.out.println("----------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date day=Date.from(Instant.parse("2019-08-07T17:11:00Z" ));
		
		System.out.println(sdf.format(d));
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(d);
		calendario.add(Calendar.HOUR_OF_DAY, 15);
		calendario.add(Calendar.DAY_OF_WEEK, 5);
		d = calendario.getTime();
		
		System.out.println(sdf.format(day));
		System.out.println(sdf.format(d));
		
		System.out.println();
		
		int minutos = calendario.get(Calendar.MINUTE);
		int dayOfWeek=calendario.get(Calendar.DAY_OF_WEEK);
		//no calendario Janero é o mês zero, tem que somar +1
		int mes=1 + calendario.get(Calendar.MONTH);
		
		System.out.println("Minutes: "+minutos);
		System.out.println("Day of week: "+dayOfWeek);
		System.out.println("Month: "+mes);
		
		
	}

}
