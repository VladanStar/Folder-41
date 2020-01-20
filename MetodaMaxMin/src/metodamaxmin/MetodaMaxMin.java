package metodamaxmin;

import java.util.Scanner;

public class MetodaMaxMin {

    // program za pronalazenje max i min unetog sa tastature
    public static void main(String[] args) {
        
        while(true){
        Scanner input = new Scanner(System.in);
            System.out.println("Uneiste prvi broj:");
            int prvi = input.nextInt();
            System.out.println("Unesite drugi broj: ");
            int drugi = input.nextInt();
            System.out.println("Unesite treci broj: ");
            int treci = input.nextInt();
            
            System.out.println("Minimum dva broja: " + min(prvi, drugi));
            System.out.println("Msksimum dva broja:  " + max(prvi, drugi));
            System.out.println("Maksimum tri broja: " + max(prvi, drugi, treci));
            System.out.println("Da li zelite da natavite (unesite da ili ne): ");
            String sc = input.next();
            if(sc.equalsIgnoreCase("da")){
            continue;
            }
            else{
            break;
            
            }
            
        }
        System.out.println("Kraj programa");

    }

    // metoda bira max od dva broja
    static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }

    }

    static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    static int max(int a, int b, int c) {
        int m = a;
        if (a < b) {
            if (b < m) {
                m = c;
            } else {

                m = b;
            }
        } else {
            if(a <c){
            m = c;
        }
        }
       return m; 
                }

    }


