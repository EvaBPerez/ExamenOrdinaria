package ecamenordinaria.view;

import ecamenordinaria.model.ListProducts;
import java.util.List;

public interface ListDisplay {
    public void display(ListProducts list);
    public void display(List<String> list);
}
