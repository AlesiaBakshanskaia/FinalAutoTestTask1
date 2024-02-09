package library.fund;

import library.storageMedium.StorageMedium;

import java.util.List;

public abstract class AbstractFund {
    protected String nameLibrary;
    protected String address;
    protected List<StorageMedium> listOfStorageMedia;

    public AbstractFund(String nameLibrary, String address, List<StorageMedium> listOfStorageMedium) {
        this.nameLibrary = nameLibrary;
        this.address = address;
        this.listOfStorageMedia = listOfStorageMedium;
    }

    public List<StorageMedium> getListOfStorageMedia() {
        return listOfStorageMedia;
    }

    public void addStorageMediaInList(StorageMedium storageMedia) {
        this.listOfStorageMedia.add(storageMedia);
    }

    public String getName() {
        return nameLibrary;
    }

    public String getAddress() {
        return address;
    }

}
