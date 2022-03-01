package part4;

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
	 
}

