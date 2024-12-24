package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args)
    {
        MovieReview[] reviews = new MovieReview[2];

        reviews[0] = new MovieReview("인셉션", "인생은 무한루프");
        reviews[1] = new MovieReview("어바웃 타임","인생 시간 영화!");

        for (MovieReview r : reviews) {
            System.out.println("영화 제목: " + r.getTitle() + ", 리뷰: " + r.getReview());
        }
    }
}
