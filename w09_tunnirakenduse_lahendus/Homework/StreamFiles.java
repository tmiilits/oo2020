import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamFiles {
    public static void main(String[] args)throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("processed_data.txt"));

        Files.readAllLines(Paths.get("data.txt")).stream()
            .map(e->e.split(","))
            .filter(e -> Integer.parseInt(e[1]) < 4) //esikolmiku saab aind nii kätte
            .filter(e->e[3].contains("22:38:58"))
            .map(e->e[1] + " | " + e[0] + " | " + e[2] + " | "+e[3])
            .forEach(pw::println);
        pw.close();
    }
}