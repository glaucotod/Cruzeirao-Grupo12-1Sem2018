package Classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inscricao implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long numero;
	private boolean pagamento, validada;
	private List<Inscrito> inscritos;
	private Categoria categoria;
	private List<Partida> partidas;
	
	public long getNumero() {
		return numero;
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
