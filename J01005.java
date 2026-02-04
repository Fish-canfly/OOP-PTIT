import java.util.*;
import java.io.*;
public class J01005{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int h=sc.nextInt();
			for(int i=1;i<n;++i){
				double res=h*Math.sqrt(i/(double)n);
				System.out.printf(String.format("%.6f",res)+" ");
			}
			System.out.println();
		}
	}
}