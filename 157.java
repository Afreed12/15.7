import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeOnMouseClick extends JPanel implements MouseListener {
    private Color circleColor;
    private final int circleRadius = 50;
    private final int circleX = 200;
    private final int circleY = 200;

    public ColorChangeOnMouseClick() {
        circleColor = Color.WHITE;
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(circleColor);
        g.fillOval(circleX - circleRadius, circleY - circleRadius, 2 * circleRadius, 2 * circleRadius);
    }

    public void mouseClicked(MouseEvent e) {
        circleColor = Color.BLACK;
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        circleColor = Color.WHITE;
        repaint();
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Color Change on Mouse Click");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.add(new ColorChangeOnMouseClick());
            frame.setVisible(true);
        });
    }
}
