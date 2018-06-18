package Classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Date;

@Entity
public class Usuario 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUsuario;
	private String nome, email, telefonefixo,telefonemovel,endereco,rg,cpf,cref,foto;
	
	@Temporal(TemporalType.DATE)
	private Date datanascimento;
	@ManyToMany(mappedBy="diretores")
	private List<Equipe> equipes;
	@OneToMany(mappedBy="usuario")
	private List<Inscrito> inscricoes;
	@ManyToMany
	private List<Campeonato> campeonatos;
	
	public int getId() 
	{
		return idUsuario;
	}
	
	public void setId(int idUsuario) 
	{
		this.idUsuario = idUsuario;
	}
	
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
