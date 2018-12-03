
public class Assinante implements ObservadorRevista {

    private String nome;
    private String endereco;

    public Assinante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    
    @Override
    public void atualizar(Revista revista) {
        System.out.println("Nome: " + nome + "\n"
                + "Revista: " + revista.getNome() + "\n"
                + "Edição: " + revista.getEdicoes().get(revista.getEdicoes().size() - 1).getNumero());
        
    }

    
}
