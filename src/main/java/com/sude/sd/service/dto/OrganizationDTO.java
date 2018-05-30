package com.sude.sd.service.dto;

import java.time.ZonedDateTime;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Organization entity.
 */
public class OrganizationDTO implements Serializable {

    private Long id;

    private String lawman;

    @NotNull
    private String orgCode;

    private String orgName;

    @NotNull
    private String applyStatus;

    private String cityCode;

    @NotNull
    private String provinceCode;

    @NotNull
    private String countyCode;

    private String orgType;

    @NotNull
    private String createBy;

    private ZonedDateTime createDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getLawman() {
        return lawman;
    }

    public void setLawman(String lawman) {
        this.lawman = lawman;
    }
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OrganizationDTO organizationDTO = (OrganizationDTO) o;

        if ( ! Objects.equals(id, organizationDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrganizationDTO{" +
            "id=" + id +
            ", lawman='" + lawman + "'" +
            ", orgCode='" + orgCode + "'" +
            ", orgName='" + orgName + "'" +
            ", applyStatus='" + applyStatus + "'" +
            ", cityCode='" + cityCode + "'" +
            ", provinceCode='" + provinceCode + "'" +
            ", countyCode='" + countyCode + "'" +
            ", orgType='" + orgType + "'" +
            ", createBy='" + createBy + "'" +
            ", createDate='" + createDate + "'" +
            '}';
    }
}
