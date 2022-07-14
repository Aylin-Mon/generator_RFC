import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aylin
 */
public class controllers {
    ModelRfc modelrfc;
    ViewRFC viewrfc;

    public controllers(ModelRfc modelRfc, ViewRFC viewRFC) {
        this.modelrfc = modelRfc;
        this.viewrfc = viewRFC;
        this.viewrfc.Jb_generar.addActionListener(actionListener);
        initComponents();
    }

    ActionListener actionListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewrfc.Jb_generar) {
                calcularRFC();

            }
        }

    };

    public controllers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void calcularRFC() {
        modelrfc.setNombre(viewrfc.Jtf_nombre.getText().toUpperCase());
        modelrfc.setAp_paterno(viewrfc.Jtf_apellido_paterno.getText().toUpperCase());
        modelrfc.setAp_materno(viewrfc.Jtf_apellido_materno.getText().toUpperCase());
        modelrfc.setDia(String.valueOf(viewrfc.Js_dia.getValue()));
        modelrfc.setAnio(viewrfc.Jtf_anio.getText());

        if (modelrfc.getDia().length() <= 1) {
            modelrfc.setDia("0" + String.valueOf(viewrfc.Js_dia.getValue()));
        }

        switch (viewrfc.Jcb_mes.getSelectedIndex()) {
        case 0:
            modelrfc.setMes("01");
            break;
        case 1:
            modelrfc.setMes("02");
            break;
        case 2:
            modelrfc.setMes("03");
            break;
        case 3:
            modelrfc.setMes("04");
            break;
        case 4:
            modelrfc.setMes("05");
            break;
        case 5:
            modelrfc.setMes("06");
            break;
        case 6:
            modelrfc.setMes("07");
            break;
        case 7:
            modelrfc.setMes("08");
            break;
        case 8:
            modelrfc.setMes("09");
            break;
        case 9:
            modelrfc.setMes("10");
            break;
        case 10:
            modelrfc.setMes("11");
            break;
        case 11:
            modelrfc.setMes("12");
            break;
        }
        String RFC = modelrfc.getAp_paterno() + modelrfc.getAp_materno() + modelrfc.getNombre() + modelrfc.getAnio()
                + modelrfc.getMes() + modelrfc.getDia();

        viewrfc.Jtf_rfc.setText(RFC);
    }

    public final void initComponents() {
        viewrfc.setVisible(true);
    }

}
