package meetingscheduler;

public class Schedule extends BookHall{
    public void generateSchedule() {
        System.out.println("  1 2 3 4 ");
        System.out.print("M ");
        for (int i=0; i<noOfSlots; i++) {
            if (day1slots[i] == 0) System.out.print(0 + " ");
            else System.out.print(1 + " ");
        } System.out.println();
        System.out.print("T ");
        for (int i=0; i<noOfSlots; i++) {
            if (day2slots[i] == 0) System.out.print(0 + " ");
            else System.out.print(1 + " ");
        } System.out.println();
        System.out.print("W ");
        for (int i=0; i<noOfSlots; i++) {
            if (day3slots[i] == 0) System.out.print(0 + " ");
            else System.out.print(1 + " ");
        } System.out.println();
        System.out.print("T ");
        for (int i=0; i<noOfSlots; i++) {
            if (day4slots[i] == 0) System.out.print(0 + " ");
            else System.out.print(1 + " ");
        } System.out.println();
        System.out.print("F ");
        for (int i=0; i<noOfSlots; i++) {
            if (day5slots[i] == 0) System.out.print(0 + " ");
            else System.out.print(1 + " ");
        }
    }

    //Method overriding in bookHall() method
    public void bookHall(String bookingName, int day, int slot, String Hallname) {
        super.bookHall(bookingName,day,slot);
        System.out.println("Booked Hall : " + Hallname);
    }
}