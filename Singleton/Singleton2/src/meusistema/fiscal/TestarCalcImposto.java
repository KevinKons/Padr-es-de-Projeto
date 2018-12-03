package meusistema.fiscal;

public class TestarCalcImposto {

    public static void main(String[] args) {
        CalcImposto ci = CalcImposto.getInstance();
        System.out.println(ci.calcImposto(100, 5));
    }

}
