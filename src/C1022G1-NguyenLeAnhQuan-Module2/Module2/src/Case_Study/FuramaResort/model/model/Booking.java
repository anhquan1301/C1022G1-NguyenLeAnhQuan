package Case_Study.FuramaResort.model.model;


import Case_Study.FuramaResort.model.model.extend_person.Customer;

import java.time.LocalDate;

public class Booking {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    int customerId;
    String nameService;

    public Booking() {
    }

    public Booking(int id, LocalDate startDate, LocalDate endDate, int customerId, String nameService) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.nameService = nameService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customerId=" + customerId +
                ", nameService='" + nameService + '\'' +
                '}';
    }
}
