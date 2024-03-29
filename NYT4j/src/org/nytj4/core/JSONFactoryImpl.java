// Copyright 2012 Chris Downes. 
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// //////////////////////////////////////////////////////////////////////////////
package org.nytj4.core;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONFactoryImpl implements JSONFactory {

  @Override
  public Article articleFromJSON(JSONObject articleJSON) throws JSONException {
    return new ArticleImpl(articleJSON);
  }

  @Override
  public SearchResultList searchResultListFromJSON(JSONArray searchResultListJSON)
      throws JSONException {
    return new SearchResultListImpl(searchResultListJSON);
  }

  @Override
  public ArticleSearchResponse searchResponseFromJSON(JSONObject searchResponseJSON)
      throws JSONException {
    return new ArticleSearchResponseImpl(searchResponseJSON);
  }

  @Override
  public SearchResult searchResultFromJSON(JSONObject searchResultJSON) throws JSONException {
    return new SearchResultImpl(searchResultJSON);
  }
}
