package Classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Equipe implements Serializable
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Idequipe;
	private String nome,cidade;
	
	@Temporal(TemporalType.DATE)
	private Date datafundacao;
	@ManyToMany
	private List<Usuario> diretores;
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public String getCidade() 
	{
		return cidade;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	
	public Date getDatafundacao() 
	{
		return datafundacao;
	}
	
	public void setDatafundacao(Date datafundacao) 
	{
		this.datafundacao = datafundacao;
	}
	
	
	public List<Usuario> getDiretores() 
	{
		return diretores;
	}
	
	public void setDiretores(List<Usuario> diretores) 
	{
		this.diretores = diretores;
	}
	
	
}
