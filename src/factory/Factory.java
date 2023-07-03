package factory;

import product.chair.Chair;
import product.sofa.Sofa;
import product.table.Table;

public interface Factory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
