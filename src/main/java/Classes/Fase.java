package Classes;

import java.util.Date;
import java.util.List;

public class Fase 
{
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
