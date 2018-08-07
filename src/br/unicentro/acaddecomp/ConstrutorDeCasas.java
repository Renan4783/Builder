package br.unicentro.acaddecomp;

public class ConstrutorDeCasas implements Construtor{

	@Override
	public void ConstruirParteUm() {
		System.out.println("Paredes Construídas!");
	}

	@Override
	public void ConstruirParteDois() {
		System.out.println("Telhado Construído!");
		
	}

}
