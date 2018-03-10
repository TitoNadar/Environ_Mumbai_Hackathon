package tito.example.com.environ_mumbai_hackathon.Model;

/**
 * Created by tito on 10/3/18.
 */

public class Dominant_pollutant_text {
    private String main;
    private String effects;
    private  String causes;

    public Dominant_pollutant_text() {
    }

    public Dominant_pollutant_text(String main, String effects, String causes) {
        this.main = main;
        this.effects = effects;
        this.causes = causes;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }
}
