import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean program = true;
        while (true) {

            System.out.println("▦ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▤ ▦");
            System.out.println("▥                                            ▥");
            System.out.println("▥                  Kalkulator                ▥");
            System.out.println("▥                  ver. 0.03                 ▥");
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
                        int a;
                        int b;
                        String znak;

                        System.out.print("Podaj pierwszą liczbę: ");
                        a = in.nextInt();

                        System.out.print("Podaj znak działania: ");
                        znak = in.next();

                        System.out.print("Podaj drugą liczbę: ");
                        b = in.nextInt();

                        System.out.print("Wynik to: ");
                        switch (znak) {
                            case ("+"):
                                System.out.println(a + b);
                                calc = false;
                                break;
                            case ("-"):
                                System.out.println(a - b);
                                calc = false;
                                break;
                            case ("*"):
                                System.out.println(a * b);
                                calc = false;
                                break;
                            case ("/"):
                                System.out.println(a / b);
                                calc = false;
                                break;
                            default:
                                System.out.println("Podano nieprawidłowy znak.");
                                break;
                        }
                    }
                case (2):
                    System.out.println("v0.03");
                    System.out.println("Poprawki.");
                    System.out.println("Dodano:");
                    System.out.println("- ");
                    System.out.println("Usunięto:");
                    System.out.println("- Niepotrzebny kod (Zastosowano zasade Clean Code'u DRY)");
                    System.out.println("Wprowadzono 28.11.2023.");
                    System.out.println();
                    System.out.println("Po pełny dziennik zmian, sprawdź https://github.com/rs-projop/kalkulator/blob/master/co_nowego.txt");
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
