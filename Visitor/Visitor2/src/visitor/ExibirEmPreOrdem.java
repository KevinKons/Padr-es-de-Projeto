package visitor;

import arvore.Noh;

/**
 *
 * @author Avell
 */
public class ExibirEmPreOrdem implements ArvoreVisitor {

    @Override
    public void visit(Noh noh) throws Exception {
        if(noh == null) {
            return;
        } 
        System.out.println(noh);
        this.visit(noh.getEsquerdo());
        this.visit(noh.getDireito());
    }
    
}
