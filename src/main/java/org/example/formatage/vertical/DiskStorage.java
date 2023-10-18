package org.example.formatage.vertical;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DiskStorage {
    private String storagePath;
    public DiskStorage(String storageDirectory) {
        this.storagePath = new File(storageDirectory).getAbsolutePath();
        setupStorageDirectory();
    }
    private void setupStorageDirectory() {
        File storageDirectory = new File(storagePath);
        if (!storageDirectory.exists()) {
            createStorageDirectory();
        } else {
            System.out.println("Directory exists already.");
        }
    }
    private void createStorageDirectory() {
        File storageDirectory = new File(storagePath);
        if (storageDirectory.mkdirs()) {
            System.out.println("Storage directory created.");
        } else {
            System.out.println("Failed to create storage directory.");
        }
    }
    public void insertFileWithData(String fileName, String data) {
        File storageDirectory = new File(storagePath);
        if (!storageDirectory.exists()) {
            System.out.println("The storage directory hasn't been created yet.");
            return;
        }
        String filePath = storagePath + File.separator + fileName;
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(data);
            System.out.println("File '" + fileName + "' created successfully.");
        } catch (IOException e) {
            handleFileSystemError(e);
        }
    }
    private void handleFileSystemError(IOException error) {
        System.out.println("Something went wrong - the operation did not complete.");
        error.printStackTrace();
    }
    public static void main(String[] args) {
        DiskStorage logStorage = new DiskStorage("logs");
        DiskStorage userStorage = new DiskStorage("users");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logStorage.insertFileWithData("2020-10-1.txt", "A first demo log entry.");
        logStorage.insertFileWithData("2020-10-2.txt", "A second demo log entry.");
        userStorage.insertFileWithData("max.txt", "Maximilian Schwarzmüller");
        userStorage.insertFileWithData("maria.txt", "Maria Jones");
    }
}

