package sistema.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import Classes.Equipe;
import sistema.daos.TimeDAO;


public class TimeService 
{
		TimeDAO timeDAO = new TimeDAO();
		
		public Equipe salvar (Equipe time)
		{
			time = timeDAO.save(time);
			timeDAO.closeEntityManager();
			return time;
		}
		
		public List<Equipe> getTime()
		{
			List <Equipe> list = timeDAO.getAll(Equipe.class);
			timeDAO.closeEntityManager();
			return list;
		}
		
		public void alterar (Equipe time)
		{
			timeDAO.save(time);
			timeDAO.closeEntityManager();
		}
		
		public void remover (Equipe time)
		{
			time = timeDAO.getById(Equipe.class, time.getIdequipe());
			timeDAO.remove(time);
			timeDAO.closeEntityManager();
		}
}
