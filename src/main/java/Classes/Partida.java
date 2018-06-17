package Classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Date;

@Entity
public class Partida 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numero;
	private Inscricao equipemandante, equipevisitante;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	private Local local;
	private Partida proxpartida;
	@ManyToMany
	private List<Juiz> juizes;
	private Grupo grupo;
	private String relatojuiz;
	
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	
	public Inscricao getEquipemandante() 
	{
		return equipemandante;
	}
	
	public void setEquipemandante(Inscricao equipemandante) 
	{
		this.equipemandante = equipemandante;
	}
	
	
	public Inscricao getEquipevisitante() 
	{
		return equipevisitante;
	}
	
	public void setEquipevisitante(Inscricao equipevisitante) 
	{
		this.equipevisitante = equipevisitante;
	}
	
	
	public Date getData() 
	{
		return data;
	}
	
	public void setData(Date data) 
	{
		this.data = data;
	}
	
	
	public Local getLocal() 
	{
		return local;
	}
	
	public void setLocal(Local local) 
	{
		this.local = local;
	}
	
	
	public Partida getProxpartida() 
	{
		return proxpartida;
	}
	
	public void setProxpartida(Partida proxpartida) 
	{
		this.proxpartida = proxpartida;
	}
	
	
	public List<Juiz> getJuizes() 
	{
		return juizes;
	}
	
	public void setJuizes(List<Juiz> juizes) 
	{
		this.juizes = juizes;
	}
	
	
	public Grupo getGrupo() 
	{
		return grupo;
	}
	
	public void setGrupo(Grupo grupo) 
	{
		this.grupo = grupo;
	}
	
	
	public String getRelatojuiz() 
	{
		return relatojuiz;
	}
	
	public void setRelatojuiz(String relatojuiz) 
	{
		this.relatojuiz = relatojuiz;
	}
	
}
