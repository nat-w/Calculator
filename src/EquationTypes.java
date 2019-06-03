import java.util.HashMap;
import java.util.Map;

public enum EquationTypes {	
	SIN_OF_X(1),
    EXPONENT_BASE_10(2),
    LOG_OF_X(3),
    NATURAL_EXPONENTIAL_FUNCTION(4),
    STANDARD_DEVIATION(5);                		 
	
	private int value;
	private static Map map = new HashMap<>();

    private EquationTypes(int value) {	    	
        this.value = value;
    }

    static {
    	 for (EquationTypes equationType : EquationTypes.values()) {
             map.put(equationType.value, equationType);
         }
    }	    	    	 
    
    public static EquationTypes valueOf(int equationType) {		    	
    	return (EquationTypes) map.get(equationType);
    }
    
    public int getValue() {	    
        return value;
    }	
}
