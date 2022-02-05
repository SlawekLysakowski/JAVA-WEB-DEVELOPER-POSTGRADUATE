package pl.edu.wszib.interfaces;

public class DataProvidersApp {
    public static void main(String[] args) {

//        DataProvider dataProvider = new SimpleDataProvider();
        DataProvider dataProvider = new FileDataProvider();
        DataPresenter dataPresenter = new DataPresenter();

        dataPresenter.showData(dataProvider);


    }
}
