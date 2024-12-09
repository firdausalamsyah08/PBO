package Tugas.sesi5;

public class nomer4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }

        System.out.println("Jumlah bilangan genap dari 1 hingga 100 adalah: " + sum);
    }
}
