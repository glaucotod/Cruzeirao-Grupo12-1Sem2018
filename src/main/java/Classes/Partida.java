package Classes;

import java.util.List;
import java.util.Date;

public class Partida 
{
	int numero;
	Inscricao equipemandante, equipevisitante;
	Date data;
	Local local;
	Partida proxpartida;
	List<Juiz> juizes;
	Grupo grupo;
	String relatojuiz;
	
	
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
