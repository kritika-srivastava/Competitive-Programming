class Temperature {
    double temp;

    public Temperature() {
        temp = 92;
    }

    public Temperature(double t) {
        temp = t;
    }

    public double convert2Celcius() {
        double Cel = (5.0 / 9) * (temp - 32);
        return Cel;
    }

    public double getTemp() {
        return temp;
    }
}

public class ImplementTemperature {
    public static void main(String Args[]) {
        Temperature dayTemp = new Temperature(98);
        System.out.println("Temperature in Fahrenheit is :" + dayTemp.getTemp());
        System.out.println("Temperature in Celsius is :" + dayTemp.convert2Celcius());
        Temperature dTemp = new Temperature();
        System.out.println("Other Temperature in Fahrenheit is :" + dTemp.getTemp());
        System.out.println("Other Temperature in Celsius is :" + dTemp.convert2Celcius());
    }
}
