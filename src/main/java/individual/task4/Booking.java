package individual.task4;

public class Booking implements Runnable {

    private final Client client;
    private final Hotel hotel;
    private int durationMs;

    public Booking(Client client, Hotel hotel, int durationMs) {
        this.client = client;
        this.hotel = hotel;
        this.durationMs = durationMs;
    }

    public void settle() {
        synchronized (hotel) {
            Logger.log(
                    Thread.currentThread().getName() + " - starting booking " + client + " for " + durationMs
                            + hotel.getFreeRooms());

            while (!hotel.hasFreeRooms()) {
                try {
                    Logger.log(
                            Thread.currentThread().getName() + " - waiting ... " + client + " for a free room "
                                    + hotel.getFreeRooms());
                    hotel.wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            hotel.getBookingList().add(this);
            Thread thread = new Thread(this);
            thread.start();
        }
    }


    @Override
    public void run() {
        Logger.log(
                Thread.currentThread().getName() + " - started living... " + client + " for " + durationMs
                        + hotel.getFreeRooms());
        try {
            Thread.sleep(durationMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hotel.getBookingList().remove(this);
        Logger.log(
                Thread.currentThread().getName() + " - ended living " + client + " for " + durationMs
                        + hotel.getFreeRooms());
    }
}
