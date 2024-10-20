import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alma
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        // Kullanıcıya işlem seçenekleri sunma
        System.out.println("Bir işlem seçin: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.print("Seçiminiz: ");
        int choice = scanner.nextInt();

        double result;

        // Koşullu durumlarla seçime göre işlem yapma
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Sonuç: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Sonuç: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Sonuç: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Sonuç: " + result);
                } else {
                    System.out.println("Bölme hatası: Sıfıra bölme tanımsızdır!");
                }
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}