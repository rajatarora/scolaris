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

/**
 * Describes the complete street address of a particular Person in Scolaris.
 * 
 * @see Person
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Address {

	/** Address Line 1 */
	String line1;
	
	/** Address Line 2 */
	String line2;
	
	/** The city. */
	String city;
	
	/** The state. */
	String state;
	
	/** The country. */
	String country;
	
	/** The postal code. */
	String postalCode;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((line1 == null) ? 0 : line1.hashCode());
		result = prime * result + ((line2 == null) ? 0 : line2.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Address)) return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null) return false;
		}
		else if (!city.equals(other.city)) return false;
		if (country == null) {
			if (other.country != null) return false;
		}
		else if (!country.equals(other.country)) return false;
		if (line1 == null) {
			if (other.line1 != null) return false;
		}
		else if (!line1.equals(other.line1)) return false;
		if (line2 == null) {
			if (other.line2 != null) return false;
		}
		else if (!line2.equals(other.line2)) return false;
		if (postalCode == null) {
			if (other.postalCode != null) return false;
		}
		else if (!postalCode.equals(other.postalCode)) return false;
		if (state == null) {
			if (other.state != null) return false;
		}
		else if (!state.equals(other.state)) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [");
		if (line1 != null) builder.append("line1=").append(line1).append(", ");
		if (line2 != null) builder.append("line2=").append(line2).append(", ");
		if (city != null) builder.append("city=").append(city).append(", ");
		if (state != null) builder.append("state=").append(state).append(", ");
		if (country != null) builder.append("country=").append(country).append(", ");
		if (postalCode != null) builder.append("postalCode=").append(postalCode);
		builder.append("]");
		return builder.toString();
	}
	
}
