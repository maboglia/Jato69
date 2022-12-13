package interfacce;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import eccezioni.Gatto;

public class ProvaFunzionale {

	public static void main(String[] args) {
		
//		IntStream
//			.range(1, 91)
//			.filter(n -> n%2==0)
//			.filter(n -> n%3==0)
//			.limit(15)
//			.skip(5)
//			.forEach(n -> System.out.println(n) );
//		
//		Stream.of("do", "re", "mi").sorted().forEach(System.out::println);
//		
//		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
//		
//
//		List<String> noteMaiuscoleOrdinate = Arrays
//			.stream(note)
//			.map(n -> n.toUpperCase())
//			.sorted()
//			.toList();
//		
		IntSummaryStatistics summaryStatistics = IntStream
				.of(24,26,18,23,28,29,27,24,30,30,19,22,21)
				.summaryStatistics();

		System.out.println(summaryStatistics);
		
		try {
			List<Gatto> gatti = Files
				.lines(Paths.get("files", "gatti.txt"))
				.map(s -> { 
					String[] split = s.split(",") ; 
					return new Gatto(split[0], split[1]);
				})
				.toList();
			
			gatti.forEach(System.out::println);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
