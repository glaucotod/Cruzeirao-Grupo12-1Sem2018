package ManagedBean;

import javax.persistence.EntityManager;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Inscrito;
import system.dao.InscDAO;

@ManagedBean
@SessionScoped

public class InscritoMB {
	
private Inscrito insc = new Inscrito();
	
	public Inscrito salvar(Inscrito insc)
	{
		insc = InscDAO.save(insc);
		InscDAO.closeEntityManager();
		return insc;
	}
	
	public List<Inscrito> getCamp(){
		List <Inscrito> lista = InscDAO.getall(Inscrito.class);
		InscDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar (Inscrito camp)
	{
		InscDAO.save(camp);
		InscDAO.closeEntityManager();
	}
	
	public void remover (Inscrito camp) // EXCLUSÃO DO CAMPEONATO
	{
		insc = InscDAO.getById(Inscrito.class, insc.getNome());
		InscDAO.remove(camp);
		InscDAO.closeEntityManager();
	}

	public Inscrito getInscrito() {
		return insc;
	}

	public void setInscrito(Inscrito insc) {
		this.insc = insc;
	}

}
