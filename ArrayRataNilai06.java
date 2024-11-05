import java.util.Scanner;
public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs= sc.nextInt();
        int [] nilaiMhs = new int[jmlMhs];
        double total = 0, totalLulus=0,totalTidakLulus=0,rataLulus=0,rataTidakLulus=0;
        int jmlLulus=0,jmlTidakLulus=0;
        for (int i=0;i<nilaiMhs.length;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i=0;i<nilaiMhs.length;i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        if (jmlLulus > 0) {
            rataLulus = totalLulus / jmlLulus;
        }
        if (jmlTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jmlTidakLulus;
        }
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}