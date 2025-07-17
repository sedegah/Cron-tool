package cron;

import com.cronutils.model.Cron;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.parser.CronParser;
import com.cronutils.model.time.ExecutionTime;
import static com.cronutils.model.CronType.UNIX;

import java.time.ZonedDateTime;
import java.util.Optional;

public class CronValidator {
    public static void showNextRuns(String cronExpr, int count) {
        CronParser parser = new CronParser(CronDefinitionBuilder.instanceDefinitionFor(UNIX));
        Cron cron = parser.parse(cronExpr);
        ExecutionTime executionTime = ExecutionTime.forCron(cron);
        ZonedDateTime now = ZonedDateTime.now();

        for (int i = 0; i < count; i++) {
            Optional<ZonedDateTime> next = executionTime.nextExecution(now);
            if (next.isPresent()) {
                System.out.println("- " + next.get()); // replaced arrow with dash
                now = next.get().plusSeconds(1);
            } else {
                break;
            }
        }
    }
}
