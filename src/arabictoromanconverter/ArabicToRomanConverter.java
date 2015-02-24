/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabictoromanconverter;

/**
 *
 * @author Lipa
 */
public class ArabicToRomanConverter {
    
    public static final String INCORRECT_ENTER = "incorrect enter";
    
    
    /**
     * converting arabian numerics to roman
     * arabic numeric must be from 1 to 3999
     * @param arabian
     * @return 
     */
    public String makeRomanFromArabian(int arabian){
        
        if (arabian < 1 || arabian > 3999 ){
            return INCORRECT_ENTER;
        }
        
        String roman = "";
        
        char[] romanNumerics = {
            'I', 'V', 
            'X', 'L', 
            'C', 'D', 
            'M'};  
        
        for (int orderNum = 1; arabian != 0; orderNum++){
            
            int modulo = arabian%10;
                      
            switch (modulo){
                case 1: case 2: case 3:
                    roman = repeatSymbol(romanNumerics[orderNum * 2 - 2], modulo) + roman;
                    break;
                    
                case 4: 

                    roman = "" + romanNumerics[orderNum * 2 - 2] + romanNumerics[orderNum * 2 - 1] + roman;
                    break;
                    
                case 5:
                    roman = "" + romanNumerics[orderNum * 2 - 1] + roman;
                    break;
                    
                case 6: case 7: case 8:
                    roman = "" + romanNumerics[orderNum * 2 - 1] + repeatSymbol(romanNumerics[orderNum * 2 - 2], modulo -5) + roman;
                    break;
                    
                case 9: 
                    roman = "" + romanNumerics[orderNum * 2 - 2] + romanNumerics[orderNum * 2] + roman;                
            }
            
            arabian /= 10;
            
        }
        
        System.out.println(roman);
        return roman;
    }
    
    private String repeatSymbol(char symbol, int count){
        
        String result = "";
        
        for (int i = 0; i < count; i++) {
            result += symbol;
        }
        
        return result;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
