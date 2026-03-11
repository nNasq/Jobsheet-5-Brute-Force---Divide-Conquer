package minggu5;

public class NilaiMahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    NilaiMahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static int maxUTSDC(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMax  = maxUTSDC(arr, l, mid);
        int rightMax = maxUTSDC(arr, mid + 1, r);
        return (leftMax > rightMax) ? leftMax : rightMax;
    }

    static int minUTSDC(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMin  = minUTSDC(arr, l, mid);
        int rightMin = minUTSDC(arr, mid + 1, r);
        return (leftMin < rightMin) ? leftMin : rightMin;
    }

    static double rataUASBF(NilaiMahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}