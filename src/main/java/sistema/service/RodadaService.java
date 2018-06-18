package sistema.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Rodada;
import system.dao.RodDAO;


@ManagedBean
@SessionScoped

public class RodadaMB
{
	
	private Rodada rod = new Rodada();
	
	public Rodada salvar (Rodada rod)
	{
		rod = RodDAO.save(rod);
		RodDAO.closeEntityManager();
		return rod;
	}
	
	public List<Rodada> getRodada()
	{
		List <Rodada> list = RodDAO.getall(Rodada.class);
		RodDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Rodada rod)
	{
		RodDAO.save(rod);
		RodDAO.closeEntityManager();
	}
	
	public void remover (Rodada rod)
	{
		rod = RodDAO.getById(Rodada.class, rod.getNumero());
		RodDAO.remove(rod);
		RodDAO.closeEntityManager();
	}
	
}