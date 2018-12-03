
public class WebSite implements ObservadorRevista{
    
    private String url;

    public WebSite(String url) {
        this.url = url;
    }

    @Override
    public void atualizar(Revista revista) {
        System.out.println("WebSite: " + url + "\n"
                + "Revista: " + revista.getNome() + "\n"
                + "Edição: " + revista.getEdicoes().get(revista.getEdicoes().size() -1).getNumero());
        for(Artigo a : revista.getEdicoes().get(revista.getEdicoes().size() -1).getArtigos()) {
            System.out.println("Artigo: " + a.getNome());
        }
    }
}
