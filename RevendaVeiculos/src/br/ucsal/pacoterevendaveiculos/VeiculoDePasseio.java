package br.ucsal.pacoterevendaveiculos;

public class VeiculoDePasseio extends Veiculos {
	
	private Integer maximoDePassageiro;
	private Double capacidadePortaMalas;
	
	public VeiculoDePasseio(String placa, Integer anoDeFabricacao, Double valor, Integer maximoDePassageiro,
			Double capacidadePortaMalas) throws NegocioException {
		super(placa, anoDeFabricacao, valor);
		setMaximoDePassageiro(maximoDePassageiro);
		setCapacidadePortaMalas(capacidadePortaMalas);
	}
	
	public void setMaximoDePassageiro(Integer maximoDePassageiro) {
		this.maximoDePassageiro = maximoDePassageiro;
	}

	public Double getCapacidadePortaMalas() {
		return capacidadePortaMalas;
	}

	public void setCapacidadePortaMalas(Double capacidadePortaMalas) throws NegocioException {
		validarPortaMalas(capacidadePortaMalas);
		this.capacidadePortaMalas = capacidadePortaMalas;
	}
	
	public void validarPortaMalas(Double capacidadePortaMalas ) throws NegocioException {
		if (capacidadePortaMalas < 0) {
			throw new NegocioException ("A capacidade do porta-malas não pode ser negativa.");
		}
	}

	@Override
	public String toString() {
		return "VeiculoDePasseio [maximoDePassageiro=" + maximoDePassageiro + ", capacidadePortaMalas="
				+ capacidadePortaMalas + "]";
	}
	
	
	
	
	
	
}
