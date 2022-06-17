package School;

public class ExamDTO {

    private String test; //프라이빗을 선언하면 남이 절대 쓸 수 없음

    public String getTest() {
        return test;
    }

    public void setTest(String test) { //파라미터 명확하게 해주시 위해 디스 붙이기
        this.test = test;
    }

    public int getScore() { //명확하게 해주기 위해 디스 붙이기
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int score;
}
