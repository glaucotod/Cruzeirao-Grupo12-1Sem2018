package Classes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Inscrito inscrito;
	private int tempo;
	
	
	public Inscrito getInscrito() 
	{
		return inscrito;
	}
	
	public void setInscrito(Inscrito inscrito) 
	{
		this.inscrito = inscrito;
	}
	
	
	public int getTempo() 
	{
		return tempo;
	}
	
	public void setTempo(int tempo) 
	{
		this.tempo = tempo;
	}
	
	
}
