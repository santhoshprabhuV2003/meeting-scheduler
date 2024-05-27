import java.util.logging.*;

public class ScheduleLog {
    public static void main(String[] args) {
        try {
            LogManager lm = LogManager.getLogManager();
            Logger logger = Logger.getLogger("Schedule Logger");
            FileHandler fh = new FileHandler("schedule.txt",true);
            lm.addLogger(logger);
            //logger.setLevel(Level.INFO);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());

            BookHall booking1 = new BookHall("Kiran",2,4);
            BookHall booking2 = new BookHall("Abdullah",3,5);
            BookHall booking3 = new BookHall("Balaji",2,4);

            logger.log(Level.INFO, booking1.toString());
            logger.log(Level.INFO, booking2.toString());
            logger.log(Level.INFO, booking3.toString());
            fh.close();
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}