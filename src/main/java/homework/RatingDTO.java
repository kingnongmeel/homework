package homework;

public class RatingDTO {
    private int rating1;
    private int rating2;


    public RatingDTO() {
    }


    public RatingDTO(int rating1, int rating2) {
        this.rating1 = rating1;
        this.rating2 = rating2;
    }


    public int getRating1() {
        return rating1;
    }

    public void setRating1(int rating1) {
        this.rating1 = rating1;
    }

    public int getRating2() {
        return rating2;
    }

    public void setRating2(int rating2) {
        this.rating2 = rating2;
    }


    @Override
    public String toString() {
        return "RatingDTO{" +
                "rating1=" + rating1 +
                ", rating2=" + rating2 +
                '}';
    }
}
