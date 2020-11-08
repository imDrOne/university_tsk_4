package ru.miit;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RollingStock {
    @NotNull(message = "Name connot be null")
    private int id;

    @NotNull(message = "Name connot be null")
    @Min(value= 100, message = "Wagon number must be under 100")
    private int number;

    @Size(min = 5, max = 100, message = "Rolling stock must be contain wagon count between 10 and 100")
    private int wagonsCount;

    public RollingStock(int id, int number, int wagonsCount) {
        this.id = id;
        this.number = number;
        this.wagonsCount = wagonsCount;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWagonsCount(int wagonsCount) {
        this.wagonsCount = wagonsCount;
    }
}
