package tito.example.com.environ_mumbai_hackathon.Model;

/**
 * Created by tito on 10/3/18.
 */

public class Data_air {
    private String datetime;
    private String country_name;
    private String breezometer_aqi;
    private String breezometer_color;
    private String breezometer_description;
    private String country_aqi;
    private String country_aqi_prefix;
    private String country_color;
    private String country_description;
    private String data_valid;
    private String key_valid;
    private Random_Recommendation random_recommendations;
    private String dominant_pollutant_canonical_name;
    private String dominant_pollutant_description;
    private Dominant_pollutant_text dominant_pollutant_text;
    private Pollutants pollutants;

    public Data_air() {
    }

    public String getDominant_pollutant_description() {
        return dominant_pollutant_description;
    }

    public void setDominant_pollutant_description(String dominant_pollutant_description) {
        this.dominant_pollutant_description = dominant_pollutant_description;
    }

    public Data_air(String datetime, String country_name, String breezometer_aqi, String breezometer_color, String breezometer_description, String country_aqi, String country_aqi_prefix, String country_color, String country_description, String data_valid, String key_valid, Random_Recommendation random_recommendations, String dominant_pollutant_canonical_name, String dominant_pollutant_description, Dominant_pollutant_text dominant_pollutant_text, Pollutants pollutants) {
        this.datetime = datetime;
        this.country_name = country_name;
        this.breezometer_aqi = breezometer_aqi;
        this.breezometer_color = breezometer_color;
        this.breezometer_description = breezometer_description;
        this.country_aqi = country_aqi;
        this.country_aqi_prefix = country_aqi_prefix;
        this.country_color = country_color;
        this.country_description = country_description;
        this.data_valid = data_valid;
        this.key_valid = key_valid;
        this.random_recommendations = random_recommendations;
        this.dominant_pollutant_canonical_name = dominant_pollutant_canonical_name;
        this.dominant_pollutant_text = dominant_pollutant_text;
        this.dominant_pollutant_description=dominant_pollutant_description;
        this.pollutants = pollutants;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getBreezometer_aqi() {
        return breezometer_aqi;
    }

    public void setBreezometer_aqi(String breezometer_aqi) {
        this.breezometer_aqi = breezometer_aqi;
    }

    public String getBreezometer_color() {
        return breezometer_color;
    }

    public void setBreezometer_color(String breezometer_color) {
        this.breezometer_color = breezometer_color;
    }

    public String getBreezometer_description() {
        return breezometer_description;
    }

    public void setBreezometer_description(String breezometer_description) {
        this.breezometer_description = breezometer_description;
    }

    public String getCountry_aqi() {
        return country_aqi;
    }

    public void setCountry_aqi(String country_aqi) {
        this.country_aqi = country_aqi;
    }

    public String getCountry_aqi_prefix() {
        return country_aqi_prefix;
    }

    public void setCountry_aqi_prefix(String country_aqi_prefix) {
        this.country_aqi_prefix = country_aqi_prefix;
    }

    public String getCountry_color() {
        return country_color;
    }

    public void setCountry_color(String country_color) {
        this.country_color = country_color;
    }

    public String getCountry_description() {
        return country_description;
    }

    public void setCountry_description(String country_description) {
        this.country_description = country_description;
    }

    public String getData_valid() {
        return data_valid;
    }

    public void setData_valid(String data_valid) {
        this.data_valid = data_valid;
    }

    public String getKey_valid() {
        return key_valid;
    }

    public void setKey_valid(String key_valid) {
        this.key_valid = key_valid;
    }

    public Random_Recommendation getRandom_recommendations() {
        return random_recommendations;
    }

    public void setRandom_recommendations(Random_Recommendation random_recommendations) {
        this.random_recommendations = random_recommendations;
    }

    public String getDominant_pollutant_canonical_name() {
        return dominant_pollutant_canonical_name;
    }

    public void setDominant_pollutant_canonical_name(String dominant_pollutant_canonical_name) {
        this.dominant_pollutant_canonical_name = dominant_pollutant_canonical_name;
    }

    public Dominant_pollutant_text getDominant_pollutant_text() {
        return dominant_pollutant_text;
    }

    public void setDominant_pollutant_text(Dominant_pollutant_text dominant_pollutant_text) {
        this.dominant_pollutant_text = dominant_pollutant_text;
    }

    public Pollutants getPollutants() {
        return pollutants;
    }

    public void setPollutants(Pollutants pollutants) {
        this.pollutants = pollutants;
    }
}
