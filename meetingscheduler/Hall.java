package meetingscheduler;

public abstract class Hall implements Meeting{
    public int noOfSlots;
    public int[] day1slots, day2slots, day3slots, day4slots, day5slots;

    Hall() {
        this.noOfSlots = 4;
        this.day1slots = new int[noOfSlots];
        this.day2slots = new int[noOfSlots];
        this.day3slots = new int[noOfSlots];
        this.day4slots = new int[noOfSlots];
        this.day5slots = new int[noOfSlots];
    }

    //Method overloading in class Hall
    //void checkBookedSlots()

    public void checkBookedSlots(int day) {
        switch (day) {
            case 1:
                System.out.println("Day1 Booked Slots");
                for (int i=0; i<noOfSlots; i++) {
                    if (day1slots[i] == 1) System.out.println(i+1);
                } break;
            case 2:
                System.out.println("Day2 Booked Slots");
                for (int i=0; i<noOfSlots; i++) {
                    if (day2slots[i] == 1) System.out.println(i+1);
                } break;
            case 3:
                System.out.println("Day3 Booked Slots");
                for (int i=0; i<noOfSlots; i++) {
                    if (day3slots[i] == 1) System.out.println(i+1);
                } break;
            case 4:
                System.out.println("Day4 Booked Slots");
                for (int i=0; i<noOfSlots; i++) {
                    if (day4slots[i] == 1) System.out.println(i+1);
                } break;
            case 5:
                System.out.println("Day5 Booked Sots");
                for (int i=0; i<noOfSlots; i++) {
                    if (day5slots[i] == 1) System.out.println(i+1);
                } break;
        }
    }

    public void checkBookedSlots() {
        System.out.println("\nSlots Booked");
        System.out.println("Day1 Booked Slots");
        for (int i=0; i<noOfSlots; i++) {
            if (day1slots[i] == 1) System.out.println(i+1);
        }
        System.out.println("Day2 Booked Slots");
        for (int i=0; i<noOfSlots; i++) {
            if (day2slots[i] == 1) System.out.println(i+1);
        }
        System.out.println("Day3 Booked Slots");
        for (int i=0; i<noOfSlots; i++) {
            if (day3slots[i] == 1) System.out.println(i+1);
        }
        System.out.println("Day4 Booked Slots");
        for (int i=0; i<noOfSlots; i++) {
            if (day4slots[i] == 1) System.out.println(i+1);
        }
        System.out.println("Day5 Booked Sots");
        for (int i=0; i<noOfSlots; i++) {
            if (day5slots[i] == 1) System.out.println(i+1);
        }
    }
}
