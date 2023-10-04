import java.util.Date;
import java.text.SimpleDateFormat;

/*PetCare authority creates 4 category rooms. They are small, medium, big and water room.
 *
 * ==========================
 * BIGROOM-1
 * - Capacity : 5 Animals
 * - Weight Alowed : 30 KG to 50KG
 * - Has Aquirium? : No
 * ==========================
 *
 * * ==========================
 * MEDIUM ROOM-2
 * - Capacity : 10 Animals
 * - Weight Alowed : 10 KG to 29KG
 * - Has Aquirium? : No
 * ==========================
 *
 * SMALL ROOM-3
 * - Capacity : 20 Animals
 * - Weight Alowed : 1 KG to 9 KG
 * - Has Aquirium? : No
 * ==========================
 *
 * AQUIRIUM-4
 * - Capacity : 50 Fishes
 * - Weight Alowed : 0.1 KG to 0.99 KG
 * - Has Aquirium? : YES
 * ==========================
 * */

public class PetHostelOwner {

    public static Room bigRoom, mediumRoom, smallRoom, aquaRoom;
    public static int total_revenue,order_count;
    public static int total_client_reached;


    public void setRoomPolicy() {
        order_count = 1;
        // Creates 4 Rooms and Set Policies
        bigRoom = new Room(1, 30, 50, 5, "big", false);
        mediumRoom = new Room(2, 10, 30, 10, "medium", false);
        smallRoom = new Room(3, 1, 9, 10, "small", false);
        aquaRoom = new Room(4, 0.01, 1.00, 50, "aqua", true);
    }

    public static Room getRoom(String room_type) {
        if (room_type == "big") {
            return bigRoom;
        } else if (room_type == "medium") {
            return mediumRoom;
        } else if (room_type == "small") {
            return smallRoom;
        } else return aquaRoom;

    }

    public void showSalesReport() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);

        System.out.println("=====================================");
        System.out.println("On " + formattedDate);
        System.out.println("Total Revenue : " + total_revenue + "$");
        System.out.println("Total Client Received: " + total_client_reached);
        System.out.println("============Thank you=================");
    }


}
