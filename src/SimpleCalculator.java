public class SimpleCalculator {

    public static void main(String[] args) {
        //Call the constructors to make everything run.
        SCmodel theModel = new SCmodel();
        SCview theView = new SCview();
        SCcontroller controller = new SCcontroller(theView,theModel);

        //Set the frame visible
        theView.setVisible(true);
    }
}
