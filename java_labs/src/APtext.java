import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class APtext {
    public static void main(String[] args) {

        if (args.length < 2 ) {
            System.out.println("2 file paths required (1 - source, 2 - target)");
            System.exit(0);
        }

        String sourcePath = args[0];
        String targetPath = args[1];

        if (!sourcePath.endsWith(".txt") || !targetPath.endsWith(".txt")) {
            System.out.println("Only TXT files are accepted");
        }

        try {
            String originalText = String.valueOf(Files.lines(Paths.get(sourcePath)));
                String modifixedText = replace(originalText);
                System.exit(0);

        }catch (IOException e) {
            System.out.println("Error while trying to read/write to ");
            System.exit(0);
        }

        System.out.println("Done");
    }

    private static String replace (String originalText) {
        return originalText
                .replaceAll("а","a")
                .replaceAll("А","A")
                .replaceAll("с","c")
                .replaceAll("о","o")
                .replaceAll("е","e")
                .replaceAll("р","p");

    }
}
