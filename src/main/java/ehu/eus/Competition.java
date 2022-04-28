package ehu.eus;

public class Competition {
    int id;
    Area area;
    String name;
    String code;
    String emblemUrl;
    String plan;
    Season currentSeason;
    int numberOfAvailableSeasons;
    String lastUpdated;

    @Override
    public String toString() {
        return "Competition{" +
                "id=" + id +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", emblemUrl='" + emblemUrl + '\'' +
                ", plan='" + plan + '\'' +
                ", currentSeason=" + currentSeason +
                ", numberOfAvailableSeasons=" + numberOfAvailableSeasons +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
