public class Room {
    // Constructor
    Room(int room_no,double room_wrl, double room_wrr,int capacity,String size, boolean isAqua ){
        setRoomSize(size);
        setRoomNo(room_no);
        setWeightRange(room_wrl, room_wrr);
        setCapacity(capacity);
        this.isAquiriumRoom = isAqua;
    }

    // Class Members
    public String size;
    public int room_no;
    public double permissible_start_weight;
    public double permissible_end_weight;

    public int totalcapacity;
    public int available_capacity;

    boolean isAquiriumRoom;


    public void setRoomSize(String room_size){
        this.size = room_size;
    }

    public void setRoomNo(int room_no){
        this.room_no = room_no;
    }

    public void setWeightRange(double a, double b){
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
