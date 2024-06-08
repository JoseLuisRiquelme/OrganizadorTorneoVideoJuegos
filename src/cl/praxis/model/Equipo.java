package cl.praxis.model;

import java.util.ArrayList;

public class Equipo {

    private String nombre;

    int puntos;
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {}

    public Equipo(String nombre, int puntos, ArrayList<Jugador> listaJugadores) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.listaJugadores = listaJugadores;
    }

    public  void agregarJugador(Jugador jugador, ArrayList<Jugador> listaJugadores){
        listaJugadores.add(jugador);
        setListaJugadores(listaJugadores);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
