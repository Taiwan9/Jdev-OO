package cusrsojava.classes;

/*Herança-Classe pai ou classe master ou superclasse - (Atributos comuns a todos os objetos filhos)*/
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;

	/*Metodo abatrato e que fica na  classe pai é obrigatorio para as classes filhas*/
	public abstract double salario();

	public Pessoa() {
	}

	public Pessoa(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae,
			String nomePai) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	/* return true caso seja 18 anos pra cima */
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba Maior de idade" : "ixii você é menor de idade";
	}
}
