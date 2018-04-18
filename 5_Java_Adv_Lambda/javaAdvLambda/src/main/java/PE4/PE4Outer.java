package PE4;

import com.LoggerHelper;

public class PE4Outer {
    
    public PE4Outer(){
        
    }

    public static void main(String[] args) {
        PE4Outer outer = new PE4Outer();
        Hand handObj = outer.createHand();
        handObj.facepalm();
    }
    
    public Hand createHand() {
        class Palm implements Hand{
            public void facepalm() {
            	LoggerHelper logger = new LoggerHelper();
                logger.info("Hi! This is facepalm");        
            }            
        }
        return new Palm();
    }
}