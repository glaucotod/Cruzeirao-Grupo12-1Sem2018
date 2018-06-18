package Classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Inscricao implements Serializable
{
	@Id
	private long numero;
	private boolean pagamento, validada;
	@ManyToMany
	private List<Inscrito> inscritos;
	@ManyToOne
	private Categoria categoria;
	@ManyToMany
	private List<Partida> partidas;
	
	public int getNumero() {
		return (int) numero;
	}
	
	public void setNumero(long numero) 
	{
		this.numero = numero;
	}
	
	
	public boolean isPagamento() 
	{
		return pagamento;
	}
	
	public void setPagamento(boolean pagamento) 
	{
		this.pagamento = pagamento;
	}
	
	
	public boolean isValidada() 
	{
		return validada;
	}
	
	public void setValidada(boolean validada) 
	{
		this.validada = validada;
	}
	
	
	public List<Inscrito> getInscritos() 
	{
		return inscritos;
	}
	
	public void setInscritos(List<Inscrito> inscritos) 
	{
		this.inscritos = inscritos;
	}
	
	
	public Categoria getCategoria() 
	{
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) 
	{
		this.categoria = categoria;
	}
	
	
	public List<Partida> getPartidas() 
	{
		return partidas;
	}
	
	public void setPartidas(List<Partida> partidas) 
	{
		this.partidas = partidas;
	}
	
	
}
