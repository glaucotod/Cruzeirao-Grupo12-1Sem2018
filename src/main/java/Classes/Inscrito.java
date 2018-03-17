package Classes;

public class Inscrito 
{
	boolean aceiteusuario,suspensojogos,inscricaovalidada;
	Usuario Usuario;
	
	
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
