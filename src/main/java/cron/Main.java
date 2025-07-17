package cron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter command (e.g., 'Run every Monday at 5pm'):");
            String input = scanner.nextLine();

            String cron = CronParser.parse(input);
            System.out.println("Generated Cron: " + cron);

            System.out.println("Explanation: " + CronExplainer.explain(cron));

            CronValidator.showNextRuns(cron, 3);
        }
    }
}
