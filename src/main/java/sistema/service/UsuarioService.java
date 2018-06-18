package sistema.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Usuario;
import system.dao.UserDAO;


@ManagedBean
@SessionScoped

public class UsuarioMB
{
	private Usuario user = new Usuario();
	
	public Usuario salvar (Usuario user)
	{
		user = UserDAO.save(user);
		UserDAO.closeEntityManager();
		return user;
	}
	
	public List<Usuario> getUsuario()
	{
		List <Usuario> list = UserDAO.getall(Usuario.class);
		UserDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Usuario user)
	{
		UserDAO.save(user);
		UserDAO.closeEntityManager();
	}
	
	public void remover (Usuario user)
	{
		user = UserDAO.getById(Usuario.class, user.getId());
		UserDAO.remove(user);
		UserDAO.closeEntityManager();
	}
	
}