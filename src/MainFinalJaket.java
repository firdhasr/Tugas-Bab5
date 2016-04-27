
package laporan;


import java.util.Scanner;
public class MainFinalJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil, jml;
        do {
            System.out.println("");
            System.out.println("=============== Menu ===============");
            System.out.println("1. Bahan Jaket A");
            System.out.println("2. Bahan Jaket B");
            System.out.println("3. Bahan Jaket C");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda   : ");
            pil = input.nextInt();
            switch (pil) {
                case 1: {
                    System.out.print("Masukkan Jumlah Jaket :   ");
                    jml = input.nextInt();
                    FinalJaket.belia(jml);
                }
                break;
                case 2: {
                    System.out.print("Masukkan Jumlah Jaket :   ");
                    jml = input.nextInt();
                    FinalJaket.belib(jml);
                }
                break;
                case 3: {
                    System.out.print("Masukkan Jumlah Jaket :   ");
                    jml = input.nextInt();
                    FinalJaket.belic(jml);
                }
                break;
            }
        } while (pil != 4);
    }
}
