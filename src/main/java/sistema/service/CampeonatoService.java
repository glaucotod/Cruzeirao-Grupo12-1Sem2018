package sistema.service;

import Classes.Campeonato;
import Classes.Inscrito;
import sistema.daos.CampDAO;

import java.util.List;

public class CampeonatoService
{
	
	CampDAO campDAO = new CampDAO();
	
	public Campeonato salvar(Campeonato camp)
	{
		camp = campDAO.save(camp);
		campDAO.closeEntityManager();
		return camp;
	}
	
	public List<Campeonato> getCamp(){
		List <Campeonato> lista = campDAO.getAll(Campeonato.class);
		campDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar (Campeonato camp)
	{
		campDAO.save(camp);
		campDAO.closeEntityManager();
	}
	
	public void remover (Campeonato camp) // EXCLUSÃO DO CAMPEONATO
	{
		camp = campDAO.getById(Campeonato.class, camp.getId());
		campDAO.remove(camp);
		campDAO.closeEntityManager();
	}

}
