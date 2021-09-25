package keychains;

public class KeychainCollector implements KeychainAbstractCollector {

	static final int MAX = 5;
    int items = 0;
    Keychain[] keychainList;
  
    public KeychainCollector()
    {
        keychainList = new Keychain[MAX];
  
        // Let us add some dummy notifications
        addItem(1, "Wallet Keychain", 120);
        addItem(2, "Decorative Keychain",150);
        addItem(3, "Used Keychain",250);
    }
  
    public void addItem(int id, String str, int prc)
    {
        Keychain keychain = new Keychain(id, str, prc);
        if (items >= MAX)
            System.err.println("Full");
        else
        {
            keychainList[items] = keychain;
            items = items + 1;
        }
    }
  
	@Override
	public KeychainAbstractIterator getIterator() {
		return new KeychainIterator(keychainList);
	}

}
