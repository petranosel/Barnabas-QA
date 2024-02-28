package Library;

public class LibraryItem {
    private String title;
    private int identifier;

    public LibraryItem(String title, int identifier) {
        this.title = title;
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "LibraryItem: Title - " + title + ", Identifier - " + identifier;
    }


}
