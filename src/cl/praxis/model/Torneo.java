package cl.praxis.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Torneo {

    private HashMap<String, Equipo> equipos;

    private ArrayList<String> resultadoPartidos;

    public Torneo() {}

    public Torneo(HashMap<String, Equipo> equipos, ArrayList<String> resultadoPartidos) {
        this.equipos = equipos;
        this.resultadoPartidos = resultadoPartidos;
    }

    public void agregarEquipo(HashMap equipos, String nombre,Equipo equipo){
        equipos.put(nombre,equipo);
        setEquipos(equipos);
    }

    public void agregarJugador(Jugador jugador,ArrayList<Jugador> listaJugadores){
         Equipo equipo = new Equipo();
         equipo.agregarJugador(jugador,listaJugadores);
    }

    public void registrarResultado(){

    }

    public HashMap<String, Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashMap<String, Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<String> getResultadoPartidos() {
        return resultadoPartidos;
    }

    public void setResultadoPartidos(ArrayList<String> resultadoPartidos) {
        this.resultadoPartidos = resultadoPartidos;
    }
}


