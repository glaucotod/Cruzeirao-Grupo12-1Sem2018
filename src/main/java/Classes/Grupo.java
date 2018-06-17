package Classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Grupo implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
