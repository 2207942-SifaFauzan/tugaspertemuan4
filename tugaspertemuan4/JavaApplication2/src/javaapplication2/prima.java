import java.util.Scanner;

public class prima{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        if(batasAwal >=1 && batasAkhir <=100){
        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i))
                System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i) && i > 1)
                System.out.print(i + " ");
        }
        }else{
            System.out.print("inputan tidak valid");
        }
        System.out.println();
    }

    public static boolean isPrima(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
