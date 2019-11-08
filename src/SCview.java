import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SCview extends JFrame {

    //Variable initialization
    private JPanel mainPanel = new JPanel(new BorderLayout()), fieldPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)),
            numberPanel = new JPanel(new GridLayout(5, 3)), solutionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JButton addB = new JButton("Add"), subB = new JButton("Subtract"), multB = new JButton("Multiply"),
            divB = new JButton("Divide"), powB = new JButton("X in the power of Y"), absB = new JButton("Absolute Value");
    private JTextField firstNumField = new JTextField(15), secondNumField = new JTextField(15),
            solutionField = new JTextField(25);
    private JLabel xLabel = new JLabel("type X:"), yLabel = new JLabel("type Y:"), solLabel = new JLabel("Solution:");


    public SCview() {

        //Frame Creation
        this.setTitle("Simple Calculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 500));
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        //MainPanel initialization
        mainPanel.add(fieldPanel, BorderLayout.NORTH);
        mainPanel.add(numberPanel, BorderLayout.CENTER);
        mainPanel.add(solutionPanel, BorderLayout.SOUTH);
        mainPanel.add(fieldPanel, BorderLayout.NORTH);
        mainPanel.setMaximumSize(new Dimension(400, 400));

        //fieldPanel initialization
        fieldPanel.add(xLabel);
        fieldPanel.add(firstNumField);
        fieldPanel.add(yLabel);
        fieldPanel.add(secondNumField);

        //numberPanel initialization
        numberPanel.add(addB);
        numberPanel.add(subB);
        numberPanel.add(multB);
        numberPanel.add(divB);
        numberPanel.add(powB);
        numberPanel.add(absB);
        numberPanel.add(new JButton("To be implemented"));
        numberPanel.add(new JButton("To be implemented"));
        numberPanel.add(new JButton("To be implemented"));
        numberPanel.add(new JButton("To be implemented"));


        //solutionPanel initialization
        solutionPanel.add(solLabel);
        solutionPanel.add(solutionField);
        solutionField.setEditable(false);

        //Adding the mainPanel with all the components to the Frame to be displayed
        //Setting the frame visible is done in the main program
        this.add(mainPanel);
    }

    //Set the solution field to the number
    void setSolution(Double x){
        solutionField.setText(Double.toString(x));
    }

    //Method to display error messaged
    void displayErrorMessage(String s)
    {
        JOptionPane.showMessageDialog(this,s);
    }

    //Add listeners for everybutton
    void addListener(ActionListener al){
        addB.addActionListener(al);
        subB.addActionListener(al);
        multB.addActionListener(al);
        divB.addActionListener(al);
        powB.addActionListener(al);
        absB.addActionListener(al);

    }

    //-------------------------Getters-------------------
    public JButton getAddB() {
        return addB;
    }

    public JButton getSubB() {
        return subB;
    }

    public JButton getMultB() {
        return multB;
    }

    public JButton getDivB() {
        return divB;
    }

    public JButton getPowB() {
        return powB;
    }

    public JButton getAbsB() {
        return absB;
    }

    public double getFirstNum()
    {
        return Double.parseDouble(firstNumField.getText());
    }

    public double getSecondNum()
    {
        return Double.parseDouble(secondNumField.getText());
    }
}
