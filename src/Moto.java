
public class Moto extends Veiculo{

	@Override
	public int acelerar(int velocidade) {
		int velocidadeAtual = getVelocidade();
		int novaVelocidade = velocidadeAtual += velocidade;
        System.out.println("A moto está acelerando para " + novaVelocidade + " km/h.");
        return novaVelocidade;
	}

	@Override
	public void frear() {
		System.out.println("A moto está freando.");
	}

}
