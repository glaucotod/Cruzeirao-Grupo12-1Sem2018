package Classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fase implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Date datainicio, datafim;
	Categoria categoria;
	List<Grupo> grupos;
	int numero;
	
	
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
