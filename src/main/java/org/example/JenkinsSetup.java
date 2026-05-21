package org.example;

public class JenkinsSetup {
    public static void main(String[] args) {
        String s="Vidya sagar at Infosys";
        String[] n=s.split(" ");


        for(String st : n){
            String rev="";
            for(int i=st.length()-1;i>=0;i--){
                rev+=st.charAt(i);
            }
            System.out.print(rev+" ");
        }
    }
}
