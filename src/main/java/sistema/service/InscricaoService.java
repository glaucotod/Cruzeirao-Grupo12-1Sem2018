package sistema.service;

import Classes.Inscricao;
import sistema.daos.InscricaoDAO;

public class InscricaoService {
	
	InscricaoDAO inscricaoDAO = new InscricaoDAO();	
	
	
	public Inscricao salvar(Inscricao insc)
	{
		inscricaoDAO.save(insc);
		inscricaoDAO.closeEntityManager();
		return insc;
	}
	
	public void remover(Inscricao insc)
	{
		insc = inscricaoDAO.getById(Inscricao.class, insc.getNumero());
		inscricaoDAO.remove(insc);
		inscricaoDAO.closeEntityManager();
	}	
	
	

}
