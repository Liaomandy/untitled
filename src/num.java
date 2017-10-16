public class num {
    public static void main(String[]args){
            java.util.Scanner sc=new java.util.Scanner(System.in);
            String str=sc.next();
            char symbol=sc.next().charAt(0);
            //System.out.println(symbol);

            String newStr=str.replace(symbol,'\n');
            System.out.println(newStr);



    }
}
