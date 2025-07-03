package badmintonclass.batchmodel;

public class Batch {
    private String slot;
    private int spot;
    private int id;

    public Batch(int id, String slot, int spot) {
        this.id = id;
        this.slot = slot;
        this.spot = spot;
    }

    public Batch(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "slot='" + slot + '\'' +
                ", spot=" + spot +
                ", id=" + id +
                '}';
    }
}
