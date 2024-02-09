package library.search;

import library.fund.AbstractFund;
import library.storageMedium.StorageMedium;

import java.util.List;

public interface SearchService {
    List<StorageMedium> findStorageMedium(AbstractFund fund, int id);

    List<StorageMedium> findStorageMedium(AbstractFund fund, String author);

}
