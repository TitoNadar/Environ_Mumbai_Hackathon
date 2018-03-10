package tito.example.com.environ_mumbai_hackathon.Model;

/**
 * Created by tito on 10/3/18.
 */

public class Random_Recommendation {
    private String children;
    private String sport;
    private String health;
    private String inside;
    private String outside;

    public Random_Recommendation() {
    }

    public Random_Recommendation(String children, String sport, String health, String inside, String outside) {
        this.children = children;
        this.sport = sport;
        this.health = health;
        this.inside = inside;
        this.outside = outside;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getOutside() {
        return outside;
    }

    public void setOutside(String outside) {
        this.outside = outside;
    }
}
