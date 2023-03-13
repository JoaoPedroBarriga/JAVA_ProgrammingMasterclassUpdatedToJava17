package CodingExercises01_Through_08;

public class CodingExercise03_MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);  // "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(-1024); // "Invalid Value"
        printMegaBytesAndKiloBytes(5000);  // "5000 KB = 4 MB and 904 KB"
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = (kiloBytes / 1024);
            int kiloRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kiloRemainder + " KB");
        }
    }
}

