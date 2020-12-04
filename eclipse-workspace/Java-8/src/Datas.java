import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate meuAniversario = LocalDate.of(2020, Month.DECEMBER, 16);
		
		int anos = meuAniversario.getYear() - hoje.getYear();
		
		//System.out.println(anos);
		
		Period periodo = Period.between(hoje, meuAniversario);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate diaD = LocalDate.of(2099, Month.JANUARY, 25);
		
		String  valorFormatado = meuAniversario.format(formatador);
		String hojeformatado = hoje.format(formatador); 
		String diadform = diaD.format(formatador); 
		
		System.out.println("Dia de hoje formatado " + hojeformatado);
		
		System.out.println(valorFormatado);
		
		
		System.out.println("Dia do exercicio " + diadform);
	}

}
