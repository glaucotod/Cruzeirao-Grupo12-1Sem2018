package ManagedBean;

import Classes.Campeonato;
import system.dao.CampDAO;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CampeonatoMB {
	
	private Campeonato camp = new Campeonato();
	
	public Campeonato salvar(Campeonato camp)
	{
		camp = CampDAO.save(camp);
		CampDAO.closeEntityManager();
		return camp;
	}
	
	public List<Campeonato> getCamp(){
		List <Campeonato> lista = CampDAO.getall(Campeonato.class);
		CampDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar (Campeonato camp)
	{
		CampDAO.save(camp);
		CampDAO.closeEntityManager();
	}
	
	public void remover (Campeonato camp) // EXCLUSÃO DO CAMPEONATO
	{
		camp = CampDAO.getById(Campeonato.class, camp.getNome());
		CampDAO.remove(camp);
		CampDAO.closeEntityManager();
	}

}
