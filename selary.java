import java.io.*;
class Selary
{
    public static void main(String args[])throws IOException
    {
        int basicselary,rentalounce,dearnessalounce,groseselary;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the basic selary");
        basicselary=Integer.parseInt(br.readLine());
        rentalounce=(basicselary*40)/100;
        dearnessalounce=(basicselary*20)/100;
        groseselary=basicselary+rentalounce+dearnessalounce;
        System.out.println("groseselary="+groseselary);
    }
}