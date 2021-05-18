package cursojava.executavel;

import cusrsojava.classes.Aluno;
import cusrsojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {

//		double[] valores = { 9.5, 8.9 };
//		String palavras[] = new String[4];
//		
//		System.out.println(valores);
//
//		palavras[0] = "alex";
//		palavras[1] = "Curso Java";
//
//		/* Array pode ser de todos os tipos de dados e objetos também */
//
//		/* Array sempre deve ter a quantidade de posições definidas */
//
//		/* Atribuir valor nas posições do arrays */
//		String posicoes = JOptionPane.showInputDialog("quantas posições o array deve ter: ");
//		double notas[] = new double[Integer.parseInt(posicoes)];
//
//		for (int i = 0; i < notas.length; i++) {
//			String valor = JOptionPane.showInputDialog("Qual o valor da posicao = " + i);
//			notas[i] = Double.valueOf(valor);
//		}
//
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println("nota " + (i + 1) + "= " + notas[i]);
//		}

		// Criacao do Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando");
		aluno.setNomeEscola("JDEV Treinamento");

		// Criacao da Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		double[] notas = { 6, 7, 6, 9 };
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		/* ========================================================================= */
		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;

		for (int i = 0; i < arrayAlunos.length; i++) {
			System.out.println("Nome do aluno: " + arrayAlunos[i].getNome());
			
			for (Disciplina disc : arrayAlunos[i].getDisciplinas()) {
				System.out.println("Nome da disciplina: " + disc.getDisciplina());
				
				for(int posNota=0; posNota< disc.getNota().length; posNota++) {
					System.out.println("A nota numero: " + (posNota+1) +" e igual = " + disc.getNota()[posNota]);
				}
			}
		}

//		System.out.println("Nome do aluno-= " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
//
//		for (Disciplina disc : aluno.getDisciplinas()) {
//			System.out.println("-------------------Disciplina do aluno--------------");
//			System.out.println("Disciplina: " + disc.getDisciplina());
//
//			System.out.println("As Notas da disciplina são: ");
//			
//			double notaMax=0.0;
//			double notaMin=0.0;
//			for (int i = 0; i < disc.getNota().length; i++) {
//				System.out.println("Nota " + (i + 1) + " é igual= " + disc.getNota()[i]);
//				
//				/*Descobrindo a maior nota*/
//				if(i==0) {
//					notaMax = disc.getNota()[i];
//					
//				}else {
//					if(disc.getNota()[i]> notaMax) {
//						notaMax = disc.getNota()[i];
//					}
//				}
//				
//				/*Descobrindo a menor nota*/
//				if(i==0) {
//					notaMin = disc.getNota()[i];
//				}else {
//					if(disc.getNota()[i]< notaMin) {
//						notaMin = disc.getNota()[i];
//					}
//				}
//			}
//			System.out.println("A maior nota da disciplina = " + disc.getDisciplina()+ " e de valor: " + notaMax);
//			System.out.println("A menor nota da disciplina = " + disc.getDisciplina()+ " e de valor: " + notaMin);
//			
//		}

	}

}
