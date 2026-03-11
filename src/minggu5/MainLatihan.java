package minggu5;

public class MainLatihan {
    public static void main(String[] args) {
        NilaiMahasiswa[] mahasiswa = {
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi",  "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian",  "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko",   "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina",  "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi",  "220101008", 2020, 82, 84)
        };

        int n = mahasiswa.length;

        int maxUTS = NilaiMahasiswa.maxUTSDC(mahasiswa, 0, n - 1);
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);

        int minUTS = NilaiMahasiswa.minUTSDC(mahasiswa, 0, n - 1);
        System.out.println("b) Nilai UTS terendah (Divide and Conquer): " + minUTS);

        double rataUAS = NilaiMahasiswa.rataUASBF(mahasiswa);
        System.out.println("c) Rata-rata nilai UAS (Brute Force): " + rataUAS);
    }
}