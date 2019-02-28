package TrafficLights;

import java.util.List;

public class Traffic {

    private List<TrafficLights> trafficLights;

    public Traffic(List<TrafficLights> trafficLights) {
        this.trafficLights = trafficLights;
    }

    public void changeTrafficLight() {
        TrafficLights currLight = this.trafficLights.remove(this.trafficLights.size() - 1);
        trafficLights.add(0, currLight);
        for (TrafficLights trafficLight : trafficLights) {
            System.out.print(trafficLight.name()+" ");
        }
        System.out.println();

    }

    public List<TrafficLights> getTrafficLights() {
        return trafficLights;
    }

    public void setTrafficLights(List<TrafficLights> trafficLights) {
        this.trafficLights = trafficLights;
    }
}
