/* See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Esri Inc. licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.catalog.search;
import java.util.List;


/**
 * The Interface ISearchFilterThemes. Defines the themes/data
 * categories to be applied to the search criteria.
 */
public interface ISearchFilterThemes extends ISearchFilter {

// methods =====================================================================
/**
 * Gets the selected themes.
 * 
 * @return the selected themes
 */
public List<String> getSelectedThemes();

/**
 * Sets the selected themes.
 * 
 * @param themes the new selected themes
 */
public void setSelectedThemes(List<String> themes);

}

