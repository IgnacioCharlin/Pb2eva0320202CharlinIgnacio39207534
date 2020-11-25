package EDA3.Pb2eva0320202CCharlinIgnacio39207534.src.ar.edu.unlam.pb220202c.eva03;

public class Vehiculo implements Imultable{

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;
	
	
	public Vehiculo(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		super();
		Patente = patente;
		VelocidadActual = velocidadActual;
		this.limiteVelocidad = limiteVelocidad;
	}

	public void incrmentarVelocidad(Integer Velocidad) {
		
	}

	public String getPatente() {
		return Patente;
	}
	@Override
    public Boolean enInfraccion() {
        if(this.VelocidadActual> this.limiteVelocidad)
            return true;

        return false;
    }

	public void setPatente(String patente) {
		Patente = patente;
	}

	public Integer getVelocidadActual() {
		return VelocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}

	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}

	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}
	
}
