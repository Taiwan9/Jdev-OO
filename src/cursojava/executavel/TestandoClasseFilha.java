package cursojava.executavel;

import cusrsojava.classes.Aluno;
import cusrsojava.classes.Diretor;
import cusrsojava.classes.Pessoa;
import cusrsojava.classes.Secretario;

public class TestandoClasseFilha {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setNomeEscola("Jdev - Treinamento");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("123456321564");
		diretor.setNome("Edigio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		secretario.setNome("João");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() +" - "+ aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("salario e igual a = R$"+ aluno.salario());
		System.out.println("salario e igual a = R$"+ diretor.salario());
		System.out.println("salario e igual a = R$"+ secretario.salario());
		
		Pessoa pessoa = new Aluno();
		pessoa = secretario;
		System.out.println(pessoa);
		
		test(aluno);
		test(diretor);
		test(secretario);
		

	}
	
	public static void test(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais "+ pessoa.getNome() + " e o salario dela é de =  "+ pessoa.salario());
	}

}
