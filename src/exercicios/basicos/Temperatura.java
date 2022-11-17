package exercicios.basicos;

public class Temperatura {
    public static void main(String [] args){
        // (*F-32)*(5/9)=ºC
        double F= 150;
        double C;
        final int ajuste = 32;
        final double K = 5.0/9;
        C = (F-ajuste)*(K);
        System.out.println(C);

    }
}
