
package Model;

import java.time.LocalDate;

/**
 *
 * @author Avell
 */
public class Consulta {
    
    private Animal animal;
    private String veterinario;
    private LocalDate date;
    private double horaInicio;
    private double horaFim;

    public Consulta() {
    }

    public Consulta(Animal animal, String veterinario, LocalDate date, double horaInicio, double horaFim) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.date = date;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public double getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(double horaFim) {
        this.horaFim = horaFim;
    }
    
    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    
    
    
    
}
