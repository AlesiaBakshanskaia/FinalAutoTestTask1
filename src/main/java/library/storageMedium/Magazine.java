package library.storageMedium;

public class Magazine extends StorageMedium {
    private final String number;


    public Magazine(String nameMedia, int publicationYear, int id, String number) {
        super(nameMedia, publicationYear, id);
        this.number = number;
    }
    @Override
    public void printMedium() {
        System.out.printf("Название: \"%s\", номер: %s, год издания: %d%n", nameMedia, number, publicationYear);
    }

    public String getNumber() {
        return number;
    }

}
