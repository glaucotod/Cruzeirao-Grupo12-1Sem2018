package Classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PartidaFutebol 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPartidaFutebol;
	@ManyToMany
	private List<Gol> golsmandante;
	@ManyToMany
	private List<Gol> golsvisitantes;
	@ManyToMany
	private List<Gol> golspenaltesmandantes;
	@ManyToMany
	private List<Gol> golspenaltesvisitantes;
	@ManyToMany
	private List<Cartao> cartoesmandante; 
	@ManyToMany
	private List<Cartao> cartoesvisitantes;
	
	
	public List<Gol> getGolsmandante() 
	{
		return golsmandante;
	}
	
	public void setGolsmandante(List<Gol> golsmandante) 
	{
		this.golsmandante = golsmandante;
	}
	
	
	public List<Gol> getGolsvisitantes() 
	{
		return golsvisitantes;
	}
	
	public void setGolsvisitantes(List<Gol> golsvisitantes) 
	{
		this.golsvisitantes = golsvisitantes;
	}
	
	
	public List<Gol> getGolspenaltesmandantes() 
	{
		return golspenaltesmandantes;
	}
	
	public void setGolspenaltesmandantes(List<Gol> golspenaltesmandantes) 
	{
		this.golspenaltesmandantes = golspenaltesmandantes;
	}
	
	
	public List<Gol> getGolspenaltesvisitantes() 
	{
		return golspenaltesvisitantes;
	}
	
	public void setGolspenaltesvisitantes(List<Gol> golspenaltesvisitantes) 
	{
		this.golspenaltesvisitantes = golspenaltesvisitantes;
	}
	
	
	public List<Cartao> getCartoesmandante() 
	{
		return cartoesmandante;
	}
	
	public void setCartoesmandante(List<Cartao> cartoesmandante) 
	{
		this.cartoesmandante = cartoesmandante;
	}
	
	
	public List<Cartao> getCartoesvisitantes() 
	{
		return cartoesvisitantes;
	}
	
	public void setCartoesvisitantes(List<Cartao> cartoesvisitantes) 
	{
		this.cartoesvisitantes = cartoesvisitantes;
	}
	
}

