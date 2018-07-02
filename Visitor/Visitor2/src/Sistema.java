
import arvore.ArvoreBinaria;
import visitor.ExibirEmOrdemVisitor;
import visitor.ExibirEmPosOrdem;
import visitor.ExibirEmPreOrdem;

public class Sistema {

    public static void main(String[] args) throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria("F");

        arvore.inserir("G");
        arvore.inserir("I");
        arvore.inserir("H");
        arvore.inserir("B");
        arvore.inserir("A");
        arvore.inserir("D");
        arvore.inserir("C");
        arvore.inserir("E");

        System.out.println("Exibir em ordem");
        ExibirEmOrdemVisitor v1 = new ExibirEmOrdemVisitor();
        arvore.accept(v1);
        
        System.out.println("Exibir pré ordem");
        ExibirEmPreOrdem v2 = new ExibirEmPreOrdem();
        arvore.accept(v2);
        
        System.out.println("Exibir em pós ordem");
        ExibirEmPosOrdem v3 = new ExibirEmPosOrdem();
        arvore.accept(v3);
    }

}
