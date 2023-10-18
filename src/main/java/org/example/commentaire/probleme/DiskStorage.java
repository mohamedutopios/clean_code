package org.example.commentaire.probleme;


// *********
// Imports
// *********
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * (c) 2023 Mohamed A. / Utopios
 */

// *********
// Main
// *********

// Une classe qui nous permet de créer des instances de stockage sur disque
public class DiskStorage {

    // Le répertoire de stockage
    private String storageDirectory;

    // Constructeur de la classe
    public DiskStorage(String directoryName) {
        this.storageDirectory = directoryName;
    }

    // Renvoie le chemin du répertoire
    public Path getDirectoryPath() {
        return Paths.get(this.storageDirectory);
    }

    // Crée le répertoire s'il n'existe pas déjà
    public void createDirectory() {
        File directory = new File(this.storageDirectory);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    // Insère un fichier avec un nom donné et un contenu donné
    public void insertFile(String fileName, String content) throws IOException {
        // Récupère le chemin complet du fichier
        File file = new File(this.getDirectoryPath().resolve(fileName).toString());
        // Écrit le contenu dans le fichier
        java.nio.file.Files.write(file.toPath(), content.getBytes());
        // Todo: Ajouter une gestion d'erreur appropriée
    }

    // Méthode principale pour tester la classe
    public static void main(String[] args) {
        // Crée une instance de DiskStorage avec le répertoire 'logs'
        DiskStorage logStorage = new DiskStorage("logs");
        // Crée le répertoire s'il n'existe pas déjà
        logStorage.createDirectory();

        try {
            // Insère un fichier nommé 'test.txt' avec le contenu 'Test'
            logStorage.insertFile("test.txt", "Test");
        } catch (IOException e) {
            // Gère les exceptions liées aux opérations de fichiers
            e.printStackTrace();
            // Gère l'exception ici
        }
    }
}

