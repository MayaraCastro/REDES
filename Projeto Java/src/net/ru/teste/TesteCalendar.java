package net.ru.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteCalendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		hoje.set(2018, Calendar.AUGUST, 05);
		
		Calendar segunda = Calendar.getInstance();
		segunda.add(Calendar.DATE, 1);
		
		Calendar terca = Calendar.getInstance();
		terca.add(Calendar.DATE, 1);
		
		Calendar quarta = Calendar.getInstance();
		quarta.add(Calendar.DATE, 1);
		
		Calendar quinta = Calendar.getInstance();
		quinta.add(Calendar.DATE, 1);
		
		Calendar sexta = Calendar.getInstance();
		sexta.add(Calendar.DATE, 1);
		
		if (hoje.getTime().getDay() == 6)
			segunda.add(Calendar.DAY_OF_MONTH, 2);
		else
			segunda.add(Calendar.DATE, 1 - hoje.getTime().getDay());
		
		if (hoje.getTime().getDay() == 6)
			terca.add(Calendar.DAY_OF_MONTH, 3);
		else
			terca.add(Calendar.DATE, 2 - hoje.getTime().getDay());
		
		if (hoje.getTime().getDay() == 6)
			quarta.add(Calendar.DAY_OF_MONTH, 4);
		else
			quarta.add(Calendar.DATE, 3 - hoje.getTime().getDay());
		
		if (hoje.getTime().getDay() == 6)
			quinta.add(Calendar.DAY_OF_MONTH, 5);
		else
			quinta.add(Calendar.DATE, 4 - hoje.getTime().getDay());
		
		if (hoje.getTime().getDay() == 6)
			sexta.add(Calendar.DAY_OF_MONTH, 6);
		else
			sexta.add(Calendar.DATE, 5 - hoje.getTime().getDay());
		
		List<Calendar> dias = new ArrayList<Calendar>();
		dias.add(segunda);
		dias.add(terca);
		dias.add(quarta);
		dias.add(quinta);
		dias.add(sexta);
		
		for(Calendar dia : dias) 
			System.out.println(dia.getTime());
		
	}
	
}
