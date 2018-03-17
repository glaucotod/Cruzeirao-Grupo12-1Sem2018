package Classes;

import java.util.List;
import java.util.Date;

public class Usuario 
{
	String nome, email, telefonefixo,telefonemovel,endereco,rg,cpf,cref,foto;
	Date datanascimento;
	List<Equipe> equipes;
	List<Inscrito> inscricoes;
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getTelefonefixo() 
	{
		return telefonefixo;
	}
	
	public void setTelefonefixo(String telefonefixo) 
	{
		this.telefonefixo = telefonefixo;
	}
	
	
	public String getTelefonemovel() 
	{
		return telefonemovel;
	}
	
	public void setTelefonemovel(String telefonemovel) 
	{
		this.telefonemovel = telefonemovel;
	}
	
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	
	
	public String getRg() 
	{
		return rg;
	}
	
	public void setRg(String rg) 
	{
		this.rg = rg;
	}
	
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	
	public String getCref() 
	{
		return cref;
	}
	
	public void setCref(String cref) 
	{
		this.cref = cref;
	}
	
	
	public String getFoto() 
	{
		return foto;
	}
	
	public void setFoto(String foto) 
	{
		this.foto = foto;
	}
	
	
	public Date getDatanascimento() 
	{
		return datanascimento;
	}
	
	public void setDatanascimento(Date datanascimento)
	{
		this.datanascimento = datanascimento;
	}
	
	
	public List<Equipe> getEquipes() 
	{
		return equipes;
	}
	
	public void setEquipes(List<Equipe> equipes) 
	{
		this.equipes = equipes;
	}
	
	
	public List<Inscrito> getInscricoes() 
	{
		return inscricoes;
	}
	
	public void setInscricoes(List<Inscrito> inscricoes) 
	{
		this.inscricoes = inscricoes;
	}
	
	
}
