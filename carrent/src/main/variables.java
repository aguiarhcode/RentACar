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

    String[] agencys = {"Porto, Aveiro, Coimbra, Lisboa, Faro"};

}
