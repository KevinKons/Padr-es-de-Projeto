public class Main {
    
    public static void main(String[] args) {
        Revista r1 = new Revista("r1");
        Revista r2 = new Revista("r2");
        
        Assinante a1 = new Assinante("a1", "");
        Assinante a2 = new Assinante("a2", "");
        Assinante a3 = new Assinante("a3", "");
        Assinante a4 = new Assinante("a4", "");
        
        WebSite ws = new WebSite("ws");
        
        r1.anexar(a1);
        r1.anexar(a2);
        r1.anexar(a3);
        
        r2.anexar(a2);
        r2.anexar(a4);
        
        r1.anexar(ws);
        r2.anexar(ws);
        
        r1.lancarNovaEdicao(0);
        r1.getEdicoes().get(r1.getEdicoes().size() -1).addArtigos(new Artigo("T1"));
        r1.getEdicoes().get(r1.getEdicoes().size() -1).addArtigos(new Artigo("T2"));
        
        r2.lancarNovaEdicao(1);
        r2.getEdicoes().get(r2.getEdicoes().size() -1).addArtigos(new Artigo("T3"));
        r2.getEdicoes().get(r2.getEdicoes().size() -1).addArtigos(new Artigo("T4"));
        r2.getEdicoes().get(r2.getEdicoes().size() -1).addArtigos(new Artigo("T5"));
    }
    
}
