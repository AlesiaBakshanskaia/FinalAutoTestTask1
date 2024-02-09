package library.storageMedium;

public abstract class StorageMedium {
    protected String nameMedia;
    protected int publicationYear;
    protected int id;
    private MediumStatus mediumStatus;

    public StorageMedium(String nameMedia, int publicationYear, int id) {
        this.nameMedia = nameMedia;
        this.publicationYear = publicationYear;
        this.id = id;
        this.mediumStatus = MediumStatus.AVAILABLE;
    }

    public String getNameMedia() {
        return nameMedia;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getId() {
        return id;
    }

    public MediumStatus getStatusMedium() {
        return mediumStatus;
    }

    public void setStatusMedium(MediumStatus mediumStatus) {
        this.mediumStatus = mediumStatus;
    }

    public abstract void printMedium();

}
