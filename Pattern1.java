import java.util.*;
class Main{
public static void main(String args[]){
Scanner t =new Scanner(System.in);
int n = t.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i==0||i==n-1||j==0||j==n-1){
System.out.print("*");
}else{
System.out.print(" ");
}
}
 System.out.print("\n");
}
}
}