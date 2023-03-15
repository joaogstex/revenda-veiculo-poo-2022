package br.ucsal.pacoterevendaveiculos;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
	
	private static List<Veiculos> veiculo = new ArrayList<>();

	public static void incluir(Veiculos veiculo) {
		veiculo.add(veiculo);
	}

	public static List<Veiculos> obterTodos() {
		return new ArrayList<>(veiculo);
	}


}
