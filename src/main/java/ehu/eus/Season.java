package ehu.eus;

public class Season {
    int id;
    String startDate;
    String endDate;
    int currentMatchDate;
    Object winner;

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", currentMatchDate=" + currentMatchDate +
                ", winner=" + winner +
                '}';
    }
}
