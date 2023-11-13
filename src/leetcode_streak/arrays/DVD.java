package leetcode_streak.arrays;

public class DVD {
    public String name;
    public int releasedYear;
    public String director;

    public DVD(String name, int releasedYear, String director) {
        this.name = name;
        this.releasedYear = releasedYear;
        this.director = director;
    }

    @Override
    public String toString() {
        return this.name + "was directed by " + this.director + " which was released in " + this.releasedYear;
    }
}
