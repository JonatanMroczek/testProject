public class Movie {
    private String title;
    private String directorName;
    private String directorSurname;
    private int lenghtInMinutes;
    private int productionYear;

    public Movie(String title, String directorName, String directorSurname, int lenghtInMinutes, int productionYear) {
        this.title = title;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.lenghtInMinutes = lenghtInMinutes;
        this.productionYear = productionYear;
    }
    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public int getLenghtInMinutes() {
        return lenghtInMinutes;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
