import java.util.HashMap;
import java.util.Map;
class RomantoInt{
    public static void main(String[]args){
        Map<Character,Integer>Map=new HashMap<>();
        Map.put('I',1);
        Map.put('V',5);
        Map.put('X',10);
        Map.put('L',50);
        Map.put('C',100);
        Map.put('D',500);
        Map.put('M',1000);
        String roman="MCMIV";
        int result=0;
        for(int i=0;i<roman.length();i++){
            int value=Map.get(roman.charAt(0));
            if(i+1<roman.length ()&&value<Map.get(roman.charAt(i+1))){
                result-=value;
            }
            else{
                result+=value;
            }
        }
        System.out.println("Int value:"+result);
    }
}
