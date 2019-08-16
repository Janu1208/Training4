import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileReader2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path path = Paths.get("books.txt");

        System.out.println("Reading entire file contents");
        byte[] content1 = Files.readAllBytes(path);
        String contentStr = new String(content1);
        System.out.println(contentStr);

        System.out.println("Reading line by line");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
	}
	}
}
