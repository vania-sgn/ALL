package laba6;

public class Main {
    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation(3);
        taxiStation.add(new Porschee(52, 3,5000));
        taxiStation.add(new Lada(16, 4,6000));
        taxiStation.add(new Subaru(34, 3,5000));
        //Cars proposition = taxiStation.findProposition(10);
        //System.out.println(proposition);
        System.out.println("Наш таксопарк:");
        System.out.println(taxiStation);
        taxiStation.SumCost();


        System.out.println("-------------------------------------------------------------");
        System.out.println("Сортируем наш таксопарк по расходу топлива:");
        taxiStation.SortedFuelReduce();
        System.out.println( taxiStation);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Выводим машину по заданому колличеству расхода топлива :");
        taxiStation.findProposition(16,34);

    }
}