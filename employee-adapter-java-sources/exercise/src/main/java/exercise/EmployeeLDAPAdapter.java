package exercise;

public class EmployeeLDAPAdapter implements Employee {
    private final EmployeeLDAP adaptee;

    public EmployeeLDAPAdapter(EmployeeLDAP adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getId() {
        return adaptee.get("uid");
    }

    @Override
    public String getFirstName() {
        return adaptee.get("givenName");
    }

    @Override
    public String getLastName() {
        return adaptee.get("sn");
    }

    @Override
    public String getEmail() {
        return adaptee.get("mail");
    }
}
