package com.pos_authentication.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.jmx.export.annotation.ManagedNotifications;

@NoArgsConstructor
@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
public abstract class BaseEntity {
    @Id
    private long id;
    @CreatedBy
    protected  String createdBy;
    @CreatedDate
    protected String createdOn;
    @LastModifiedBy
    protected  String lastModifiedBy;
    @LastModifiedDate
    protected String lastModifiedDate;
    private  boolean softDelete;

}
