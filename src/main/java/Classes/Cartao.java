package Classes;

import java.io.Serializable;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Cartao extends Inscrito implements Serializable
{
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
