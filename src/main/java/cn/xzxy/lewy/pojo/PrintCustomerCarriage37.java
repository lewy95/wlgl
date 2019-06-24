package cn.xzxy.lewy.pojo;

import javax.persistence.*;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Entity
@Table(name = "t_37_dykhyl", schema = "wlgl", catalog = "")
public class PrintCustomerCarriage37 {
    private String sendgoodscustomer;
    private Double carriagetotal;
    private Double insurancetotal;
    private Integer pieceamounttotal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sendgoodscustomer")
    public String getSendgoodscustomer() {
        return sendgoodscustomer;
    }

    public void setSendgoodscustomer(String sendgoodscustomer) {
        this.sendgoodscustomer = sendgoodscustomer;
    }

    @Column(name = "carriagetotal")
    public Double getCarriagetotal() {
        return carriagetotal;
    }

    public void setCarriagetotal(Double carriagetotal) {
        this.carriagetotal = carriagetotal;
    }

    @Column(name = "insurancetotal")
    public Double getInsurancetotal() {
        return insurancetotal;
    }

    public void setInsurancetotal(Double insurancetotal) {
        this.insurancetotal = insurancetotal;
    }

    @Column(name = "pieceamounttotal")
    public Integer getPieceamounttotal() {
        return pieceamounttotal;
    }

    public void setPieceamounttotal(Integer pieceamounttotal) {
        this.pieceamounttotal = pieceamounttotal;
    }
}
