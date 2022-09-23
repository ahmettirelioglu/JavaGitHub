package Ahmet;

public class academician extends University{
    private String title;
    private int NumberOfArticlePublished;
    private String branch;

    public academician(String name, String lastName, String universityName, String facultyName, int phone, String mail, String address) {
        super(name, lastName, universityName, facultyName, phone, mail, address);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfArticlePublished() {
        return NumberOfArticlePublished;
    }

    public void setNumberOfArticlePublished(int numberOfArticlePublished) {
        NumberOfArticlePublished = numberOfArticlePublished;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
