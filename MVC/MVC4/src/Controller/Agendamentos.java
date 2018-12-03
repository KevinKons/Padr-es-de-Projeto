package Controller;

import Model.Animal;
import Model.Consulta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Avell
 */
public class Agendamentos implements AgendamentosControle {

    private List<Observador> observadores = new ArrayList<>();
    private Consulta consulta;
    private List<Consulta> consultas = new ArrayList<>();
    private List<Animal> animais = new ArrayList<>();

    public Agendamentos() {
        animais.add(new Animal(1, "Maggie", "Eliete"));
        animais.add(new Animal(2, "Belinha", "Kevin"));
        animais.add(new Animal(3, "Nina", "Arildo"));
        animais.add(new Animal(4, "Ana Julha", "Kevin"));
        animais.add(new Animal(5, "Missy", "Camilla"));

        consultas.add(new Consulta(animais.get(1), "José", LocalDate.of(1999, 9, 9), 16, 17));
        consultas.add(new Consulta(animais.get(2), "José", LocalDate.of(1999, 9, 9), 8, 9));
        consultas.add(new Consulta(animais.get(3), "José", LocalDate.of(1999, 9, 9), 7, 8));
    }

    @Override
    public void iniciarAgendamento() {
        consulta = new Consulta();
        for(Observador o : observadores) {
            o.notificarInicioDeConsulta();
        }
    }

    @Override
    public void buscar(long id) {
        for (Animal a : animais) {
            if (a.getId() == id) {
                consulta.setAnimal(a);
                for (Observador o : observadores) {
                    o.setInformacoes(a);
                }
            }
        }
    }

    List<String> horarios;
    @Override
    public void setData(LocalDate data) {
        horarios = new ArrayList<>();
        consulta.setDate(data);

        List<Consulta> consultasNoMsmDia = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getDate().equals(data)) {
                consultasNoMsmDia.add(c);
            }
        }

        if (consultasNoMsmDia.size() != 0) {

            Collections.sort(consultasNoMsmDia, new Comparator<Consulta>() {
                @Override
                public int compare(Consulta o1, Consulta o2) {
                    return Double.compare(o1.getHoraInicio(), o2.getHoraFim());
                }
            });

            int index = 0;
            Consulta c = consultasNoMsmDia.get(index);
            for (int i = 7; i <= 18; i++) {
                if (index == consultasNoMsmDia.size()) {
                    String x = i + ":00-" + (i + 1) + ":00  Livre";
                    System.out.println(x);
                    horarios.add(x);
                } else if (c.getHoraInicio() <= i) {
                    String x = String.format("%,.2f", c.getHoraInicio()) + "-" + String.format("%,.2f", c.getHoraFim()) + "  Ocupado";
                    x = x.replaceAll(",", ":");
                    System.out.println(x);
                    horarios.add(x);
                    index++;
                    if (index != consultasNoMsmDia.size()) {
                        c = consultasNoMsmDia.get(index);
                    }
                } else {
                    String x = i + ":00-" + (i + 1) + ":00  Livre";
                    System.out.println(x);
                    horarios.add(x);
                }
            }
        } else {
            for (int i = 7; i <= 18; i++) {
                String x = i + ":00-" + (i + 1) + ":00  Livre";
                System.out.println(x);
                horarios.add(x);
            }
        }

        for (Observador o : observadores) {
            for (String s : horarios) {
                o.notificaDataEscolhida(s);
            }
        }
    }

    @Override
    public void finalizaAgendamento(int horarioSelecionado) {
        if (horarios.get(horarioSelecionado).contains("Ocupado")) {
            for (Observador o : observadores) {
                o.notificarHorarioOcupado();
            }
        } else {
            consulta.setHoraInicio(horarioSelecionado+ 7);
            consulta.setHoraFim(horarioSelecionado + 8);
            consultas.add(consulta);
            for(Observador o : observadores) {
                o.limparCampos();
            }
            consulta = null;
            horarios = null;
        }
    }

    @Override
    public void addObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public List<String> getAgendamentosDoDia(LocalDate data) {

        return null;
    }

}
