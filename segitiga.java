import java.util.Scanner;

public class segitiga{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        int i, j;
        if(N >= 1 && N <= 1000){
            for( i = N; i > 0; i-- ){
                for( j = N; j >= i; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("perbaiki inputan");
        }
        
    }

}
