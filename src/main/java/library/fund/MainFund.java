package library.fund;

import library.storageMedium.StorageMedium;

import java.util.List;

public class MainFund extends AbstractFund {
    private List<?> listOfReaders;

    public MainFund(String nameLibrary, String address, List<StorageMedium> listOfStorageMedium, List<?> listOfReaders) {
        super(nameLibrary, address, listOfStorageMedium);
        this.listOfReaders = listOfReaders;
    }

    public List<?> getListOfReaders() {
        return listOfReaders;
    }
}
