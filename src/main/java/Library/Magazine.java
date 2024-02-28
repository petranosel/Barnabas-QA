package Library;

public class Magazine extends LibraryItem  {
    private int issueNumber;

    public Magazine(String title, int identifier, int issueNumber) {
        super(title, identifier);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine: " + getTitle() + ", Issue: " + issueNumber;
}}
