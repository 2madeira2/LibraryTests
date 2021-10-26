import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

public class Application {

	public static void main(@NotNull String[] args) throws IOException {

		if (args.length != 2){
			System.out.println("Sorry, invalid parametrs");
		}
		else {
			final Injector injector = Guice.createInjector(new Module(args[0]));
			Library library = injector.getInstance(LibraryFactory.class).
					createLib(Integer.parseInt(args[1]));

			library.printAll();
		}
	}
}
