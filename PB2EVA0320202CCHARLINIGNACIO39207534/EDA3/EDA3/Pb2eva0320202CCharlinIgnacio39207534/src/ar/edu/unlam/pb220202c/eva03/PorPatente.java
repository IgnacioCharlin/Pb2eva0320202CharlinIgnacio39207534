package EDA3.Pb2eva0320202CCharlinIgnacio39207534.src.ar.edu.unlam.pb220202c.eva03;

import java.util.Comparator;

public class PorPatente implements Comparator<Vehiculo>{

    @Override
    public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        // TODO Auto-generated method stub
        return vehiculo1.getPatente().compareTo(vehiculo2.getPatente());
    }
}
