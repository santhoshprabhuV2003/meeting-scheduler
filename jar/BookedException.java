public class BookedException extends Exception {
    String msg;
    BookedException(String name,int day,int slot) {
        msg = name + " Day " + day + " Slot " + slot + " Already Booked";
    }

    public String toString() {
        return msg;
    }
}