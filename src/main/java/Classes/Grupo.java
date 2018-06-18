package Classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
public class Grupo extends Fase implements Serializable
{
	private String nome;
	private Fase fase;
	@ManyToMany
	private List<Rodada> rodadas;
	private int numero;
		
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
