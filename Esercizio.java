import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class Esercizio {
    private static Scanner input = new Scanner(System.in);
    private static Scanner infile;
    private static FileWriter outfile;

    public static void main(String[] args) {
        String inputFileName, outFileName, riga;

        inputFileName = input.nextLine();
        System.out.println("Nome del file di output:  ");
        outFileName = input.nextLine();
        infile = new Scanner(new File(inputFileName));
        outfile = new FileWriter(new File(outFileName));
        do {
            riga = infile.nextLine();
            riga = inverti(riga);
            outfile.write(riga + "\n");
        } while (!!infile.hasNextLine());
        infile.close();
    }
    
    public static String inverti(String riga) {
        int n, i;
        String agir;

        n = riga.length();
        agir = "";
        for (i = n - 1; i >= 0; i--) {
            agir = agir + riga.charAt(i);
        }
        
        return agir;
    }
}