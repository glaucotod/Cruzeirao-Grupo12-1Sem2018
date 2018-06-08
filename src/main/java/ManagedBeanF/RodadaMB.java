package MenagedBeanF;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Rodada;


@ManagedBean
@SessionScoped

public class RodadaMB
{
	
	private Rodada rod = new Rodada();
	
	public Rodada salvar (Rodada rod)
	{
		rod = rodDAO.save(rod);
		rodDAO.closeEntityManager();
		return rod;
	}
	
	public List<Rodada>> getRodada()
	{
		List <Rodada> list = rodDAO.getall(Rodada.class);
		rodDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Rodada rod)
	{
		rodDAO.save(rod);
		rodDAO.closeEntityManager();
	}
	
	public void remover (Rodada rod)
	{
		rod = rodDAO.getById(Rodada.class, rod.getNumero));
		rodDAO.remove(rod);
		rodDAO.closeEntityManager();
	}
	
}