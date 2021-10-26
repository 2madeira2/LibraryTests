import com.google.inject.AbstractModule;

public class Module extends AbstractModule {
	String filename;

	public Module(String filename){
		this.filename = filename;
	}


	@Override
	protected void configure() {
		bind(BooksFactory.class).toInstance(new FileBookFactory(filename));
	}
}
