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
package co.rajat.scolaris.model.academia;

import java.time.LocalTime;

/**
 * Describes a particular Duration of a Class, e.g. "1 Hour", "40 Minutes" etc.
 * 
 * @see Class
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class ClassDuration {

	/** The system generated unique ID of the Class Duration. */
	public String id;
	
	/** The name. */
	public String name;
	
	/** The duration. */
	public LocalTime duration;
}
