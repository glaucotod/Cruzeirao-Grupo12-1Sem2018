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
			cat = catDAO.save(cat);
			cat.closeEntityManager();
			return cat;			
		}
		
		public void remover(Categoria cat)
		{
			cat = catDAO.getall(Categoria.class);
			catDAO.remove(cat);
			catDAO.closeEntityManager();			
		}
		
		public List<Categoria> getCategoria(){
			List <Campeonato> lista = catDAO.getall(Campeonato.class);
			catDAO.closeEntityManager();
			return lista();
		}
		
		public void alterar(Categoria cat)
		{
			catDAO.save(cat);
			catDAO.closeEntiyManager();
		}
		
}
