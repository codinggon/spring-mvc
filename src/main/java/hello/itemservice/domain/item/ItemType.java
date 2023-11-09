package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("도서"), FOOD("실품"), ETC("기타");

    private final String description;


    ItemType(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

}
