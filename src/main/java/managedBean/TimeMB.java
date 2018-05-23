package ManagedBean;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Classes.Equipe;


@ManagedBean
@SessionScoped

public class TimeMB 
{
		private Equipe  time = new Equipe();
		
		public Equipe salvar (Equipe time)
		{
			time = timeDAO.save(time);
			timeDAO.closeEntityManager();
			return time;
		}
		
		public List<Equipe> getTime()
		{
			List <Equipe> list = timeDAO.getall(Equipe.class);
			timeDAO.closeEntityManager();
			return list;
		}
		
		public void alterar (Equipe time)
		{
			timeDAO.save(time);
			timeDAO.closeEntityManager();
		}
		
		public void remover (Equipe time) // EXCLUSAO DA EQUIPE
		
		{
			time = timeDAO.getById(Equipe.class, time.getnome());
			timeDAO.remove(time);
			timeDAO.closeEntityManager();
		}
}