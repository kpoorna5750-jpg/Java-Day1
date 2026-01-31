import java.util.Scanner;
class Type{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double d=sc.nextDouble();
        float f=sc.nextFloat();
        String str=sc.next();
        System.out.println( "int:"+a);
        System.out.println("double:"+d);
        System.out.println("float:"+f);
        System.out.println("String:"+str);
    }
}