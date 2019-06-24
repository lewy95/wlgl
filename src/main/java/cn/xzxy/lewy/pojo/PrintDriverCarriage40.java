package cn.xzxy.lewy.pojo;

import javax.persistence.*;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Entity
@Table(name = "t_40_dysjyl", schema = "wlgl", catalog = "")
public class PrintDriverCarriage40 {
    private String carNo;
    private Double carryFeeTotal;
    private Double addCarriageTotal;
    private Double total;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarNO")
    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    @Column(name = "CarryFeeTotal")
    public Double getCarryFeeTotal() {
        return carryFeeTotal;
    }

    public void setCarryFeeTotal(Double carryFeeTotal) {
        this.carryFeeTotal = carryFeeTotal;
    }


    @Column(name = "AddCarriageTotal")
    public Double getAddCarriageTotal() {
        return addCarriageTotal;
    }

    public void setAddCarriageTotal(Double addCarriageTotal) {
        this.addCarriageTotal = addCarriageTotal;
    }


    @Column(name = "Total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
