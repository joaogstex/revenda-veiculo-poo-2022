package br.ucsal.pacoterevendaveiculos;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
	
	private static List<Comprador> comprador = new ArrayList<>();

	public static void incluir(Comprador comprador) {
		comprador.add(comprador);
	}

	public static List<Comprador> obterTodos() {
		return new ArrayList<>(comprador);
	}

}
