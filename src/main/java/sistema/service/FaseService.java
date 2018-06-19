package sistema.service;

import java.util.List;

import Classes.Fase;
import sistema.daos.FaseDAO;

public class FaseService
{
	FaseDAO faseDAO = new FaseDAO();
	
	
	public Fase salvar(Fase fase)
	{
		fase = faseDAO.save(fase);
		faseDAO.closeEntityManager();
		return fase;
	}
	
	public List<Fase> getFase()
	{
		List <Fase> lista = faseDAO.getAll(Fase.class);
		faseDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar(Fase fase)
	{
		faseDAO.save(fase);
		faseDAO.closeEntityManager();
	}
	
	public void remover(Fase fase)
	{
		fase = faseDAO.getById(Fase.class, fase.getId());
		faseDAO.remove(fase);
		faseDAO.closeEntityManager();
	}

}
