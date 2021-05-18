package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classeAuxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cusrsojava.classes.Aluno;
import cusrsojava.classes.Diretor;
import cusrsojava.classes.Disciplina;

public class Main {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		try {
			
			String login = JOptionPane.showInputDialog("LOGIN: ");
			String senha = JOptionPane.showInputDialog("SENHA: ");

			// Secretario secretario = new Secretary(); //Diretamente com o objeto

			// só travar o contrato para autorizar somente quem realmente tem o contrato
			// 100% legitimio
			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) { /* se TRUE acessa se FALSE nao acessa */
				List<Aluno> alunos = new ArrayList<Aluno>();

				// é uma lista que dentro dela temos uma chave que identifica uma sequência de
				// valores também
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 3; qtd++) {

					/* new Aluno() é uma instancia(Criação de objeto) */
					/* aluno1 e uma referencia ao objeto aluno */

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "+: ");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno: ");
					/*
					 * String dataNasc = JOptionPane.showInputDialog("Qual a data de nascimento: ");
					 * String rg = JOptionPane.showInputDialog("Numero do RG: "); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF do aluno: "); String nomePai =
					 * JOptionPane.showInputDialog("Qual o nome do pai: "); String nomeMae =
					 * JOptionPane.showInputDialog("Qual o nome do mãe: "); String dataMatricula =
					 * JOptionPane.showInputDialog("Data da matricula: "); String nomeEscola =
					 * JOptionPane.showInputDialog("Qual o nome da escola: "); String serie =
					 * JOptionPane.showInputDialog("Qual a serie do aluno: ");
					 */

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					/*
					 * aluno1.setDataNascimento(dataNasc); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
					 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
					 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(nomeEscola);
					 */

					for (int pos = 1; pos <= 1; pos++) { // Adicionando disciplina ao objeto Aluno
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " : ");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " : ");
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						//disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

					if (escolha == 0) { // Opção SIM e ZERO

						int continuarRemover = 0;
						int posicao = 1;
						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina( 1, 2, 3, 4) : ");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()
									- posicao); /* entrar de acordo com o indice da lista */
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null,
									"Continuar a remover? ");/* Continuando a remover itens da lista */

						}
					}

					alunos.add(aluno1);

				}

				// varre a lista principal e cria uma lista nova de aprovados e reprovados
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				// SEPARANDO OS ALUNO APROVADOS E REPROVADOS
				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);

					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);

					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("-----------------Lista dos aprovados-----------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ "com a media de = " + aluno.getMediaNota());
				}

				System.out.println("-----------------Lista de Recuperacão-----------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ "com a media de = " + aluno.getMediaNota());
				}

				System.out.println("-----------------Lista dos Reprovados-----------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ "com a media de = " + aluno.getMediaNota());
				}

				/*
				 * for(int pos=0; pos<alunos.size(); pos++) { //PECORRENDO LISTA PELAS POSIÇÕES
				 * Aluno aluno =alunos.get(pos);
				 * 
				 * if(aluno.getNome().equalsIgnoreCase("Alex")) { //Substitutindo um aluno da
				 * Lista Aluno trocar = new Aluno(); trocar.setNome("Aluno foi trocado: ");
				 * 
				 * Disciplina disciplina = new Disciplina();
				 * disciplina.setDisciplina("Matematica"); disciplina.setNota(96);
				 * 
				 * trocar.getDisciplinas().add(disciplina);
				 * 
				 * alunos.set(pos, trocar); //troca o aluno alex pelo objeto trocar aluno =
				 * alunos.get(pos);
				 * 
				 * }
				 * 
				 * System.out.println("Aluno = "+ aluno.getNome());
				 * System.out.println("Media do aluno: " + aluno.getMediaNota());
				 * System.out.println("Resultado= " + aluno.getAlunoAprovado2());
				 * System.out.println("======================================================");
				 * 
				 * for(Disciplina disc: aluno.getDisciplinas()) {
				 * System.out.println("Materia = "+ disc.getDisciplina()+ "nota =" +
				 * disc.getNota()); } }
				 */

				/*
				 * for(Aluno aluno : alunos){
				 * 
				 * if (aluno.getNome().equalsIgnoreCase("Alex")) //removendo alex da Lista {
				 * //alunos.remove(aluno); break; }else { System.out.println(aluno);
				 * System.out.println("Media do aluno = " + aluno.getMediaNota());
				 * System.out.println("Resultado = " + aluno.getAlunoAprovado2()); }
				 * 
				 * }
				 * 
				 * 
				 * for (Aluno aluno : alunos) { //Listando os demais alunos na lista
				 * System.out.println("Alunos que sobraram na lista");
				 * System.out.println(aluno.getNome());
				 * System.out.println("Suas materia são: "); for(Disciplina disciplina:
				 * aluno.getDisciplinas()) { //listando as disciplinas matriculadas do aluno
				 * System.out.println(disciplina.getDisciplina()); }
				 * 
				 * }
				 */

			} else {
				JOptionPane.showConfirmDialog(null, "ACESSO INVALIDO!");
			}

		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();

			System.out.println("Mensagem: " + e.getMessage()); // imprime erro ou causa

			e.printStackTrace(); /* Imprime erro no console Java */

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo de erro: " + e.getStackTrace()[i].getMethodName());// append = adicionar
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
			}

			JOptionPane.showInternalMessageDialog(null,
					"Erro ao processar notas" + saida.toString());/* Mensagem do erro ou causa */
		}
		finally { //Sempre é executado ocorrendo erros ou não. Porquê
			//Finally é sempre usado quando precisa executar um processo acontecendo erro ou não no sistema
			
			JOptionPane.showInternalMessageDialog(null, "Obrigado por aprender Java comigo");
		}
		
	}
	

}
