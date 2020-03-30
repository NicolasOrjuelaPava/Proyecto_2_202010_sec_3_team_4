package model.data_structures;

public class HashSeparateChaining<K,V> implements IHashSeparateChaining<K,V> {

	//----------------------------------------------------------------------------------------------
	//clase interna
	class HashElement <K, V> implements Comparable<HashElement<K,V>>{
		K key;
		V value;
		
		public HashElement (K ke, V val){
			this.key = ke;
			this.value = val;
		}
		
		public int compareTo(HashElement<K,V> h){
			if (h.value.toString().contains(this.toString())){
				return 1;
			}else{
				return 0;
			}
			
			//return (((  (Comparable<HashSeparateChaining<K, V>.HashElement<K, V>>) h.key).compareTo((HashSeparateChaining<K, V>.HashElement<K, V>) this.key)));
		}

	}
	
	//----------------------------------------------------------------------------------------------
	
	//atributos
	int numElements;
	int tableSize;
	double maxLoadFactor;
	private LinkedList<HashElement<K,V>> [] harray;
	
	//constructor
	public HashSeparateChaining(){
		this(4);
	}
	
	public HashSeparateChaining (int ts){
		
		this.tableSize = ts;
		maxLoadFactor = 0.75;
		numElements = 0;
		//OJO: SE PONE TABLESIZE O TS
		harray = new LinkedList [tableSize];
		
		/*
		LinkedList<K> list = new LinkedList<K>();
		
		for (int i=0; i<tableSize;i++){			
			
			 HashElement<K, LinkedList<HashElement<K,V>>> element = harray[i];
			
		}
		*/

	}
	
	//METODOS
	
	//Hash Code
	public int hashCode(K key){

		return (key.hashCode() & 0x7fffffff)%tableSize;
		
	}
	
	
	
	
	public void add (K key, V value){
		
		double loadFactor = numElements/tableSize;
		
		if (loadFactor>maxLoadFactor){
			reSize(tableSize*2);
		}
		
		HashElement<K,V> he = new HashElement(key, value);
		
		int hashval = hashCode(key);
		harray[hashval].addFirst(he);
		numElements++;		
	}
	
	
	/*
	public V getValue(K key){

		//recorre el arreglo hash
		for (int i=0; i<harray.length;i++){
			
			Node<E> tmp = new Node<E>(harray[i].getFirst());
			
			while (tmp. != null){
				K ke = harray[i].getFirst().next.data.key;
				if (ke == key){
					return harray[i].getFirst().data.value;
				}
			}
		}
		
	} */
	
	//Resize la tabla de hash
	public void reSize(int newSize){
		

		LinkedList<HashElement<K,V>>[] new_array = new LinkedList[newSize];
		
		for(int i=0; i<newSize;i++){
			
			new_array[i] = new LinkedList<HashElement<K,V>>();
		}
		
		harray = new_array;
		tableSize = newSize;
		
	}

	@Override
	public V getValue(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSize(){
		return numElements;
	}
	
	
	
}


