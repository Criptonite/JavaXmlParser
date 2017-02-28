package company;

import java.util.Date;

public class OtherPersonal extends Employee {
    private String description;

    public OtherPersonal() {
        super();
    }

    public OtherPersonal(String firstName, String secondName, String patronymic, Date birthDate, Date offerDate, String description) {
        super(firstName, secondName, patronymic, birthDate, offerDate);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
