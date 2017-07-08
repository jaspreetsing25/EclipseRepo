import java.io.IOException;

import javax.swing.plaf.SliderUI;

class Execp6{  
  @SuppressWarnings("unused")
void m() throws IOException {  
	  if  (1<0)
	  {
		  throw new java.io.IOException("device error");//checked exception  
	  }
	  else
	  {
		  System.out.println("HI");
		  throw new java.io.CharConversionException("device error");//checked exception 
		  
		  
	  }
	    
    
	 /* try{
	  int data=50/0;
	  }
	  catch (Exception e)
	  {
		  System.out.println("caught");
	  }
  */
  }  
  void n() throws IOException{  
    m();
    System.out.println("In m");
    
  }  
  void p(){  
   /*try{  
    n();
    
    System.out.println("In p");
    
   }catch(Exception e){System.out.println("exception handled");}  */
  }  
  public static void main(String args[]){  
	  Execp6 obj=new Execp6();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  