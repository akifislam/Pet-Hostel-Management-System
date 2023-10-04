public class PetCareDemo {
    public static void main(String[] args) {
        // Create a hostel owner who will set room policy
        PetHostelOwner owner = new PetHostelOwner();
        owner.setRoomPolicy();

        // Create a co-ordinator or hostel-manager to allocate rooms for customer's pet
        RoomAllocator manager = new RoomAllocator();

        // Create Clients
        Client a = new Client();
        Client b = new Client();
        Client c = new Client();

        // Clients are ordering for various pets and no of days
        a.order_hostel(21.0,"bird",5);
        b.order_hostel(48.0,"tiger",100);
        c.order_hostel(0.5,"aqua",55);

        a.order_hostel(100,"aqua",4);
        a.order_hostel(0.5,"aqua",100);

        // Sales Report
        System.out.println("Total Customer Served : "+PetHostelOwner.total_client_reached);
        System.out.println("Total Owner Revenue: "+PetHostelOwner.total_revenue + "$");

    }
}

