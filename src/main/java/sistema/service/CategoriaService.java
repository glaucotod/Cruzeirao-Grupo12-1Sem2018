package sistema.service;

import Classes.Categoria;
import sistema.daos.CatDAO;

import java.util.List;


public class CategoriaService {

		CatDAO catDAO = new CatDAO();
		
		public Categoria salvar(Categoria cat)
		{
			cat = catDAO.save(cat);
			catDAO.closeEntityManager();
			return cat;			
		}
		
		public void remover(Categoria cat)
		{
			cat = catDAO.getById(Categoria.class, cat.getId());
			catDAO.remove(cat);
			catDAO.closeEntityManager();			
		}
		
		public List<Categoria> getCategoria(){
			List <Categoria> lista = catDAO.getAll(Categoria.class);
			catDAO.closeEntityManager();
			return lista;
		}
		
		public void alterar(Categoria cat)
		{
			catDAO.save(cat);
			catDAO.closeEntityManager();
		}
		
}
