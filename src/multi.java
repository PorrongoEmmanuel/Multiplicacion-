/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel
 */
public class multi {
    
    int producto(int a, int b){
		if(a == 0 && b == 0) 
			return 0;
			
                else if (a == 1) 
				return b;
			
                        else if (b == 1) 
				return a;
			
                        
                        else
				return a + (a*(b-1));
}
}
