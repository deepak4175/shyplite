package roughPackage;

import baseClass.Mainclass;

public class RoughTestclass extends Mainclass{
	
	public  String stringConcat(String inp1,String inp2)
	{
		 String opt="";
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       opt=inp1.concat(inp2);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new RoughTestclass().stringConcat("a","b"));
	}

}
