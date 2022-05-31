public class HarmonicAverage {

    public static void main(String[] args) {

        int[] list  = {2,5,12,34,23,124};
        double harmonicSeries = 0.0;


        for(int i = 0;i<list.length;i++){

            harmonicSeries += (1.0/list[i]);
        }

        double harmonicAverage = harmonicSeries/list.length;
        System.out.println("Harmonic Average: " + harmonicAverage);

    }

}