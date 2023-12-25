
package appclinica;

import java.time.LocalDateTime;

public class Cita {


    private int codCita;
    private LocalDateTime fecha;
    private Paciente nombrePaciente;
    private boolean Prioridad;
    private boolean atendido;
    
    public static int id=0;
    public static MiListaEnlazada<Cita> ListaCitas=new MiListaEnlazada<Cita>();
    
    
    public Cita(LocalDateTime fecha, Paciente nombrePaciente, Boolean prioridad) {
        this.fecha = fecha;
        this.nombrePaciente = nombrePaciente;
        this.Prioridad=prioridad;
        this.codCita=id;
        atendido=false;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }
    public void asignarNumeroCita(){
        codCita=id;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Paciente getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(Paciente nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public boolean isPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(boolean Prioridad) {
        this.Prioridad = Prioridad;
    }

    @Override
    public String toString() {
        return "Cita{" + "codCita=" + codCita + ", fecha=" + fecha + ", nombrePaciente=" + nombrePaciente.getNombre() + ", Prioridad=" + Prioridad + " Esta Atendido=" + atendido + '}';
    }
    
    
}

