package ManagedBean;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Classes.Gol;
import system.dao.GolsDAO;


@ManagedBean
@SessionScoped

public class GolMB
{
	
	private Gol gols = new Gol();
	
	public Gol salvar (Gol gols)
	{
		gols = GolsDAO.save(gols);
		GolsDAO.closeEntityManager();
		return gols;
	}
	
	public List<Gol> getGol()
	{
		List <Gol> list = GolsDAO.getall(Gol.class);
		GolsDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Gol gols)
	{
		GolsDAO.save(gols);
		GolsDAO.closeEntityManager();
	}
	
	public void remover (Gol gols)
	{
		gols = GolsDAO.getById(Gol.class, gols.getInscrito());
		GolsDAO.remove(gols);
		GolsDAO.closeEntityManager();
	}
	
}