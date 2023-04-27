public class Main{
	public static void main(String[] args){
		User user1 = new AutoriseUser("Bob");
		User user2 = new AutoriseUser("John");
		PersisterDB db = new PersisterDB();
		PersisterXml xml = new PersisterXml();
		ReportPrint pr = new ReportPrint();
		pr.report(user1);
		pr.report(user2);
		db.save(user1);
		db.save(user2);
		xml.save(user1);
		xml.save(user2);
	}
	
}