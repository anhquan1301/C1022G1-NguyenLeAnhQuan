package Case_Study.FuramaResort.model.model;


import Case_Study.FuramaResort.model.model.extend_person.Customer;

import java.time.LocalDate;

public class Booking {
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String nameService;

    public Booking() {
    }

    public Booking(String id, LocalDate startDate, LocalDate endDate, String customerId, String nameService) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.nameService = nameService;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
