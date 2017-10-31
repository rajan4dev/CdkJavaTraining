package immutable_employee;

/**
 * Created by bhirudr on 10/30/2017.
 */
public final class ImmutableEmployee {
    private final String empID;
    private final String name;

    public ImmutableEmployee(String empID, String name) {
        this.empID = empID;
        this.name = name;
    }
}
