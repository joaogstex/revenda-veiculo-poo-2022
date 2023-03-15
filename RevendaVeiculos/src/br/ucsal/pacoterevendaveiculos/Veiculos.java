package br.ucsal.pacoterevendaveiculos;

public abstract class Veiculos {
	
	private String placa;
	private Integer anoDeFabricacao;
	private Double valor;
	
	public Veiculos(String placa, Integer anoDeFabricacao, Double valor) throws NegocioException {
		setPlaca(placa);
		setAnoDeFabricacao(anoDeFabricacao);
		setValor(valor);
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) throws NegocioException {
		validarValor(valor);
		this.valor = valor;
	}
	
	public void validarValor(Double valor) throws NegocioException {
		if (valor < 0) {
			throw new NegocioException ("O valor não pode ser negativo.");
		}

	}

	@Override
	public String toString() {
		return "Veiculos [placa=" + placa + ", anoDeFabricacao=" + anoDeFabricacao + ", valor=" + valor + "]";
	}

	public void add(Veiculos veiculo) {
		
	}
	
	
	
	
	

}
