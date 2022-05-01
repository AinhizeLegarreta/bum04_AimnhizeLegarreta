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

    public int getId() {
        return id;
    }

    public Area getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getEmblemUrl() {
        return emblemUrl;
    }

    public String getPlan() {
        return plan;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public int getNumberOfAvailableSeasons() {
        return numberOfAvailableSeasons;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

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

        public int getId() {
            return id;
        }

        public String getStartDate() {
            return startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public int getCurrentMatchDate() {
            return currentMatchDate;
        }

        public Object getWinner() {
            return winner;
        }
    }



    public class Area {
        int id;
        String name;
        String countryCode;

        @Override
        public String toString() {
            return "Area{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", countryCode=" + countryCode +
                    '}';
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCountryCode() {
            return countryCode;
        }
    }


}
