/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import static secondsolution.RunTime.endInMiliSeconds;
import static secondsolution.RunTime.startInMiliSeconds;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Lenovo-ideaPad-15isk
 */
public class LineCounter {

    static File file = new File("src\\secondsolution\\cities.csv");
    static Path path = Paths.get("src\\secondsolution\\cities.csv");
    static int counter = 0;

    static void lineCounter() throws FileNotFoundException, IOException {
        long startTime = startInMiliSeconds();
        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.readLine() != null) {
            counter++;
        }
        long endTime = endInMiliSeconds();
        long durationTime = endTime - startTime;
        System.out.println("Number of lines: " + counter);
        System.out.println("The first solution time: " + durationTime + " ms");
    }

    static void secondLineCounter() throws FileNotFoundException {
        long startTime = startInMiliSeconds();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        counter = (int) reader.lines().count();
        long endTime = endInMiliSeconds();
        long durationTime = endTime - startTime;
        System.out.println("The second solution time: " + durationTime + " ms");
    }

    static void thirdLineCounter() throws IOException {
        long startTime = startInMiliSeconds();
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        counter = (int) lines.stream().count();
        long endTime = endInMiliSeconds();
        long durationTime = endTime - startTime;
        System.out.println("The third solution time: " + durationTime + " ms");
    }

    static void fourtLineCounter() throws IOException {
        long startTime = startInMiliSeconds();
        Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8);
        counter = (int) stream.count();
        long endTime = endInMiliSeconds();
        long durationTime = endTime - startTime;
        System.out.println("The fourth solution time: " + durationTime + " ms");
    }

    static void fifthLineCounter() throws FileNotFoundException {
        long startTime = startInMiliSeconds();
        Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name());
        counter = 0;
        while (sc.hasNextLine()) {
            counter++;
            sc.nextLine();
        }
        long endTime = endInMiliSeconds();
        long durationTime = endTime - startTime;
        System.out.println("The fifth solution time: " + durationTime + " ms");
    }
}
