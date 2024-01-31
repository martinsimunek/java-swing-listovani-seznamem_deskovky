import javax.swing.*;

public class DeskovkyFrame extends JFrame {
    private JButton btPrevious;
    private JButton btSaveChanges;
    private JButton btNext;
    private JTextField tfNazev;
    private JPanel panelMain;

    private final Model model = new Model();
    private int indexAktualniHry = 0;
    public DeskovkyFrame() {
        super("Deskovky");
        setContentPane(panelMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        zobrazDeskovku();
        btNext.addActionListener(e -> {
            // Ošetřit situaci, kdy jsme na konci seznamu!!!
            indexAktualniHry++;
            zobrazDeskovku();
        });
        btPrevious.addActionListener(e -> {
            // Ošetřit situaci, kdy jsme na začátku seznamu!!!
            indexAktualniHry--;
            zobrazDeskovku();
        });
    }

    public void zobrazDeskovku() {
        // Ošetřit situaci, kdy je seznam prázdný!!!
        Deskovka aktualniDeskovka = model.getDeskovka(indexAktualniHry);
        tfNazev.setText(aktualniDeskovka.getNazev());
    }
}
