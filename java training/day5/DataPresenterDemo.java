import java.util.*;

class DataPresenterDemo {
	
	@SuppressWarnings({"unchecked","unused"})
	public static void main(String[] args){
	
		Date d =new Date();
	
		DataPresenter presenter = new DataPresenter();
		presenter.display("5 Java Books");
		presenter.display(120);
		presenter.display(true);

		presenter.info(false,100);
		presenter.info(12000.00,100);
		presenter.info(10,"Hello");

		presenter.info(10,"Hello",10.00);

		DataPresenter<Double,Integer> presenter1 = new DataPresenter<>();
		presenter1.greet(1500.00,1);
		presenter1.greet("ADAD",1);

	}
}