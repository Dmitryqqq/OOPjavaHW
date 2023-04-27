public class PersisterXml implements Persister {
  	
	public void save(IUser user){
		System.out.println("Save user to XMLfile: " + user.getName());
	}

    public  String getName(){
        return this.getName();
   }
    
}
