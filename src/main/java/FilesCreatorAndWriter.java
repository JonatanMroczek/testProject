import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FilesCreatorAndWriter {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            String pathToFile = "C:\\Users\\Jonatan\\IdeaProjects\\data.txt\\data.txt";
            Files.writeString(Path.of(pathToFile), "Kurs\n" + "Java\n" + "Lekcja 6\n" + "Pliki\n" + "Wyjątki\n" + "Pliki\n" + "Koniec pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




