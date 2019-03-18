import java.util.Random;
import java.util.Scanner;

public class Losowa_liczba {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int liczba_komputera = random.nextInt(100)+1;
        int n = 1, i = 1;
        int hit = 0;
        int szansy, user_input, chance, remain;


        while(i == 1) {
            System.out.println("Witaj w mojej grze!!!");
            System.out.println("Wpisz 1, aby rozpocząć lub 2, aby wyjść:");
            user_input = scanner.nextInt();
            if(user_input == 1) {
                System.out.println("Wybierz liczbę szans: ");
                chance = scanner.nextInt();
                szansy = chance;
                remain = chance;

                System.out.println("Zgadnij moją liczbę od 1 do 100!!!");
                while (n == 1) {
                    int liczba = scanner.nextInt();

                    if (liczba == liczba_komputera) {
                        System.out.println("Brawo!!!");
                        hit += 1;
                        System.out.println("Zgadłeś w: " + hit + " krokach!!!");
                        hit = 0;
                        break;


                    } else if (liczba > liczba_komputera) {
                        System.out.println("Moja liczba jest mniejsza!!!");
                        hit += 1;
                        remain -= 1;
                        if(remain == 0){
                            System.out.println("Nie masz już szans!!!");
                        }
                        else if(remain == 1){
                            System.out.println("Została Ci: " + remain + " szansa.");
                        }
                        else if(remain == 2 || remain == 3 || remain == 4){
                            System.out.println("Zostały Ci: " + remain + " szansy.");
                        }
                        else{
                            System.out.println("Zostało Ci: " + remain + " szans.");
                        }
                    } else if (liczba < liczba_komputera) {
                        System.out.println("Moja liczba jest większa!!!");
                        hit += 1;
                        remain -= 1;
                        if(remain == 0){
                            System.out.println("Nie masz już szans!!!");
                        }
                        else if(remain == 1){
                            System.out.println("Została Ci: " + remain + " szansa.");
                        }
                        else if(remain == 2 || remain == 3 || remain == 4){
                            System.out.println("Zostały Ci: " + remain + " szansy.");
                        }
                        else{
                            System.out.println("Zostało Ci: " + remain + " szans.");
                        }

                    }
                    if (remain == 0) {
                        System.out.println("Koniec gry!!!");
                        System.out.println("Moja liczba to: " + liczba_komputera);
                        break;
                    }
                }
            }
            else if(user_input == 2){
                break;
            }
        }
    }

}
