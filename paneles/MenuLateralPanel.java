package paneles;

import javax.swing.*;
import java.awt.*;

public class MenuLateralPanel {
    private JPanel panelMenu;

    public MenuLateralPanel() {
        panelMenu = new JPanel();
        panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS)); // <- apila vertical
        panelMenu.setPreferredSize(new Dimension(300, 800)); // ancho fijo de menú
        panelMenu.setBorder(BorderFactory.createDashedBorder(Color.BLUE));

        // Etiqueta "Buscar"
        JLabel lBuscar = new JLabel("Buscar");
        lBuscar.setForeground(Color.RED);
        lBuscar.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Campo de texto
        JTextField txtBuscar = new JTextField();
        txtBuscar.setMaximumSize(new Dimension(250, 30)); 
        txtBuscar.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtBuscar.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Botón "Buscar"
        JButton btnBuscar = new JButton("Buscar"); 
        btnBuscar.setMaximumSize(new Dimension(100, 30));
        btnBuscar.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Agregamos componentes con separadores
        panelMenu.add(Box.createRigidArea(new Dimension(0, 20))); // margen arriba
        panelMenu.add(lBuscar); 
        panelMenu.add(Box.createRigidArea(new Dimension(0, 5))); 
        panelMenu.add(txtBuscar);
        panelMenu.add(Box.createRigidArea(new Dimension(0, 10))); 
        panelMenu.add(btnBuscar);

        // Empuja el resto hacia arriba
        panelMenu.add(Box.createVerticalGlue());
    }

    public JPanel getJPanel() {
        return panelMenu;
    }

    // Ejemplo para probar el menú lateral
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tienda Fake");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Menú lateral
            MenuLateralPanel menu = new MenuLateralPanel();
            frame.add(menu.getJPanel(), BorderLayout.WEST);

            // Panel central simulado
            JPanel content = new JPanel();
            content.setBackground(Color.LIGHT_GRAY);
            frame.add(content, BorderLayout.CENTER);

            frame.setSize(1000, 800);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

