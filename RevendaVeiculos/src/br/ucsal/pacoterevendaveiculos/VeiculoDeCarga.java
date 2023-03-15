package br.ucsal.pacoterevendaveiculos;

public class VeiculoDeCarga extends Veiculos {
	
	private Integer capacidadeMaximaCarga;
	private Double capacidadeCombustivel;
	private Integer quantidadeEixos;
	
	public VeiculoDeCarga(String placa, Integer anoDeFabricacao, Double valor, Integer capacidadeMaximaCarga,
			Double capacidadeCombustivel, Integer quantidadeEixos) throws NegocioException {
		super(placa, anoDeFabricacao, valor);
		setCapacidadeMaximaCarga(capacidadeMaximaCarga);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQuantidadeEixos(quantidadeEixos);
	}
	

	public Double calcularCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public Integer getCapacidadeMaximaCarga() {
		return capacidadeMaximaCarga;
	}

	public void setCapacidadeMaximaCarga(Integer capacidadeMaximaCarga) throws NegocioException {
		validarMaximaCarga(capacidadeMaximaCarga);
		this.capacidadeMaximaCarga = capacidadeMaximaCarga;
	}
	
	public void validarMaximaCarga(Integer capacidadeMaximaCarga) throws NegocioException {
		if (capacidadeMaximaCarga <= 0) {
			throw new NegocioException ("A capacidade máxima de carga não pode ser negativa.");
		}
	}
	
	public Double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(Double capacidadeCombustivel) throws NegocioException {
		validarCapacidadeCombustivel(capacidadeCombustivel);
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
	public void validarCapacidadeCombustivel(Double capacidadeCombustivel) throws NegocioException {
		if (capacidadeCombustivel <= 0) {
			throw new NegocioException ("A capacidade de combustível não pode ser negativa.");
		}
	}
	
	public Integer getQuantidadeEixos() {
		return quantidadeEixos;
	}
	
	public void setQuantidadeEixos(Integer quantidadeEixos) throws NegocioException {
		validarQuantidadeEixos(quantidadeEixos);
		this.quantidadeEixos = quantidadeEixos;
	}
	
	public void validarQuantidadeEixos(Integer quantidadeEixos) throws NegocioException {
		if (quantidadeEixos < 0) {
			throw new NegocioException ("A quantidade de eixos não pode ser negativa.");
		}
	}

	@Override
	public String toString() {
		return "VeiculoDeCarga [capacidadeMaximaCarga=" + capacidadeMaximaCarga + ", capacidadeCombustivel="
				+ capacidadeCombustivel + ", quantidadeEixos=" + quantidadeEixos + "]";
	}
	
	
     
	
}
