import meetingscheduler.*;

class Main {
    public static void main(String[] args) {
        Schedule booking1 = new Schedule();
        booking1.bookHall("Vishnu", 1, 4, "Seminar Hall");
        booking1.bookHall("Kannan", 5, 3, "OA");
        booking1.bookHall("Karthik", 5, 3, "OA");

        booking1.checkBookedSlots(1);
        booking1.checkBookedSlots(5);
        booking1.generateSchedule();

        booking1.checkBookedSlots();
    }
}