package EDA3.Pb2eva0320202CCharlinIgnacio39207534.src.ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista{
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	private TreeSet<Vehiculo> vehiculosEnInfraccion;
	
	
	public Autopista() {
		super();
		telepase = new HashMap<>();
		vehiculosEnCirculacion = new HashSet<>();
		vehiculosEnInfraccion = new TreeSet<>();
	}
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		if(!telepase.containsKey(numeroTelpase) && !telepase.containsValue(vehiculo)) {
	        telepase.put(numeroTelpase, vehiculo);
	        return true;
	        }
	        return false;
	}
	public Boolean ingresarAutopista (Integer numeroTelepase)throws VehiculoNotFounException  {
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista	
		Boolean sePudo = false;
		if (!telepase.containsKey(numeroTelepase)) {
			throw new VehiculoNotFounException();
		}else {
			vehiculosEnCirculacion.add(telepase.get(numeroTelepase));
			sePudo = true;
		}
		
		return sePudo;
	}
	
	public void salirAutpista (Vehiculo vehiculo)throws VehiculoNotFounException {
		if (!vehiculosEnCirculacion.contains(vehiculo)) {
			throw new VehiculoNotFounException();
		}else {
			vehiculosEnCirculacion.remove(vehiculo);
		}
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
        PorPatente ordenador = new PorPatente();
        TreeSet<Vehiculo> vehiculosPorPatente = new TreeSet<Vehiculo>(ordenador);
        vehiculosPorPatente.addAll(vehiculosEnInfraccion);
        return vehiculosPorPatente;
    }
	

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return cantidadDeVehiculosENCirculacion().SIZE;
	}
	public HashSet<Vehiculo> getVehiculosEnCirculacion() {
		return vehiculosEnCirculacion;
	}
	public void setVehiculosEnCirculacion(HashSet<Vehiculo> vehiculosEnCirculacion) {
		this.vehiculosEnCirculacion = vehiculosEnCirculacion;
	}
	
	
}
