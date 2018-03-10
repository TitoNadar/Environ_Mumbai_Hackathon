package tito.example.com.environ_mumbai_hackathon.Model;

/**
 * Created by tito on 10/3/18.
 */

public class Pollutants {
    private Pollutant_data co;
    private Pollutant_data no2;
    private Pollutant_data o3;
    private Pollutant_data pm10;
    private Pollutant_data pm25;
    private Pollutant_data so2;

    public Pollutants() {
    }

    public Pollutants(Pollutant_data co, Pollutant_data no2, Pollutant_data o3, Pollutant_data pm10, Pollutant_data pm25, Pollutant_data so2) {
        this.co = co;
        this.no2 = no2;
        this.o3 = o3;
        this.pm10 = pm10;
        this.pm25 = pm25;
        this.so2 = so2;
    }

    public Pollutant_data getCo() {
        return co;
    }

    public void setCo(Pollutant_data co) {
        this.co = co;
    }

    public Pollutant_data getNo2() {
        return no2;
    }

    public void setNo2(Pollutant_data no2) {
        this.no2 = no2;
    }

    public Pollutant_data getO3() {
        return o3;
    }

    public void setO3(Pollutant_data o3) {
        this.o3 = o3;
    }

    public Pollutant_data getPm10() {
        return pm10;
    }

    public void setPm10(Pollutant_data pm10) {
        this.pm10 = pm10;
    }

    public Pollutant_data getPm25() {
        return pm25;
    }

    public void setPm25(Pollutant_data pm25) {
        this.pm25 = pm25;
    }

    public Pollutant_data getSo2() {
        return so2;
    }

    public void setSo2(Pollutant_data so2) {
        this.so2 = so2;
    }
}
