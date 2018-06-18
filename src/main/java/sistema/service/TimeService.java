package sistema.service;

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
			time = TimeDAO.save(time);
			TimeDAO.closeEntityManager();
			return time;
		}
		
		public List<Equipe> getTime()
		{
			List <Equipe> list = TimeDAO.getall(Equipe.class);
			TimeDAO.closeEntityManager();
			return list;
		}
		
		public void alterar (Equipe time)
		{
			TimeDAO.save(time);
			TimeDAO.closeEntityManager();
		}
		
		public void remover (Equipe time)
		{
			time = TimeDAO.getById(Equipe.class, time.getNome());
			TimeDAO.remove(time);
			TimeDAO.closeEntityManager();
		}
}
