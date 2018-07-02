
import java.util.ArrayList;
import java.util.List;

public class Orgao extends Participante {

    private List<Participante> membros = new ArrayList<>();

    public void add(Participante participante) {
        membros.add(participante);
    }

    public void remove(Participante participante) {
        membros.remove(participante);
    }

    public Participante getParticipante(int index) {
        return membros.get(index);
    }

    @Override
    public boolean votarSecao(int numSecao) {
        int votosAFavor = 0;
        int votosContra = 0;
        for(Participante p : membros) {
            if(p.votarSecao(numSecao)) {
                votosAFavor++;
            } else {
                votosContra++;
            }
        } 
        if(votosAFavor > votosContra) {
            return true;
        } else {
            return false;
        }
    }

}
