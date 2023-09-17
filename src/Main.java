import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        salarioMensual w = new salarioMensual();
        w.setContentPane(w.contentPane);
        w.setSize(1000,500);
        w.setTitle("Empleado");
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setVisible(true);

    }
}