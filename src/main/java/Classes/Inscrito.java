package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inscrito 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idInscrito;
	private boolean aceiteusuario,suspensojogos,inscricaovalidada;
	private Usuario Usuario;
	
	
	public boolean isAceiteusuario() 
	{
		return aceiteusuario;
	}
	
	public void setAceiteusuario(boolean aceiteusuario) 
	{
		this.aceiteusuario = aceiteusuario;
	}
	
	
	public boolean isSuspensojogos() 
	{
		return suspensojogos;
	}
	
	public void setSuspensojogos(boolean suspensojogos) 
	{
		this.suspensojogos = suspensojogos;
	}
	
	
	public boolean isInscricaovalidada()
	{
		return inscricaovalidada;
	}
	
	public void setInscricaovalidada(boolean inscricaovalidada) 
	{
		this.inscricaovalidada = inscricaovalidada;
	}
	
	
	public Usuario getUsuario() 
	{
		return Usuario;
	}
	
	public void setUsuario(Usuario usuario) 
	{
		Usuario = usuario;
	}
	
}
