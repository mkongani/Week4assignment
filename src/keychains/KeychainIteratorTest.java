package keychains;

public class KeychainIteratorTest {

	public static void main(String args[])
    {
	
	 KeychainCollector keychains = new KeychainCollector() ;
	 KeychainAbstractIterator iterator = keychains.getIterator();
     System.out.println(" Keycains Description here: ");
     while (iterator.hasnext())
     {
         Keychain h = (Keychain)iterator.next();
         System.out.println(h.getId()+ ". "+h.getName()+ ". "+h.getPrice());
     }
}
}