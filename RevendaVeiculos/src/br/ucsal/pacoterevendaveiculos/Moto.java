package br.ucsal.pacoterevendaveiculos;

public class Moto extends Veiculos {
	
	private String categoria;
	private Double cilindrada;
	
	public Moto(String placa, Integer anoDeFabricacao, Double valor, String categoria, Double cilindrada) throws NegocioException {
		super(placa, anoDeFabricacao, valor);
		setCategoria(categoria);
		setCilindrada(cilindrada);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Double cilindrada) throws NegocioException {
		validarCilindrada(cilindrada);
		this.cilindrada = cilindrada;
	}
	
	public void validarCilindrada(Double cilindrada) throws NegocioException {
		if (cilindrada < 0) {
			throw new NegocioException ("O valor da cilindrada não pode ser negativa.");
		}
	}

	@Override
	public String toString() {
		return "Moto [categoria=" + categoria + ", cilindrada=" + cilindrada + "]";
	}
	
	
	

}
