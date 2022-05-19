package modelo.dao.reserva;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fecha;
    private int duracion;
    private int horaEntrada;
    private TipoReserva tipo = TipoReserva.GUIADA;
    private int id_usuario;

    public Reserva(LocalDate fecha, int duracion, int horaEntrada, int id_usuario) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.horaEntrada = horaEntrada;
        this.id_usuario = id_usuario;
    }

    public Reserva() {
    }

    public Reserva(LocalDate now, int duracion, int horaEntrada, String s) {
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public TipoReserva getTipo() {
        return tipo;
    }

    public void setTipo(TipoReserva tipo) {
        this.tipo = tipo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    /*public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }*/

    @Override
    public String toString() {
        return String.format("%s,%d,%d,%s,%d",fecha,duracion,horaEntrada,tipo,id_usuario);

    }

    public Object getTipoReserva() {
        return null;
    }

    public String getDniUsuario() {
        return null;
    }

    public void setTipoReserva(TipoReserva tipoReserva) {
    }
}