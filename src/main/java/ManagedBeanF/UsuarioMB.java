package MenagedBean;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Usuario;


@ManagedBean
@SessionScoped

public class UsuarioMB
{
	private Usuario user = new Usuario();
	
	public Usuario salvar (Usuario user)
	{
		user = userDAO.save(user);
		userDAO.closeEntityManager();
		return user;
	}
	
	public List<Usuario> getUsuario()
	{
		List <Usuario> list = userDAO.getall(Usuario.class);
		userDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Usuario user)
	{
		userDAO.save(user);
		userDAO.closeEntityManager();
	}
	
	public void remover (Usuario user)
	{
		user = userDAO.getById(Usuario.class, user.getIdUsuario());
		userDAO.remove(user);
		userDAO.closeEntityManager();
	}
	
}