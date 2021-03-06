package org.lahab.clucene.utils;

import java.util.Collection;

/*
 * #%L
 * server
 * %%
 * Copyright (C) 2012 NTNU
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/** 
 * This provides a container to record statistics using a statRecorder
 * @author charlymolter
 *
 */
public interface Statable {

	
	/**
	 * The tile of each statistic that will be recorder for the header of the file
	 * @return
	 */
	Collection<? extends String> header();
	
	/** 
	 * This method should return a vector of stats that should be recorded in the stat file 
	 * 
	 */
	Collection<? extends String> record();
}
