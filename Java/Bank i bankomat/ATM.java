import java.util.Scanner;

public class ATM {
    public void main()
    {
        Scanner scanner = new Scanner(System.in);
        Credit_card card = new Credit_card();
        int n = 1;
        int i = 0;
        String code;
        while (n == 1)
        {
            String real_code = card.getCode();
            if (i == 0) {
                System.out.println("Włóż kartę. (Wpisz abc)");
                System.out.println("Lub wprowadź 'w', aby wyjść");
            }

            code = scanner.next();
            if (code.equals(real_code))
            {
                while(n == 1)
                {
                    int balance = card.getMoney();
                    System.out.println("Wypłać pieniądze(1)");
                    System.out.println("Wpłać pieniądze(2)");
                    System.out.println("Stan konta(3)");
                    System.out.println("Wyjdź(4)");
                    int user_input = scanner.nextInt();
                    if (user_input == 1)
                    {
                        System.out.println("Liczba: ");
                        int user_out = scanner.nextInt();
                        if (balance - user_out >= 0) {
                            card.setMoney(balance - user_out);
                        }
                        else
                        {
                            System.out.println("Masz za mało na koncie!!!");
                        }
                    }
                    else if (user_input == 2)
                    {
                        System.out.println("Liczba: ");
                        int user_in = scanner.nextInt();
                        card.setMoney(balance + user_in);
                    }
                    else if (user_input == 3)
                    {
                        System.out.println("Twój stan konta: " + balance);
                    }
                    else if (user_input == 4)
                    {
                        i = 0;
                        break;
                    }
                    else
                    {
                        System.out.println("Nieprawidłowa komenda");
                    }
                }
            }
            else if(code.equals("w")){
                break;
            }
            else
            {
                System.out.println("Wpisz kod jeszcze raz!!!");
                i = 1;
            }


        }
    }
}
