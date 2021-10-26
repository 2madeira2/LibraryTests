import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
	final Author author;
	final String name;

	@Override
	public String toString() {
		return "Book{" +
						"author=" + author.getName() +
						", name='" + name + '\'' +
						'}';
	}
}

