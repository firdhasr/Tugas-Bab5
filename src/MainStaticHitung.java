package laporan;

import java.util.Scanner;

public class MainStaticHitung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, nilai1, nilai2, pembilang, penyebut, pembilang1 = 0, penyebut1 = 0;
        do {
            System.out.println("====APLIKASI OPERASI HITUNG====");
            System.out.println("3. Operasi Perkalian");
            System.out.println("4. Operasi Pembagian");
            System.out.println("5. Menyederhanakan Pecahan");
            System.out.println("6. Keluar");
            System.out.println("Masukkan pilihan anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nilai 1 : ");
                    nilai1 = input.nextInt();
                    System.out.println("Masukkan nilai 2 : ");
                    nilai2 = input.nextInt();
                    StaticHitung.HitungPenjumlahan(nilai1, nilai2);
                    break;
                case 2:
                    System.out.println("Masukkan nilai 1 : ");
                    nilai1 = input.nextInt();
                    System.out.println("Masukkan nilai 2 : ");
                    nilai2 = input.nextInt();
                    StaticHitung.HitungPengurangan(nilai1, nilai2);
                    break;
                case 3:
                    System.out.println("Masukkan nilai 1 : ");
                    nilai1 = input.nextInt();
                    System.out.println("Masukkan nilai 2 : ");
                    nilai2 = input.nextInt();
                    StaticHitung a = new StaticHitung();
                    a.HitungPerkalian(nilai1, nilai2);
                    break;
                case 4:
                    System.out.println("Masukkan nilai 1 : ");
                    nilai1 = input.nextInt();
                    System.out.println("Masukkan nilai 2 : ");
                    nilai2 = input.nextInt();
                    StaticHitung b = new StaticHitung();
                    b.HitungPembagian(nilai1, nilai2);
                    break;
                case 5:
                    System.out.println("Masukkan Pembilang : ");
                    pembilang = input.nextInt();
                    System.out.println("Masukkan penyebut : ");
                    penyebut = input.nextInt();
                    StaticHitung c = new StaticHitung();
                    c.Sederhana(pembilang, penyebut, pembilang1, penyebut1);
                    break;
                case 6:
                    System.out.println("Terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf, anda mulai lelah");
            }
        } while (pilihan != 6);

    }
}
