
package laporan;


public class StaticHitung {
    public static void HitungPenjumlahan (int a, int b) {
        int nilai = a + b;
        System.out.println("Hasil penjumlahan adalah : "+nilai);
        }
    
    public static void HitungPengurangan (int a, int b) {
        int nilai = a - b;
        System.out.println("Hasil pengurangan adalah : "+nilai);
    }
    
    public void HitungPerkalian (int a, int b) {
        int nilai = a * b;
        System.out.println("Hasil perkalian adalah : "+nilai);
    }
    
    public void HitungPembagian (int a, int b) {
        int nilai = a / b;
        System.out.println("Hasil pembagian adalah : "+nilai);
    }
    
    public void Sederhana (int pem, int pen, int pem1, int pen1) {
    if(pen==0){
            System.out.print("MAAF, MASUKKAN ANGKA SELAIN 0!\n");
        }
        else{
          System.out.println("Nilai pecahan sebelum disederhanakan : "+pem+"/"+pen);
           
          pem1 = (pem/FPB(pem,pen));
          pen1 = (pen/FPB(pem,pen));
           
          
          if (pem1!=pem && pen1!=pen){
             System.out.println("Nilai pecahan setelah disederhanakan : "+pem1+"/"+pen1);
             if(pen1==1){
              System.out.println("Maka nilai pecahan : "+pem1);
             }
          }
          else if(pen==1){
              System.out.println("Nilai pecahan setelah disederhanakan : "+pem);          
          }
          else if (pem==0 && pen!=0){
              System.out.println("Nilai pecahan adalah 0");
          }
          else{              
              System.out.println("MAAF, TIDAK BISA DISEDERHANAKAN");
              System.out.println("Maka nilai pecahan : "+pem+"/"+pen);
          }
        }
                 
    }

     public static int FPB(int pembilang, int penyebut) {
        if (pembilang%penyebut == 0) 
            return penyebut;
        else 
            return FPB(penyebut, pembilang%penyebut);
    }
}
 

