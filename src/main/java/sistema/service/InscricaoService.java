package sistema.service;

import java.util.ArrayList;
import java.util.List;

import Classes.Inscricao;
import Classes.Inscrito;

import managedbean.ManagedBean;
import managedbean.SessionScoped;

@SessionScoped
@ManagedBean

public class InscricaoMB {
	
	private Inscricao lista = new Inscricao();
	
	public Inscricao getLista() 
	{		
		return lista;	
	}

	public void setLista(Inscricao lista) 
	{
		this.lista = lista;
	}	

	
	public Inscricao salvar(Inscricao incricao)
	{
		ListaDAO.save(inscricao);
		inscricao.closeEntityManager();
		return inscricao;
	}
	
	public void remover(Inscricao inscricao)
	{
		lista = ListaDAO.getById(Inscricao.class, lista.getNumero());
		ListaDAO.remove(lista);
		ListaDAO.closeEntityManager();
	}	
	
	

}
