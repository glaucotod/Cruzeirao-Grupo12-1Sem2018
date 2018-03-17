package Classes;

import java.util.Date;
import java.util.List;

public class Equipe 
{
	String nome,cidade;
	Date datafundacao;
	List<Usuario> diretores;
	
	
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
