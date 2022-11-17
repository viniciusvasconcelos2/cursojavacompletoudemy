package desafios.classeData;

import java.util.Calendar;

public class Data {
    int dia;
    int mes;
    int ano;

    public static int converteEmDias(int dia,int mes,int ano){
        Calendar dataAtual = Calendar.getInstance();
        int tempoTotaldeVida = (dataAtual.get(Calendar.YEAR) - ano)*365;
        tempoTotaldeVida = tempoTotaldeVida + ((dataAtual.get(Calendar.MONTH)-mes)*30);
        tempoTotaldeVida = tempoTotaldeVida + (dataAtual.get(Calendar.DAY_OF_MONTH)-dia);
        return tempoTotaldeVida;


    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes='" + mes + '\'' +
                ", ano=" + ano +
                '}';
    }


}
