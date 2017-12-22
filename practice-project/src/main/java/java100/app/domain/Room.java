package java100.app.domain;

import java100.app.control.CSVFormatException;

public class Room {
    protected int no;
    protected String location;
    protected String name;
    protected int capacity;
    
    public Room() {}
    
    public Room(int no, String location, String name, int capacity) {
        this.no = no;
        this.location = location;
        this.name = name;
        this.capacity = capacity;
    }

    public Room(String csv) throws CSVFormatException {
        String[] rec = csv.split(",");
        if (rec.length != 4)
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수가 올바르지 않습니다.");
        
        try {
            this.no = Integer.parseInt(rec[0]);
            this.location = rec[1];
            this.name = rec[2];
            this.capacity = Integer.parseInt(rec[3]);
        } catch (Exception e) {
            throw new CSVFormatException(
                    "CSV 데이터 항목의 형식이 올바르지 않습니다.");
        }
    }

    @Override
    public String toString() {
        return "Room [no=" + no + ", location=" + location + ", name=" + name + ", capacity=" + capacity + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toCSVString() {
        return String.format("%d,%s,%s,%d", 
                this.getNo(),
                this.getName(),
                this.getLocation(),
                this.getCapacity());
    }

}