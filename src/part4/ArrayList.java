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
		    // 엘리먼트 중간에 데이터를 추가하기 위해서는 끝의 엘리먼트부터 index의 노드까지 뒤로 한 칸씩 이동시켜야 합니다.
		    for (int i = size - 1; i >= index; i--) {
		        elementData[i + 1] = elementData[i];
		    }
		    // index에 노드를 추가합니다.
		    elementData[index] = element;
		    // 엘리먼트의 숫자를 1 증가시킵니다.
		    size++;
		    return true;
		}
	 
}

