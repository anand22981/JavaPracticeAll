package pattern;

import java.util.Scanner;
public class Xpattern
    {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("eneter a number");
            int a=sc.nextInt();
            //int a=4;
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    if(i==j){
                        System.out.print(i);}
                    else{
                        System.out.print(" ");
                    }
                }
                for(int x=a;x>i;x--){

                    if(x-1==i){
                        System.out.print(" "+i);
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            //System.out.println("     "+a);
            for(int i=1;i<a;i++){
                for(int j=a;j>i;j--){
                    if(i==j-1){
                        System.out.print((a-i));}
                    else{
                        System.out.print(" ");
                    }
                }
                for(int x=1;x<=i;x++){
                    if(x==i){
                        System.out.print(" "+(a-i));
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
