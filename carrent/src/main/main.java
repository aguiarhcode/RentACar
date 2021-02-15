package main;

import java.util.Scanner;

public class main {

    public main() {

        rentCar();
    }
    
    float insuranceValue = variables.getInsuranceValue();
    float rentValue = variables.getRentValue();
    float rentClause = variables.getClauseValue();
    int numberDaysRent = variables.getNumberDaysRent();
    int numberCarChoosen;


    public int rentValue(){

        // calculate rentValue, rentValue equals to base rentValue * numberOfdays of rent

        rentValue = (rentValue * numberDaysRent);
        return (int) rentValue;
    }
    
    public float insuranceValue(){ 

        // minimum value of insuranceValue = 100
        // insuranceValue = 30% of rentValue

        insuranceValue = (float) (100 + (0.30 * rentValue)); // insuranceValue é igual a 100 (valor base) + 30% do rentValue
        return insuranceValue;
    }

    public float rentClause() {

        // calculate rentClause

        rentClause = (float) 0.50 * rentValue; // rentClause value is 50% of rentValue
        return rentClause;
    }
    public void temporaryBackend() {

        System.out.printf("Choose the car you want, insert the number of the car: ");
        System.out.printf("Available: ");

        System.out.printf("Renault Clio V - 60€  (Day) Number 1");

        System.out.printf("Mercedes Classe A200  - 100€  (Day) Number 2");

        System.out.printf("Volkswagen Golf - 65€ (Day) Number 3");
    }
    private void rentCar() {

        int uChoice;
        int ifHelper;

        Scanner UserInput = new Scanner (System.in);

        public void temporaryBackend() {
        
            System.out.printf("Choose the car you want, insert the number of the car: ");
            System.out.printf("Available: ");
    
            System.out.printf("Renault Clio V - 60€  (Day) Number 1");
    
            System.out.printf("Mercedes Classe A200  - 100€  (Day) Number 2");
    
            System.out.printf("Volkswagen Golf - 65€ (Day) Number 3");
        }

        System.out.printf("Choose the agency you want: ");

        uChoice = UserInput.nextInt();

        System.out.printf("Porto - 1");
        System.out.printf("Aveiro: - 2");
        System.out.printf("Coimbra:  - 3");
        System.out.printf("Lisboa: - 4");
        System.out.printf("Faro: - 5");

        switch (uChoice) {

            // for (ifHelper = 1; ifHelper >= 5 ; ifHelper++ ) {
            //     uChoice++;
            // }

            case 1: {
                temporaryBackend();
            }
            case 2: {
                temporaryBackend();
            }
            case 3: {
                temporaryBackend();
            }
            case 4: {
                temporaryBackend();
            }
            case 5: {
                temporaryBackend();
            }
        }

        if (numberCarChoosen == 1) {
            rentValue = rentValue + 60;
        }
        if (numberCarChoosen == 2) {
            rentValue = rentValue + 100;
        }
        if (numberCarChoosen == 3) {
            rentValue = rentValue + 65;
        }
    }
}