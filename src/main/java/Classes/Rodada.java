package Classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Rodada 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numero;
	private Grupo grupo;
	@ManyToMany
	private List<Partida> partidas;
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	
	public Grupo getGrupo() 
	{
		return grupo;
	}
	
	public void setGrupo(Grupo grupo) 
	{
		this.grupo = grupo;
	}
	
	
	public List<Partida> getPartidas() 
	{
		return partidas;
	}
	
	public void setPartidas(List<Partida> partidas) 
	{
		this.partidas = partidas;
	}
	
}
