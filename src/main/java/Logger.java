import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("[" + dateFormat.format(new Date()) + " " + num++ + "]" + " " + msg);
    }

}
