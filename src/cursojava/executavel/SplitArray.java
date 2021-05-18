package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		String text = "Taiwan, Curso Java, 80, 70, 90, 67";

		String[] valoresArray = text.split(","); // Converte String para Array

		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		
		/*Convertendo Array em Lista*/
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/*Convertendo Lista em Array*/
		
		String[]conversaoArray= list.toArray(new String[6]);
		
		for(int i =0; i<conversaoArray.length; i++) {
			System.out.println(conversaoArray[i]);
		}
	}

}
