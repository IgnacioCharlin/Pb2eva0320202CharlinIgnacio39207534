package EDA3.Pb2eva0320202CCharlinIgnacio39207534.src.ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo{
	private Integer cantidadDeEjes;
	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad , Integer cantidadDeEjes) {
		super(patente, velocidadActual, limiteVelocidad);
	}
	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}
	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	
}
