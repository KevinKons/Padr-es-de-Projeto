package visitor;

import arvore.Noh;

/**
 *
 * @author Avell
 */
public class ExibirEmPosOrdem implements ArvoreVisitor {

    @Override
    public void visit(Noh noh) throws Exception {
        if (noh == null) {
            return;
        }

        this.visit(noh.getEsquerdo());
        this.visit(noh.getDireito());
        System.out.println(noh);
    }

}
