package JavaBasic.String.DataSmoothing;

import java.util.Arrays;

public class SensorDataAnalysis {
    // TODO: Write the processSensorData method here
    public static double processSensorData (double[] data){

        return Arrays.stream(data).sorted().
                filter(x -> x%2 ==0).count();


    }


    public static void main(String[] args) {
        double[] rawReadings = {24.5, 18.2, 29.1, 21.0, 19.5, 35.0, 22.8};

        System.out.println("Raw Data: " + Arrays.toString(rawReadings));

        // TODO: Call your method and store the result
        double stableAvg = 0.0; // call processSensorData(rawReadings);

        System.out.println("Stable Average: " + stableAvg);
    }
}
