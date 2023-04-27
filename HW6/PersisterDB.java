public class PersisterDB implements Persister {


	public void save(IUser user){
		System.out.println("Save user to DataBase: " + user.getName());
	}

    public  String getName(){
	 	return this.getName();
	}
}
