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

import co.rajat.scolaris.model.academia.Department;
import co.rajat.scolaris.model.academia.Subject;

/**
 * Describes a particular Teacher of the Institution.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 1.0
 */
public class Teacher extends Employee {

	/** The academic Department the Teacher belongs to. */
	public Department department;
	
	/** The Subjects taught by the Teacher. */
	public List<Subject> subjects;
}
