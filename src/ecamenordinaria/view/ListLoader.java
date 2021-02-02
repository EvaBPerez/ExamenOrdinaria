package ecamenordinaria.view;

import ecamenordinaria.model.ListProducts;
import java.util.List;

public interface ListLoader {
    public ListProducts load(String name);
    public List<String> load(List<String> list);
}
