package asha;

public class Palondrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="326";
     String sr="";
     for(int i=s.length()-1;i>=0;i--)
     {
    	 sr=sr+s.charAt(i);
     }
     if(s.equals(sr))
     {
    	 System.out.println("The number is palondrom :"+s);
     }else
     {
    	 System.out.println("The number is not palondrom: "+s);
     }
     
     
	}

}
