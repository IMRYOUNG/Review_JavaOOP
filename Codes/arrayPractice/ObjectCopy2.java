//��������
package arrayPractice;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // å�� 5�� ����� �ƴ϶� �迭 �ϳ��� ĭ�� 5�� ����
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("����� �� ����1", "������");
		library[2] = new Book("����1", "�츣�� �켼");
		library[3] = new Book("�¹���1", "������");
		library[4] = new Book("����� �� ����1", "������");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book book : copyLibrary) { //copyLibrary��� ��ü�� �� ���� ������ ����� book�� �����ϰڴٴ� ���� for��
			book.showBookInfo();
		}*/
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("----------------");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}
	
}