import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();

        Scanner s = new Scanner(System.in);
        String yesNo;

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. Keluar");

            int pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = s.next();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = s.next();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahun = s.nextInt();

                    System.out.println("Tambahkan data di depan? y/n");
                    yesNo = s.next();

                    if (yesNo.equals("y")) {
                        list1.tambahDepan(new Buku(judul, penulis, tahun));
                    } else {
                        list1.tambahBelakang(new Buku(judul, penulis, tahun));
                    }
                    
                    break;
                
                case 2:
                    System.out.println("Hapus data di awal list? y/n");
                    yesNo = s.next();
                    
                    if(yesNo.equals("y")) {
                        list1.hapusDepan();
                        System.out.println("Data di awal list telah dihapus");
                    } else {
                        list1.hapusBelakang();
                        System.out.println("Data di akhir list telah dihapus");
                    }

                    break;

                case 3:
                    list1.print();

                    break;

                case 4:
                    // s.close();
                    keepRunning = false;
            }
        }
       

        
    }
}
