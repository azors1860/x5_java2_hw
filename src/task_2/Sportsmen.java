package task_2;

import java.util.Objects;

public class Sportsmen {
    private String Name;
    private boolean hasRecord;
    private boolean hasTeam;

    private static int count = 0;

    public Sportsmen(String name, boolean hasRecord, boolean hasTeam) {
        Name = name;
        this.hasRecord = hasRecord;
        this.hasTeam = hasTeam;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isHasRecord() {
        return hasRecord;
    }

    public void setHasRecord(boolean hasRecord) {
        this.hasRecord = hasRecord;
    }

    public boolean isHasTeam() {
        return hasTeam;
    }

    public void setHasTeam(boolean hasTeam) {
        this.hasTeam = hasTeam;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsmen sportsmen = (Sportsmen) o;
        return hasRecord == sportsmen.hasRecord &&
                hasTeam == sportsmen.hasTeam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasRecord, hasTeam);
    }
}