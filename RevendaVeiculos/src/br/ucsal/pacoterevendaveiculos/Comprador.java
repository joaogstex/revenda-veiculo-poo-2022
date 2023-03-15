package br.ucsal.pacoterevendaveiculos;

public class Comprador {
	
	private Integer cpf;
	private String nome;
	private String endereço;
	private Integer cep;
	private String logradouro;
	private Integer numero;
	private String bairro;
	private Integer telefone;
	
	public Comprador(Integer cpf, String nome, String endereço, Integer cep, String logradouro, Integer numero,
			String bairro, Integer telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereço = endereço;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.telefone = telefone;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Comprador [cpf=" + cpf + ", nome=" + nome + ", endereço=" + endereço + ", CEP=" + cep + ", logradouro="
				+ logradouro + ", numero=" + numero + ", bairro=" + bairro + ", telefone=" + telefone + "]";
	}

	public void add(Comprador comprador) {
		
	}
	
	
	
}
