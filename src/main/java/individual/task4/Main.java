package individual.task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Client client1 = new Client("Mary", "Johnson");
        Client client2 = new Client("Gary", "Moore");
        Client client3 = new Client("Bruce", "Willice");
        Hotel hotel = new Hotel();
        Logger.log("Created hotel, max rooms = " + hotel.MAX_ROOM_COUNT);
        Logger.log(
                Thread.currentThread().getName() + " - Settle client " + client1 + " " + hotel.settle(client1, 5000));
        Logger.log(
                Thread.currentThread().getName() + " - Settle client " + client2 + " " + hotel.settle(client2, 2000));
        Thread.sleep(1000);
        Logger.log(
                Thread.currentThread().getName() + " - Settle client " + client3 + " " + hotel.settle(client3, 7000));

//        2023-05-13T12:12:29.617 - Created hotel, max rooms = 2
//        2023-05-13T12:12:29.687 - main - starting booking Client{name='Mary', surname='Johnson'} for 5000 free rooms = 2
//        2023-05-13T12:12:29.687 - main - Settle client Client{name='Mary', surname='Johnson'} true
//        2023-05-13T12:12:29.687 - main - starting booking Client{name='Gary', surname='Moore'} for 2000 free rooms = 1
//        2023-05-13T12:12:29.687 - main - Settle client Client{name='Gary', surname='Moore'} false
//        2023-05-13T12:12:29.690 - Thread-0 - started living... Client{name='Mary', surname='Johnson'} for 5000 free rooms = 0
//        2023-05-13T12:12:29.690 - Thread-1 - started living... Client{name='Gary', surname='Moore'} for 2000 free rooms = 0
//        2023-05-13T12:12:30.687 - main - starting booking Client{name='Bruce', surname='Willice'} for 7000 free rooms = 0
//        2023-05-13T12:12:30.687 - main - waiting ... Client{name='Bruce', surname='Willice'} for a free room  free rooms = 0
//        2023-05-13T12:12:31.187 - main - waiting ... Client{name='Bruce', surname='Willice'} for a free room  free rooms = 0
//        2023-05-13T12:12:31.687 - main - waiting ... Client{name='Bruce', surname='Willice'} for a free room  free rooms = 0
//        2023-05-13T12:12:31.690 - Thread-1 - ended living Client{name='Gary', surname='Moore'} for 2000 free rooms = 1
//        2023-05-13T12:12:32.187 - main - Settle client Client{name='Bruce', surname='Willice'} false
//        2023-05-13T12:12:32.187 - Thread-2 - started living... Client{name='Bruce', surname='Willice'} for 7000 free rooms = 0
//        2023-05-13T12:12:34.690 - Thread-0 - ended living Client{name='Mary', surname='Johnson'} for 5000 free rooms = 1
//        2023-05-13T12:12:39.187 - Thread-2 - ended living Client{name='Bruce', surname='Willice'} for 7000 free rooms = 2
//
//        Process finished with exit code 0

    }
}
