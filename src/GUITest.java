import javax.swing.*;
import java.awt.*;

public class GUITest extends JFrame {
    public GUITest(){
        setTitle("GUI Test");
        setSize(500,500);



        //initializing the elements of the gui
        JTextField textTest = new JTextField("Type Here:");
        JLabel yesOrNo = new JLabel("Choose Yes or No:");
        JLine line = new JLine();
        JButton button = new JButton("Click Me");
        JCheckBox checkBox = new JCheckBox("Check Me");
        JRadioButton radioYes = new JRadioButton("Yes");
        JRadioButton radioNo = new JRadioButton("No");

        //adding layout manager
        setLayout(new BorderLayout());

        //adding a bottom panel to hold the radio buttons
        JPanel bottomPanel = new JPanel();

        //adding radio elements into the bottom panel
        bottomPanel.add(yesOrNo);
        bottomPanel.add(radioYes);
        bottomPanel.add(radioNo);


        //adding the elements into the frame
        add(line);
        add(textTest, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        add(checkBox, BorderLayout.WEST);
        add(bottomPanel, BorderLayout.EAST);




    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUITest guiTest = new GUITest();
            guiTest.setVisible(true);
        });
    }

    private static class JLine extends JComponent {
        protected void paintComponent(Graphics graphic) {
            super.paintComponent(graphic);

            //using this to make the line the size of the gui
            int width, height;
            width = getWidth();
            height = getHeight();

            graphic.drawLine(0,height/2 ,width,height/2);

        }
    }
}
