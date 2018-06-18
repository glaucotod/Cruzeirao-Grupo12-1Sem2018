package sistema.service;

import java.util.List;
import Classes.Usuario;
import sistema.daos.UserDAO;


public class UsuarioService
{
	UserDAO userDAO = new UserDAO();
	
	public Usuario salvar (Usuario user)
	{
		user = userDAO.save(user);
		userDAO.closeEntityManager();
		return user;
	}
	
	public List<Usuario> getUsuario()
	{
		List <Usuario> list = userDAO.getAll(Usuario.class);
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
		user = userDAO.getById(Usuario.class, user.getId());
		userDAO.remove(user);
		userDAO.closeEntityManager();
	}
	
}