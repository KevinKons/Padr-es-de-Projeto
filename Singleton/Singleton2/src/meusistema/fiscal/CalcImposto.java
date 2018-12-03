package meusistema.fiscal;

public class CalcImposto {

    private CalcImposto() {}
    
    private static CalcImposto instance;
    
    public synchronized static CalcImposto getInstance() {
        if(instance == null)
            instance = new CalcImposto();
        
        return instance;
    } 
    
    public float calcImposto(float valor, float aliquota) {
        return valor * aliquota / 100;
    }

}
