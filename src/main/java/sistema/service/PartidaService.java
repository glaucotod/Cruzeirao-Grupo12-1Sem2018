package sistema.service;

import java.util.List;
import Classes.Partida;
import Classes.PartidaFutebol;
import sistema.daos.PartDAO;
import sistema.daos.PartfDAO;


public class PartidaService
{
	PartDAO partDAO = new PartDAO();
	PartfDAO partfDAO = new PartfDAO();
	
	public Partida salvar (Partida part)
	{
		part = partDAO.save(part);
		partDAO.closeEntityManager();
		return part;
	}
	
	public List<Partida> getPartida()
	{
		List <Partida> list = partDAO.getAll(Partida.class);
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
		List <PartidaFutebol> list = partfDAO.getAll(PartidaFutebol.class);
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