package personagens;

import Visitor.VisitorAtaque;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(15, 2);
    }

    @Override
    public void receberAtaque(VisitorAtaque visitor) {
        visitor.visit();
    }

}
