package tito.example.com.environ_mumbai_hackathon.Model;

/**
 * Created by tito on 10/3/18.
 */

public class Pollutant_data {
    private String pollutant_description;
    private String units;
    private String concentration;

    public Pollutant_data() {
    }

    public Pollutant_data(String pollutant_description, String units, String concentration) {
        this.pollutant_description = pollutant_description;
        this.units = units;
        this.concentration = concentration;
    }

    public String getPollutant_description() {
        return pollutant_description;
    }

    public void setPollutant_description(String pollutant_description) {
        this.pollutant_description = pollutant_description;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }
}
