import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class LinkExtractor {
    public static void main(String[] args) throws IOException {
        var path = Path.of(args[0]);
        var lines = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
        // reads all lines of the file opened in Latin-1
        for(var line : lines){
          if(line.matches("^<a href=")){
            System.out.print("oui");
          }
        }
      }
}
