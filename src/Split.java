import java.util.Date;
public class Split {
	public static void main(String []args){
		Date objdat = new Date();
	System.out.println("======"+objdat+"=============");
	String name ="banataelak tahefet ayalew";
	String[] nameSplit =name.split("\\s");
	for(int i=0; i<nameSplit.length;i++){
		System.out.println("the value of the name is then changed"+nameSplit[i]);
	}
	}
	
}

