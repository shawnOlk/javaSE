package ali;

import java.util.concurrent.*;

/**
 * 报警邮件处理类
 * Created by sunlei on 2018/3/21.
 */
public class AlarmHandler {
    //新建连个线程池，分别处理邮件A和邮件B
    static ExecutorService executorA = Executors.newFixedThreadPool(5);
    static ExecutorService executorB = Executors.newFixedThreadPool(5);
    static final int ALARM_A = 0;
    static final int ALARM_B = 1;

    private volatile static AlarmHandler alarmHandler;

    private AlarmHandler() {
    }

    public static AlarmHandler getAlarmHandler() {
        if (alarmHandler == null) {
            synchronized (AlarmHandler.class) {
                if (alarmHandler == null) {
                    alarmHandler = new AlarmHandler();
                }
            }
        }
        return alarmHandler;
    }

    //区分不同的邮件类型，放到不同的线程池中处理
    public void sendAlarm(final int type) {
        if (type == ALARM_A) {
            try {
                //A邮件报警
                executorA.execute(new AlarmA());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (type == ALARM_B) {
            try {
                //B邮件报警
                executorB.execute(new AlarmB());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
