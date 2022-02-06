package pl.edu.wszib.enums;

public enum Directions {
    NORTH("NORTH", "N", "PÓŁNOC", "PN"),
    SOUTH("SOUTH", "S", "POŁUDNIE", "PD" ),
    EAST ("EAST", "E", "WSCHÓD", "W"),
    WEST ("WEST", "W", "ZACHÓD", "Z" ),
    NORTH_EAST ("NORTH-EAST", "NE", "PÓŁNOCNY-WSCHÓD", "PN-W"),
    SOUTH_EAST ("SOUTH-EAST", "SE", "POŁUDNIOWY-WSCHÓD", "PD-W"),
    NORTH_WEST("NORTH-WEST", "NW", "PÓŁNOCNY-ZACHÓD", "PN-Z"),
    SOUTH_WEST("SOUTH-WEST", "SW", "POŁUDNIOWY-ZACHÓD", "PD-Z" );

    private String engDir;
  private String engShort;
  private String polDir;
  private String polShort;


    Directions(String engDir, String engShort, String polDir, String polShort) {
        this.engDir = engDir;
        this.engShort = engShort;
        this.polDir = polDir;
        this.polShort = polShort;
    }

    public String getEngDir() {
        return engDir;
    }

    public void setEngDir(String engDir) {
        this.engDir = engDir;
    }

    public String getEngShort() {
        return engShort;
    }

    public void setEngShort(String engShort) {
        this.engShort = engShort;
    }

    public String getPolDir() {
        return polDir;
    }

    public void setPolDir(String polDir) {
        this.polDir = polDir;
    }

    public String getPolShort() {
        return polShort;
    }

    public void setPolShort(String polShort) {
        this.polShort = polShort;
    }

    @Override
    public String toString() {
        return "Directions{" +
                "engDir='" + engDir + '\'' +
                ", engShort='" + engShort + '\'' +
                ", polDir='" + polDir + '\'' +
                ", polShort='" + polShort + '\'' +
                '}';
    }
}
