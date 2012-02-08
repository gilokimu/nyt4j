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

public class NYTArticleSearch {

  private NYTAPIKey nytApiKey;

  public NYTArticleSearch(String key) {
    nytApiKey = new NYTAPIKey(key);
  }

  public NYTArticleSearch(NYTAPIKey key) {
    nytApiKey = new NYTAPIKey(key);
  }

  public ArticleSearchQuery newQuery() {
    return new ArticleSearchQueryImpl(nytApiKey);
  }
}
