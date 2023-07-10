
public abstract class Veiculo {
	
	private int velocidade;
	
	public abstract int acelerar(int velocidade);
	
	public abstract void frear();

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}
