package sistema.service;

import java.util.List;

import Classes.Cartao;
import sistema.daos.CartaoDAO;

public class CartaoService {
	
	CartaoDAO cartaoDAO = new CartaoDAO();
	
	public Cartao salvar(Cartao cartao)
	{
		cartao = cartaoDAO.save(cartao);
		cartaoDAO.closeEntityManager();
		return cartao;
	}
	
	public List<Cartao> getCartao()
	{
		List<Cartao> lista = cartaoDAO.getAll(Cartao.class);
		cartaoDAO.closeEntityManager();
		return lista;
	}
	
	public void alterar(Cartao cartao)
	{
		cartaoDAO.save(cartao);
		cartaoDAO.closeEntityManager();
	}
	
	public void remover(Cartao cartao)
	{
		cartao = cartaoDAO.getById(Cartao.class, cartao.getId());
		cartaoDAO.remove(cartao);
		cartaoDAO.closeEntityManager();
	}

}
