package ali;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by sunlei on 2018/3/21.
 */
public class AlarmTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        AlarmHandler alarmHandler = AlarmHandler.getAlarmHandler();
        for (int i=0;i<10;i++) {
            executorService.execute(new Alarm(alarmHandler,i%2));
        }

    }

    static class Alarm implements Runnable {
        private AlarmHandler alarmHandler;
        private int i;

        Alarm(AlarmHandler alarmHandler, int i) {
            this.alarmHandler = alarmHandler;
            this.i=i;
        }

        @Override
        public void run() {
            alarmHandler.sendAlarm(i);
        }
    }
}
