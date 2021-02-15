package main;

public class variables {

    private static float insuranceValue;
    public static int numberDaysRent;
    private static float rentValue;
    public static float rentClause;
    
    public static float getInsuranceValue() {
        return insuranceValue;
    }

    public static float getRentValue() {
        return rentValue;
    }
    public static float getClauseValue() {
        return rentClause;
    }
    public static int getNumberDaysRent(){
        return numberDaysRent;
    }

    // Alpha 2.0

    // private static String temporaryBackend() {
        

    //     System.out.printf("Choose the car you want, insert the number of the car: ");
    //     System.out.printf("Available: ");

    //     System.out.printf("Renault Clio V - 60€  (Day) Number 1");

    //     System.out.printf("Mercedes Classe A200  - 100€  (Day) Number 2");

    //     System.out.printf("Volkswagen Golf - 65€ (Day) Number 3");

    // }

    // public static String getBackend() {
    //     return temporaryBackend();
    // }

    String[] agencys = {"Porto, Aveiro, Coimbra, Lisboa, Faro"};

}
