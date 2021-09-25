package keychains;

public class KeychainIterator implements KeychainAbstractIterator {

	Keychain[] keychainList;
	public int index = 0;
	public KeychainIterator(Keychain[] keychainList) {

		this.keychainList = keychainList;
	}

	@Override
	public boolean hasnext()
	{		
		if (index >= keychainList.length ||
		keychainList[index] == null)
	            return false;
	        else
	            return true;
	 }

	@Override
	public Object next() {
		 Keychain ham =  keychainList[index];
	        index += 1;
	        return ham;
	}

}
