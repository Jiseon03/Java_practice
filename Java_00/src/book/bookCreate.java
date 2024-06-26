package book;

import java.util.Scanner;

public class bookCreate {

	private static Scanner sc = new Scanner(System.in);
	
	public static void bookInfoInsert(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		
		System.out.println("도서명을 입력해 주세요 : ");
		String bookTitle = sc.next();
		
		System.out.println("가격을 입력해 주세요 : ");
		int bookPrice = sc.nextInt();
		
		
		b1.setTitle(bookTitle);
		b1.setPrice(bookPrice);
		b1.setAuthor("권지선");
		b1.setPublisher("출판사이름");
		b1.setPubYear("2024");
		b1.setIsbn("12345678");
		b1.setPage(654);
		System.out.println(b1.bookInfo());
	}
	
	public static Book bookInfoSelect(Book book) {
		System.out.println(book.bookInfo());
		return book;
	}

}
