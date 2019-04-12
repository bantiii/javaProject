import java.util.Date;
public class Split {
	public static void main(String []args){
		Date objdat = new Date();
	System.out.println("======"+objdat+"=============");
	String name ="banataelak tahefet ayalew";
	// this is gonna be the First order list value of the product
	// and also this will make our jorny perfect and we will try to cover come all this 
	//in the very good fashion of life so don't worry we gonna make it.
	String[] nameSplit =name.split("\\s");
	for(int i=0; i<nameSplit.length;i++){
		
		//this is new bro
		System.out.println("the value of the name is then changed"+nameSplit[i]);
	}
	}
	
}

