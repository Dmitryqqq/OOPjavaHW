public class ReportPrint implements Report{
    IUser us;
    public void report(IUser us){
		System.out.println("Print Report for user: " + us.getName());
	}

    public  String getName(){
        return this.getName();
   }
}

