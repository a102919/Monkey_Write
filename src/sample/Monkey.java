package sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Monkey {
    private String ans = "methinks it is like a whale";

    public Map<String,Integer> compare(List<String> data){
        Map<String,Integer> dataMap = new HashMap<>();
        int ansLength = ans.length();
        String[] word = ans.split(" ");
        int wordLength = word.length;
        for(String d: data){
            int count = 0;
            int Dlength = d.length();
            String[] dataWord = d.split(" ");
            int wordDLength = dataWord.length;

            for (int i=0;i<(ansLength>Dlength?Dlength:ansLength);i++){
                if(d.charAt(i) == ans.charAt(i)){
                    count = count + 10;
                }
            }

            for (int i=0;i<(ansLength>wordDLength?wordDLength:wordLength);i++){
                if(word[i].equals(dataWord[i])){
                    count = count + 100;
                }
            }

            dataMap.put(d,count);
        }
        return dataMap;
    }
}
