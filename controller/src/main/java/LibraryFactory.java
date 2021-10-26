import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class LibraryFactory {

	private final @NotNull
	BooksFactory factory;

	@Inject
	public LibraryFactory(@NotNull BooksFactory factory) {
		this.factory = factory;
	}

	public Library createLib(int length) throws IOException {
		return new Library(length,factory);
	}

}
