/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.identity.application.authenticator.totp.internal;

import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.utils.ConfigurationContextService;

/**
 * DataHolder to hold instance.
 *
 * @since 2.0.3
 */
public class TOTPDataHolder {
	private static TOTPDataHolder instance = new TOTPDataHolder();
	private RealmService realmService;
	private ConfigurationContextService configurationContextService;

	/**
	 * Returns the DataHolder instance.
	 *
	 * @return The DataHolder instance
	 */
	public static TOTPDataHolder getInstance() {
		return instance;
	}

	/**
	 * Returns the Realm service.
	 *
	 * @return Realm service
	 */
	public RealmService getRealmService() {
		return realmService;
	}

	/**
	 * Sets the Realm service.
	 *
	 * @param realmService Realm service
	 */
	public void setRealmService(RealmService realmService) {
		this.realmService = realmService;
	}

	/**
	 * Returns the ConfigurationContext service.
	 *
	 * @return ConfigurationContext service
	 */
	public ConfigurationContextService getConfigurationContextService() {
		return configurationContextService;
	}

	/**
	 * Sets the ConfigurationContext service.
	 *
	 * @param configurationContextService The ConfigurationContextService
	 */
	public void setConfigurationContextService(
			ConfigurationContextService configurationContextService) {
		this.configurationContextService = configurationContextService;
	}
}