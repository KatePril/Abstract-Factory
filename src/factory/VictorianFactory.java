package factory;

import product.chair.Chair;
import product.chair.VictorianChair;
import product.sofa.Sofa;
import product.sofa.VictorianSofa;
import product.table.Table;
import product.table.VictorianTable;

public class VictorianFactory implements Factory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
