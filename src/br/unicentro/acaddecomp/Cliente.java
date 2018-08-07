package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String args[]) {
		ConstrutorDeCasas cc = new ConstrutorDeCasas();
		ConstrutorDePredios cp = new ConstrutorDePredios();
		Diretor dir = new Diretor();
		dir.setConstrutor(cc);
		dir.Construir();
		dir.setConstrutor(cp);
		dir.Construir();
	}
}
