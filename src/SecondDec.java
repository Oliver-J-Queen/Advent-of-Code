import java.util.ArrayList;

public class SecondDec extends FileReader3000 {
    
    public int countChar(String string, char c){
        int count=0;

        for(int i =0; i<string.length();i++){
            if(c == string.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public int validPasswords(ArrayList<String> input){

        int min, max;
        int validCount = 0;
        String text, rule;

        for(String x : input){
            text=x.replace(" ", "-");
            text=text.replace(":","");

            String[] split = text.split("-");
            min = Integer.parseInt(split[0]);
            max = Integer.parseInt(split[1]);
            rule = split[2];
            char c = rule.charAt(0);
            text = split[3];

            if(countChar(text,c)>= min && countChar(text,c)<= max){
                validCount++;
            }
        }
        return validCount;
    }

    public int validCodes(ArrayList<String> input){

        int min, max;
        int validCount = 0;
        String text, rule;

        for(String x : input){
            text=x.replace(" ", "-");
            text=text.replace(":","");

            String[] split = text.split("-");
            min = Integer.parseInt(split[0]);
            max = Integer.parseInt(split[1]);
            rule = split[2];
            char c = rule.charAt(0);
            text = split[3];

            if(c==text.charAt(min)&&c!=text.charAt(max-1)){
                if(c!=text.charAt(min)&&c==text.charAt(max-1)){
                validCount++;
                }
            }
        }
        return validCount;
    }

    public static void main(String[]args){

        FileReader3000 reader = new FileReader3000();
        SecondDec door2 = new SecondDec();
        ArrayList<String> input = reader.getInput("input1.txt");
        //System.out.print(door2.validPasswords(input));
        String teststring = "7-10 b: sgmbgmxbxnpjgpthcbr";
        teststring=teststring.replace(" ", "-");
        teststring=teststring.replace(":","");
        System.out.print(door2.validCodes(input));
        
        //System.out.println(teststring);
        //System.out.print(test2);
        //String test2 = "1 ";
        //String neu = test2.replace(" ", "");
        //System.out.println(test2);

        
    }
}
