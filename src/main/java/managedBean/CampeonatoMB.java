package managedBean;

import Classes.Campeonato;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CampeonatoMB {
	
	private Campeonato camp = new Campeonato();
	
	public Campeonato salvar(Campeonato camp)
	{
		camp = campDAO.save(camp);
		campDAO.closeEntityManager();
		return camp;
	}
	
	public List<Campeonato> getCamp(){
		List <Campeonato> lista = campDAO.getall(Campeonato.class);
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
		camp = campDAO.getById(Campeonato.class, camp.getNome());
		campDAO.remove(camp);
		campDAO.closeEntityManager();
	}

}
