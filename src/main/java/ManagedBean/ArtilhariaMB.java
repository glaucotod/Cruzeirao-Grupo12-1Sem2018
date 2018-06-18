package ManagedBean;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Partida;
import Classes.PartidaFutebol;
import system.dao.GolsDAO;
import system.dao.PartDAO;
import system.dao.PartfDAO;
import Classes.Gol;


@ManagedBean
@SessionScoped

public class ArtilhariaMB
{
	@SuppressWarnings("unused")
	private Partida part = new Partida();
	@SuppressWarnings("unused")
	private PartidaFutebol partf = new PartidaFutebol();
	@SuppressWarnings("unused")
	private Gol gols = new Gol();
	
	public Partida salvar (Partida part)
	{
		part = PartDAO.save(part);
		PartDAO.closeEntityManager();
		return part;
	}
	
	public List<Partida> getPartida()
	{
		List <Partida> list = PartDAO.getall(Partida.class);
		PartDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Partida part)
	{
		PartDAO.save(part);
		PartDAO.closeEntityManager();
	}
	
	public void remover (Partida part)
	{
		part = PartDAO.getById(Partida.class, part.getNumero());
		PartDAO.remove(part);
		PartDAO.closeEntityManager();
	}
	
	public PartidaFutebol salvar (PartidaFutebol partf)
	{
		partf = PartfDAO.save(partf);
		PartfDAO.closeEntityManager();
		return partf;
	}
	
	public List<PartidaFutebol> getPartidaFutebol()
	{
		List <PartidaFutebol> list = PartfDAO.getAll(PartidaFutebol.class);
		PartfDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (PartidaFutebol partf)
	{
		PartfDAO.save(partf);
		PartfDAO.closeEntityManager();
	}
	
	public void remover (PartidaFutebol partf)
	{
		partf = PartfDAO.getById(PartidaFutebol.class, partf.getNumero());
		PartfDAO.remove(partf);
		PartfDAO.closeEntityManager();
	}
	
	public Gol salvar (Gol gols)
	{
		gols = golstDAO.save(gols);
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