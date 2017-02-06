package presentation.rxjava_cron;

import com.ullink.rxscheduler.cron.RxCronForwardingScheduler;
import com.ullink.rxscheduler.cron.RxCronScheduler;
import com.ullink.rxscheduler.cron.calendar.CronExpression;
import com.ullink.rxscheduler.cron.calendar.WeeklyCalendar;
import rx.Scheduler;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by serhii.kartashov on 07.10.2016.
 */
public class Usage {

    // DOESN'T WORK!!!
    public static void main(String[] args) throws ParseException {
        ExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Scheduler inner = Schedulers.from(executor);
        RxCronScheduler service = new RxCronForwardingScheduler(inner);
        final SideEffectTask task = new SideEffectTask();
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        boolean[] excluded = new boolean[]{false, false, true, true, true, true, true, true};
        weeklyCalendar.setDaysExcluded(excluded);
//        service.schedule(task, new CronExpression("0 0 15 ? * *"), weeklyCalendar); // CANNOT COMPILE
    }

}

class SideEffectTask implements Action0 {
    @Override
    public void call() {
        System.out.println("Hello");
    }
}
