import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private final List<Book> lib;

	public Library(int libSize,BooksFactory factory) {

		lib = new ArrayList<>(libSize);

		if(factory.books().size()>libSize){
			throw new ArrayIndexOutOfBoundsException("File more than Array size");
		}
		else {
			for(int i=0; i<libSize;i++){
				if(i<factory.books().size()){
					lib.add((Book) factory.books().toArray()[i]);
				}
			}
		}

	}

	public String getBook(int i) {
		Book book = lib.get(i);
		if(book == null){
			throw new NullPointerException("No such book");
		}
		else {
			return "index: " + i + ", book:" + book.toString();
		}
	}

	public void addBook(@NotNull Book book){
		for(int i =0;i<lib.size();i++){
			if(lib.get(i)==null){
				lib.set(i,book);
				return;
			}
		}
		throw new IndexOutOfBoundsException("Library is out of space");
	}

	public String printBooks(){
		return lib.toString();
	}

	public void printAll(){

		System.out.println("\nAll books\n");
		for(Book book: lib){
			System.out.println(book.toString());
		}
	}

}
