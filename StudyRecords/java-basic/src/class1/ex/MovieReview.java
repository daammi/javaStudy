package class1.ex;

public class MovieReview {

    private String title;
    private String review;

    public MovieReview(String title, String review) {
        this.review = review;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
