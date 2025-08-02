import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String firstRep = s.replace("--", "2");
        String secondRep = firstRep.replace("-.", "1");
        String finalRep = secondRep.replace(".", "0");
        System.out.println(finalRep);
    }
}

/////        ####ALTERNATIVE APPROACH
/////        MyScanner sc=new MyScanner();
/////        PrintWriter pw=new PrintWriter(System.out,true);
/////        StringBuilder sb=new StringBuilder();
/////
/////        String s=sc.next();
/////        String ans="";
/////        for(int i=0;i<s.length();i++){
/////        if(i<s.length()-1 && s.charAt(i)=='-'){
/////        if(s.charAt(i+1)=='.')
/////        ans+='1';
/////        else
/////        ans+='2';
/////        i++;
/////        }else
/////        ans+='0';
/////        }
/////        pw.println(ans);
/////
/////        pw.flush();
/////        pw.close();
/////        ###ALTERNATIVE APPROACH###
/////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/////        String x;
/////        StringBuilder y = new StringBuilder();
/////        x = br.readLine();
/////
/////        for(int i=0; i<x.length(); i++){
/////            if(x.charAt(i) == '.'){
/////                y.append('0');
/////            }
/////            else if(i < x.length()-1 && x.charAt(i) == '-' && x.charAt(i+1) == '.'){
/////                i++;
/////                y.append('1');
/////            }
/////            else if(i < x.length()-1 && x.charAt(i) == '-' && x.charAt(i+1) == '-'){
/////                i++;
/////                y.append('2');
/////            }
/////        }
/////        System.out.println(y);
