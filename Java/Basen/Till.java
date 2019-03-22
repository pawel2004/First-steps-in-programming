import java.util.Scanner;

public class Till {

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj na naszym basenie!!!");
        int n = 0;
        int i = 0;
        boolean have = false;

        Ticket ticket = new Ticket();
        while (i == 0) {
            System.out.println("Podejdź do kasy(1)");
            System.out.println("Wejdź przez bramkę(2)");
            System.out.println("Wróć do hali głównej(3)");
            int user_inputway = scanner.nextInt();

            if (user_inputway == 1) {

                while (n == 0) {

                    System.out.println("Kup bilet(1)");
                    System.out.println("Przedłuż bilet(2)");
                    System.out.println("Wyjdź(3)");
                    int user_input = scanner.nextInt();
                    if (user_input == 1) {

                        System.out.println("Wprowadź kod autoryzacyjny");
                        String user_in = scanner.next();
                        ticket.setCode(user_in);
                        System.out.println("Określ ilość wejść");
                        int user_ind = scanner.nextInt();
                        ticket.setDuration(user_ind);
                        System.out.println("Dziękujemy!!!");
                        have = true;
                    }
                    else if (user_input == 2) {

                        if (have == true) {
                            int duration = ticket.getDuration();
                            System.out.println("O ile przedłużyć? ");
                            int user_ind = scanner.nextInt();
                            ticket.setDuration(duration + user_ind);
                        }
                        else
                        {
                            System.out.println("Nie masz biletu!!!");
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else if(user_inputway == 2) {
                int d = 0;
                System.out.println("Wprowadź kod biletu");
                System.out.println("Lub wpisz 'cofnij'");

                while (d == 0) {

                    String user_input = scanner.next();
                    if (user_input.equals(ticket.getCode()))
                    {
                        int duration = ticket.getDuration();
                        if (duration > 0)
                        {
                            ticket.setDuration(duration - 1);
                            System.out.println("Proszę wejść");
                            System.out.println("Ilość pozostałych wejść: " + ticket.getDuration());
                            break;
                        } else {
                            System.out.println("Nie możesz wejść. Doładuj bilet w kasie!!!");
                            break;
                        }
                    }
                    else if (user_input.equals("cofnij"))
                    {
                        break;
                    }
                    else {
                        System.out.println("Wprowadź kod jeszcze raz!!!");
                    }

                }
            }
            else
            {
                break;
            }
        }
    }
}
