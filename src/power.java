public class power {
    
     static double calculate(double x) {
         double result = 1;
         double base=10;
         double exponent=(int)x;
	     
          if(exponent==0)// base case
          	return 1;
            
          if(exponent>0){
             for(int i = 0;i<exponent;i++)
                 {
                      result *= base;
                 }
            }
            else
            {
              for(double i = exponent;i<0;i++)
                 {
                      result *= base;
                 }
                   result = 1/result;
            }
            return result;
        }
}
