package sistema.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import Classes.Gol;
import sistema.daos.GolsDAO;


public class GolService
{
	
	GolsDAO golsDAO = new GolsDAO();
	
	public Gol salvar (Gol gols)
	{
		gols = golsDAO.save(gols);
		golsDAO.closeEntityManager();
		return gols;
	}
	
	public List<Gol> getGol()
	{
		List <Gol> list = golsDAO.getAll(Gol.class);
		golsDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Gol gols)
	{
		golsDAO.save(gols);
		golsDAO.closeEntityManager();
	}
	
	public void remover (Gol gols)
	{
		gols = golsDAO.getById(Gol.class, gols.getId());
		golsDAO.remove(gols);
		golsDAO.closeEntityManager();
	}
	
}