package meetingscheduler;

public interface Meeting {
    void checkBookedSlots();
    void bookHall(String bookingName, int day, int slot);
    void generateSchedule();
}
