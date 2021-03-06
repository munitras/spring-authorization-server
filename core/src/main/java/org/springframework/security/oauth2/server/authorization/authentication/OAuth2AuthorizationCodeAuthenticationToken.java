/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.oauth2.server.authorization.authentication;

import org.springframework.lang.Nullable;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.SpringSecurityCoreVersion;

import java.util.Collections;

/**
 * @author Joe Grandja
 */
public class OAuth2AuthorizationCodeAuthenticationToken extends AbstractAuthenticationToken {
	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
	private String code;
	private Authentication clientPrincipal;
	private String clientId;
	private String redirectUri;

	public OAuth2AuthorizationCodeAuthenticationToken(String code,
			Authentication clientPrincipal, @Nullable String redirectUri) {
		super(Collections.emptyList());
		this.code = code;
		this.redirectUri = redirectUri;
		this.clientPrincipal = clientPrincipal;
	}

	public OAuth2AuthorizationCodeAuthenticationToken(String code,
			String clientId, @Nullable String redirectUri) {
		super(Collections.emptyList());
		this.code = code;
		this.redirectUri = redirectUri;
		this.clientId = clientId;
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Object getPrincipal() {
		return null;
	}
}
