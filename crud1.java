import java.io.IOException;
import java.util.Scanner;

class Main{  
  public static void main(String args[]){  
    
    Scanner userinput = new Scanner(System.in);
    String pilihan;
    boolean lanjutkan = true;
    
    System.out.println("Database Perpustakaan\n");
    
    while(lanjutkan){
         clearScreen();   
    System.out.println("1.\tLihat seluruh buku");
    System.out.println("2.\tCari data buku");
    System.out.println("3.\ttambah data buku");
    System.out.println("4.\tUbah data buku");
    System.out.println("5.\tHapus data buku");
    
    System.out.println("\n\nPilihan Anda: ");
    pilihan = userinput.next();
    
    switch(pilihan){
      case "1":
        //menampilkan seluruh buku
        System.out.println("\n======================");
        System.out.println("Tampilkan seluruh buku");
        System.out.println("=======================");
        break;
      case "2":
        //Mencari data buku
        System.out.println("\n=========");
        System.out.println("Cari buku");
        System.out.println("=========");
        break;
      case "3":
        //Menambah data buku
        System.out.println("\n==================");
        System.out.println("tambah seluruh buku");
        System.out.println("====================");
        break;
      case "4":
        //Mengubah data buku
        System.out.println("\n=================");
        System.out.println("Ubah seluruh buku");
        System.out.println("=================");
        break;
      case "5":
        //Menghapus data buku
        System.out.println("\n===================");
        System.out.println("Hapus seluruh buku");
        System.out.println("===================");
        break;
      default:
        System.err.println("pilihan anda tidak ditemukan\nsilakan pilih yang [1-5]");   
     }
        lanjutkan = getYesorNo("Apakah anda ingin melanjutkan? ");
    }
    
    
      
  }  
  
  public static void tampilkan() throws IOException{
    
  }
  
    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
      } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}  
