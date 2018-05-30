package com.sude.sd.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A . 
 */
@Entity
@Table(name = "user_application_form")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "userapplicationform")
public class UserApplicationForm extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "app_form_code")
    private String appFormCode;  // 

    @NotNull
    @Column(name = "status", nullable = false)
    private String status;  // 

    @Column(name = "pay_premium", precision=10, scale=2)
    private BigDecimal pay_premium;  // 

    @Column(name = "start_date")
    private ZonedDateTime startDate;  // 

    @Column(name = "end_date")
    private LocalDate endDate;  // 

    @Column(name = "insurance_no")
    private String insuranceNo;  // 

//    @ManyToOne
//    private Organization organization; //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppFormCode() {
        return appFormCode;
    }

    public UserApplicationForm appFormCode(String appFormCode) {
        this.appFormCode = appFormCode;
        return this;
    }

    public void setAppFormCode(String appFormCode) {
        this.appFormCode = appFormCode;
    }

    public String getStatus() {
        return status;
    }

    public UserApplicationForm status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPay_premium() {
        return pay_premium;
    }

    public UserApplicationForm pay_premium(BigDecimal pay_premium) {
        this.pay_premium = pay_premium;
        return this;
    }

    public void setPay_premium(BigDecimal pay_premium) {
        this.pay_premium = pay_premium;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public UserApplicationForm startDate(ZonedDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public UserApplicationForm endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public UserApplicationForm insuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
        return this;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
//
//    public Organization getOrganization() {
//        return organization;
//    }
//
//    public UserApplicationForm organization(Organization organization) {
//        this.organization = organization;
//        return this;
//    }
//
//    public void setOrganization(Organization organization) {
//        this.organization = organization;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserApplicationForm userApplicationForm = (UserApplicationForm) o;
        if(userApplicationForm.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, userApplicationForm.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UserApplicationForm{" +
            "id=" + id +
            ", appFormCode='" + appFormCode + "'" +
            ", status='" + status + "'" +
            ", pay_premium='" + pay_premium + "'" +
            ", startDate='" + startDate + "'" +
            ", endDate='" + endDate + "'" +
            ", insuranceNo='" + insuranceNo + "'" +
            '}';
    }
}
