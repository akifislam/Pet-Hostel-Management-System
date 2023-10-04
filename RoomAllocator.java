public class RoomAllocator {

    Room smallRoom;
    Room mediumRoom;
    Room bigRoom;
    Room aquaRoom;

    RoomAllocator() {
        smallRoom = PetHostelOwner.getRoom("small");
        mediumRoom = PetHostelOwner.getRoom("medium");
        bigRoom = PetHostelOwner.getRoom("big");
        aquaRoom = PetHostelOwner.getRoom("aqua");

    }

    boolean bookRoom(double pet_weight, String pet_type, int no_of_days) {
        System.out.println("***Order No:"+PetHostelOwner.order_count+"***");
        PetHostelOwner.order_count+=1;

//        System.out.println("Received Weight : "+pet_weight);

        if (pet_type == "aqua") {
            if (aquaRoom.isAvailable()) {
                if(pet_weight>0.0 && pet_weight<=1.0) {
                    aquaRoom.available_capacity--;
                    System.out.println("You have allocated to " + aquaRoom.size + " room");
                    System.out.println("This room more " + aquaRoom.available_capacity + " spaces to allocate");
                    System.out.println("Total Bill for the customer: " + 25 * no_of_days + " $");
                    PetHostelOwner.total_revenue += 25 * no_of_days;
                    System.out.println();
                    return true;
                }
            }
            return false;

        } else {
            if (pet_weight > smallRoom.permissible_start_weight && pet_weight < smallRoom.permissible_end_weight) {
                smallRoom.available_capacity--;

                System.out.println("You have allocated to " + smallRoom.size);
                System.out.println("This room more " + smallRoom.available_capacity + " spaces to allocate");
                System.out.println("Total Bill for the customer : " + 30 * no_of_days + " $");
                PetHostelOwner.total_revenue+=30*no_of_days;
                System.out.println();

                return true;

            } else if (pet_weight > bigRoom.permissible_start_weight && pet_weight < bigRoom.permissible_end_weight) {
                bigRoom.available_capacity--;

                System.out.println("You have allocated to " + bigRoom.size);
                System.out.println("This room more " + bigRoom.available_capacity + " spaces to allocate");
                System.out.println("Total Bill for the customer: " + 80 * no_of_days + " $");
                PetHostelOwner.total_revenue+=80*no_of_days;
                System.out.println();

                return true;

            } else if (pet_weight > mediumRoom.permissible_start_weight && pet_weight < mediumRoom.permissible_end_weight) {
                mediumRoom.available_capacity--;

                System.out.println("You have allocated to " + mediumRoom.size);
                System.out.println("This room more " + mediumRoom.available_capacity + " spaces to allocate");
                System.out.println("Total Bill for the customer : " + 50 * no_of_days + " $");
                PetHostelOwner.total_revenue+=50*no_of_days;
                System.out.println();

                return true;

            }
            System.out.println();
            return false;

        }

    }
}
