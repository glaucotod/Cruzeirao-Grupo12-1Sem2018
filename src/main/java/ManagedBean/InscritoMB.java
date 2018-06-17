package managedBean;

import javax.persistence.EntityManager;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Inscrito;

@ManagedBean
@SessionScoped

public class InscritoMB {
	
private Inscrito insc = new Inscrito();
	
	public Inscrito salvar(Inscrito insc)
	{
		insc = inscDAO.save(insc);
		inscDAO.closeEntityManager();
		return insc;
	}
	
	public List<Inscrito> getCamp(){
		List <Inscrito> lista = inscDAO.getall(Inscrito.class);
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
		insc = inscDAO.getById(Inscrito.class, insc.getNome());
		inscDAO.remove(camp);
		inscDAO.closeEntityManager();
	}

	public Inscrito getInscrito() {
		return insc;
	}

	public void setInscrito(Inscrito insc) {
		this.insc = insc;
	}

}
