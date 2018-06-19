package sistema.service;

import Classes.Grupo;
import sistema.daos.GrupoDAO;

import java.util.List;

public class GrupoService
{
	
	GrupoDAO groupDAO = new GrupoDAO();
	
	public Grupo salvar(Grupo group)
	{
		group = groupDAO.save(group);
		groupDAO.closeEntityManager();
		return group;
	}
	
	public List<Grupo> getGrupo(){
		List <Grupo> lista = groupDAO.getAll(Grupo.class);
		groupDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar (Grupo group)
	{
		groupDAO.save(group);
		groupDAO.closeEntityManager();
	}
	
	public void remover (Grupo group) 
	{
		group = groupDAO.getById(Grupo.class, group.getId());
		groupDAO.remove(group);
		groupDAO.closeEntityManager();
	}

}
