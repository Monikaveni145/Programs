package tamilnadu.chennai;

public class ProgrammingDemo {
	public static void main(String[] args) {

		ProgrammingDemo pd = new ProgrammingDemo();
		
		  pd.learn_if(); 
		  pd.learn_if2(); 
		  pd.learn_if3(); 
		  pd.loopLearning();
		  pd.loopLearning2();
		 
		pd.loopLearning3();
	}

	private void loopLearning3() 
	{
		// TODO Auto-generated method stub
		
		  int total = 0;  
		  int purse = 2; 
		  total=total+ purse;//2 
		  purse=purse*2;//4
		  total=total+ purse;//6 
		  purse=purse*2;//8 
		  total=total+ purse;//14
		  purse=purse*2;//16 
		  total=total+purse;//30 
		  purse=purse*2;//32
		  total=total+purse;//62 
		  System.out.println(total);
		 
		purse = 0;
		int day = 1;
	while(day<=10)
	{
		purse = purse +day;  
		day =day +1;
		System.out.println(purse);
	}
	
		//int total = 0;
		//int purse = 2;
		//int day = 1;
		//while (day <= 4);
		//{
			//total = total + purse;
			//day = day + 1;
			//purse = purse * 2;
			//System.out.println(purse);
		//}

	}

	
	  private void loopLearning2() { // TODO Auto-generated method stub 
		  int purse =0; 
		  int day =1; 
		  while(day<=3) 
		  { 
			  purse = purse + day;
		  }
	  System.out.println(purse); 
		  day = day + 1; 
	  
	  
	  if(day<=5) { 
		  purse=purse+1; 
		  day=2;} 
	  if(day<=5) { 
		  purse=purse+2; 
		  day=3;}
	  if(day<=5) { 
		  purse=purse+3; 
		  day = 4;} 
	  if(day<=5) { 
		  purse=purse+4; 
		  day = 5;}
	  purse = purse+5;
	  System.out.println(purse);
	  
	  }
	  
	  private void loopLearning() { // TODO Auto-generated method stub 
		  int first=2;
	  int second=first*2; 
	  int third=second*2; 
	  int total=first+second+third;
	  System.out.println(total); 
	  }
	  
	  private void learn_if3() { 
		  // TODO Auto-generated method stub 
		  int amount =105; 
		  int petrol = 104; 
		  if (amount>100) 
		  { 
			  if(petrol==104) {
	  System.out.println("fill petrol"); 
	  } 
			  else {
	  System.out.println("no petrol today"); } 
			  } 
		  if (amount>100 || petrol==104) {
	  System.out.println("Fill petrol"); 
	  } 
		  }
	  
	  private void learn_if2() { // TODO Auto-generated method stub 
		  boolean school = true; 
		                                           boolean raining = true;
	  
	  if(school==true && raining == true) { System.out.println("Tacke umbrella"); }
	  else { System.out.println("not nesscesary"); } }
	  
	  private void learn_if() { int no1 = 5 , no2 = 55; if(no1>no2) {
	  System.out.println(no1); } else if(no2>no1) { System.out.println(no2); } else
	  { System.out.println(no1 +"equals"+no2); } }
	  
	 

}
