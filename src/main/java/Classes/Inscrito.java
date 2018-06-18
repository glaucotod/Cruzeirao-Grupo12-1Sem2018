package Classes;

import javax.persistence.Entity;

@Entity
public class Inscrito extends Usuario
{
	private boolean aceiteusuario,suspensojogos,inscricaovalidada;
	private Usuario usuario;
	
	
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
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) 
	{
		this.usuario = usuario;
	}
	
}
