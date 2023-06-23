package co.develhope.introduction._17;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        House casa = new House();

        boolean isNumber=false;
        System.out.println("immetti il numero di piani :");
       int floorsNumber=0;

        do{
            if ( scanner.hasNextInt() ) {
                    floorsNumber= scanner.nextInt();
                     if (floorsNumber >= 0){
                    isNumber = !isNumber;
                }
            }else{
                scanner.next();
                System.out.println("Non hai immesso il numero di piani corretto! Riprova : ");
            }
        }while(!isNumber);

        casa.setFloorsNumber(floorsNumber);

        scanner.nextLine();

        System.out.println("immetti il nome della via e il numero civico : ");
        casa.setAddress(scanner.nextLine());

        scanner.close();

        String[] residentsNames = { "Antonio" , "Pasquale" , "Marco"};
        String residents = String.join("," , residentsNames);

        System.out.println(" House details : ");
        String formatted = String.format("la casa in Via %s ha %d piani ed è abitata da %s " ,
                casa.getAddress() , casa.getFloorsNumber() , residents);

        System.out.println(formatted);



    }

}
