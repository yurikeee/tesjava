import java.util.Scanner;

public class CariKoordinat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angkax1, angkax2, angkay1, angkay2;
        double jumlah=0;
        
        System.out.print("masukkan titik x1 : ");
        angkax1 = input.nextDouble();	//menyimpan variabel angkax1 bertipe data double
        System.out.print("masukkan titik y1 : ");
        angkay1 = input.nextDouble();
        System.out.print("masukkan titik x2 : ");
        angkax2 = input.nextDouble();
        System.out.print("masukkan titik y2 : ");
        angkay2 = input.nextDouble();
        
        jumlah = Math.sqrt(Math.pow((angkax1-angkax2), 2) + Math.pow((angkay1-angkay2), 2));
        System.out.println("Titik terdekat: " + jumlah);
    }
    
}