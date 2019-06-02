import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Player player = new Player();
        Spider spider = new Spider();
        Zombie zombie = new Zombie();
        Rat rat = new Rat();

        System.out.println("Witaj w Lochu!!!");
        int n = 1;
        int i = 1;

        while (n==1)
        {
            System.out.println("Graj(1)");
            System.out.println("Wyjdź(2)");
            int score = 0;
            int k = 0;
            int user_input = scanner.nextInt();
            if (user_input == 1)
            {
                System.out.println("Podaj mi swoje imię: ");
                String user_name = scanner.next();
                player.setName(user_name);
                System.out.println("Jaki jest twój bohater? ");
                System.out.println("Silny(1), przeciętny(2), czy słaby(3)?");
                int user_body = scanner.nextInt();
                if (user_body == 1)
                {
                    player.setHp(40);
                }
                else if (user_body == 2)
                {
                    player.setHp(20);
                }
                else if (user_body == 3)
                {
                    player.setHp(10);
                }
                else
                {
                    player.setHp(5);
                }
                System.out.println("Wybierz broń.");
                System.out.println("Miecz(1), łuk(2), czy buława(3)?");
                int user_weapon = scanner.nextInt();
                if (user_weapon == 1)
                {
                    player.setMin_damage(5);
                    player.setMax_damage(10);
                }
                else if (user_weapon == 2)
                {
                    player.setMin_damage(4);
                    player.setMax_damage(8);
                }
                else if (user_weapon == 3)
                {
                    player.setMin_damage(0);
                    player.setMax_damage(12);
                }
                else
                {
                    player.setMin_damage(0);
                    player.setMax_damage(2);
                }
                System.out.println("Podaj ilość mikstur: ");
                int user_potions = scanner.nextInt();
                player.setPotions(user_potions);

                while (i == 1)
                {
                    if (k == 0) {
                        String name = player.getName();
                        int player_hp = player.getHp();
                        int potions = player.getPotions();
                        int player_min_damage = player.getMin_damage();
                        int player_max_damage = player.getMax_damage();
                        spider.setHp(20);
                        zombie.setHp(30);
                        rat.setHp(10);
                        System.out.println("Witaj w lochu, " + name);
                        System.out.println("Twoje hp: " + player_hp);
                        System.out.println("Twoje mikstury: " + potions);
                        System.out.println("Idziesz do przodu(1)");
                        System.out.println("Wychodzisz(2)");
                        int user_choice = scanner.nextInt();
                        if (user_choice == 1) {
                            int enemy = random.nextInt(3) + 1;

                            if (enemy == 1) {
                                System.out.println("Spotykasz pająka!!!");
                                int a = 1;
                                while (a == 1) {
                                    player_hp = player.getHp();
                                    potions = player.getPotions();
                                    int enemy_hp = spider.getHp();
                                    int enemy_min_damage = spider.getMin_damage();
                                    int enemy_max_damage = spider.getMax_damage();
                                    if (player_hp > 0) {
                                        if (enemy_hp > 0) {
                                            System.out.println("Hp wroga: " + enemy_hp);
                                            System.out.println("Twoje hp: " + player_hp);
                                            System.out.println("Twoje mikstury: " + potions);
                                            System.out.println("Uderz(1)");
                                            System.out.println("Użyj mikstury(2)");
                                            System.out.println("Ucieknij(3)");
                                            int user_turn = scanner.nextInt();
                                            if (user_turn == 1) {
                                                int player_hit = random.nextInt(2);

                                                if (player_hit == 1) {
                                                    int player_deal = random.nextInt(player_max_damage - player_min_damage + 1) + player_min_damage;

                                                    System.out.println("Zadajesz " + player_deal + " obrażeń.");
                                                    spider.setHp(enemy_hp - player_deal);
                                                } else {
                                                    System.out.println("Pudło!!!");
                                                }

                                                int enemy_hit = random.nextInt(2);

                                                if (enemy_hit == 1) {
                                                    int enemy_deal = random.nextInt(enemy_max_damage - enemy_min_damage + 1) + enemy_min_damage;

                                                    System.out.println("Przeciwnik zadaje " + enemy_deal + " obrażeń.");
                                                    player.setHp(player_hp - enemy_deal);
                                                } else {
                                                    System.out.println("Przeciwnik pudłuje!!!");
                                                }
                                            } else if (user_turn == 2) {
                                                if (potions > 0) {
                                                    player.setPotions(potions - 1);
                                                    player.setHp(player_hp + 5);
                                                }
                                                else
                                                {
                                                    System.out.println("Nie masz już mikstur!!!");
                                                }

                                            } else if (user_turn == 3) {
                                                int escape = random.nextInt(2);

                                                if (escape == 1) {
                                                    System.out.println("Uciekasz!!!");
                                                    break;
                                                } else {
                                                    System.out.println("Nie udaje Ci się uciec!!!");
                                                }
                                            } else {
                                                System.out.println("Nie ma takiej opcji!!!");
                                            }
                                        } else {
                                            System.out.println("Przeciwnik ginie!!!");
                                            score++;
                                            break;
                                        }
                                    } else {
                                        System.out.println("Koniec gry!!!");
                                        k = 1;
                                        System.out.println("Zabite potwory: " + score);
                                        break;
                                    }
                                }

                            }
                            else if (enemy == 2) {
                                System.out.println("Spotykasz zombie!!!");
                                int a = 1;
                                while (a == 1) {
                                    player_hp = player.getHp();
                                    potions = player.getPotions();
                                    int enemy_hp = zombie.getHp();
                                    int enemy_min_damage = zombie.getMin_damage();
                                    int enemy_max_damage = zombie.getMax_damage();
                                    if (player_hp > 0) {
                                        if (enemy_hp > 0) {
                                            System.out.println("Hp wroga: " + enemy_hp);
                                            System.out.println("Twoje hp: " + player_hp);
                                            System.out.println("Twoje mikstury: " + potions);
                                            System.out.println("Uderz(1)");
                                            System.out.println("Użyj mikstury(2)");
                                            System.out.println("Ucieknij(3)");
                                            int user_turn = scanner.nextInt();
                                            if (user_turn == 1) {
                                                int player_hit = random.nextInt(2);

                                                if (player_hit == 1) {
                                                    int player_deal = random.nextInt(player_max_damage - player_min_damage + 1) + player_min_damage;

                                                    System.out.println("Zadajesz " + player_deal + " obrażeń.");
                                                    zombie.setHp(enemy_hp - player_deal);
                                                } else {
                                                    System.out.println("Pudło!!!");
                                                }

                                                int enemy_hit = random.nextInt(2);

                                                if (enemy_hit == 1) {
                                                    int enemy_deal = random.nextInt(enemy_max_damage - enemy_min_damage + 1) + enemy_min_damage;

                                                    System.out.println("Przeciwnik zadaje " + enemy_deal + " obrażeń.");
                                                    player.setHp(player_hp - enemy_deal);
                                                } else {
                                                    System.out.println("Przeciwnik pudłuje!!!");
                                                }
                                            } else if (user_turn == 2) {
                                                if (potions > 0) {
                                                    player.setHp(player_hp + 5);
                                                    player.setPotions(potions - 1);
                                                }
                                                else
                                                {
                                                    System.out.println("Nie masz już mikstur!!!");
                                                }
                                            } else if (user_turn == 3) {
                                                int escape = random.nextInt(2);

                                                if (escape == 1) {
                                                    System.out.println("Uciekasz!!!");
                                                    break;
                                                } else {
                                                    System.out.println("Nie udaje Ci się uciec!!!");
                                                }
                                            } else {
                                                System.out.println("Nie ma takiej opcji!!!");
                                            }
                                        } else {
                                            System.out.println("Przeciwnik ginie!!!");
                                            score++;
                                            break;
                                        }
                                    } else {
                                        System.out.println("Koniec gry!!!");
                                        k = 1;
                                        System.out.println("Zabite potwory: " + score);
                                        break;
                                    }
                                }


                            } else if (enemy == 3) {

                                System.out.println("Spotykasz szczura!!!");

                                int a = 1;
                                while (a == 1) {
                                    player_hp = player.getHp();
                                    potions = player.getPotions();
                                    int enemy_hp = rat.getHp();
                                    int enemy_min_damage = rat.getMin_damage();
                                    int enemy_max_damage = rat.getMax_damage();
                                    if (player_hp > 0) {
                                        if (enemy_hp > 0) {
                                            System.out.println("Hp wroga: " + enemy_hp);
                                            System.out.println("Twoje hp: " + player_hp);
                                            System.out.println("Twoje mikstury: " + potions);
                                            System.out.println("Uderz(1)");
                                            System.out.println("Użyj mikstury(2)");
                                            System.out.println("Ucieknij(3)");
                                            int user_turn = scanner.nextInt();
                                            if (user_turn == 1) {
                                                int player_hit = random.nextInt(2);

                                                if (player_hit == 1) {
                                                    int player_deal = random.nextInt(player_max_damage - player_min_damage + 1) + player_min_damage;

                                                    System.out.println("Zadajesz " + player_deal + " obrażeń.");
                                                    rat.setHp(enemy_hp - player_deal);
                                                } else {
                                                    System.out.println("Pudło!!!");
                                                }

                                                int enemy_hit = random.nextInt(2);

                                                if (enemy_hit == 1) {
                                                    int enemy_deal = random.nextInt(enemy_max_damage - enemy_min_damage + 1) + enemy_min_damage;

                                                    System.out.println("Przeciwnik zadaje " + enemy_deal + " obrażeń.");
                                                    player.setHp(player_hp - enemy_deal);
                                                } else {
                                                    System.out.println("Przeciwnik pudłuje!!!");
                                                }
                                            } else if (user_turn == 2) {
                                                if(potions > 0) {
                                                    player.setHp(player_hp + 5);
                                                    player.setPotions(potions - 1);
                                                }
                                                else
                                                {
                                                    System.out.println("Nie masz już mikstur!!!");
                                                }
                                            } else if (user_turn == 3) {
                                                int escape = random.nextInt(2);

                                                if (escape == 1) {
                                                    System.out.println("Uciekasz!!!");
                                                    break;
                                                } else {
                                                    System.out.println("Nie udaje Ci się uciec!!!");
                                                }
                                            } else {
                                                System.out.println("Nie ma takiej opcji!!!");
                                            }
                                        } else {
                                            System.out.println("Przeciwnik ginie!!!");
                                            score++;
                                            break;
                                        }
                                    } else {
                                        System.out.println("Koniec gry!!!");
                                        k = 1;
                                        System.out.println("Zabite potwory: " + score);
                                        break;
                                    }
                                }

                            }


                        } else if (user_choice == 2) {
                            System.out.println("Zabite potwory: " + score);
                            break;
                        } else {
                            System.out.println("Nie ma takiej opcji!!!");
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else if (user_input == 2)
            {
                break;
            }
            else
            {
                System.out.println("Nie ma takiej opcji!!!");
            }
        }

    }

}
