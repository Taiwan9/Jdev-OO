package cursojava.executavel;

public class Matriz {
	public static void main(String[] args) {

		int notas[][] = new int[2][3];

		notas[0][0] = 10;
		notas[0][1] = 20;
		notas[0][2] = 30;

		notas[1][0] = 40;
		notas[1][1] = 50;
		notas[1][2] = 60;


		for (int posLinha = 0; posLinha < notas.length; posLinha++) { // pecorre as linhas
			
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {//pecorre as colunas
					System.out.println("Valor da matriz: " + notas[posLinha][posColuna]);
			}
		}

	}
}
