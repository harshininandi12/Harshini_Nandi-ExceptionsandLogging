package Epam4.logging;

import java.util.logging.Logger;

public class Driver {
	static Logger log = Logger.getLogger(Driver.class.getName());
    public static void main( String[] args )
    {
    	Interest.calInterest();
        Construction.costPrediction();
    }
}
