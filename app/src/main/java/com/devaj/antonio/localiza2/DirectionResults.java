package com.devaj.antonio.localiza2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DirectionResults {
    @SerializedName("routes")
    private List<Route> routes;

    public List<Route> getRoutes() {
        return routes;
    }

    public class Route {
        @SerializedName("overview_polyline")
        private OverviewPolyLine overviewPolyLine;

        private List<Legs> legs;

        public OverviewPolyLine getOverviewPolyLine() {
            return overviewPolyLine;
        }

        public List<Legs> getLegs() {
            return legs;
        }
    }

    public class Legs {
        private List<Steps> steps;

        public List<Steps> getSteps() {
            return steps;
        }
    }

    public class Steps {
        private Location start_location;
        private Location end_location;
        private OverviewPolyLine polyline;

        public Location getStart_location() {
            return start_location;
        }

        public Location getEnd_location() {
            return end_location;
        }

        public OverviewPolyLine getPolyline() {
            return polyline;
        }
    }

    public class OverviewPolyLine {

        @SerializedName("points")
        public String points;

        public String getPoints() {
            return points;
        }
    }

    public class Location {
        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public double getLng() {
            return lng;
        }
    }
}
