import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MyPannel extends JPanel {
    static final int SCREEN_WIDTH = 400;
    static final int SCREEN_HEIGHT = 400;
    static Scanner in = new Scanner(System.in);

    // For labels under text
    private JLabel labelPlantName = new JLabel("Enter Plant Name");
    private JLabel labelPlantWatering = new JLabel("Enter Plant Watering");
    private JLabel labelPlantLightning = new JLabel("Enter Plant Lightning");
    private JLabel labelPlantLastWatering = new JLabel("Enter Plant Last Watering");
    // For user text fields
    private JTextField textPlantName = new JTextField(20);
    private JTextField textPlantWatering = new JTextField(20);
    private JTextField textPlantLightning = new JTextField(20);
    private JTextField textPlantLastWatering = new JTextField(20);
    // For Button
    private JButton buttonLogin = new JButton("Add The Plant");

    MyPannel(){
        JPanel newPanel = new JPanel(new GridBagLayout());
        //this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // For Name field and text
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelPlantName, constraints);

        constraints.gridx = 1;
        newPanel.add(textPlantName, constraints);
        // For Lightning field and text
        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelPlantLightning, constraints);

        constraints.gridx = 1;
        newPanel.add(textPlantLightning, constraints);
        // For Watering field and text
        constraints.gridx = 0;
        constraints.gridy = 2;
        newPanel.add(labelPlantWatering, constraints);

        constraints.gridx = 1;
        newPanel.add(textPlantWatering, constraints);
        // For Last Watering field and text
        constraints.gridx = 0;
        constraints.gridy = 3;
        newPanel.add(labelPlantLastWatering, constraints);

        constraints.gridx = 1;
        newPanel.add(textPlantLastWatering, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 4;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);

        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Plant panel"));

        this.add(newPanel);
        this.setBackground(Color.white);
        this.setFocusable(true);

    }

    public void addLabel(){
        JLabel label = new JLabel("Enter Plant Name");
        JTextField plantName = new JTextField(20);

    }
}
