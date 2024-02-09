package library.storageMedium;

public class Book extends StorageMedium implements AuthorReternable{
    private final String author;

    public Book(String nameMedia, int publicationYear, int id, String author) {
        super(nameMedia, publicationYear, id);
        this.author = author;
    }


    @Override
    public void printMedium() {
        System.out.printf("Название: \"%s\", автор: %s, год издания: %d%n", nameMedia, author, publicationYear);
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
