package ventanas;

import java.awt.*;
import javax.swing.*;
import paneles.*;

public class Dashboard {

    private JFrame ventanaNueva;

    public Dashboard() {
        ventanaNueva = new JFrame("Tienda Fake");
        ventanaNueva.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNueva.setLayout(new BorderLayout());
        ventanaNueva.setLocationRelativeTo(null);

        // ---- Panel lateral (menú) ----
        MenuLateralPanel menuLateral = new MenuLateralPanel();
        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        panelIzquierdo.setBackground(new Color(154, 199, 188));
        panelIzquierdo.setPreferredSize(new Dimension(300, 800)); 
        panelIzquierdo.add(menuLateral.getJPanel(), BorderLayout.NORTH);
        ventanaNueva.add(panelIzquierdo, BorderLayout.WEST);

        // ---- Panel central (productos) ----
        ProductoPanel productos = new ProductoPanel();
        ventanaNueva.add(productos.getJPanel(), BorderLayout.CENTER);

        ventanaNueva.setVisible(true);  // Mostrar ventana
    }
}
