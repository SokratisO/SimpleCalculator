public class SCmodel {
    private double solution = 0.0d;
    private String message;

    //Constructor
    public SCmodel() {
    }

    //-----------------------------Methods--------------------------------
    public void addition(double x, double y)
    {
        setSolution(x+y);
    }

    public void subtraction(double x, double y)
    {
        setSolution(x-y);
    }

    public void multiplication(double x, double y)
    {
        setSolution(x*y);
    }

    //this method returns boolean to make it easier to set a solution and also give a check if the method was run
    //in the proper way.
    public boolean division(double x, double y)
    {
        if(y == 0.0d)
        {
            //return false if division is by 0
            return false;
        }
        else
        {
            setSolution(x/y);
            return true;
        }

    }

    public void power(double x, double y)
    {
        setSolution(Math.pow(x,y));
    }

    //Same idea as with division, if there is no value to get the absolute value of then return false
    //and let the controller throw an error message.
    public boolean absolute()
    {
        if(solution != 0)
        {
            setSolution(Math.abs(getSolution()));
            return true;
        }
        else
            return false;
    }


    //-------------------Getters and Setters--------------------

    public Double getSolution() {
        return solution;
    }

    private void setSolution(double solution) {
        this.solution = solution;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
