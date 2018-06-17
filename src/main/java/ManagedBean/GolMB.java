package ManagedBean;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Classes.Gol;


@ManagedBean
@SessionScoped

public class GolMB
{
	
	private Gol gols = new Gol();
	
	public Gol salvar (Gol gols)
	{
		gols = golsDAO.save(gols);
		golsDAO.closeEntityManager();
		return gols;
	}
	
	public List<Gol> getGol()
	{
		List <Gol> list = golsDAO.getall(Gol.class);
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
		gols = golsDAO.getById(Gol.class, gols.getInscrito());
		golsDAO.remove(gols);
		golsDAO.closeEntityManager();
	}
	
}