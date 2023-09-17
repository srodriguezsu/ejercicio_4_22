import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.text.NumberFormat;

public class salarioMensual extends JFrame{

    public JPanel contentPane;
    private JTextField inNombre;
    private JSpinner inSalarioBase;
    private JSpinner inHorasMes;
    private JLabel outNombre;
    private JLabel outSalarioMensual;

    public salarioMensual() {
        NumberFormat pesos = NumberFormat.getCurrencyInstance();


        Empleado empleado = new Empleado( "", 0, 0);

        outSalarioMensual.setVisible(false);
    inSalarioBase.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            int salarioBase = (int) inSalarioBase.getValue();
            empleado.setSalarioBase(salarioBase);
            outSalarioMensual.setText(pesos.format(empleado.getSalarioMensual()));
            outSalarioMensual.setVisible(empleado.getSalarioMensual() > 450_000);
        }
    });
        inHorasMes.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int horasMes = (int) inHorasMes.getValue();
                empleado.setHorasMes(horasMes);
                outSalarioMensual.setText(pesos.format(empleado.getSalarioMensual()));
                outSalarioMensual.setVisible(empleado.getSalarioMensual() > 450_000);
            }
        });

        inNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = inNombre.getText();
                empleado.setNombre(nombre);
                outNombre.setText(empleado.getNombre());
                setTitle(empleado.getNombre());
            }
        });


        inNombre.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String nombre = inNombre.getText();
                empleado.setNombre(nombre);
                outNombre.setText(empleado.getNombre());
                setTitle(empleado.getNombre());

            }
        });
        inNombre.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String nombre = inNombre.getText();
                empleado.setNombre(nombre);
                outNombre.setText(empleado.getNombre());
                setTitle(empleado.getNombre());

            }
        });
    }
}
