
package laporan;


public class FinalJaket {
    private final static double jaka = 100000;
    private final static double jakb = 125000;
    private final static double jakc = 175000;
    public static double harga;
    public static void belia(int jml){
        harga = 0;
        if(jml > 100){
            harga = 95000 * jml;
            System.out.printf("Total Harga :   %.0f", harga);
        }
        else if(jml <= 100){
            harga = jaka * jml;
            System.out.printf("Total Harga :   %.0f", harga);
        }
    }
    public static void belib(int jml){
        harga = 0;
        if(jml > 100){
            harga = 120000 * jml;
            System.out.printf("Total Harga :   %.0f", harga);
        }
        else if(jml <= 100){
            harga = jakb * jml;
            System.out.printf("Total Harga :   %.0f", harga);
        }
    }
    public static void belic(int jml){
        harga = 0;
        if(jml > 100){
            harga = 160000 * jml;
            System.out.printf("Total Harga :   %.0f", harga);
        }
        else if(jml <= 100){
            harga = jakc * jml;
            System.out.printf("Total Harga :   %.0f", harga);
        }
    }
}


