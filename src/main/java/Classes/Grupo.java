package Classes;

import java.util.List;

public class Grupo 
{
	String nome;
	Fase fase;
	List<Rodada> rodadas;
	int numero;
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public Fase getFase() 
	{
		return fase;
	}
	
	public void setFase(Fase fase) 
	{
		this.fase = fase;
	}
	
	
	public List<Rodada> getRodadas() 
	{
		return rodadas;
	}
	
	public void setRodadas(List<Rodada> rodadas) 
	{
		this.rodadas = rodadas;
	}
	
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
}
