import factory.ModernFactory;
import factory.VictorianFactory;
import product.chair.ModernChair;
import product.chair.VictorianChair;
import product.sofa.ModernSofa;
import product.sofa.VictorianSofa;
import product.table.ModernTable;
import product.table.VictorianTable;

public class Main {
    public static void main(String[] args) {
        ModernFactory modernFactory = new ModernFactory();

        ModernChair modernChair = (ModernChair) modernFactory.createChair();
        modernChair.beChair();

        ModernSofa modernSofa = (ModernSofa) modernFactory.createSofa();
        modernSofa.beSofa();

        ModernTable modernTable = (ModernTable) modernFactory.createTable();
        modernTable.beTable();


        VictorianFactory victorianFactory = new VictorianFactory();

        VictorianChair victorianChair = (VictorianChair) victorianFactory.createChair();
        victorianChair.beChair();

        VictorianSofa victorianSofa = (VictorianSofa) victorianFactory.createSofa();
        victorianSofa.beSofa();

        VictorianTable victorianTable = (VictorianTable) victorianFactory.createTable();
        victorianTable.beTable();
    }
}
