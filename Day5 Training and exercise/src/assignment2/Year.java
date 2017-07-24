package assignment2;

/**
 * Created by bhirudr on 7/25/2017.
 */
public enum Year {
    twok15(2015), getTwok16(2016), twok17(2017), twok18(2018), twok19(2019), twok20(2020);

    int year;

    public int getYear() {
        return year;
    }

    Year(int yearParam) {
        year = yearParam;
    }
}
