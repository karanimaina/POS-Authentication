package com.pos_authentication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@Table(name = "oauth_client_details")
public class OauthClientDetails implements Serializable {
    @Id
    @Column(name = "client_id")
    String clientId;
    @Column(name = "resource_ids")
    String resourceIds;
    @Column(name = "client_secret")
    String clientSecret;
    String scope;
    @Column(name = "authorized_grant_types")
    String authorizedGrantTypes;
    @Column(name = "web_server_redirect_uri")
    String webServerRedirectUri;
    String authorities;
    @Column(name = "access_token_validity")
    long accessTokenValidity;
    @Column(name = "refresh_token_validity")
    long refreshTokenValidity;
    @Column(name = "additional_information")
    String additionalInformation;
    String autoapprove;
}
