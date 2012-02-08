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
package com.downes.nyt4j;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * http://api.nytimes.com/svc/mostpopular/{version}/{resource-type}/{section}[/share-types]/{time-
 * period}[.response-format]?api-key={your-API-key}
 * 
 * @author cdownes
 * 
 */
public class MostPopularSearch {

  private String BASE_URI = "http://api.nytimes.com/svc/mostpopular/";

  NYTAPIKey key;
  MostPopularQuery query;

  public MostPopularSearch(NYTAPIKey key) {
    this.key = key;
  }

  public void search(MostPopularQuery query) {
    this.query = query;
    StringBuilder queryURL = new StringBuilder();
    queryURL.append(BASE_URI);
    queryURL.append(query.getVersion());
    queryURL.append("/" + query.getResourceType().toString());
    queryURL.append("/all-sections");
    queryURL.append("/" + query.getTimePeriod().toString());
    queryURL.append("/" + "?api-key=" + key.getKey());
    System.out.println(queryURL.toString());
    try {
      System.out.println(HttpRequest.urlToJSON(new URL(queryURL.toString())));
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
