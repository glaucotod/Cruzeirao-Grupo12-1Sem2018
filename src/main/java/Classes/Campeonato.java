package Classes;

import java.util.Date;
import java.util.List;

public class Campeonato 
{
	String nome;
	List<Local> locais;
	List<Juiz> juizes;
	List<Categoria> categorias;
	Date datainicioinscricao, datafiminscricao, datainiciocampeonato, datafimcampeonato;
	double valortaxa;
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public List<Local> getLocais() 
	{
		return locais;
	}
	
	public void setLocais(List<Local> locais) 
	{
		this.locais = locais;
	}
	
	
	public List<Juiz> getJuizes() 
	{
		return juizes;
	}
	
	public void setJuizes(List<Juiz> juizes) 
	{
		this.juizes = juizes;
	}
	
	
	public List<Categoria> getCategorias() 
	{
		return categorias;
	}
	
	public void setCategorias(List<Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	
	
	public Date getDatainicioinscricao() 
	{
		return datainicioinscricao;
	}
	
	public void setDatainicioinscricao(Date datainicioinscricao) 
	{
		this.datainicioinscricao = datainicioinscricao;
	}
	
	
	public Date getDatafiminscricao() 
	{
		return datafiminscricao;
	}
	
	public void setDatafiminscricao(Date datafiminscricao) 
	{
		this.datafiminscricao = datafiminscricao;
	}
	
	
	public Date getDatainiciocampeonato() 
	{
		return datainiciocampeonato;
	}
	
	public void setDatainiciocampeonato(Date datainiciocampeonato) 
	{
		this.datainiciocampeonato = datainiciocampeonato;
	}
	
	
	public Date getDatafimcampeonato() 
	{
		return datafimcampeonato;
	}
	
	public void setDatafimcampeonato(Date datafimcampeonato) 
	{
		this.datafimcampeonato = datafimcampeonato;
	}
	
	
	public double getValortaxa() 
	{
		return valortaxa;
	}
	
	public void setValortaxa(double valortaxa) 
	{
		this.valortaxa = valortaxa;
	}
	
	
}
