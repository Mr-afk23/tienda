package paneles;

import javax.swing.*;
import java.awt.*;

public class ProductoPanel {

    private JPanel panelProductos;

    public ProductoPanel() {
        panelProductos = new JPanel();
        panelProductos.setLayout(new BorderLayout());

        // Título arriba
        JLabel titulo = new JLabel("Productos");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelProductos.add(titulo, BorderLayout.NORTH);

        // Panel central con los cuadros (2 filas, 4 columnas)
        JPanel panelCuadros = new JPanel(new GridLayout(2, 4, 20, 20)); 
        panelCuadros.setBackground(Color.WHITE);

        // Datos de ejemplo
        String[] articulos = {
            "Zapatos", "Camisa", "Pantalón", "Gorra",
            "Reloj", "Bolsa", "Lentes", "Chaqueta"
        };
        String[] precios = {
            "$25.00", "$15.00", "$30.00", "$10.00",
            "$50.00", "$20.00", "$12.00", "$45.00"
        };

        // Crear 8 cuadros (paneles con borde, texto y precio al fondo)
        for (int i = 0; i < 8; i++) {
            JPanel cuadro = new JPanel(new BorderLayout());
            cuadro.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            cuadro.setBackground(Color.WHITE);

            // Panel inferior con artículo y precio
            JPanel info = new JPanel();
            info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
            info.setOpaque(false);

            JLabel lblArticulo = new JLabel(articulos[i]);
            lblArticulo.setAlignmentX(Component.CENTER_ALIGNMENT);
            lblArticulo.setFont(new Font("Arial", Font.BOLD, 14));

            JLabel lblPrecio = new JLabel(precios[i]);
            lblPrecio.setAlignmentX(Component.CENTER_ALIGNMENT);
            lblPrecio.setForeground(Color.BLUE);
            lblPrecio.setFont(new Font("Arial", Font.PLAIN, 12));

            info.add(lblArticulo);
            info.add(lblPrecio);

            cuadro.add(info, BorderLayout.SOUTH); // 👈 abajo

            panelCuadros.add(cuadro);
        }

        panelProductos.add(panelCuadros, BorderLayout.CENTER);
    }

    public JPanel getJPanel() {
        return panelProductos;
    }
}
