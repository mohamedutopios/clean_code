package org.example.commentaire.solution;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DiskStorage {

    private String storageDirectory;

    public DiskStorage(String directoryName) {
        this.storageDirectory = directoryName;
    }

    public Path getDirectoryPath() {
        return Paths.get(this.storageDirectory);
    }

    public void createDirectory() {
        File directory = new File(this.storageDirectory);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    // Avertissement : Le répertoire doit exister au préalable
    public void insertFile(String fileName, String content) throws IOException {
        Path filePath = this.getDirectoryPath().resolve(fileName);
        File file = new File(filePath.toString());
        java.nio.file.Files.write(file.toPath(), content.getBytes());
        // Todo: Ajouter une gestion d'erreur appropriée
    }

    public static void main(String[] args) {
        DiskStorage logStorage = new DiskStorage("logs");

        logStorage.createDirectory();

        try {
            logStorage.insertFile("test.txt", "Test");
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'exception ici
        }
    }
}

