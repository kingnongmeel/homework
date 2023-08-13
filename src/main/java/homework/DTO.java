package homework;

public class DTO {

    private int no;
    private String title;
    private int year;
    private int rating;
    private int genre;


    public DTO() {}


    public DTO(int no, String title, int year, int rating, int genre) {
        this.no = no;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "DTO{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genre=" + genre +
                '}';
    }
}
