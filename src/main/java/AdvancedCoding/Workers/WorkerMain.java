package AdvancedCoding.Workers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkerMain {
    private static final String FILE_LOCATION = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\AdvancedCoding\\Workers\\Worker";

    public static void main(String[] args) {
        List<Worker> workers = readDataFromFile();

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }
        System.out.println("Average age of employees: " + averageWorkersAge(workers) + " years.");
        System.out.println("Biggest salary: " + biggestSalary(workers) + " euro.");
        System.out.println("Youngest employee: " + youngestEmployee(workers) + " years old.");
    }

    private static List<Worker> readDataFromFile() {
        List<Worker> workers = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))){
            String line = br.readLine();

            while (line != null) {
                workers.add(mapWorkerData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return workers;
    }
    private static Worker mapWorkerData(String line) {
        String[] splitedLine = line.split(",");
        return new Worker(
                splitedLine[0],
                Double.parseDouble(splitedLine[1]),
                Integer.parseInt(splitedLine[2]),
                splitedLine[3].toCharArray()[0]
        );
    }
    private static double biggestSalary(List<Worker> workers) {
        double biggestSalary = workers.get(0).getSalary();

        for (Worker w : workers) {
            biggestSalary = Math.max(w.getSalary(), biggestSalary);
        }
        return biggestSalary;
    }
    private static double averageWorkersAge (List<Worker> workers) {
        int allSall = 0;

        for (Worker w : workers) {
            allSall += w.getAge();
        }
        return (double) allSall / workers.size();
    }
    private static int youngestEmployee(List<Worker> workers) {
        int youngestEmployee = workers.get(0).getAge();

        for (Worker w : workers) {
            youngestEmployee = Math.min(w.getAge(), youngestEmployee);
        }
        return youngestEmployee;
    }
}