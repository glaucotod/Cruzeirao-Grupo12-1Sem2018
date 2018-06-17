package ManagedBean;

import Classes.Campeonato;
import Classes.Categoria;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CategoriaMB {

		private Categoria cat = new Categoria();
		
		public Categoria salvar(Categoria cat)
		{
			cat = CatDAO.save(cat);
			cat.closeEntityManager();
			return cat;			
		}
		
		public void remover(Categoria cat)
		{
			cat = CatDAO.getall(Categoria.class);
			CatDAO.remove(cat);
			CatDAO.closeEntityManager();			
		}
		
		public List<Categoria> getCategoria(){
			List <Campeonato> lista = CatDAO.getall(Campeonato.class);
			CatDAO.closeEntityManager();
			return lista();
		}
		
		public void alterar(Categoria cat)
		{
			CatDAO.save(cat);
			CatDAO.closeEntiyManager();
		}
		
}
