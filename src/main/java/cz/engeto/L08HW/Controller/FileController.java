package cz.engeto.L08HW.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequestMapping("file/")

public class FileController {

    @GetMapping("/scifi")
    public String getScifi() {
        Path filePath = Path.of("C:\\Users\\akraj\\IdeaProjects\\L08HW\\src\\main\\java\\cz\\engeto\\L08HW\\Controller\\scifi.txt");
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return text;
    }

    @GetMapping("/romantic")
    public String getRomantic() {
        Path filePath = Path.of("C:\\Users\\akraj\\IdeaProjects\\L08HW\\src\\main\\java\\cz\\engeto\\L08HW\\Controller\\romantic.txt");
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return text;
    }

    @GetMapping("/historic")
    public String getHistoric() {
        Path filePath = Path.of("C:\\Users\\akraj\\IdeaProjects\\L08HW\\src\\main\\java\\cz\\engeto\\L08HW\\Controller\\historic.txt");
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return text;
    }
}
