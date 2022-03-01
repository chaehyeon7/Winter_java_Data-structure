package part3;

//ArrayList.javapackage list.arraylist.implementation;

public class ArrayList {
	 private int size = 0;
	 private Object[] elementData = new Object[100];
	 
	 public boolean addLast(Object element) {
		    elementData[size] = element;
		    size++;
		    return true;
		}
	 public boolean addFirst(Object element) {
		 return add(0,element);
	 }
	 public boolean add(int index, Object element) {
		    // ������Ʈ �߰��� �����͸� �߰��ϱ� ���ؼ��� ���� ������Ʈ���� index�� ������ �ڷ� �� ĭ�� �̵����Ѿ� �մϴ�.
		    for (int i = size - 1; i >= index; i--) {
		        elementData[i + 1] = elementData[i];
		    }
		    // index�� ��带 �߰��մϴ�.
		    elementData[index] = element;
		    // ������Ʈ�� ���ڸ� 1 ������ŵ�ϴ�.
		    size++;
		    return true;
		}
	public Object get(int index) {
		return elementData[index];
	}

	 
	 public String toString(){
		    String str = "[";
		    for(int i=0; i < size; i++){
		        str += elementData[i];
		        if(i < size-1){
		            str += ",";
		        }
		    }
		    return str + "]";
		}

	 public int size() {
		 return size;
	 }
	 public int indexOf(Objcet o) {
		 for(int i=0; i<size; i++) {
			 if(o.equals(elementData[i])) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
}

