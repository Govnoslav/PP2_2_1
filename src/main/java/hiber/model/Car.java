package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Car  {
    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private Integer series;



    public Car() {
    }

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
