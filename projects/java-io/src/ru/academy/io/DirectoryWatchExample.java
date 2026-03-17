package ru.academy.io;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryWatchExample {

    static void main() throws IOException {
        Path directoryPath = Path.of("tracking");

        if (Files.notExists(directoryPath))
            Files.createDirectories(directoryPath);

        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
            WatchKey watchKey = directoryPath.register(
                    watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            while (true) {
                for (WatchEvent<?> watchEvent : watchKey.pollEvents()) {
                    Path targetPath = (Path) watchEvent.context();
                    System.out.println("Замечено изменение, связанное с элементом " + targetPath);
                }
            }
        }
    }
}
