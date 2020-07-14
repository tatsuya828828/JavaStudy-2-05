
public class StrongBox<E> {
	private E obj;
	private KeyType keyType;
	private long count;

	public void put(E obj) {
		this.obj = obj;
	}

	public E get() {
		this.count ++;
		switch(this.keyType) {
			case PADLOCK:
				if(this.count < 1024) {
					return null;
				}
				break;
			case BUTTON:
				if(this.count <10000) {
					return null;
				}
				break;
			case DIAL:
				if(this.count < 30000) {
					return null;
				}
				break;
			case FINGER:
				if(this.count <1000000) {
					return null;
				}
				break;
		}
		return this.obj;
	}

	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
	}
}
