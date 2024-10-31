import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int saldo = 1000000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di JUDI_ITU_DOSA_BOSS");
        System.out.println("Saldo anda adalah " + saldo);

        while (saldo > 0) {
            System.out.print("Masukan Taruhan -> ");
            int taruhan = scanner.nextInt();

            if (saldo < taruhan) {
                System.out.println("Saldo anda tidakr cukup \n");
                continue;
            }

            int number = GenerateRandomNumber(10);
            int minRange = Math.max(0, number - GenerateRandomNumber(5));
            int maxRange = Math.min(10, number + GenerateRandomNumber(5));

            String between = "Angka di kisaran " + minRange + " - " + maxRange;
            System.out.println(between);

            System.out.print("Masukkan Jawaban -> ");
            int jawaban = scanner.nextInt();

            if (jawaban == number) {
                if (GenerateRandomNumber(10) <= 3) {
                    System.out.println("Selamat! Anda menebak dengan benar. \n");
                    saldo += saldo / 2;
                } else {
                    if (GenerateRandomNumber(10) <= 5) {
                        System.out.println("Tebakan anda salah. Angka yang keluar adalah "
                                + (number + GenerateRandomNumber(5)) + "\n");
                    } else {
                        System.out.println("Tebakan anda salah. Angka yang keluar adalah "
                                + (number - GenerateRandomNumber(5)) + "\n");
                    }
                }
            } else {
                System.out.println("Maaf, tebakan Anda salah. Angka yang benar adalah " + number + "\n");
                saldo -= taruhan;
            }
            System.out.println("Saldo Anda sekarang: " + saldo);
            System.out.println("----------------------------");

            if (saldo <= 0) {
                System.out.println("Saldo Anda habis. Permainan berakhir.");
                break;
            }
            System.out.println("\n");
        }
        scanner.close();
    }

    public static int GenerateRandomNumber(int max) {
        return (int) (Math.random() * (max + 1));
    }
}
