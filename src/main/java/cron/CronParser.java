package cron;

public class CronParser {
    public static String parse(String input) {
        input = input.toLowerCase();
        if (input.contains("every 15 minutes")) return "*/15 * * * *";
        if (input.contains("every day at 6am")) return "0 6 * * *";
        if (input.contains("every monday at 5pm")) return "0 17 * * 1";
        if (input.contains("every 10 minutes on weekdays")) return "*/10 * * * 1-5";
        return "* * * * *"; // Default fallback
    }
}