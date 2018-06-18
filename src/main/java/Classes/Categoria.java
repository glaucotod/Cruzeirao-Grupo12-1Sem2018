package Classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import system.dao.CampDAO;

@SuppressWarnings({ "serial", "unused" })
@Entity
public class Categoria extends Campeonato implements Serializable
{
	private String nome;
	private int nascidosapartirde, minjogadores, maxjogadores, atribute74;
	@OneToMany
	private List<Inscricao> inscricoes;
	@OneToMany(mappedBy="categoria")
	private List<Fase> fases;
	@ManyToOne
	private Campeonato campeonato;
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public int getNascidosapartirde() 
	{
		return nascidosapartirde;
	}
	
	public void setNascidosapartirde(int nascidosapartirde) 
	{
		this.nascidosapartirde = nascidosapartirde;
	}
	
	
	public int getMinjogadores() 
	{
		return minjogadores;
	}
	
	public void setMinjogadores(int minjogadores) 
	{
		this.minjogadores = minjogadores;
	}
	
	
	public int getMaxjogadores() 
	{
		return maxjogadores;
	}
	
	public void setMaxjogadores(int maxjogadores) 
	{
		this.maxjogadores = maxjogadores;
	}
	
	
	public int getAtribute74() 
	{
		return atribute74;
	}
	
	public void setAtribute74(int atribute74) 
	{
		this.atribute74 = atribute74;
	}
	
	
	public List<Inscricao> getInscricoes() 
	{
		return inscricoes;
	}
	
	public void setInscricoes(List<Inscricao> inscricoes) 
	{
		this.inscricoes = inscricoes;
	}
	
	
	public List<Fase> getFases() 
	{
		return fases;
	}
	
	public void setFases(List<Fase> fases) 
	{
		this.fases = fases;
	}
	
	
	public Campeonato getCampeonato() 
	{
		return campeonato;
	}
	
	public void setCampeonato(Campeonato campeonato) 
	{
		this.campeonato = campeonato;
	}
	
}
