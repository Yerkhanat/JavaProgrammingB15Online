package day55;

public class Taxi {
    int plateNumber;
    Engine eng;
    Driver dr;

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr =dr;

    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                ", dr=" + dr +
                '}';
    }
}

class Engine{
    String type;
    private int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;

    }

    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }


}

class Driver {
    String name;
    int driverId;

    public Driver(String name, int driverId) {
        this.name = name;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverId=" + driverId +
                '}';
    }
}

