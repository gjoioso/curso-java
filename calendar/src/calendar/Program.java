// ** Manipular data com Calendar(metodo antigo)

package calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("Hora informada: " + sdf.format(d)); // printa a hora definida acima

		Calendar cal = Calendar.getInstance();
		cal.setTime(d); // calendário com a data informada acima instanciada dentro dele
		cal.add(Calendar.HOUR_OF_DAY, 4); // acrescenta 4 horas a data informada
		d = cal.getTime();
		System.out.println("Add 4 horas: " + sdf.format(d)); // add mais 4 horas --> printa a hora usando Calendar

	}

}
