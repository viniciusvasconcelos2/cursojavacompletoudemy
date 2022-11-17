package desafios.classeData;

public class DataTeste {
    public static void main (String[]args){

        Data data1 = new Data();
        data1.ano = 1999;
        data1.mes = 6;
        data1.dia = 1;

        Data data2 = new Data();
        data2.ano = 2020;
        data2.mes = 1;
        data2.dia = 15;

//        var data3 = new  Data(); var é no java10 parece que o meu é 8!
        Data data3 = new Data();
        data3.dia = 22;
        data3.mes = 10;
        data3.ano = 1947;

        Data data4 = new Data();
        data4.ano = 1985;
        data4.mes = 6;
        data4.dia = 25;

        Data data5 = new Data();
        data5.ano = 1989;
        data5.mes = 4;
        data5.dia = 18;

        System.out.println(data1);
        System.out.printf("%d/%s/%d\n",data2.dia,data2.mes,data2.ano);
        System.out.println(data3);

        System.out.println("total de dias vividos até agora: "+ Data.converteEmDias(data3.dia,data3.mes,data3.ano) + " dias");


    }
}
