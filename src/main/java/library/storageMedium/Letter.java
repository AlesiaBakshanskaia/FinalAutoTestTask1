package library.storageMedium;

public class Letter extends StorageMedium implements AuthorReternable{
    String author;
    String recipient;

    public Letter(String nameMedia, int publicationYear, int id, String author, String recipient) {
        super(nameMedia, publicationYear, id);
        this.author = author;
        this.recipient = recipient;
    }
    @Override
    public void printMedium() {
        System.out.printf("Название: \"%s\", автор: %s, получатель: %s,год издания: %d%n",
                nameMedia, author, recipient, publicationYear);
    }
    @Override
    public String getAuthor() {
        return author;
    }

    public String getRecipient() {
        return recipient;
    }

    }
