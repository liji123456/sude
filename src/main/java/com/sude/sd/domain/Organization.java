package com.sude.sd.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A . 
 */
@Entity
@Table(name = "organization")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "organization")
public class Organization extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "lawman")
    private String lawman;  // 

    @NotNull
    @Column(name = "org_code", nullable = false)
    private String orgCode;  // 

    @Column(name = "org_name")
    private String orgName;  // 

    @NotNull
    @Column(name = "apply_status", nullable = false)
    private String applyStatus;  // 

    @Column(name = "city_code")
    private String cityCode;  // 

    @NotNull
    @Column(name = "province_code", nullable = false)
    private String provinceCode;  // 

    @NotNull
    @Column(name = "county_code", nullable = false)
    private String countyCode;  // 

    @Column(name = "org_type")
    private String orgType;  // 

    @NotNull
    @Column(name = "create_by", nullable = false)
    private String createBy;  // 

    @Column(name = "create_date")
    private ZonedDateTime createDate;  // 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLawman() {
        return lawman;
    }

    public Organization lawman(String lawman) {
        this.lawman = lawman;
        return this;
    }

    public void setLawman(String lawman) {
        this.lawman = lawman;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public Organization orgCode(String orgCode) {
        this.orgCode = orgCode;
        return this;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public Organization orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public Organization applyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getCityCode() {
        return cityCode;
    }

    public Organization cityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public Organization provinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public Organization countyCode(String countyCode) {
        this.countyCode = countyCode;
        return this;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getOrgType() {
        return orgType;
    }

    public Organization orgType(String orgType) {
        this.orgType = orgType;
        return this;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Organization createBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public Organization createDate(ZonedDateTime createDate) {
        this.createDate = createDate;
        return this;
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
        Organization organization = (Organization) o;
        if(organization.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, organization.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Organization{" +
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
