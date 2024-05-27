package meetingscheduler;

public abstract class BookHall extends Hall{
    BookHall() {}

    public void bookHall(String bookingName, int day, int slot) {
        switch (day) {
            case 1:
                if (day1slots[slot-1] == 0 && slot<=noOfSlots) {
                    System.out.println("Booking Details \nBooking Name : "
                            + bookingName + "\nDay : Monday \nSlot : " + slot);
                    day1slots[slot-1] = 1;
                } else {System.out.println(bookingName + "\nSlot Already booked");}
                break;
            case 2:
                if (day2slots[slot-1] == 0 && slot<=noOfSlots) {
                    System.out.println("Booking Details \nBooking Name : "
                            + bookingName + "\nDay : Tuesday \nSlot : " + slot);
                    day2slots[slot-1] = 1;
                } else {System.out.println(bookingName + "\nSlot Already booked");}
                break;
            case 3:
                if (day3slots[slot-1] == 0 && slot<=noOfSlots) {
                    System.out.println("Booking Details \nBooking Name : "
                            + bookingName + "\nDay : Wednesday \nSlot : " + slot);
                    day3slots[slot-1] = 1;
                } else {System.out.println(bookingName + "\nSlot Already booked");}
                break;
            case 4:
                if (day3slots[slot-1] == 0 && slot<=noOfSlots) {
                    System.out.println("Booking Details \nBooking Name : "
                            + bookingName + "\nDay : Thursday \nSlot : " + slot);
                    day3slots[slot-1] = 1;
                } else {System.out.println(bookingName + "\nSlot Already booked");}
                break;
            case 5:
                if (day5slots[slot-1] == 0 && slot<=noOfSlots) {
                    System.out.println("Booking Details \nBooking Name : "
                            + bookingName + "\nDay : Friday \nSlot : " + slot);
                    day5slots[slot-1] = 1;
                } else {System.out.println(bookingName + "\nSlot Already booked");}
                break;
            default:
                System.out.println(bookingName);
                System.out.println("No Booking on Saturdays and Sundays");
        }
    }
}
