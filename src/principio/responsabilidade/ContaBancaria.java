package principio.responsabilidade;

public class ContaBancaria {
	/*
	 * TERMOS DE RESPONSABILIDADE
	 * 
	 * 1= O objeto tem que fazer o processamento dentro dele proprio desde que tudo
	 * que ele precisa esteja nele próprio
	 * 
	 */
	private String descricao;
	private double saldo = 8000;

	public void soma100Reais() {
		saldo += 100;
	}

	public void duminui100Reais() {
		saldo -= 100;
	}

	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}

	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	

}
