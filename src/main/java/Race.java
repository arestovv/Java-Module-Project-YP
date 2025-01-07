public class Race {

    private String nameLeader = "";
    private int distanceLeader = 0;

    public String getNameLeader() {
        return nameLeader;
    }

    public void calculatePosition(Car car) {
        int time = 24;
        int currentDistance = time * car.getSpeed();

        if (currentDistance > distanceLeader) {
            distanceLeader = currentDistance;
            nameLeader = car.getName();
        }
    }
}