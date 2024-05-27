import java.util.Scanner;

public class BookHall {
    String name;
    int day,slot;
    Scanner in = new Scanner(System.in);
    static int[] day1slots = new int[4];
    static int[] day2slots = new int[4];
    static int[] day3slots = new int[4];
    static int[] day4slots = new int[4];
    static int[] day5slots = new int[4];

    BookHall(String name,int day,int slot) {
        this.name = name;
        this.day = day;
        this.slot = slot;
    }

    String scheduleSlot(int day_order,int slot_no) {
        try {
            if (slot_no < 5) {
                bookSlot(name,day_order, slot_no);
                return name + " Day order " + day_order + " slot " + slot_no + " booked";
            } else
                return "Invalid Slot Entered by " + name;
        } catch (BookedException e) {
            return e.toString();
        }
    }

    void bookSlot(String name,int day,int slot) throws BookedException{
        switch (day) {
            case 1: if (day1slots[slot-1] == 0) day1slots[slot-1] = 1;
            else throw new BookedException(name,day,slot);
            case 2: if (day2slots[slot-1] == 0) day2slots[slot-1] = 1;
            else throw new BookedException(name,day,slot);
            case 3: if (day3slots[slot-1] == 0) day3slots[slot-1] = 1;
            else throw new BookedException(name,day,slot);
            case 4: if (day4slots[slot-1] == 0) day4slots[slot-1] = 1;
            else throw new BookedException(name,day,slot);
            case 5: if (day5slots[slot-1] == 0) day5slots[slot-1] = 1;
            else throw new BookedException(name,day,slot);
        }
    }

    public String toString() {
        return scheduleSlot(day, slot);
    }
}