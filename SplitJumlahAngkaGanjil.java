import java.util.Scanner;	//mengimport scanner ke class

public class SplitJumlahAngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	//mengambil masukan dari user
        String angka;
        int uangka, hasil=0;
        boolean status=false;	//status false untuk menginput selain angka
        while(!status) {		//jika status berlawanan dengan status diawal maka akan mengulang
            System.out.print("Masukkan beberapa angka : ");
            angka = input.nextLine();	//angka yang tipe datanya string diubah menjadi integer
            if(angka.matches("[0-9]*")){	//jika angka yg dimasukkan antara 0 sampai 9 makan
                System.out.println("OK");	//menampilkan OK 
                String[] inputmasuk = angka.split("(?<=\\G.{1})");	//untuk memisahkan satu satu angka
                for(int i=0; i<inputmasuk.length; i++) {			//pengulangan untuk mengulang banyaknya angka
                    uangka = Integer.parseInt(inputmasuk[i]);		//mengubah tipe data variabel uangka menjadi integer
                    if(uangka%2==1){			//jika sisa hasil bagi uangka yang nilainya 1 maka 
                        hasil=uangka + hasil;	//uangka akan dijumlahkan menjadi hasil dan berulang sampai angka terakhir
                    }
                }
                status=true;	//maka tidak akan masuk ke pengulangan while(!status)
            } else{
                System.out.println("Silahkan masukkan angka!");
                status=false;	//maka akan masuk ke pengulangan while(!status)
            } 
        }
        System.out.println("Hasil   : " + hasil);              
    }
}