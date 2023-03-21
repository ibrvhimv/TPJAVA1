package org.e12109518.serie05.exo13;
import java.util.*;
import java.util.function.BiFunction;

public class Exo13
{
    public static void main(String[] args)
    {
        System.out.println("*****1*****");
        HashMap<Integer,String> map = new HashMap<>(Map.of(1,"one",2, "two",3,"three",4,"four",5,"five",6,"six",7,"seven",8,"eight",9,"nine",10,"ten"));
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.replaceAll((i1,s1)->s1.toUpperCase());
        map.forEach((k,v)-> System.out.println(k+"-->"+v));

        System.out.println("*****3*****");

        List<Integer> keys = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        for(Integer key : keys)
        {
            String value = map.getOrDefault(key, " ");
            System.out.println(key+"-->"+ value);
        }

        System.out.println("*****2*****");
        for(Integer key : keys)
        {
            map.computeIfAbsent(key, s -> "");
        }
        map.forEach((k,v)-> System.out.println(k+"-->"+v));


        HashMap<Integer, List<String>> map2 =new HashMap<>();
        List<String> words = new ArrayList<>(List.of("one", "two","three","four","five","six","seven","eight","nine","ten"));
        words.add("eleven");
        words.add("twelve");
        for(String ch : words)
        {
            int cle=ch.length();
            List<String> LisWo= map2.get(cle);
            if(LisWo!=null)
            {
                LisWo.add(ch);
            }
            else
            {
                LisWo =new ArrayList<String>();
                LisWo.add(0,ch);
                map2.put(cle,LisWo);
            }

            //BiFunction<Integer,List<String>,List<String>> biFunctionAddCh = (k, v) ->v.add(ch);
            //map2.computeIfPresent(cle,biFunctionAddCh);
        }
        System.out.println(map2);
        HashMap<Integer, String> map3 =new HashMap<>();
        for(String ch : words)
        {
            int cle=ch.length();
            String LisWa= map3.get(cle);
            if(LisWa==null)
            {
                map3.put(cle,ch);
            }
            else
            {
                map3.put(cle,LisWa+";"+ch);
            }
        }
        System.out.println(map3);
    }
}