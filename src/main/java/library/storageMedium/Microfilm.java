package library.storageMedium;

public class Microfilm extends StorageMedium {
    private final MicrofilmType microfilmType;

    public Microfilm(String nameMedia, int publicationYear, int id, MicrofilmType microfilmType) {
        super(nameMedia, publicationYear, id);
        this.microfilmType = microfilmType;
    }
    @Override
    public void printMedium() {
        System.out.printf("Название: \"%s\", тип: %s, год издания: %d%n", nameMedia, microfilmType, publicationYear);
    }

    public MicrofilmType getMicrofilmType() {
        return microfilmType;
    }

}
