package newExmple;

import java.util.ArrayList;
import java.util.Scanner;
import exmple.AAbstrict;
//import exmple.animal;

public class xmain extends  AAbstrict {
	
	

	public static void main(String[] args) {

		xmain main1 = new xmain();
		
		int x ;
        
        ArrayList<String> ar = new ArrayList<String>();
       
        ar.add("hello");
        ar.add(1,"hello2");
        System.out.println(ar.get(0));
        
        		
		String ss = new String("passward");
		
		if(ss.equals("passward") == true) {
			System.out.println("password true");
		}
		
	   Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		
		System.out.println(x);
		if (x==1) {
			main1.ppp();
			main1.Mabstract();
			
		} else {
			System.out.println("not valid passward");
		}
		
	}

	@Override
	public void Mabstract() {
       System.out.println("Abstract Method");	
	}

	
	
	
	
	
}
