package sistema.service;

import Classes.Local;
import sistema.daos.LocalDAO;

import java.util.List;

public class LocalService
{
	
	LocalDAO localDAO = new LocalDAO();
	
	public Local salvar(Local local)
	{
		local = localDAO.save(local);
		localDAO.closeEntityManager();
		return local;
	}
	
	public List<Local> getLocal(){
		List <Local> lista = localDAO.getAll(Local.class);
		localDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar (Local local)
	{
		localDAO.save(local);
		localDAO.closeEntityManager();
	}
	
	public void remover (Local local)
	{
		local = localDAO.getById(Local.class,local.getNumero());
		localDAO.remove(local);
		localDAO.closeEntityManager();
	}

}
