import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOExceptionCase {
    public static void main(String[] args) {
        Path file = Paths.get("c:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file);  //IOException 발생 가능
            writer.write('A');
            writer.write('Z');

            if(writer != null)
                writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
