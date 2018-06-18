package sistema.service;

import javax.persistence.EntityManager;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Inscrito;
import sistema.daos.InscDAO;


public class InscritoService {
	
	InscDAO inscDAO = new InscDAO();
	
	public Inscrito salvar(Inscrito insc)
	{
		insc = inscDAO.save(insc);
		inscDAO.closeEntityManager();
		return insc;
	}
	
	public List<Inscrito> getCamp(){
		List <Inscrito> lista = inscDAO.getAll(Inscrito.class);
		inscDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar (Inscrito camp)
	{
		inscDAO.save(camp);
		inscDAO.closeEntityManager();
	}
	
	public void remover (Inscrito camp) // EXCLUSÃO DO CAMPEONATO
	{
		camp = inscDAO.getById(Inscrito.class, camp.getId());
		inscDAO.remove(camp);
		inscDAO.closeEntityManager();
	}

}
