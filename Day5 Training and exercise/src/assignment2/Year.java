package assignment2;

/**
 * Created by bhirudr on 7/25/2017.
 */
public enum Year {
    Y_2015(2015), Y_2016(2016), Y_2017(2017), Y_2018(2018), Y_2019(2019), Y_2020(2020);

    int year;

    public int getYear() {
        return year;
    }

    Year(int yearParam) {
        year = yearParam;
    }
}
