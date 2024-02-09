package library.search;


import library.fund.AbstractFund;
import library.storageMedium.AuthorReternable;
import library.storageMedium.StorageMedium;

import java.util.ArrayList;
import java.util.List;

public class Searcher implements SearchService {


    @Override
    public List<StorageMedium> findStorageMedium(AbstractFund fund, int id) {
        List<StorageMedium> resultsOfSearch = new ArrayList<>();
        for (StorageMedium storageMedium : fund.getListOfStorageMedia()) {
            if (storageMedium.getId() == id) {
                resultsOfSearch.add(storageMedium);
            }
        }
        return resultsOfSearch;
    }

    @Override
    public List<StorageMedium> findStorageMedium(AbstractFund fund, String author) {
        List<StorageMedium> resultsOfSearch = new ArrayList<>();
        for (StorageMedium storageMedium : fund.getListOfStorageMedia()) {
            if (storageMedium instanceof AuthorReternable) {
                if (((AuthorReternable) storageMedium).getAuthor().equals(author)) {
                    resultsOfSearch.add(storageMedium);
                }
            }
        }
        return resultsOfSearch;
    }
}
