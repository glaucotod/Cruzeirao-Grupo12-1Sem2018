package Classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Fase extends Categoria implements Serializable
{	
	@Temporal(TemporalType.DATE)
	private Date datainicio, datafim;
	@ManyToOne
	private Categoria categoria;
	@ManyToMany
	private List<Grupo> grupos;
	private int numero;
	
	
	public Date getDatainicio() 
	{
		return datainicio;
	}
	
	public void setDatainicio(Date datainicio) 
	{
		this.datainicio = datainicio;
	}
	
	
	public Date getDatafim() 
	{
		return datafim;
	}
	
	public void setDatafim(Date datafim) 
	{
		this.datafim = datafim;
	}
	
	
	public Categoria getCategoria() 
	{
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) 
	{
		this.categoria = categoria;
	}
	
	
	public List<Grupo> getGrupos() 
	{
		return grupos;
	}
	
	public void setGrupos(List<Grupo> grupos) 
	{
		this.grupos = grupos;
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
