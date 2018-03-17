package Classes;

import java.util.List;

public class PartidaFutebol 
{
	List<Gol> golsmandante, golsvisitantes, golspenaltesmandantes, golspenaltesvisitantes;
	List<Cartao> cartoesmandante, cartoesvisitantes;
	
	
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

