import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    do {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                            if (penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                                break;
                            } else {
                                System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia :C");
                        }
                    } while (true);
                    break;
                case 2:
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                }
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
                    break;
                case 3:
                    System.out.print("Terimakasih :D");
                    return;
            }
        }
    }
}