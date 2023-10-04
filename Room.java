public abstract class Room {
    Room(){
        setRoom("big");
        setRoomNo(1);
        setWeightRange(30, 100);
        setCapacity(5);
    }
    public String size;
    public int room_no;
    public int permissible_start_weight;
    public int permissible_end_weight;

    public int totalcapacity;
    public int available_capacity;


    public void setRoom(String room_size){

    }
    public void setRoomNo(int room_no){

    }

    public void setWeightRange(int a, int b){
        this.permissible_start_weight = a;
        this.permissible_end_weight = b;
    }

    public void setCapacity(int no_of_capacity){
        this.totalcapacity = no_of_capacity;
        this.available_capacity = no_of_capacity;
    }

    public boolean isAvailable(){
        if (available_capacity>0){
            return true;
        }
        else return false;
    }

}
