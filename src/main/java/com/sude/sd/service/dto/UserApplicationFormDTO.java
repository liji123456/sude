package com.sude.sd.service.dto;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;


/**
 * A DTO for the UserApplicationForm entity.
 */
public class UserApplicationFormDTO implements Serializable {

    private Long id;

    private String appFormCode;

    @NotNull
    private String status;

    private BigDecimal pay_premium;

    private ZonedDateTime startDate;

    private LocalDate endDate;

    private String insuranceNo;


    private Long organizationId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getAppFormCode() {
        return appFormCode;
    }

    public void setAppFormCode(String appFormCode) {
        this.appFormCode = appFormCode;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public BigDecimal getPay_premium() {
        return pay_premium;
    }

    public void setPay_premium(BigDecimal pay_premium) {
        this.pay_premium = pay_premium;
    }
    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UserApplicationFormDTO userApplicationFormDTO = (UserApplicationFormDTO) o;

        if ( ! Objects.equals(id, userApplicationFormDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UserApplicationFormDTO{" +
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
