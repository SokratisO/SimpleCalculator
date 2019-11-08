//necessary imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SCcontroller {

    //Declaration of object variables
    SCview theView;
    SCmodel theModel;

    //constructor that creates associations between model and view
    public SCcontroller(SCview theView, SCmodel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addListener(new Listener());
    }

    //Helper class that implements ActionListener
    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Check which button is pressed and call the appropriate function from the model class
            try {
                if (e.getSource() == theView.getAddB()) {
                    theModel.addition(theView.getFirstNum(), theView.getSecondNum());
                }
                if (e.getSource() == theView.getSubB()) {
                    theModel.subtraction(theView.getFirstNum(), theView.getSecondNum());
                }
                if (e.getSource() == theView.getMultB()) {
                    theModel.multiplication(theView.getFirstNum(), theView.getSecondNum());
                }
                if (e.getSource() == theView.getDivB()) {
                    //Do the division only if the y is not 0, otherwise display an error message
                    if (!theModel.division(theView.getFirstNum(), theView.getSecondNum())) {
                        theView.displayErrorMessage("Cannot divide by 0");
                    }
                }
                if (e.getSource() == theView.getPowB()) {
                    theModel.power(theView.getFirstNum(), theView.getSecondNum());
                }
                if (e.getSource() == theView.getAbsB()) {
                    if(!theModel.absolute())
                    {
                        theView.displayErrorMessage("Solution was not initialized");
                    }
                }

                //after the calculation is done display the solution in the view
                theView.setSolution(theModel.getSolution());

            //Catch an exception where user input Strings that cannot be converted to double
            } catch (NumberFormatException exception) {
                theView.displayErrorMessage("Please insert numbers");
            }
        }
    }
}
