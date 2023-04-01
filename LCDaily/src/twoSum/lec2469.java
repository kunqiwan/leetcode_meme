package twoSum;

public class lec2469 {
    public double[] convertTemperature(double celsius) {
        double Kelvin  =celsius+273.15 ;
        double Fahrenheit = celsius * 1.80 + 32.00;
        double[] result = new double[2];
        result[0] = Kelvin;
        result[1] = Fahrenheit;
        return result;
    }
}
