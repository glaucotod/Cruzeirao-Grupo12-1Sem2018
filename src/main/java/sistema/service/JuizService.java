package sistema.service;

import java.util.List;

import Classes.Juiz;
import sistema.daos.JuizDAO;

public class JuizService 
{
	JuizDAO juizDAO = new JuizDAO();
	
	
	public Juiz salvar(Juiz juiz)
	{
		juiz = juizDAO.save(juiz);
		juizDAO.closeEntityManager();
		return juiz;
	}
	
	public List<Juiz> getJuiz()
	{
		List <Juiz> lista = juizDAO.getAll(Juiz.class);
		juizDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar(Juiz juiz)
	{
		juizDAO.save(juiz);
		juizDAO.closeEntityManager();
	}
	
	public void remover(Juiz juiz)
	{
		juiz = juizDAO.getById(Juiz.class, juiz.getId());
		juizDAO.remove(juiz);
		juizDAO.closeEntityManager();
	}

}
