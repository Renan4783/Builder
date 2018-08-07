package br.unicentro.acaddecomp;

public class Diretor {

	private Construtor c;
	
	public void setConstrutor(Construtor c){
		this.c = c;
	}
	
	public void Construir(){
		c.ConstruirParteUm();
		c.ConstruirParteDois();
	}
}
