package lab4.ru.billing.client;

import lab4.ru.billing.exceptions.CatalogLoadException;
import lab4.ru.billing.exceptions.ItemAlreadyExistsException;
import lab4.ru.billing.stocklist.Category;
import lab4.ru.billing.stocklist.FoodItem;
import lab4.ru.billing.stocklist.GenericItem;
import lab4.ru.billing.stocklist.ItemCatalog;

import java.time.LocalDate;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12, LocalDate.now(),(short)10);
        try {
            cat.addItem(item1);
            cat.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}
