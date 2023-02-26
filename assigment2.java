import java.util.Scanner;

public class robert {
    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan jumlah mainan yang dibeli : ");

        int mainan = scan.nextInt();
        int sisa = mainan%3;

        if (sisa > 0){
            System.out.println("sisa mainan : "+1);
        }
        else {
            System.out.println("Mainan pas");
        }
    }

}
