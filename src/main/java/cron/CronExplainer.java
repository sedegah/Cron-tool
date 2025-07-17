package cron;

import com.cronutils.model.Cron;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.parser.CronParser;
import com.cronutils.descriptor.CronDescriptor;
import static com.cronutils.model.CronType.UNIX;

import java.util.Locale;

public class CronExplainer {
    public static String explain(String cronExpr) {
        CronParser parser = new CronParser(CronDefinitionBuilder.instanceDefinitionFor(UNIX));
        Cron cron = parser.parse(cronExpr);
        return CronDescriptor.instance(Locale.ENGLISH).describe(cron);
    }
}