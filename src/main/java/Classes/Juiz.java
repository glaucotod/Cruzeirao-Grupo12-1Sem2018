package Classes;

import javax.persistence.Entity;


@Entity
public class Juiz extends Usuario
{
	
	private Usuario usuario;
	@SuppressWarnings({ "rawtypes", "unused" })
	private Enum tipo;

	public Usuario getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario) 
	{
		this.usuario = usuario;
	}
	
}
