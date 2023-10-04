public class Client {
    // Client talks with Room Allocator in the PetCare shop
    private RoomAllocator manager = new RoomAllocator();

    public void order_hostel(double pet_weight, String pet_type, int no_of_days) {
        if (manager.bookRoom(pet_weight, pet_type, no_of_days)) {
//            System.out.println("Successfully Booked a Room !");
            PetHostelOwner.total_client_reached+=1;
        } else {
            System.out.println("There are not available room.\n");
        }
    }

}
