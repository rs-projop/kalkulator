import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean program = true;
        while (true) {

            System.out.println("▦ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▦");
            System.out.println("▥                                            ▥");
            System.out.println("▥                  Kalkulator                ▥");
            System.out.println("▥                  ver. 0.00                 ▥");
            System.out.println("▥                                            ▥");
            System.out.println("▦ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▦");
            System.out.println("▸ Aby uruchomić program, wciśnij 1. ");
            System.out.println("▸ Aby wyświetlić Dziennik Zmian, wciśnij 2. ");
            System.out.println("▸ Aby zamknąć program, wciśnij 3. ");
            System.out.println();
            System.out.println("⏎ Po wpisaniu liczby wciśnij Enter aby kontynuować. ");
            int select = in.nextInt();
            switch (select) {
                case (1):
                    boolean calc = true;
                    while (true) {
                        int a = 0;
                        int b = 0;
                        String znak = null;

                        System.out.print("Podaj pierwszą liczbę: ");
                        int l1 = in.nextInt();
                        a = l1;

                        System.out.print("Podaj znak działania: ");
                        String z = in.next();
                        znak = z;

                        System.out.print("Podaj drugą liczbę: ");
                        int l2 = in.nextInt();
                        b = l2;

                        switch (znak) {
                            case ("+"):
                                System.out.print("Wynik to: ");
                                System.out.println(a + b);
                                calc = false;
                                break;
                            case ("-"):
                                System.out.print("Wynik to: ");
                                System.out.println(a - b);
                                calc = false;
                                break;
                            case ("*"):
                                System.out.print("Wynik to: ");
                                System.out.println(a * b);
                                calc = false;
                                break;
                            case ("/"):
                                System.out.print("Wynik to: ");
                                System.out.println(a / b);
                                calc = false;
                                break;
                            default:
                                System.out.println("Podano nieprawidłowy znak.");
                                break;
                        }
                    }
                case (2):
                    System.out.println("v0.00");
                    System.out.println("Wersja startowa.");
                    System.out.println("Dodano:");
                    System.out.println("- Kalkulator bardzo prosty");
                    System.out.println("Usunięto:");
                    System.out.println("- ");
                    System.out.println("Wprowadzono 30.10.2023.");
                    break;
                case (3):
                    System.exit(0);
                    break;
                default:
                    System.out.println("Podaj prawidłową liczbę.");
                    break;
            }
        }
    }
}