package sistema.service;

import java.util.List;
import Classes.Rodada;
import sistema.daos.RodDAO;


public class RodadaService
{
	
	RodDAO rodDAO = new RodDAO();
	
	public Rodada salvar (Rodada rod)
	{
		rod = rodDAO.save(rod);
		rodDAO.closeEntityManager();
		return rod;
	}
	
	public List<Rodada> getRodada()
	{
		List <Rodada> list = rodDAO.getAll(Rodada.class);
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
		rod = rodDAO.getById(Rodada.class, rod.getNumero());
		rodDAO.remove(rod);
		rodDAO.closeEntityManager();
	}
	
}