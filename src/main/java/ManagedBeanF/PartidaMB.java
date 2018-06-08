package MenagedBean;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Partida;
import Classes.PartidaFutebol;


@ManagedBean
@SessionScoped

public class PartidaMB
{
	private Partida part = new Partida();
	private PartidaFutebol partf = new PartidaFutebol();
	
	public Partida salvar (Partida part)
	{
		part = partDAO.save(part);
		partDAO.closeEntityManager();
		return part;
	}
	
	public List<Partida> getPartida()
	{
		List <Partida> list = partDAO.getall(Partida.class);
		partDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (Partida part)
	{
		partDAO.save(part);
		partDAO.closeEntityManager();
	}
	
	public void remover (Partida part)
	{
		part = partDAO.getById(Partida.class, part.getNumero());
		partDAO.remove(part);
		partDAO.closeEntityManager();
	}
	
	public PartidaFutebol salvar (PartidaFutebol partf)
	{
		partf = partfDAO.save(partf);
		partfDAO.closeEntityManager();
		return partf;
	}
	
	public List<PartidaFutebol> getPartidaFutebol()
	{
		List <PartidaFutebol> list = partfDAO.getall(PartidaFutebol.class);
		partfDAO.closeEntityManager();
		return list;
	}
	
	public void alterar (PartidaFutebol partf)
	{
		partfDAO.save(partf);
		partfDAO.closeEntityManager();
	}
	
	public void remover (PartidaFutebol partf)
	{
		partf = partfDAO.getById(PartidaFutebol.class, partf.getNumero());
		partfDAO.remove(partf);
		partfDAO.closeEntityManager();
	}
	
}