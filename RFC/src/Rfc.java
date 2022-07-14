/**
 *
 * @author Aylin
 */
public class Rfc {
    private static ModelRfc modelrfc;
    private static controllers controllers;
    private static ViewRFC viewrfc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelrfc = new ModelRfc();
        viewrfc = new ViewRFC();
        controllers = new controllers(modelrfc, viewrfc);
    }

}
