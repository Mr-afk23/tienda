import javax.swing.*;
import java.awt.*;
import paneles.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tienda Fake");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1000, 800);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); // inicia maximizada
        ventana.setLayout(new BorderLayout());
        ventana.setLocationRelativeTo(null);

        // ---- Panel lateral (menú) ----
        MenuLateralPanel menuLateral = new MenuLateralPanel();
        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        panelIzquierdo.setBackground(new Color(154, 199, 188));
        panelIzquierdo.setPreferredSize(new Dimension(300, 800)); 
        panelIzquierdo.add(menuLateral.getJPanel(), BorderLayout.NORTH);
        ventana.add(panelIzquierdo, BorderLayout.WEST);

        // ---- Panel central (productos) ----
        ProductoPanel productos = new ProductoPanel();
        ventana.add(productos.getJPanel(), BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}
