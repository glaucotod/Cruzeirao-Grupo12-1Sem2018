package Classes;

import javax.persistence.Entity;


@Entity
public class Local extends Partida
{
	String endereco;

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	
}
