package individual.task4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    public static final int MAX_ROOM_COUNT = 2;

    private final List<Booking> bookingList = new ArrayList<>();

    public boolean settle(Client client, int durationMs) {
        Booking booking = new Booking(client, this, durationMs);
        booking.settle();
        return hasFreeRooms();
    }

    public synchronized List<Booking> getBookingList() {
        return bookingList;
    }

    public synchronized boolean hasFreeRooms() {
        return bookingList.size() < MAX_ROOM_COUNT;
    }

    public String getFreeRooms() {
        return " free rooms = " + (Hotel.MAX_ROOM_COUNT - getBookingList().size());
    }
}
