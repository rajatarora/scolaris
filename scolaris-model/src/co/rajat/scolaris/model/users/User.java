/*
 * Copyright 2016 Rajat Arora
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.rajat.scolaris.model.users;

import java.util.List;

/**
 * Describes a single User of Scolaris.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class User {

	/** The system generated unique ID of the User. */
	String id;
	
	/** The unique login name of the User. */
	String username;
	
	/** The roles assigned to the User. */
	List<Role> roles;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof User)) return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (username == null) {
			if (other.username != null) return false;
		}
		else if (!username.equals(other.username)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [");
		if (id != null) builder.append("id=").append(id).append(", ");
		if (username != null) builder.append("username=").append(username);
		builder.append("]");
		return builder.toString();
	}
	
}
