package Classes;

import java.io.Serializable;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Gol extends Usuario implements Serializable
{
	private Inscrito inscrito;
	private int tempo;
	private boolean penalty;
	
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
	
	
	public boolean isPenalty() 
	{
		return penalty;
	}
	
	public void setPenalty(boolean penalty) 
	{
		this.penalty = penalty;
	}
	
	
}
