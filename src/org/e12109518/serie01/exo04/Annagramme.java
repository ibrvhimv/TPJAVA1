package org.e12109518.serie01.exo04;


import java.util.Arrays;

public class Annagramme {
    public Annagramme() {}

    public boolean isAnagramme(String s1, String s2) {
        String news1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        news1 = news1.toLowerCase();
        String news2 = s2.replaceAll("[^a-zA-Z0-9]", "");
        news2 = news2.toLowerCase();
        char[] newsa1 = news1.toCharArray();
        char[] newsa2 = news2.toCharArray();
        Arrays.sort(newsa1);
        Arrays.sort(newsa2);
        String st1= new String(newsa1);
        String st2= new String(newsa2);
        return st1.equals(st2);
    }
}
