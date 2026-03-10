import javax.swing.*; 
import java.awt.*;        
import java.awt.event.*;    

public class Bai4_TemperatureConverter extends JFrame {
    private final JTextField celsiusInput;    
    private final JButton convertButton;       
    private final JLabel resultLabel;        
    private final JLabel titleLabel;          
    private final JLabel inputLabel;         
    public Bai4_TemperatureConverter() {
        setTitle("Chuyển Đổi Nhiệt Độ - Celsius ↔ Fahrenheit");
        setSize(420, 280);                     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);             
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15)); 
        getContentPane().setBackground(new Color(245, 245, 250)); 
        titleLabel = new JLabel("🌡️ Chuyển Đổi Nhiệt Độ");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(50, 50, 150));
        inputLabel = new JLabel("Nhập nhiệt độ Celsius (°C):");
        inputLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        celsiusInput = new JTextField(10); 
        celsiusInput.setFont(new Font("Arial", Font.PLAIN, 16));
        celsiusInput.setHorizontalAlignment(JTextField.CENTER); 
        convertButton = new JButton("Chuyển Đổi →");
        convertButton.setFont(new Font("Arial", Font.BOLD, 14));
        convertButton.setBackground(new Color(70, 130, 200)); 
        convertButton.setForeground(Color.WHITE);          
        convertButton.setFocusPainted(false);               
        convertButton.setPreferredSize(new Dimension(160, 38));
        resultLabel = new JLabel("Kết quả sẽ hiển thị ở đây");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setForeground(new Color(180, 50, 50));   
        add(titleLabel);
        add(inputLabel);
        add(celsiusInput);
        add(convertButton);
        add(resultLabel);
        convertButton.addActionListener((ActionEvent e) -> {
            convertTemperature();
        });
        celsiusInput.addActionListener((ActionEvent e) -> {
            convertTemperature();
        });
    }
    private void convertTemperature() {
        try {
            String inputText = celsiusInput.getText().trim();
            double celsius = Double.parseDouble(inputText);
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            resultLabel.setText(String.format("%.1f°C  =  %.1f°F", celsius, fahrenheit));
            resultLabel.setForeground(new Color(30, 130, 50)); 

        } catch (NumberFormatException ex) {
            resultLabel.setText(" Vui lòng nhập một số hợp lệ!");
            resultLabel.setForeground(new Color(200, 50, 50)); 
        }
    }
    public static void main(String[] args) {
        System.out.println("BÀI 4 – JAVA SWING: CHUYỂN ĐỔI NHIỆT ĐỘ ");
        System.out.println("Đang khởi động giao diện...");
        System.out.println("Ví dụ: Nhập 25 → kết quả là 77.0°F");
        SwingUtilities.invokeLater(() -> {
            Bai4_TemperatureConverter app = new Bai4_TemperatureConverter();
            app.setVisible(true);
        });
    }
}