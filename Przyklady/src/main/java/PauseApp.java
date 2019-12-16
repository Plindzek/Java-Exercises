import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class PauseApp {

    void doSomething() {}
    
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

public void cycle() {
/**
 * powtarza metode przez okreslony czas: long initialDelay = opóznienie startu, long period=czas pomiedzy wznowieniami
 *  TimeUnit unit=jednostka czasu
 *  cancel() = zatrzymuje wykonanie zadania  po określonym czasie
 *  shutdown = zamyka zadanie po określonym czasie
 */
    
	final ScheduledFuture<?> cycleRepeat = scheduler.scheduleAtFixedRate(() -> doSomething(), 0, 5,
		TimeUnit.SECONDS);
	scheduler.schedule(() -> cycleRepeat.cancel(true), 30, TimeUnit.SECONDS);
	scheduler.schedule(() -> scheduler.shutdown(), 35, TimeUnit.SECONDS);
}

}
