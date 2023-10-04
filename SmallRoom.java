public class SmallRoom extends Room {
    public void get_small_room() {
        SmallRoom smallRoom = new SmallRoom();
        setRoom("small");
        setRoomNo(3);
        setWeightRange(1, 9);
        setCapacity(20);
    }
}

