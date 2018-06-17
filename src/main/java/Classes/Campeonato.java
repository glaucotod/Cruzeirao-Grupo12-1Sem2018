package Classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Campeonato implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String nome;
	@ManyToMany
	private List<Local> locais;
	@ManyToMany
	private List<Juiz> juizes;
	@ManyToMany
	private List<Categoria> categorias;
	
	@Temporal(TemporalType.DATE)
	private Date datainicioinscricao, datafiminscricao, datainiciocampeonato, datafimcampeonato;
	private double valortaxa;
	
	
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
