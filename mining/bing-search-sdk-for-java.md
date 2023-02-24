# bing-search-sdk-for-java 
 
# Bad smells
I found 817 bad smells with 44 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 254 | false |
| SystemOutErr | 223 | false |
| RedundantStringFormatCall | 66 | false |
| UnstableApiUsage | 50 | false |
| UNUSED_IMPORT | 33 | false |
| Anonymous2MethodRef | 32 | false |
| DefaultAnnotationParam | 27 | false |
| SizeReplaceableByIsEmpty | 25 | true |
| UtilityClassWithoutPrivateConstructor | 19 | true |
| WrongPackageStatement | 19 | false |
| ThrowablePrintStackTrace | 18 | false |
| ReturnNull | 10 | false |
| UnusedAssignment | 9 | false |
| KeySetIterationMayUseEntrySet | 7 | false |
| ZeroLengthArrayInitialization | 6 | false |
| UnnecessaryFullyQualifiedName | 5 | false |
| NestedAssignment | 3 | false |
| ThrowablePrintedToSystemOut | 3 | false |
| IOResource | 2 | false |
| DataFlowIssue | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| TrivialStringConcatenation | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
        // receive JSON body
        InputStream stream = connection.getInputStream();
        String response = new Scanner(stream).useDelimiter("\\A").next();

        // construct result object for return
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java

            InputStream stream = response.getEntity().getContent();
            String json = new Scanner(stream).useDelimiter("\\A").next();

            System.out.println("\nJSON Response:\n");
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
    public static void main (String[] args) {
        if (subscriptionKey.length() != 32) {
            System.out.println("Invalid Bing Search API subscription key!");
            System.out.println("Please paste yours into the source code.");
            System.exit(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
        if (subscriptionKey.length() != 32) {
            System.out.println("Invalid Bing Search API subscription key!");
            System.out.println("Please paste yours into the source code.");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java

        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchImages(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
            */

            System.out.println("\nJSON Response:\n");
            //parse the jseon
            JsonParser parser = new JsonParser();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
            String resultURL = first_result.get("thumbnailUrl").getAsString();

            System.out.println("\nThe total number of images found: "+ total +"\n");
            System.out.println("\nThe thumbnail URL to the first image search URL: "+ resultURL +"\n");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java

            System.out.println("\nThe total number of images found: "+ total +"\n");
            System.out.println("\nThe thumbnail URL to the first image search URL: "+ resultURL +"\n");

        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
    public static void main(String[] args) {
        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchWeb(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
            SearchResults result = SearchWeb(searchTerm);

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingWebSearch.java`
#### Snippet
```java

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                if (firstspellCheckResult != null)
                {
                    System.out.println(String.format("SpellCheck Results#%d", result.flaggedTokens().size()));
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                {
                    System.out.println(String.format("SpellCheck Results#%d", result.flaggedTokens().size()));
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
                    System.out.println(String.format("First SpellCheck Result Suggestion Count: %d ",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                    System.out.println(String.format("SpellCheck Results#%d", result.flaggedTokens().size()));
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
                    System.out.println(String.format("First SpellCheck Result Suggestion Count: %d ",
                            firstspellCheckResult.suggestions().size()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
                    System.out.println(String.format("First SpellCheck Result Suggestion Count: %d ",
                            firstspellCheckResult.suggestions().size()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                    {
                        SpellingTokenSuggestion firstSuggestion = suggestions.get(0);
                        System.out.println(String.format("First SpellCheck Suggestion Score: %f ", firstSuggestion.score()));
                        System.out.println(String.format("First SpellCheck Suggestion : %s ", firstSuggestion.suggestion()));
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                        SpellingTokenSuggestion firstSuggestion = suggestions.get(0);
                        System.out.println(String.format("First SpellCheck Suggestion Score: %f ", firstSuggestion.score()));
                        System.out.println(String.format("First SpellCheck Suggestion : %s ", firstSuggestion.suggestion()));
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                else
                {
                    System.out.println("Couldn't get any Spell check results!");
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
            else
            {
                System.out.println("Didn't see any SpellCheck results..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
            runSample(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
            runSample(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
            // This will look up a single query "Xbox" and print out name and url for first web, image, news and videos results

            System.out.println("Searched Web for \"Xbox\"");
            SearchResponse webData = client.webs().search("Xbox");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
                    System.out.println("Couldn't find web results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
                    System.out.println("Couldn't find web results!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any Web data..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstImageResult != null) {
                    System.out.println(String.format("Image Results#%d", webData.images().value().size()));
                    System.out.println(String.format("First Image result name: %s ", firstImageResult.name()));
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstImageResult != null) {
                    System.out.println(String.format("Image Results#%d", webData.images().value().size()));
                    System.out.println(String.format("First Image result name: %s ", firstImageResult.name()));
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Image Results#%d", webData.images().value().size()));
                    System.out.println(String.format("First Image result name: %s ", firstImageResult.name()));
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
                } else {
                    System.out.println("Couldn't find first image results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
                } else {
                    System.out.println("Couldn't find first image results!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any image data..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstNewsResult != null) {
                    System.out.println(String.format("News Results#%d", webData.news().value().size()));
                    System.out.println(String.format("First news result name: %s ", firstNewsResult.name()));
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstNewsResult != null) {
                    System.out.println(String.format("News Results#%d", webData.news().value().size()));
                    System.out.println(String.format("First news result name: %s ", firstNewsResult.name()));
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("News Results#%d", webData.news().value().size()));
                    System.out.println(String.format("First news result name: %s ", firstNewsResult.name()));
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
                } else {
                    System.out.println("Couldn't find any News results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
                } else {
                    System.out.println("Couldn't find any News results!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see first news data..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstVideoResult != null) {
                    System.out.println(String.format("Video Results#%s", webData.videos().value().size()));
                    System.out.println(String.format("First Video result name: %s ", firstVideoResult.name()));
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstVideoResult != null) {
                    System.out.println(String.format("Video Results#%s", webData.videos().value().size()));
                    System.out.println(String.format("First Video result name: %s ", firstVideoResult.name()));
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Video Results#%s", webData.videos().value().size()));
                    System.out.println(String.format("First Video result name: %s ", firstVideoResult.name()));
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
                } else {
                    System.out.println("Couldn't find first video results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
                } else {
                    System.out.println("Couldn't find first video results!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any video data..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
            runSample(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
            // This will request suggestions for "Satya Nadella" and print out the results

            System.out.println("Searched for \"Satya Nadella\" and print out the returned suggestions");

            Suggestions suggestions = client.autoSuggest("Satya Nadella");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
            Suggestions suggestions = client.autoSuggest("Satya Nadella");
            if (suggestions != null && suggestions.suggestionGroups() != null && suggestions.suggestionGroups().size() > 0) {
                System.out.println("Found the following suggestions:");
                for (SearchAction suggestion: suggestions.suggestionGroups().get(0).searchSuggestions()) {
                    System.out.println("....................................");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                System.out.println("Found the following suggestions:");
                for (SearchAction suggestion: suggestions.suggestionGroups().get(0).searchSuggestions()) {
                    System.out.println("....................................");
                    System.out.println(suggestion.query());
                    System.out.println(suggestion.displayText());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                for (SearchAction suggestion: suggestions.suggestionGroups().get(0).searchSuggestions()) {
                    System.out.println("....................................");
                    System.out.println(suggestion.query());
                    System.out.println(suggestion.displayText());
                    System.out.println(suggestion.url());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                    System.out.println("....................................");
                    System.out.println(suggestion.query());
                    System.out.println(suggestion.displayText());
                    System.out.println(suggestion.url());
                    System.out.println(suggestion.searchKind());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                    System.out.println(suggestion.query());
                    System.out.println(suggestion.displayText());
                    System.out.println(suggestion.url());
                    System.out.println(suggestion.searchKind());
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                    System.out.println(suggestion.displayText());
                    System.out.println(suggestion.url());
                    System.out.println(suggestion.searchKind());
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any suggestion...");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java
            String json = new Scanner(stream).useDelimiter("\\A").next();

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(json));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(json));
        }
        catch (IOException e)
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java
        catch (IOException e)
        {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
            //and print out name and url for the first web page in the results list
    
            System.out.println("Searching for Query: \"Xbox\"");
            customConfigId = customConfigId != null ? customConfigId : "0";
            SearchResponse webData = client.customInstances().search(customConfigId,"Xbox");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
    
                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
                    System.out.println("Couldn't find web results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
                    System.out.println("Couldn't find web results!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any Web data..");
            }
    
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
            runSample(client, customConfigId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        }
        catch (java.io.IOException f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
    // <searchWithFilter>
    public static void searchWithFilter(VisualSearchClientImpl client){
        System.out.println("Calling Bing Visual Search with image binary and insights token");
        Gson gson = new Gson();
        String imageUrl = "https:///photo-1512546148165-e50d714a565a?w=600&q=80";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                .withImageInfo(imageInfo)
                .withKnowledgeRequest(knowledgeRequest);
        System.out.println(gson.toJson(visualSearchRequest));
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, gson.toJson(visualSearchRequest),  new byte[0]);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
    // <visualSearchWithCropArea>
    public static void searchWithCropArea(VisualSearchClientImpl client, byte[] imageBytes){
        System.out.println("Calling Bing Visual Search with image binary, using crop area");
        VisualSearchRequest visualSearchRequest;
        ImageKnowledge visualSearchResults;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        ImageInfo imageInfo = new ImageInfo().withCropArea(cropArea);
        visualSearchRequest = new VisualSearchRequest().withImageInfo(imageInfo);
        System.out.println(gson.toJson(visualSearchRequest));
        visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, gson.toJson(visualSearchRequest), imageBytes);
        PrintVisualSearchResults(visualSearchResults);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java


        System.out.println("Search with an image insights token using crop area");
        String imageInsightsToken = "bcid_113F29C079F18F385732D8046EC80145*ccid_oV/QcH95*mid_687689FAFA449B35BC11A1AE6CEAB6F9A9B53708*thid_R.113F29C079F18F385732D8046EC80145";
        Gson gson = new Gson();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                .withCropArea(cropArea);
        VisualSearchRequest visualSearchRequest = new VisualSearchRequest().withImageInfo(imageInfo);
        System.out.println(gson.toJson(visualSearchRequest));
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, gson.toJson(visualSearchRequest),  new byte[0]);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

    public static void searchUsingCropArea(VisualSearchClientImpl client){
        System.out.println("Search with an url of dog image using crop area");
        String visualSearchRequestJSON = "{\"imageInfo\":{\"url\":\"https://images.unsplash.com/photo-1512546148165-e50d714a565a?w=600&q=80\",\"cropArea\":{\"top\":0.1,\"bottom\":0.5,\"left\":0.1,\"right\":0.9}},\"knowledgeRequest\":{\"filters\":{\"site\":\"www.bing.com\"}}}";
        System.out.println(visualSearchRequestJSON);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        System.out.println("Search with an url of dog image using crop area");
        String visualSearchRequestJSON = "{\"imageInfo\":{\"url\":\"https://images.unsplash.com/photo-1512546148165-e50d714a565a?w=600&q=80\",\"cropArea\":{\"top\":0.1,\"bottom\":0.5,\"left\":0.1,\"right\":0.9}},\"knowledgeRequest\":{\"filters\":{\"site\":\"www.bing.com\"}}}";
        System.out.println(visualSearchRequestJSON);
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, visualSearchRequestJSON,  new byte[0]);
        PrintVisualSearchResults(visualSearchResults);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
    static void PrintVisualSearchResults(ImageKnowledge visualSearchResults) {
        if (visualSearchResults == null) {
            System.out.println("No visual search result data.");
        } else {
            // Print token
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

            if (visualSearchResults.image() != null && visualSearchResults.image().imageInsightsToken() != null) {
                System.out.println("Found uploaded image insights token: " + visualSearchResults.image().imageInsightsToken());
            } else {
                System.out.println("Couldn't find image insights token!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                System.out.println("Found uploaded image insights token: " + visualSearchResults.image().imageInsightsToken());
            } else {
                System.out.println("Couldn't find image insights token!");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

            if (visualSearchResults.tags() != null && visualSearchResults.tags().size() > 0) {
                System.out.format("Found visual search tag count: %d\n", visualSearchResults.tags().size());
                ImageTag firstTagResult = visualSearchResults.tags().get(0);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

                if (firstTagResult.actions() != null && firstTagResult.actions().size() > 0) {
                    System.out.format("Found first tag action count: %d\n", firstTagResult.actions().size());
                    System.out.println("Found first tag action type: " + firstTagResult.actions().get(0).actionType());
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                if (firstTagResult.actions() != null && firstTagResult.actions().size() > 0) {
                    System.out.format("Found first tag action count: %d\n", firstTagResult.actions().size());
                    System.out.println("Found first tag action type: " + firstTagResult.actions().get(0).actionType());
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Couldn't find image tags!");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
    // <visualSearch>
    public static void visualSearch(VisualSearchClientImpl client, byte[] imageBytes){
        System.out.println("Calling Bing Visual Search with image binary");
        
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, null, imageBytes);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            runSample(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            if (videoResults.value().size() > 0) {
                VideoObject firstVideoResult = videoResults.value().get(0);
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                VideoObject firstVideoResult = videoResults.value().get(0);
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
                System.out.println("\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
                System.out.println("\n");
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
                System.out.println("\n");
            } else {
                System.out.println("Couldn't find video results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println("\n");
            } else {
                System.out.println("Couldn't find video results!");
            }
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            }
        } else {
            System.out.println("Didn't see any video result data..");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            if (trendingResults.bannerTiles().size() > 0) {
                TrendingVideosTile firstBannerTile = trendingResults.bannerTiles().get(0);
                System.out.println(
                        String.format("Banner tile count: {trendingResults.BannerTiles.Count}"));
                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(
                        String.format("Banner tile count: {trendingResults.BannerTiles.Count}"));
                System.out.println(
                        String.format("First banner tile text: {firstBannerTile.Query.Text}"));
                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(
                        String.format("First banner tile text: {firstBannerTile.Query.Text}"));
                System.out.println(
                        String.format("First banner tile url: {firstBannerTile.Query.WebSearchUrl}"));
                System.out.println("\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(
                        String.format("First banner tile url: {firstBannerTile.Query.WebSearchUrl}"));
                System.out.println("\n");
            } else {
                System.out.println("Couldn't find banner tiles!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println("\n");
            } else {
                System.out.println("Couldn't find banner tiles!");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            if (trendingResults.categories().size() > 0) {
                TrendingVideosCategory firstCategory = trendingResults.categories().get(0);
                System.out.println(
                        String.format("Category count: %d", trendingResults.categories().size()));
                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(
                        String.format("Category count: %d", trendingResults.categories().size()));
                System.out.println(
                        String.format("First category title: %s", firstCategory.title()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                if (firstCategory.subcategories().size() > 0) {
                    TrendingVideosSubcategory firstSubCategory = firstCategory.subcategories().get(0);
                    System.out.println(
                            String.format("SubCategory count: %d", firstCategory.subcategories().size()));
                    System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                    System.out.println(
                            String.format("SubCategory count: %d", firstCategory.subcategories().size()));
                    System.out.println(
                            String.format("First sub category title: %s", firstSubCategory.title()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                    if (firstSubCategory.tiles().size() > 0) {
                        TrendingVideosTile firstTile = firstSubCategory.tiles().get(0);
                        System.out.println(
                                String.format("Tile count: %d", firstSubCategory.tiles().size()));
                        System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        System.out.println(
                                String.format("Tile count: %d", firstSubCategory.tiles().size()));
                        System.out.println(
                                String.format("First tile text: %s", firstTile.query().text()));
                        System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        System.out.println(
                                String.format("First tile text: %s", firstTile.query().text()));
                        System.out.println(
                                String.format("First tile url: %s", firstTile.query().webSearchUrl()));
                    } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                String.format("First tile url: %s", firstTile.query().webSearchUrl()));
                    } else {
                        System.out.println("Couldn't find tiles!");
                    }
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                    }
                } else {
                    System.out.println("Couldn't find subcategories!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Couldn't find categories!");
            }
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            }
        } else {
            System.out.println("Didn't see any trending video data..");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            //   name and url of the first video result.

            System.out.println("Search videos for query \"SwiftKey\"");
            Videos videoResults = client.videos().search("SwiftKey");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java


            System.out.println("Search videos for query \"Bellevue Trailer\" that is free, short and 1080p resolution");
            
            videoResults = client.videos().search("Bellevue Trailer", null, null, null, null, null, null, null, Freshness.MONTH, null, VideoLength.SHORT, "en-us", null, VideoPricing.FREE , VideoResolution.HD1080P, null, null, null, null);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            // This will search for trending videos then verify banner tiles and categories.

            System.out.println("Search trending videos");
            TrendingVideos trendingResults = client.videos().trending();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                modules.add(VideoInsightModule.ALL);

                System.out.println(
                        String.format("Search detail for video id={firstVideo.VideoId}, name=%s", firstVideo.name()));
                int maxTries = 2;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        if (videoDetail != null) {
                            if (videoDetail.videoResult() != null) {
                                System.out.println(
                                        String.format("Expected video id: %s", videoDetail.videoResult().videoId()));
                                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                System.out.println(
                                        String.format("Expected video id: %s", videoDetail.videoResult().videoId()));
                                System.out.println(
                                        String.format("Expected video name: %s", videoDetail.videoResult().name()));
                                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                System.out.println(
                                        String.format("Expected video name: %s", videoDetail.videoResult().name()));
                                System.out.println(
                                        String.format("Expected video url: %s", videoDetail.videoResult().contentUrl()));
                            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("Expected video url: %s", videoDetail.videoResult().contentUrl()));
                            } else {
                                System.out.println("Couldn't find expected video!");
                            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                    videoDetail.relatedVideos().value().size() > 0) {
                                VideoObject firstRelatedVideo = videoDetail.relatedVideos().value().get(0);
                                System.out.println(
                                        String.format("Related video count: %d", videoDetail.relatedVideos().value().size()));
                                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                System.out.println(
                                        String.format("Related video count: %d", videoDetail.relatedVideos().value().size()));
                                System.out.println(
                                        String.format("First related video id: %s", firstRelatedVideo.videoId()));
                                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                System.out.println(
                                        String.format("First related video id: %s", firstRelatedVideo.videoId()));
                                System.out.println(
                                        String.format("First related video name: %s", firstRelatedVideo.name()));
                                System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                System.out.println(
                                        String.format("First related video name: %s", firstRelatedVideo.name()));
                                System.out.println(
                                        String.format("First related video url: %s", firstRelatedVideo.contentUrl()));
                            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("First related video url: %s", firstRelatedVideo.contentUrl()));
                            } else {
                                System.out.println("Couldn't find any related video!");
                            }
                        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                            }
                        } else {
                            System.out.println("Couldn't find detail about the video!");
                        }
                        break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        break;
                    } catch (ErrorResponseException e) {
                        System.out.println(
                                String.format("Exception occurred, status code %s with reason %s.", e.response().code(), e.response().message()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java

                        if (e.response().code() == 429) {
                            System.out.println("You are getting a request exceeded error because you are using the free tier for this sample. Code will wait 1 second before resending request");
                        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        }
                        Thread.sleep(1000);
                        System.out.println("Resending request now...");
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Couldn't find video results!");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
    public static void main(String[] args) {
        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchNews(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
            SearchResults result = SearchNews(searchTerm);

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
    public static void main(String[] args) {
        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchVideos(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
            SearchResults result = SearchVideos(searchTerm);

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
            }
            // Pretty print
            System.out.println(prettify(sb.toString()));

            in.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
    public static void main (String[] args) {
        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchWeb(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
            SearchResults result = SearchWeb(searchTerm);

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        }
        catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            // of the first item in the list of news result list.

            System.out.println("Search news for query \"Quantum  Computing\" with market and count");
            News newsResults = client.news().search("Quantum  Computing");
            PrintNewsResult(newsResults);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            //  name of provider of the first news result
        
            System.out.println("Search most recent news for query \"Artificial Intelligence\" with freshness and sortBy");
            newsResults = client.news().search("Artificial Intelligence", null,null, null, null, null, null, null, Freshness.WEEK, "en-us", null,null, null, null,"Date", null, null);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            //  and print out category, name, url, description, published time and name of provider of the first news result

            System.out.println("Search category news");
            newsResults = client.news().category();
            PrintNewsResult(newsResults);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            //  webSearchUrl, newsSearchUrl and image Url of the first news result

            System.out.println("Search news trending topics in Bing");
            TrendingTopics trendingTopics = client.news().trending();
            if (trendingTopics != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    NewsTopic firstTopic = trendingTopics.value().get(0);

                    System.out.println(String.format("Trending topics count: %s", trendingTopics.value().size()));
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java

                    System.out.println(String.format("Trending topics count: %s", trendingTopics.value().size()));
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Trending topics count: %s", trendingTopics.value().size()));
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
                } else {
                    System.out.println("Couldn't find news trending topics!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
                } else {
                    System.out.println("Couldn't find news trending topics!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any news trending topics..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                NewsArticle firstNewsResult = newsResults.value().get(0);

                System.out.println(String.format("TotalEstimatedMatches value: %d", newsResults.totalEstimatedMatches()));
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java

                System.out.println(String.format("TotalEstimatedMatches value: %d", newsResults.totalEstimatedMatches()));
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("TotalEstimatedMatches value: %d", newsResults.totalEstimatedMatches()));
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
                System.out.println("\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
                System.out.println("\n");
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
                System.out.println("\n");
            } else {
                System.out.println("Couldn't find news results!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println("\n");
            } else {
                System.out.println("Couldn't find news results!");
            }
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            }
        } else {
            System.out.println("Didn't see any news result data..");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            runSample(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
        try {
            String response = search();
            System.out.println(prettify(response));
        } catch (Exception e) {
            System.out.println(e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
            System.out.println(prettify(response));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
    public static void main(String[] args) {
        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchImages(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
            SearchResults result = SearchImages(searchTerm);

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearch.java`
#### Snippet
```java

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
            System.out.println(prettify(result.jsonResponse));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
            // This will search images for "canadian rockies" then print the first image result,

            System.out.println(String.format("Search images for query %s", searchTerm));

            Images imageResults = client.images().search(searchTerm);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                ImageObject firstImageResult = imageResults.value().get(0);

                System.out.println(String.format("Image result count: %d", imageResults.value().size()));
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java

                System.out.println(String.format("Image result count: %d", imageResults.value().size()));
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
                System.out.println(String.format("First image content url: %s", firstImageResult.contentUrl()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("Image result count: %d", imageResults.value().size()));
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
                System.out.println(String.format("First image content url: %s", firstImageResult.contentUrl()));
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
                System.out.println(String.format("First image content url: %s", firstImageResult.contentUrl()));
            }
            else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
            }
            else {
                    System.out.println("Couldn't find any image results!");
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
            }
        catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
            runSample(client, searchTerm);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
        try {
            String response = get_suggestions ();
            System.out.println (prettify (response));
        }
        catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
            runSample(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                for (Thing thing : entrys) {
                    if (thing.entityPresentationInfo().entityScenario() == EntityScenario.DOMINANT_ENTITY) {
                        System.out.println("Searched for \"Satya Nadella\" and found a dominant entity with this description:");
                        System.out.println(thing.description());
                        System.out.println("\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    if (thing.entityPresentationInfo().entityScenario() == EntityScenario.DOMINANT_ENTITY) {
                        System.out.println("Searched for \"Satya Nadella\" and found a dominant entity with this description:");
                        System.out.println(thing.description());
                        System.out.println("\n");
                        hasDominateEntry = true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        System.out.println("Searched for \"Satya Nadella\" and found a dominant entity with this description:");
                        System.out.println(thing.description());
                        System.out.println("\n");
                        hasDominateEntry = true;
                        break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                }
                if (!hasDominateEntry) {
                    System.out.println("Couldn't find main entity Satya Nadella!");
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Didn't see any data..");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        for (Thing thing : entrys) {
                            if (thing.entityPresentationInfo().entityScenario() == EntityScenario.DOMINANT_ENTITY) {
                                System.out.println("Searched for \"William Gates\" and found a dominant entity with this description:");
                                System.out.println(thing.description());
                                hasDominateEntry = true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                            if (thing.entityPresentationInfo().entityScenario() == EntityScenario.DOMINANT_ENTITY) {
                                System.out.println("Searched for \"William Gates\" and found a dominant entity with this description:");
                                System.out.println(thing.description());
                                hasDominateEntry = true;
                                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        }
                        if (!hasDominateEntry) {
                            System.out.println("Couldn't find main entity \"William Gates\"!");
                        } else {
                            List<Thing> dominateEntries = new ArrayList<>();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                            }
                            if (dominateEntries.size() > 1) {
                                System.out.println("This query is pretty ambiguous and can be referring to multiple things. Did you mean one of these:");
                                for (Thing thing : dominateEntries) {
                                    System.out.format("\t%s (%s)\n", thing.name(), thing.entityPresentationInfo().entityTypeDisplayHint());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                                System.out.println("This query is pretty ambiguous and can be referring to multiple things. Did you mean one of these:");
                                for (Thing thing : dominateEntries) {
                                    System.out.format("\t%s (%s)\n", thing.name(), thing.entityPresentationInfo().entityTypeDisplayHint());
                                }
                            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                                }
                            } else {
                                System.out.println("We didn't find any disambiguation items for William Gates, so we must be certain what you're talking about!");
                            }
                        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        }
                    } else {
                        System.out.println("Didn't see any data..");
                    }
                    System.out.println("\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        System.out.println("Didn't see any data..");
                    }
                    System.out.println("\n");
                    break;
                } catch (ErrorResponseException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    break;
                } catch (ErrorResponseException e) {
                    System.out.println(
                            String.format("Exception occurred when searching for William Gates, status code %s with reason %s.", e.response().code(), e.response().message()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

                    if (e.response().code() == 429) {
                        System.out.println("You are getting a request exceeded error because you are using the free tier for this sample. Code will wait 1 second before resending request");
                    } else {
                        throw e;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
            // This will look up a single restaurant "john howie bellevue" and print out its phone number.

            System.out.println("Searching for \"john howie bellevue\"");
            for (int i = 1; i <= 2; i++) {
                try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

                        if (store != null) {
                            System.out.println("Searched for \"john howie bellevue\" and found a store with this phone number:");
                            System.out.println(store.telephone());
                        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        if (store != null) {
                            System.out.println("Searched for \"john howie bellevue\" and found a store with this phone number:");
                            System.out.println(store.telephone());
                        } else {
                            System.out.println("Couldn't find a place!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                            System.out.println(store.telephone());
                        } else {
                            System.out.println("Couldn't find a place!");
                        }
                    } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        }
                    } else {
                        System.out.println("Didn't see any data..");
                    }
                    System.out.println("/n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        System.out.println("Didn't see any data..");
                    }
                    System.out.println("/n");
                    break;
                } catch (ErrorResponseException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    break;
                } catch (ErrorResponseException e) {
                    System.out.println(
                            String.format("Exception occurred when searching for Microsoft Store, status code %s with reason %s.", e.response().code(), e.response().message()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

                    if (e.response().code() == 429) {
                        System.out.println("You are getting a request exceeded error because you are using the free tier for this sample. Code will wait for 1 second before resending request");
                    } else {
                        throw e;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                                Place place = (Place) item;
                                if (place == null) {
                                    System.out.println(String.format("Unexpectedly found something that isn't a place named \"%s\"", item.toString()));
                                    continue;
                                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                            }

                            System.out.println("Ok, we found these places: ");
                            System.out.println(sb.toString().substring(1));
                        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

                            System.out.println("Ok, we found these places: ");
                            System.out.println(sb.toString().substring(1));
                        } else {
                            System.out.println("Couldn't find any relevant results for \"seattle restaurants\"");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                            System.out.println(sb.toString().substring(1));
                        } else {
                            System.out.println("Couldn't find any relevant results for \"seattle restaurants\"");
                        }
                    } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        }
                    } else {
                        System.out.println("Didn't see any data..");
                    }
                    System.out.println("/n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        System.out.println("Didn't see any data..");
                    }
                    System.out.println("/n");
                    break;
                } catch (ErrorResponseException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    break;
                } catch (ErrorResponseException e) {
                    System.out.println(
                            String.format("Exception occurred when searching for seattle restaurants, status code %s with reason %s.", e.response().code(), e.response().message()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

                    if (e.response().code() == 429) {
                        System.out.println("You are getting a request exceeded error because you are using the free tier for this sample. Code will wait for 1 second before resending request");
                    } else {
                        throw e;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/models/ResponseBase.java`
#### Snippet
```java
 * The ResponseBase model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseBase.class)
@JsonTypeName("ResponseBase")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/models/Answer.java`
#### Snippet
```java
 * The Answer model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Answer.class)
@JsonTypeName("Answer")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/models/WebWebGrouping.java`
#### Snippet
```java
 * The WebWebGrouping model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = WebWebGrouping.class)
@JsonTypeName("Web/WebGrouping")
public class WebWebGrouping {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/models/SpellCheck.java`
#### Snippet
```java
 * The SpellCheck model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = SpellCheck.class)
@JsonTypeName("SpellCheck")
public class SpellCheck extends Answer {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/models/ContractualRulesAttribution.java`
#### Snippet
```java
 * The ContractualRulesAttribution model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ContractualRulesAttribution.class)
@JsonTypeName("ContractualRules/Attribution")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/models/ContractualRulesLinkAttribution.java`
#### Snippet
```java
 * Defines a contractual rule for link attribution.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ContractualRulesLinkAttribution.class)
@JsonTypeName("ContractualRules/LinkAttribution")
public class ContractualRulesLinkAttribution extends ContractualRulesAttribution {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/Response.java`
#### Snippet
```java
 * response should inherit from this.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Response.class)
@JsonTypeName("Response")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/WebPage.java`
#### Snippet
```java
 * Defines a webpage that is relevant to the query.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = WebPage.class)
@JsonTypeName("WebPage")
public class WebPage extends CreativeWork {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/Thing.java`
#### Snippet
```java
 * The Thing model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Thing.class)
@JsonTypeName("Thing")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/ErrorResponse.java`
#### Snippet
```java
 * The top-level response that represents a failed request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ErrorResponse.class)
@JsonTypeName("ErrorResponse")
public class ErrorResponse extends Response {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/models/AggregateRating.java`
#### Snippet
```java
 * Defines the metrics that indicate how well an item was rated by others.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = AggregateRating.class)
@JsonTypeName("AggregateRating")
public class AggregateRating extends Rating {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/models/ContractualRulesContractualRule.java`
#### Snippet
```java
 * The ContractualRulesContractualRule model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ContractualRulesContractualRule.class)
@JsonTypeName("ContractualRules/ContractualRule")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/models/Response.java`
#### Snippet
```java
 * response should inherit from this.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Response.class)
@JsonTypeName("Response")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/models/Identifiable.java`
#### Snippet
```java
 * Defines the identity of a resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Identifiable.class)
@JsonTypeName("Identifiable")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/Identifiable.java`
#### Snippet
```java
 * Defines the identity of a resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Identifiable.class)
@JsonTypeName("Identifiable")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/ResponseBase.java`
#### Snippet
```java
 * The ResponseBase model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseBase.class)
@JsonTypeName("ResponseBase")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/models/ContractualRulesMediaAttribution.java`
#### Snippet
```java
 * Defines a contractual rule for media attribution.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ContractualRulesMediaAttribution.class)
@JsonTypeName("ContractualRules/MediaAttribution")
public class ContractualRulesMediaAttribution extends ContractualRulesAttribution {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/SearchResponse.java`
#### Snippet
```java
 * succeeds.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = SearchResponse.class)
@JsonTypeName("SearchResponse")
public class SearchResponse extends Response {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/WebWebAnswer.java`
#### Snippet
```java
 * Defines a list of relevant webpage links.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = WebWebAnswer.class)
@JsonTypeName("Web/WebAnswer")
public class WebWebAnswer extends SearchResultsAnswer {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/models/Rating.java`
#### Snippet
```java
 * Defines a rating.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Rating.class)
@JsonTypeName("Rating")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/Answer.java`
#### Snippet
```java
 * The Answer model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Answer.class)
@JsonTypeName("Answer")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/CreativeWork.java`
#### Snippet
```java
 * The CreativeWork model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = CreativeWork.class)
@JsonTypeName("CreativeWork")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/models/SearchResultsAnswer.java`
#### Snippet
```java
 * The SearchResultsAnswer model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = SearchResultsAnswer.class)
@JsonTypeName("SearchResultsAnswer")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/models/ContractualRulesLicenseAttribution.java`
#### Snippet
```java
 * Defines a contractual rule for license attribution.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ContractualRulesLicenseAttribution.class)
@JsonTypeName("ContractualRules/LicenseAttribution")
public class ContractualRulesLicenseAttribution extends ContractualRulesAttribution {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/models/ContractualRulesTextAttribution.java`
#### Snippet
```java
 * Defines a contractual rule for text attribution.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ContractualRulesTextAttribution.class)
@JsonTypeName("ContractualRules/TextAttribution")
public class ContractualRulesTextAttribution extends ContractualRulesAttribution {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/models/PropertiesItem.java`
#### Snippet
```java
 * Defines an item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = PropertiesItem.class)
@JsonTypeName("Properties/Item")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/models/ErrorResponse.java`
#### Snippet
```java
 * The top-level response that represents a failed request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ErrorResponse.class)
@JsonTypeName("ErrorResponse")
public class ErrorResponse extends Response {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `BingImageSearchv7` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
import com.google.gson.JsonArray;

public class BingImageSearchv7 {

// ***********************************************
```

### UtilityClassWithoutPrivateConstructor
Class `BingWebSearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
 *   java -cp .;gson-2.8.6.jar BingWebSearch
 */
public class BingWebSearch {

    // Add your Bing Search V7 subscription key to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingSpellCheckSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
 *  - Spell check "Bill Gatas" with market and mode settings and print out the flagged tokens and suggestions.
 */
public class BingSpellCheckSample {
    /**
     * Main function which runs the actual sample.
```

### UtilityClassWithoutPrivateConstructor
Class `BingWebSearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
 *  - Search the web for "Xbox" with market and count settings and print out the name and url for first web, image, news and videos results.
 */
public class BingWebSearchSample {
    /**
     * Main function which runs the actual sample.
```

### UtilityClassWithoutPrivateConstructor
Class `BingAutoSuggestSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
 *  - Search for "Satya Nadella" and print out the first group of suggestions returned from the service.
 */
public class BingAutoSuggestSample {
    /**
     * Main function which runs the actual sample.
```

### UtilityClassWithoutPrivateConstructor
Class `BingVisualSearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java
 *   java -cp .;lib\* BingVisualSearch
 */
public class BingVisualSearch {

    // Add your Bing Search V7 key endpoint to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingCustomSearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
// </imports>

public class BingCustomSearchSample {

    // <runSample>
```

### UtilityClassWithoutPrivateConstructor
Class `BingVisualSearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java


public class BingVisualSearchSample {

    // Send an image binary and print out the image insights token, the number of tags, the number
```

### UtilityClassWithoutPrivateConstructor
Class `BingVideoSearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
 *  - Search videos for "Bellevue Trailer" and then search for detail information of the first video.
 */
public class BingVideoSearchSample {
    /**
     * Main function which runs the actual sample.
```

### UtilityClassWithoutPrivateConstructor
Class `BingNewsSearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
 */

public class BingNewsSearch {

    // Add your Bing Search V7 subscription key to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingVideoSearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
 *   java -cp .;gson-2.8.6.jar BingVideoSearch
 */
public class BingVideoSearch {

    // Add your Bing Search V7 subscription key to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingSpellCheck` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
 */

public class BingSpellCheck {

    static String endpoint = System.getenv("BING_SPELL_CHECK_ENDPOINT") + "/v7.0/spellcheck";
```

### UtilityClassWithoutPrivateConstructor
Class `BingCustomSearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
 */

public class BingCustomSearch {
    // <vars>
    // Add your Bing Custom Search subscription key and endpoint to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingNewsSearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
 *  - Search the news trending topics with market and print out the results.
 */
public class BingNewsSearchSample {
    /**
     * Main function which runs the actual sample.
```

### UtilityClassWithoutPrivateConstructor
Class `BingEntitySearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
 */

public class BingEntitySearch {

    // Add your Bing Entity Search subscription key to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingImageSearch` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
 */

public class BingImageSearch {
    // Add your Bing Search V7 subscription key to your environment variables.
    static String subscriptionKey = System.getenv("BING_SEARCH_V7_SUBSCRIPTION_KEY");
```

### UtilityClassWithoutPrivateConstructor
Class `BingImageSearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
 *  - Searches images for "canadian rockies" then outputs the result.
 */
public class BingImageSearchSample {
    /**
     * Main function which runs the actual sample.
```

### UtilityClassWithoutPrivateConstructor
Class `BingAutosuggest` has only 'static' members, and lacks a 'private' constructor
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
 */

public class BingAutosuggest {

    // Add your Bing Autosuggest subscription key to your environment variables.
```

### UtilityClassWithoutPrivateConstructor
Class `BingEntitySearchSample` has only 'static' members, and lacks a 'private' constructor
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
 *  - Trigger a bad request and shows how to read the error response.
 */
public class BingEntitySearchSample {
    /**
     * Main function which runs the actual sample.
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
            searchUsingInsightToken(client);
        }
        catch (java.io.IOException f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
            f.printStackTrace();
        }
        catch (java.lang.InterruptedException f){
            f.printStackTrace();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.bing.newssearch` is unnecessary, and can be replaced with an import
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
 * in News.
 */
public class NewsImpl implements com.microsoft.bing.newssearch.NewsInterface {
    /** The Retrofit service to perform REST calls. */
    private NewsService service;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.bing.videosearch` is unnecessary, and can be replaced with an import
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
 * in Videos.
 */
public class VideosImpl implements com.microsoft.bing.videosearch.VideosInterface {
    /** The Retrofit service to perform REST calls. */
    private VideosService service;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.bing.imagesearch` is unnecessary, and can be replaced with an import
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
 * in Images.
 */
public class ImagesImpl implements com.microsoft.bing.imagesearch.ImagesInterface {
    /** The Retrofit service to perform REST calls. */
    private ImagesService service;
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `ClassLoader.getSystemClassLoader().getResourceAsStream("image.jpg")` might be null
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

        try {
            imageBytes = ByteStreams.toByteArray(ClassLoader.getSystemClassLoader().getResourceAsStream("image.jpg"));
            visualSearch(client, imageBytes);
            searchWithCropArea(client, imageBytes);
```

### DataFlowIssue
Method invocation `toString` will produce `NullPointerException`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                                Place place = (Place) item;
                                if (place == null) {
                                    System.out.println(String.format("Unexpectedly found something that isn't a place named \"%s\"", item.toString()));
                                    continue;
                                }
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.*;`
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
import java.io.*;
import java.net.*;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import com.google.gson.Gson;
```

### UNUSED_IMPORT
Unused import `import net.minidev.json.parser.JSONParser;`
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
import com.google.gson.JsonParser;

import net.minidev.json.parser.JSONParser;

/*
```

### UNUSED_IMPORT
Unused import `import java.util.*;`
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
import java.io.*;
import java.net.*;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import com.google.gson.Gson;
```

### UNUSED_IMPORT
Unused import `import org.apache.http.entity.ContentType;`
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.bing.autosuggest.models.SuggestionsSuggestionGroup;`
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
import com.microsoft.bing.autosuggest.models.SearchAction;
import com.microsoft.bing.autosuggest.models.Suggestions;
import com.microsoft.bing.autosuggest.models.SuggestionsSuggestionGroup;
import com.microsoft.bing.autosuggest.implementation.AutoSuggestClientImpl;
import com.microsoft.rest.credentials.ServiceClientCredentials;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;
// </imports>

```

### UNUSED_IMPORT
Unused import `import com.microsoft.bing.entitysearch.models.Error;`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
package com.microsoft.bing.samples;
import com.microsoft.bing.entitysearch.models.EntityScenario;
import com.microsoft.bing.entitysearch.models.Error;
import com.microsoft.bing.entitysearch.models.ErrorResponse;
import com.microsoft.bing.entitysearch.models.ErrorResponseException;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.bing.entitysearch.models.ErrorResponse;`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
import com.microsoft.bing.entitysearch.models.EntityScenario;
import com.microsoft.bing.entitysearch.models.Error;
import com.microsoft.bing.entitysearch.models.ErrorResponse;
import com.microsoft.bing.entitysearch.models.ErrorResponseException;
import com.microsoft.bing.entitysearch.models.Place;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
```

### UNUSED_IMPORT
Unused import `import com.microsoft.bing.newssearch.models.SafeSearch;`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
import com.microsoft.bing.newssearch.models.News;
import com.microsoft.bing.newssearch.models.NewsTopic;
import com.microsoft.bing.newssearch.models.SafeSearch;
import com.microsoft.bing.newssearch.models.TrendingTopics;
import com.microsoft.bing.newssearch.implementation.NewsSearchClientImpl;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.bing.visualsearch.models.ErrorResponseException;`
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
import com.google.gson.Gson;
import com.microsoft.bing.visualsearch.models.CropArea;
import com.microsoft.bing.visualsearch.models.ErrorResponseException;
import com.microsoft.bing.visualsearch.models.Filters;
import com.microsoft.bing.visualsearch.models.ImageInfo;
```

### UNUSED_IMPORT
Unused import `import java.awt.*;`
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
import com.microsoft.bing.visualsearch.implementation.VisualSearchClientImpl;
// </imports>
import java.awt.*;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import okhttp3.*;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
import okhttp3.OkHttpClient.Builder;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
/**
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
/**
 * Sample code for searching web using Bing Web Search, a Bing Service.
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/AutoSuggestClient.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/CustomInstances.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/CustomInstances.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/Entities.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/ImagesInterface.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/NewsInterface.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/SpellCheckClient.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/VideosInterface.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/Images.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.MediaType;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/Webs.java`
#### Snippet
```java
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
```

### NestedAssignment
Result of assignment expression used
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            response.append(line);
        }
```

### NestedAssignment
Result of assignment expression used
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
        new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            response.append(line);
        }
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        catch (java.io.IOException f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        catch (java.lang.InterruptedException f){
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        }
        catch (java.lang.InterruptedException f){
            f.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
        catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        }
        return false;
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

                            System.out.println("Ok, we found these places: ");
                            System.out.println(sb.toString().substring(1));
                        } else {
                            System.out.println("Couldn't find any relevant results for \"seattle restaurants\"");
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
            SearchResults result = SearchImages(searchTerm);
            //uncomment this section to see the HTTP headers
            /*
            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Func1, SearchResponse\>() can be replaced with method reference
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
     */
    public Observable<SearchResponse> searchAsync(String customConfig, String query) {
        return searchWithServiceResponseAsync(customConfig, query).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SearchResponse\>() can be replaced with method reference
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
     */
    public Observable<SearchResponse> searchAsync(String customConfig, String query, String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, Integer count, String market, Integer offset, SafeSearch safeSearch, String setLang, Boolean textDecorations, TextFormat textFormat) {
        return searchWithServiceResponseAsync(customConfig, query, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, textDecorations, textFormat).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Images\>() can be replaced with method reference
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
     */
    public Observable<Images> imageSearchAsync(String customConfig, String query, String acceptLanguage, String userAgent, String clientId, String clientIp, String location, ImageAspect aspect, ImageColor color, String countryCode, Integer count, Freshness freshness, Integer height, String id, ImageContent imageContent, ImageType imageType, ImageLicense license, String market, Long maxFileSize, Long maxHeight, Long maxWidth, Long minFileSize, Long minHeight, Long minWidth, Long offset, SafeSearch safeSearch, ImageSize size, String setLang, Integer width) {
        return imageSearchWithServiceResponseAsync(customConfig, query, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, safeSearch, size, setLang, width).map(new Func1<ServiceResponse<Images>, Images>() {
            @Override
            public Images call(ServiceResponse<Images> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Images\>() can be replaced with method reference
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
     */
    public Observable<Images> imageSearchAsync(String customConfig, String query) {
        return imageSearchWithServiceResponseAsync(customConfig, query).map(new Func1<ServiceResponse<Images>, Images>() {
            @Override
            public Images call(ServiceResponse<Images> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, ImageKnowledge\>() can be replaced with method reference
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<ImageKnowledge> visualSearchAsync(String acceptLanguage, String contentType, String userAgent, String clientId, String clientIp, String location, String market, SafeSearch safeSearch, String setLang, String knowledgeRequest, byte[] image) {
        return visualSearchWithServiceResponseAsync(acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, image).map(new Func1<ServiceResponse<ImageKnowledge>, ImageKnowledge>() {
            @Override
            public ImageKnowledge call(ServiceResponse<ImageKnowledge> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, ImageKnowledge\>() can be replaced with method reference
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<ImageKnowledge> visualSearchAsync() {
        return visualSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ImageKnowledge>, ImageKnowledge>() {
            @Override
            public ImageKnowledge call(ServiceResponse<ImageKnowledge> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SpellCheck\>() can be replaced with method reference
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
     */
    public Observable<SpellCheck> spellCheckerAsync(String text, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, ActionType actionType, String appName, String countryCode, String clientMachineName, String docId, String market, String sessionId, String setLang, String userId, Mode mode, String preContextText, String postContextText) {
        return spellCheckerWithServiceResponseAsync(text, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText).map(new Func1<ServiceResponse<SpellCheck>, SpellCheck>() {
            @Override
            public SpellCheck call(ServiceResponse<SpellCheck> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SpellCheck\>() can be replaced with method reference
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
     */
    public Observable<SpellCheck> spellCheckerAsync(String text) {
        return spellCheckerWithServiceResponseAsync(text).map(new Func1<ServiceResponse<SpellCheck>, SpellCheck>() {
            @Override
            public SpellCheck call(ServiceResponse<SpellCheck> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Suggestions\>() can be replaced with method reference
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
     */
    public Observable<Suggestions> autoSuggestAsync(String query, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, String countryCode, String market, SafeSearch safeSearch, String setLang, List<ResponseFormat> responseFormat) {
        return autoSuggestWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, responseFormat).map(new Func1<ServiceResponse<Suggestions>, Suggestions>() {
            @Override
            public Suggestions call(ServiceResponse<Suggestions> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Suggestions\>() can be replaced with method reference
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
     */
    public Observable<Suggestions> autoSuggestAsync(String query) {
        return autoSuggestWithServiceResponseAsync(query).map(new Func1<ServiceResponse<Suggestions>, Suggestions>() {
            @Override
            public Suggestions call(ServiceResponse<Suggestions> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, TrendingTopics\>() can be replaced with method reference
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
     */
    public Observable<TrendingTopics> trendingAsync() {
        return trendingWithServiceResponseAsync().map(new Func1<ServiceResponse<TrendingTopics>, TrendingTopics>() {
            @Override
            public TrendingTopics call(ServiceResponse<TrendingTopics> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, News\>() can be replaced with method reference
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
     */
    public Observable<News> categoryAsync() {
        return categoryWithServiceResponseAsync().map(new Func1<ServiceResponse<News>, News>() {
            @Override
            public News call(ServiceResponse<News> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, News\>() can be replaced with method reference
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
     */
    public Observable<News> categoryAsync(String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, String category, Integer count, Integer headlineCount, String market, Integer offset, Boolean originalImage, SafeSearch safeSearch, String setLang, Boolean textDecorations, TextFormat textFormat) {
        return categoryWithServiceResponseAsync(acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat).map(new Func1<ServiceResponse<News>, News>() {
            @Override
            public News call(ServiceResponse<News> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, News\>() can be replaced with method reference
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
     */
    public Observable<News> searchAsync(String query, String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, Integer count, Freshness freshness, String market, Integer offset, Boolean originalImage, SafeSearch safeSearch, String setLang, String sortBy, Boolean textDecorations, TextFormat textFormat) {
        return searchWithServiceResponseAsync(query, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, safeSearch, setLang, sortBy, textDecorations, textFormat).map(new Func1<ServiceResponse<News>, News>() {
            @Override
            public News call(ServiceResponse<News> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, News\>() can be replaced with method reference
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
     */
    public Observable<News> searchAsync(String query) {
        return searchWithServiceResponseAsync(query).map(new Func1<ServiceResponse<News>, News>() {
            @Override
            public News call(ServiceResponse<News> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, TrendingTopics\>() can be replaced with method reference
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
     */
    public Observable<TrendingTopics> trendingAsync(String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, Integer count, String market, Integer offset, SafeSearch safeSearch, String setLang, Long since, String sortBy, Boolean textDecorations, TextFormat textFormat) {
        return trendingWithServiceResponseAsync(acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat).map(new Func1<ServiceResponse<TrendingTopics>, TrendingTopics>() {
            @Override
            public TrendingTopics call(ServiceResponse<TrendingTopics> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, VideoDetails\>() can be replaced with method reference
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
     */
    public Observable<VideoDetails> detailsAsync(String query) {
        return detailsWithServiceResponseAsync(query).map(new Func1<ServiceResponse<VideoDetails>, VideoDetails>() {
            @Override
            public VideoDetails call(ServiceResponse<VideoDetails> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Videos\>() can be replaced with method reference
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
     */
    public Observable<Videos> searchAsync(String query) {
        return searchWithServiceResponseAsync(query).map(new Func1<ServiceResponse<Videos>, Videos>() {
            @Override
            public Videos call(ServiceResponse<Videos> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, VideoDetails\>() can be replaced with method reference
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
     */
    public Observable<VideoDetails> detailsAsync(String query, String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, String id, List<VideoInsightModule> modules, String market, VideoResolution resolution, SafeSearch safeSearch, String setLang, Boolean textDecorations, TextFormat textFormat) {
        return detailsWithServiceResponseAsync(query, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modules, market, resolution, safeSearch, setLang, textDecorations, textFormat).map(new Func1<ServiceResponse<VideoDetails>, VideoDetails>() {
            @Override
            public VideoDetails call(ServiceResponse<VideoDetails> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, TrendingVideos\>() can be replaced with method reference
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
     */
    public Observable<TrendingVideos> trendingAsync(String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, String market, SafeSearch safeSearch, String setLang, Boolean textDecorations, TextFormat textFormat) {
        return trendingWithServiceResponseAsync(acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat).map(new Func1<ServiceResponse<TrendingVideos>, TrendingVideos>() {
            @Override
            public TrendingVideos call(ServiceResponse<TrendingVideos> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, TrendingVideos\>() can be replaced with method reference
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
     */
    public Observable<TrendingVideos> trendingAsync() {
        return trendingWithServiceResponseAsync().map(new Func1<ServiceResponse<TrendingVideos>, TrendingVideos>() {
            @Override
            public TrendingVideos call(ServiceResponse<TrendingVideos> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Videos\>() can be replaced with method reference
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
     */
    public Observable<Videos> searchAsync(String query, String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, Integer count, Freshness freshness, String id, VideoLength length, String market, Integer offset, VideoPricing pricing, VideoResolution resolution, SafeSearch safeSearch, String setLang, Boolean textDecorations, TextFormat textFormat) {
        return searchWithServiceResponseAsync(query, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, resolution, safeSearch, setLang, textDecorations, textFormat).map(new Func1<ServiceResponse<Videos>, Videos>() {
            @Override
            public Videos call(ServiceResponse<Videos> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SearchResponse\>() can be replaced with method reference
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
     */
    public Observable<SearchResponse> searchAsync(String query, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, String countryCode, String market, List<AnswerType> responseFilter, List<ResponseFormat> responseFormat, SafeSearch safeSearch, String setLang) {
        return searchWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, responseFilter, responseFormat, safeSearch, setLang).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SearchResponse\>() can be replaced with method reference
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
     */
    public Observable<SearchResponse> searchAsync(String query) {
        return searchWithServiceResponseAsync(query).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SearchResponse\>() can be replaced with method reference
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
     */
    public Observable<SearchResponse> searchAsync(String query) {
        return searchWithServiceResponseAsync(query).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, SearchResponse\>() can be replaced with method reference
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
     */
    public Observable<SearchResponse> searchAsync(String query, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, Integer answerCount, String countryCode, Integer count, Freshness freshness, String market, Integer offset, List<AnswerType> promote, List<AnswerType> responseFilter, SafeSearch safeSearch, String setLang, Boolean textDecorations, TextFormat textFormat) {
        return searchWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promote, responseFilter, safeSearch, setLang, textDecorations, textFormat).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Images\>() can be replaced with method reference
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<Images> searchAsync(String query) {
        return searchWithServiceResponseAsync(query).map(new Func1<ServiceResponse<Images>, Images>() {
            @Override
            public Images call(ServiceResponse<Images> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, TrendingImages\>() can be replaced with method reference
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<TrendingImages> trendingAsync(String acceptLanguage, String userAgent, String clientId, String clientIp, String location, String countryCode, String market, SafeSearch safeSearch, String setLang) {
        return trendingWithServiceResponseAsync(acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang).map(new Func1<ServiceResponse<TrendingImages>, TrendingImages>() {
            @Override
            public TrendingImages call(ServiceResponse<TrendingImages> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, TrendingImages\>() can be replaced with method reference
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<TrendingImages> trendingAsync() {
        return trendingWithServiceResponseAsync().map(new Func1<ServiceResponse<TrendingImages>, TrendingImages>() {
            @Override
            public TrendingImages call(ServiceResponse<TrendingImages> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, Images\>() can be replaced with method reference
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<Images> searchAsync(String query, String acceptLanguage, String userAgent, String clientId, String clientIp, String location, ImageAspect aspect, ImageColor color, String countryCode, Integer count, Freshness freshness, Integer height, String id, ImageContent imageContent, ImageType imageType, ImageLicense license, String market, Long maxFileSize, Long maxHeight, Long maxWidth, Long minFileSize, Long minHeight, Long minWidth, Long offset, SafeSearch safeSearch, ImageSize size, String setLang, Integer width) {
        return searchWithServiceResponseAsync(query, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, safeSearch, size, setLang, width).map(new Func1<ServiceResponse<Images>, Images>() {
            @Override
            public Images call(ServiceResponse<Images> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, ImageInsights\>() can be replaced with method reference
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<ImageInsights> detailsAsync(String query) {
        return detailsWithServiceResponseAsync(query).map(new Func1<ServiceResponse<ImageInsights>, ImageInsights>() {
            @Override
            public ImageInsights call(ServiceResponse<ImageInsights> response) {
```

### Anonymous2MethodRef
Anonymous new Func1, ImageInsights\>() can be replaced with method reference
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
     */
    public Observable<ImageInsights> detailsAsync(String query, String acceptLanguage, String contentType, String userAgent, String clientId, String clientIp, String location, Double cropBottom, Double cropLeft, Double cropRight, Double cropTop, ImageCropType cropType, String countryCode, String id, String imageUrl, String insightsToken, List<ImageInsightModule> modules, String market, SafeSearch safeSearch, String setLang) {
        return detailsWithServiceResponseAsync(query, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modules, market, safeSearch, setLang).map(new Func1<ServiceResponse<ImageInsights>, ImageInsights>() {
            @Override
            public ImageInsights call(ServiceResponse<ImageInsights> response) {
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
        // extract Bing-related HTTP headers
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (String header : headers.keySet()) {
            if (header == null) continue;      // may have null key
            if (header.startsWith("BingAPIs-") || header.startsWith("X-MSEdge-")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
        // Extract Bing-related HTTP headers
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (String header : headers.keySet()) {
            if (header == null) continue;      // may have null key
            if (header.startsWith("BingAPIs-") || header.startsWith("X-MSEdge-")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
        // Extract Bing-related HTTP headers
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (String header : headers.keySet()) {
            if (header == null) continue;      // may have null key
            if (header.startsWith("BingAPIs-") || header.startsWith("X-MSEdge-")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
        // Extract Bing-related HTTP headers
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (String header : headers.keySet()) {
            if (header == null) continue;      // may have null key
            if (header.startsWith("BingAPIs-") || header.startsWith("X-MSEdge-")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
        // Extract Bing-related HTTP headers
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (String header : headers.keySet()) {
            if (header == null) continue;      // may have null key
            if (header.startsWith("BingAPIs-") || header.startsWith("X-MSEdge-")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `result.relevantHeaders.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

```

### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
        // Extract Bing-related HTTP headers
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (String header : headers.keySet()) {
            if (header == null) continue;      // may have null key
            if (header.startsWith("BingAPIs-") || header.startsWith("X-MSEdge-")) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `customConfigId`
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
    
            System.out.println("Searching for Query: \"Xbox\"");
            customConfigId = customConfigId != null ? customConfigId : "0";
            SearchResponse webData = client.customInstances().search(customConfigId,"Xbox");
    
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/Freshness.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/VideoQueryScenario.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/ErrorCode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/VideoInsightModule.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/SafeSearch.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/VideoLength.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/VideoPricing.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/VideoResolution.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/TextFormat.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/models/ErrorSubCode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`result.flaggedTokens().size() > 0` can be replaced with '!result.flaggedTokens().isEmpty()'
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java

            // SpellCheck Results
            if (result.flaggedTokens().size() > 0)
            {
                // find the first spellcheck result
```

### SizeReplaceableByIsEmpty
`suggestions.size() > 0` can be replaced with '!suggestions.isEmpty()'
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java

                    List<SpellingTokenSuggestion> suggestions = firstspellCheckResult.suggestions();
                    if (suggestions.size() > 0)
                    {
                        SpellingTokenSuggestion firstSuggestion = suggestions.get(0);
```

### SizeReplaceableByIsEmpty
`webData.webPages().value().size() > 0` can be replaced with '!webData.webPages().value().isEmpty()'
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
            //WebPages
            if (webData != null && webData.webPages() != null && webData.webPages().value() != null &&
                    webData.webPages().value().size() > 0) {
                // find the first web page
                WebPage firstWebPagesResult = webData.webPages().value().get(0);
```

### SizeReplaceableByIsEmpty
`webData.images().value().size() > 0` can be replaced with '!webData.images().value().isEmpty()'
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

            //Images
            if (webData != null && webData.images() != null && webData.images().value() != null && webData.images().value().size() > 0) {
                // find the first image result
                ImageObject firstImageResult = webData.images().value().get(0);
```

### SizeReplaceableByIsEmpty
`webData.news().value().size() > 0` can be replaced with '!webData.news().value().isEmpty()'
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

            //News
            if (webData != null && webData.news() != null && webData.news().value() != null && webData.news().value().size() > 0) {
                // find the first news result
                NewsArticle firstNewsResult = webData.news().value().get(0);
```

### SizeReplaceableByIsEmpty
`webData.videos().value().size() > 0` can be replaced with '!webData.videos().value().isEmpty()'
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

            //Videos
            if (webData != null && webData.videos() != null && webData.videos().value() != null && webData.videos().value().size() > 0) {
                // find the first video result
                VideoObject firstVideoResult = webData.videos().value().get(0);
```

### SizeReplaceableByIsEmpty
`suggestions.suggestionGroups().size() > 0` can be replaced with '!suggestions.suggestionGroups().isEmpty()'
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java

            Suggestions suggestions = client.autoSuggest("Satya Nadella");
            if (suggestions != null && suggestions.suggestionGroups() != null && suggestions.suggestionGroups().size() > 0) {
                System.out.println("Found the following suggestions:");
                for (SearchAction suggestion: suggestions.suggestionGroups().get(0).searchSuggestions()) {
```

### SizeReplaceableByIsEmpty
`visualSearchResults.tags().size() > 0` can be replaced with '!visualSearchResults.tags().isEmpty()'
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
            // List tags

            if (visualSearchResults.tags() != null && visualSearchResults.tags().size() > 0) {
                System.out.format("Found visual search tag count: %d\n", visualSearchResults.tags().size());
                ImageTag firstTagResult = visualSearchResults.tags().get(0);
```

### SizeReplaceableByIsEmpty
`firstTagResult.actions().size() > 0` can be replaced with '!firstTagResult.actions().isEmpty()'
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                // List of actions in first tag

                if (firstTagResult.actions() != null && firstTagResult.actions().size() > 0) {
                    System.out.format("Found first tag action count: %d\n", firstTagResult.actions().size());
                    System.out.println("Found first tag action type: " + firstTagResult.actions().get(0).actionType());
```

### SizeReplaceableByIsEmpty
`webData.webPages().value().size() > 0` can be replaced with '!webData.webPages().value().isEmpty()'
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
            SearchResponse webData = client.customInstances().search(customConfigId,"Xbox");
    
            if (webData != null && webData.webPages() != null && webData.webPages().value().size() > 0)
            {
                // find the first web page
```

### SizeReplaceableByIsEmpty
`videoResults.value().size() > 0` can be replaced with '!videoResults.value().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
    public static void printVideoResults(Videos videoResults) {
        if (videoResults != null && videoResults.value() != null) {
            if (videoResults.value().size() > 0) {
                VideoObject firstVideoResult = videoResults.value().get(0);
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
```

### SizeReplaceableByIsEmpty
`trendingResults.bannerTiles().size() > 0` can be replaced with '!trendingResults.bannerTiles().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
        if (trendingResults != null) {
            // Banner Tiles
            if (trendingResults.bannerTiles().size() > 0) {
                TrendingVideosTile firstBannerTile = trendingResults.bannerTiles().get(0);
                System.out.println(
```

### SizeReplaceableByIsEmpty
`trendingResults.categories().size() > 0` can be replaced with '!trendingResults.categories().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java

            // Categories
            if (trendingResults.categories().size() > 0) {
                TrendingVideosCategory firstCategory = trendingResults.categories().get(0);
                System.out.println(
```

### SizeReplaceableByIsEmpty
`firstCategory.subcategories().size() > 0` can be replaced with '!firstCategory.subcategories().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        String.format("First category title: %s", firstCategory.title()));

                if (firstCategory.subcategories().size() > 0) {
                    TrendingVideosSubcategory firstSubCategory = firstCategory.subcategories().get(0);
                    System.out.println(
```

### SizeReplaceableByIsEmpty
`firstSubCategory.tiles().size() > 0` can be replaced with '!firstSubCategory.tiles().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                            String.format("First sub category title: %s", firstSubCategory.title()));

                    if (firstSubCategory.tiles().size() > 0) {
                        TrendingVideosTile firstTile = firstSubCategory.tiles().get(0);
                        System.out.println(
```

### SizeReplaceableByIsEmpty
`videoResults.value().size() > 0` can be replaced with '!videoResults.value().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            // This will search videos for "Bellevue Trailer" and then search for detail information of the first video.

            if (videoResults != null && videoResults.value().size() > 0)
            {
                VideoObject firstVideo = videoResults.value().get(0);
```

### SizeReplaceableByIsEmpty
`videoDetail.relatedVideos().value().size() > 0` can be replaced with '!videoDetail.relatedVideos().value().isEmpty()'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java

                            if (videoDetail.relatedVideos() != null && videoDetail.relatedVideos().value() != null &&
                                    videoDetail.relatedVideos().value().size() > 0) {
                                VideoObject firstRelatedVideo = videoDetail.relatedVideos().value().get(0);
                                System.out.println(
```

### SizeReplaceableByIsEmpty
`trendingTopics.value().size() > 0` can be replaced with '!trendingTopics.value().isEmpty()'
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
            TrendingTopics trendingTopics = client.news().trending();
            if (trendingTopics != null) {
                if (trendingTopics.value().size() > 0) {
                    NewsTopic firstTopic = trendingTopics.value().get(0);

```

### SizeReplaceableByIsEmpty
`newsResults.value().size() > 0` can be replaced with '!newsResults.value().isEmpty()'
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
    public static void PrintNewsResult(News newsResults) {
        if (newsResults != null) {
            if (newsResults.value().size() > 0) {
                NewsArticle firstNewsResult = newsResults.value().get(0);

```

### SizeReplaceableByIsEmpty
`imageResults.value().size() > 0` can be replaced with '!imageResults.value().isEmpty()'
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
            Images imageResults = client.images().search(searchTerm);

            if (imageResults != null && imageResults.value().size() > 0) {
                // Image results
                ImageObject firstImageResult = imageResults.value().get(0);
```

### SizeReplaceableByIsEmpty
`entityData.entities().value().size() > 0` can be replaced with '!entityData.entities().value().isEmpty()'
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
            SearchResponse entityData = client.entities().search("Satya Nadella");

            if (entityData.entities().value().size() > 0) {
                // find the entity that represents the dominant one
                List<Thing> entrys = entityData.entities().value();
```

### SizeReplaceableByIsEmpty
`entityData.entities().value().size() > 0` can be replaced with '!entityData.entities().value().isEmpty()'
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    entityData = client.entities().search("William Gates");

                    if (entityData.entities().value().size() > 0) {
                        // find the entity that represents the dominant one
                        List<Thing> entrys = entityData.entities().value();
```

### SizeReplaceableByIsEmpty
`entityData.places().value().size() > 0` can be replaced with '!entityData.places().value().isEmpty()'
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    entityData = client.entities().search("john howie bellevue");

                    if (entityData.places() != null && entityData.places().value().size() > 0) {
                        // Some local entities will be places, others won't be. Depending on the data you want, try to cast to the appropriate schema
                        // In this case, the item being returned is technically a Store, but the Place schema has the data we want (telephone)
```

### SizeReplaceableByIsEmpty
`restaurants.places().value().size() > 0` can be replaced with '!restaurants.places().value().isEmpty()'
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                    SearchResponse restaurants = client.entities().search("seattle restaurants");

                    if (restaurants.places() != null && restaurants.places().value().size() > 0) {
                        List<Thing> listItems = new ArrayList<Thing>();
                        for (Thing place : restaurants.places().value()) {
```

### SizeReplaceableByIsEmpty
`listItems.size() > 0` can be replaced with '!listItems.isEmpty()'
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                        }

                        if (listItems.size() > 0) {
                            StringBuilder sb = new StringBuilder();

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                .withKnowledgeRequest(knowledgeRequest);
        System.out.println(gson.toJson(visualSearchRequest));
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, gson.toJson(visualSearchRequest),  new byte[0]);

        PrintVisualSearchResults(visualSearchResults);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        VisualSearchRequest visualSearchRequest = new VisualSearchRequest().withImageInfo(imageInfo);
        System.out.println(gson.toJson(visualSearchRequest));
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, gson.toJson(visualSearchRequest),  new byte[0]);

        PrintVisualSearchResults(visualSearchResults);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
        String visualSearchRequestJSON = "{\"imageInfo\":{\"url\":\"https://images.unsplash.com/photo-1512546148165-e50d714a565a?w=600&q=80\",\"cropArea\":{\"top\":0.1,\"bottom\":0.5,\"left\":0.1,\"right\":0.9}},\"knowledgeRequest\":{\"filters\":{\"site\":\"www.bing.com\"}}}";
        System.out.println(visualSearchRequestJSON);
        ImageKnowledge visualSearchResults = client.images().visualSearch(null, null, null, null, null, null, null, null, null, visualSearchRequestJSON,  new byte[0]);
        PrintVisualSearchResults(visualSearchResults);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
    public Observable<ServiceResponse<ImageKnowledge>> visualSearchWithServiceResponseAsync(String acceptLanguage, String contentType, String userAgent, String clientId, String clientIp, String location, String market, SafeSearch safeSearch, String setLang, String knowledgeRequest, byte[] image) {
        final String xBingApisSDK = "true";
        RequestBody imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), new byte[0]);
        if (image != null) {
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final String knowledgeRequest = null;
        final byte[] image = new byte[0];
        RequestBody imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), new byte[0]);
        if (image != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String knowledgeRequest = null;
        final byte[] image = new byte[0];
        RequestBody imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), new byte[0]);
        if (image != null) {
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                if (firstspellCheckResult != null)
                {
                    System.out.println(String.format("SpellCheck Results#%d", result.flaggedTokens().size()));
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                {
                    System.out.println(String.format("SpellCheck Results#%d", result.flaggedTokens().size()));
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
                    System.out.println(String.format("First SpellCheck Result Suggestion Count: %d ",
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                    System.out.println(String.format("SpellCheck Results#%d", result.flaggedTokens().size()));
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
                    System.out.println(String.format("First SpellCheck Result Suggestion Count: %d ",
                            firstspellCheckResult.suggestions().size()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                    System.out.println(String.format("First SpellCheck Result token: %s ", firstspellCheckResult.token()));
                    System.out.println(String.format("First SpellCheck Result Type: %s ", firstspellCheckResult.type()));
                    System.out.println(String.format("First SpellCheck Result Suggestion Count: %d ",
                            firstspellCheckResult.suggestions().size()));

```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                    {
                        SpellingTokenSuggestion firstSuggestion = suggestions.get(0);
                        System.out.println(String.format("First SpellCheck Suggestion Score: %f ", firstSuggestion.score()));
                        System.out.println(String.format("First SpellCheck Suggestion : %s ", firstSuggestion.suggestion()));
                    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                        SpellingTokenSuggestion firstSuggestion = suggestions.get(0);
                        System.out.println(String.format("First SpellCheck Suggestion Score: %f ", firstSuggestion.score()));
                        System.out.println(String.format("First SpellCheck Suggestion : %s ", firstSuggestion.suggestion()));
                    }
                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
                    System.out.println("Couldn't find web results!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstImageResult != null) {
                    System.out.println(String.format("Image Results#%d", webData.images().value().size()));
                    System.out.println(String.format("First Image result name: %s ", firstImageResult.name()));
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstImageResult != null) {
                    System.out.println(String.format("Image Results#%d", webData.images().value().size()));
                    System.out.println(String.format("First Image result name: %s ", firstImageResult.name()));
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
                } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Image Results#%d", webData.images().value().size()));
                    System.out.println(String.format("First Image result name: %s ", firstImageResult.name()));
                    System.out.println(String.format("First Image result URL: %s ", firstImageResult.contentUrl()));
                } else {
                    System.out.println("Couldn't find first image results!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstNewsResult != null) {
                    System.out.println(String.format("News Results#%d", webData.news().value().size()));
                    System.out.println(String.format("First news result name: %s ", firstNewsResult.name()));
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstNewsResult != null) {
                    System.out.println(String.format("News Results#%d", webData.news().value().size()));
                    System.out.println(String.format("First news result name: %s ", firstNewsResult.name()));
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
                } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("News Results#%d", webData.news().value().size()));
                    System.out.println(String.format("First news result name: %s ", firstNewsResult.name()));
                    System.out.println(String.format("First news result URL: %s ", firstNewsResult.url()));
                } else {
                    System.out.println("Couldn't find any News results!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java

                if (firstVideoResult != null) {
                    System.out.println(String.format("Video Results#%s", webData.videos().value().size()));
                    System.out.println(String.format("First Video result name: %s ", firstVideoResult.name()));
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                if (firstVideoResult != null) {
                    System.out.println(String.format("Video Results#%s", webData.videos().value().size()));
                    System.out.println(String.format("First Video result name: %s ", firstVideoResult.name()));
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
                } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Video Results#%s", webData.videos().value().size()));
                    System.out.println(String.format("First Video result name: %s ", firstVideoResult.name()));
                    System.out.println(String.format("First Video result URL: %s ", firstVideoResult.contentUrl()));
                } else {
                    System.out.println("Couldn't find first video results!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
    
                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                if (firstWebPagesResult != null) {
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Webpage Results#%d", webData.webPages().value().size()));
                    System.out.println(String.format("First web page name: %s ", firstWebPagesResult.name()));
                    System.out.println(String.format("First web page URL: %s ", firstWebPagesResult.url()));
                } else {
                    System.out.println("Couldn't find web results!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
            if (videoResults.value().size() > 0) {
                VideoObject firstVideoResult = videoResults.value().get(0);
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                VideoObject firstVideoResult = videoResults.value().get(0);
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("Video result count: %d", videoResults.value().size()));
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
                System.out.println("\n");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First video id: %s", firstVideoResult.videoId()));
                System.out.println(String.format("First video name: %s", firstVideoResult.name()));
                System.out.println(String.format("First video url: %s", firstVideoResult.contentUrl()));
                System.out.println("\n");
            } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                TrendingVideosTile firstBannerTile = trendingResults.bannerTiles().get(0);
                System.out.println(
                        String.format("Banner tile count: {trendingResults.BannerTiles.Count}"));
                System.out.println(
                        String.format("First banner tile text: {firstBannerTile.Query.Text}"));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        String.format("Banner tile count: {trendingResults.BannerTiles.Count}"));
                System.out.println(
                        String.format("First banner tile text: {firstBannerTile.Query.Text}"));
                System.out.println(
                        String.format("First banner tile url: {firstBannerTile.Query.WebSearchUrl}"));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        String.format("First banner tile text: {firstBannerTile.Query.Text}"));
                System.out.println(
                        String.format("First banner tile url: {firstBannerTile.Query.WebSearchUrl}"));
                System.out.println("\n");
            } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                TrendingVideosCategory firstCategory = trendingResults.categories().get(0);
                System.out.println(
                        String.format("Category count: %d", trendingResults.categories().size()));
                System.out.println(
                        String.format("First category title: %s", firstCategory.title()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        String.format("Category count: %d", trendingResults.categories().size()));
                System.out.println(
                        String.format("First category title: %s", firstCategory.title()));

                if (firstCategory.subcategories().size() > 0) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                    TrendingVideosSubcategory firstSubCategory = firstCategory.subcategories().get(0);
                    System.out.println(
                            String.format("SubCategory count: %d", firstCategory.subcategories().size()));
                    System.out.println(
                            String.format("First sub category title: %s", firstSubCategory.title()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                            String.format("SubCategory count: %d", firstCategory.subcategories().size()));
                    System.out.println(
                            String.format("First sub category title: %s", firstSubCategory.title()));

                    if (firstSubCategory.tiles().size() > 0) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        TrendingVideosTile firstTile = firstSubCategory.tiles().get(0);
                        System.out.println(
                                String.format("Tile count: %d", firstSubCategory.tiles().size()));
                        System.out.println(
                                String.format("First tile text: %s", firstTile.query().text()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                String.format("Tile count: %d", firstSubCategory.tiles().size()));
                        System.out.println(
                                String.format("First tile text: %s", firstTile.query().text()));
                        System.out.println(
                                String.format("First tile url: %s", firstTile.query().webSearchUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                String.format("First tile text: %s", firstTile.query().text()));
                        System.out.println(
                                String.format("First tile url: %s", firstTile.query().webSearchUrl()));
                    } else {
                        System.out.println("Couldn't find tiles!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java

                System.out.println(
                        String.format("Search detail for video id={firstVideo.VideoId}, name=%s", firstVideo.name()));
                int maxTries = 2;
                for (int i = 1; i <= 2; i++) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                            if (videoDetail.videoResult() != null) {
                                System.out.println(
                                        String.format("Expected video id: %s", videoDetail.videoResult().videoId()));
                                System.out.println(
                                        String.format("Expected video name: %s", videoDetail.videoResult().name()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("Expected video id: %s", videoDetail.videoResult().videoId()));
                                System.out.println(
                                        String.format("Expected video name: %s", videoDetail.videoResult().name()));
                                System.out.println(
                                        String.format("Expected video url: %s", videoDetail.videoResult().contentUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("Expected video name: %s", videoDetail.videoResult().name()));
                                System.out.println(
                                        String.format("Expected video url: %s", videoDetail.videoResult().contentUrl()));
                            } else {
                                System.out.println("Couldn't find expected video!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                VideoObject firstRelatedVideo = videoDetail.relatedVideos().value().get(0);
                                System.out.println(
                                        String.format("Related video count: %d", videoDetail.relatedVideos().value().size()));
                                System.out.println(
                                        String.format("First related video id: %s", firstRelatedVideo.videoId()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("Related video count: %d", videoDetail.relatedVideos().value().size()));
                                System.out.println(
                                        String.format("First related video id: %s", firstRelatedVideo.videoId()));
                                System.out.println(
                                        String.format("First related video name: %s", firstRelatedVideo.name()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("First related video id: %s", firstRelatedVideo.videoId()));
                                System.out.println(
                                        String.format("First related video name: %s", firstRelatedVideo.name()));
                                System.out.println(
                                        String.format("First related video url: %s", firstRelatedVideo.contentUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                                        String.format("First related video name: %s", firstRelatedVideo.name()));
                                System.out.println(
                                        String.format("First related video url: %s", firstRelatedVideo.contentUrl()));
                            } else {
                                System.out.println("Couldn't find any related video!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                    } catch (ErrorResponseException e) {
                        System.out.println(
                                String.format("Exception occurred, status code %s with reason %s.", e.response().code(), e.response().message()));

                        if (e.response().code() == 429) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    NewsTopic firstTopic = trendingTopics.value().get(0);

                    System.out.println(String.format("Trending topics count: %s", trendingTopics.value().size()));
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java

                    System.out.println(String.format("Trending topics count: %s", trendingTopics.value().size()));
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("Trending topics count: %s", trendingTopics.value().size()));
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic name: %s", firstTopic.name()));
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic query: %s", firstTopic.query().text()));
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
                } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                    System.out.println(String.format("First topic image url: %s", firstTopic.image().url()));
                    System.out.println(String.format("First topic webSearchUrl: %s", firstTopic.webSearchUrl()));
                    System.out.println(String.format("First topic newsSearchUrl: %s", firstTopic.newsSearchUrl()));
                } else {
                    System.out.println("Couldn't find news trending topics!");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                NewsArticle firstNewsResult = newsResults.value().get(0);

                System.out.println(String.format("TotalEstimatedMatches value: %d", newsResults.totalEstimatedMatches()));
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java

                System.out.println(String.format("TotalEstimatedMatches value: %d", newsResults.totalEstimatedMatches()));
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("TotalEstimatedMatches value: %d", newsResults.totalEstimatedMatches()));
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("News result count: %d", newsResults.value().size()));
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news name: %s", firstNewsResult.name()));
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news url: %s", firstNewsResult.url()));
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
                System.out.println("\n");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First news description: %s", firstNewsResult.description()));
                System.out.println(String.format("First news published time: %s", firstNewsResult.datePublished()));
                System.out.println(String.format("First news provider: %s", firstNewsResult.provider().get(0).name()));
                System.out.println("\n");
            } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
            // This will search images for "canadian rockies" then print the first image result,

            System.out.println(String.format("Search images for query %s", searchTerm));

            Images imageResults = client.images().search(searchTerm);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                ImageObject firstImageResult = imageResults.value().get(0);

                System.out.println(String.format("Image result count: %d", imageResults.value().size()));
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java

                System.out.println(String.format("Image result count: %d", imageResults.value().size()));
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
                System.out.println(String.format("First image content url: %s", firstImageResult.contentUrl()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("Image result count: %d", imageResults.value().size()));
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
                System.out.println(String.format("First image content url: %s", firstImageResult.contentUrl()));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                System.out.println(String.format("First image insights token: %s", firstImageResult.imageInsightsToken()));
                System.out.println(String.format("First image thumbnail url: %s", firstImageResult.thumbnailUrl()));
                System.out.println(String.format("First image content url: %s", firstImageResult.contentUrl()));
            }
            else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                } catch (ErrorResponseException e) {
                    System.out.println(
                            String.format("Exception occurred when searching for William Gates, status code %s with reason %s.", e.response().code(), e.response().message()));

                    if (e.response().code() == 429) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                } catch (ErrorResponseException e) {
                    System.out.println(
                            String.format("Exception occurred when searching for Microsoft Store, status code %s with reason %s.", e.response().code(), e.response().message()));

                    if (e.response().code() == 429) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                                Place place = (Place) item;
                                if (place == null) {
                                    System.out.println(String.format("Unexpectedly found something that isn't a place named \"%s\"", item.toString()));
                                    continue;
                                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                } catch (ErrorResponseException e) {
                    System.out.println(
                            String.format("Exception occurred when searching for seattle restaurants, status code %s with reason %s.", e.response().code(), e.response().message()));

                    if (e.response().code() == 429) {
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + text.length() + 5);
            connection.setRequestProperty("Ocp-Apim-Subscription-Key", subscriptionKey);
            connection.setDoOutput(true);
```

## RuleId[ruleID=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingImageSearchv7.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingWebSearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'sdk.SpellCheckSample'
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.samples;

import com.microsoft.bing.spellcheck.models.Mode;
```

### WrongPackageStatement
Package name 'com.microsoft.bing.websearch.samples' does not correspond to the file path 'sdk.WebSearchSample'
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.websearch.samples;


```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'sdk.AutoSuggestSample'
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.samples;

import com.microsoft.bing.autosuggest.models.SearchAction;
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingVisualSearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'sdk.CustomSearchSample'
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
// <imports>

package com.microsoft.bing.samples;
import com.microsoft.bing.customsearch.models.SearchResponse;
import com.microsoft.bing.customsearch.models.WebPage;
```

### WrongPackageStatement
Package name 'com.microsoft.bing.videosearch.samples' does not correspond to the file path 'sdk.VisualSearchSample'
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
 * license information.
 */
package com.microsoft.bing.videosearch.samples;
// <imports>

```

### WrongPackageStatement
Package name 'com.microsoft.bing.videosearch.samples' does not correspond to the file path 'sdk.VideoSearchSample'
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.videosearch.samples;

import com.microsoft.bing.videosearch.models.ErrorResponseException;
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingNewsSearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingVideoSearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingCustomSearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. 
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'sdk.NewsSearchSample'
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.samples;
import com.microsoft.bing.newssearch.models.Freshness;
import com.microsoft.bing.newssearch.models.NewsArticle;
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingImageSearch.java`
#### Snippet
```java
package com.microsoft.bing.samples;
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'sdk.ImageSearchSample'
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.samples;
import com.microsoft.bing.imagesearch.models.ImageObject;
import com.microsoft.bing.imagesearch.models.Images;
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'rest'
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
package com.microsoft.bing.samples;

// Copyright (c) Microsoft Corporation. All rights reserved.
```

### WrongPackageStatement
Package name 'com.microsoft.bing.samples' does not correspond to the file path 'sdk.EntitySearchSample'
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
 */

package com.microsoft.bing.samples;
import com.microsoft.bing.entitysearch.models.EntityScenario;
import com.microsoft.bing.entitysearch.models.Error;
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/SpellCheckSample/BingSpellCheckSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/WebSearchSample/BingWebSearchSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/AutoSuggestSample/BingAutoSuggestSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request request = null;
                            Request original = chain.request();
                            Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/CustomSearchSample/BingCustomSearchSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/NewsSearchSample/BingNewsSearchSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/ImageSearchSample/BingImageSearchSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder();
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, countryCode, count, market, offset, query, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Condition `i <= 2` is always `true`
in `samples/sdk/VideoSearchSample/BingVideoSearchSample.java`
#### Snippet
```java
                        String.format("Search detail for video id={firstVideo.VideoId}, name=%s", firstVideo.name()));
                int maxTries = 2;
                for (int i = 1; i <= 2; i++) {
                    try {
                        VideoDetails videoDetail = client.videos().details("Bellevue Trailer", null, null, null, null, null, null, firstVideo.videoId(),modules,"en-us",null, null, null,null,null);
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `aspect` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `color` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `freshness` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `height` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `id` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `imageContent` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `imageType` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `license` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `maxFileSize` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `maxHeight` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `maxWidth` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `minFileSize` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `minHeight` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `minWidth` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `size` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `width` is always 'null'
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.imageSearch(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, customConfig, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Condition `image != null` is always `true`
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final byte[] image = new byte[0];
        RequestBody imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), new byte[0]);
        if (image != null) {
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `contentType` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `knowledgeRequest` is always 'null'
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, market, safeSearch, setLang, knowledgeRequest, imageConverted, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `pragma` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `actionType` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `appName` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `clientMachineName` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `docId` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `sessionId` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `userId` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `mode` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `preContextText` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Value `postContextText` is always 'null'
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
        final String preContextText = null;
        final String postContextText = null;
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
```

### ConstantValue
Condition `i <= 2` is always `true`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

            int maxTries = 2;
            for (int i = 1; i <= 2; i++) {
                try {
                    entityData = client.entities().search("William Gates");
```

### ConstantValue
Condition `i <= 2` is always `true`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java

            System.out.println("Searching for \"john howie bellevue\"");
            for (int i = 1; i <= 2; i++) {
                try {
                    entityData = client.entities().search("john howie bellevue");
```

### ConstantValue
Condition `i <= 2` is always `true`
in `samples/sdk/EntitySearchSample/BingEntitySearchSample.java`
#### Snippet
```java
            //=============================================================
            // This will look up a list of restaurants "seattle restaurants" and present their names and phone numbers.
            for (int i = 1; i <= 2; i++) {
                try {
                    SearchResponse restaurants = client.entities().search("seattle restaurants");
```

### ConstantValue
Value `responseFormat` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final String setLang = null;
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `pragma` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
        final List<ResponseFormat> responseFormat = null;
        String responseFormatConverted = this.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.autoSuggest(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, safeSearch, setLang, responseFormatConverted, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Suggestions>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `category` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `headlineCount` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `originalImage` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.category(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, category, count, headlineCount, market, offset, originalImage, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `since` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `sortBy` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, market, offset, safeSearch, setLang, since, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingTopics>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `freshness` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `originalImage` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `sortBy` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, market, offset, originalImage, query, safeSearch, setLang, sortBy, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<News>>>() {
                @Override
```

### ConstantValue
Value `modules` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `id` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `resolution` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, id, modulesConverted, market, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VideoDetails>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingVideos>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `freshness` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `id` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `length` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `pricing` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `resolution` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, count, freshness, id, length, market, offset, pricing, query, resolution, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Videos>>>() {
                @Override
```

### ConstantValue
Value `responseFilter` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
```

### ConstantValue
Value `responseFormat` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `pragma` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `promote` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
```

### ConstantValue
Value `location` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `responseFilter` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final Boolean textDecorations = null;
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
```

### ConstantValue
Value `aspect` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `color` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `freshness` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `height` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `id` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `imageContent` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `imageType` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `license` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `pragma` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `maxFileSize` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `maxHeight` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `maxWidth` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `answerCount` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `minFileSize` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `minHeight` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `count` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `minWidth` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `size` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `freshness` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `offset` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `width` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        final Integer width = null;
        return service.search(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, aspect, color, countryCode, count, freshness, height, id, imageContent, imageType, license, market, maxFileSize, maxHeight, maxWidth, minFileSize, minHeight, minWidth, offset, query, safeSearch, size, setLang, width, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Images>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `modules` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `textDecorations` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `contentType` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `textFormat` is always 'null'
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
        final TextFormat textFormat = null;
        String promoteConverted = this.client.serializerAdapter().serializeList(promote, CollectionFormat.CSV);String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, answerCount, countryCode, count, freshness, market, offset, promoteConverted, query, responseFilterConverted, safeSearch, setLang, textDecorations, textFormat, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `cropBottom` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `cropLeft` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `cropRight` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `cropTop` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `cropType` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `id` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `imageUrl` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `insightsToken` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final String setLang = null;
        String modulesConverted = this.client.serializerAdapter().serializeList(modules, CollectionFormat.CSV);
        return service.details(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, cropBottom, cropLeft, cropRight, cropTop, cropType, countryCode, id, imageUrl, insightsToken, modulesConverted, market, query, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageInsights>>>() {
                @Override
```

### ConstantValue
Value `acceptLanguage` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `userAgent` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `clientId` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `clientIp` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `location` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `countryCode` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `market` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `safeSearch` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

### ConstantValue
Value `setLang` is always 'null'
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
        final SafeSearch safeSearch = null;
        final String setLang = null;
        return service.trending(xBingApisSDK, acceptLanguage, userAgent, clientId, clientIp, location, countryCode, market, safeSearch, setLang, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrendingImages>>>() {
                @Override
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/CustomWebSearch/src/main/java/com/microsoft/bing/customsearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

        try {
            imageBytes = ByteStreams.toByteArray(ClassLoader.getSystemClassLoader().getResourceAsStream("image.jpg"));
            visualSearch(client, imageBytes);
            searchWithCropArea(client, imageBytes);
```

### UnstableApiUsage
'toByteArray(java.io.InputStream)' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `samples/sdk/VisualSearchSample/BingVisualSearchSample.java`
#### Snippet
```java

        try {
            imageBytes = ByteStreams.toByteArray(ClassLoader.getSystemClassLoader().getResourceAsStream("image.jpg"));
            visualSearch(client, imageBytes);
            searchWithCropArea(client, imageBytes);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
    private ServiceResponse<Images> imageSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Images, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Images>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
    private ServiceResponse<Images> imageSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Images, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Images>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/CustomImageSearch/src/main/java/com/microsoft/bing/customimagesearch/implementation/CustomInstancesImpl.java`
#### Snippet
```java
    private ServiceResponse<Images> imageSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Images, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Images>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<ImageKnowledge> visualSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<ImageKnowledge, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageKnowledge>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<ImageKnowledge> visualSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<ImageKnowledge, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageKnowledge>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/VisualSearch/src/main/java/com/microsoft/bing/visualsearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<ImageKnowledge> visualSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<ImageKnowledge, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageKnowledge>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
    private ServiceResponse<SpellCheck> spellCheckerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<SpellCheck, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SpellCheck>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
    private ServiceResponse<SpellCheck> spellCheckerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<SpellCheck, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SpellCheck>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/SpellCheck/src/main/java/com/microsoft/bing/spellcheck/implementation/SpellCheckClientImpl.java`
#### Snippet
```java
    private ServiceResponse<SpellCheck> spellCheckerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<SpellCheck, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SpellCheck>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
    private ServiceResponse<Suggestions> autoSuggestDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Suggestions, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Suggestions>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
    private ServiceResponse<Suggestions> autoSuggestDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Suggestions, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Suggestions>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/AutoSuggest/src/main/java/com/microsoft/bing/autosuggest/implementation/AutoSuggestClientImpl.java`
#### Snippet
```java
    private ServiceResponse<Suggestions> autoSuggestDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Suggestions, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Suggestions>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<News> categoryDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<News, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<News>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<News> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<News, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<News>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<News> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<News, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<News>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingTopics> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingTopics, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingTopics>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingTopics> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingTopics, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingTopics>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<News> categoryDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<News, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<News>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<News> categoryDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<News, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<News>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<News> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<News, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<News>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/NewsSearch/src/main/java/com/microsoft/bing/newssearch/implementation/NewsImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingTopics> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingTopics, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingTopics>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingVideos> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingVideos, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingVideos>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingVideos> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingVideos, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingVideos>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingVideos> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingVideos, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingVideos>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<Videos> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Videos, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Videos>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<Videos> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Videos, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Videos>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<Videos> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Videos, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Videos>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<VideoDetails> detailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VideoDetails, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VideoDetails>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<VideoDetails> detailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VideoDetails, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VideoDetails>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/VideoSearch/src/main/java/com/microsoft/bing/videosearch/implementation/VideosImpl.java`
#### Snippet
```java
    private ServiceResponse<VideoDetails> detailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VideoDetails, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VideoDetails>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/EntitySearch/src/main/java/com/microsoft/bing/entitysearch/implementation/EntitiesImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingImages> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingImages, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingImages>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<ImageInsights> detailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ImageInsights, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageInsights>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<ImageInsights> detailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ImageInsights, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageInsights>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<ImageInsights> detailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ImageInsights, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageInsights>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingImages> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingImages, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingImages>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<TrendingImages> trendingDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<TrendingImages, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrendingImages>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<Images> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Images, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Images>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<Images> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Images, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Images>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `sdk/ImageSearch/src/main/java/com/microsoft/bing/imagesearch/implementation/ImagesImpl.java`
#### Snippet
```java
    private ServiceResponse<Images> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Images, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Images>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `sdk/WebSearch/src/main/java/com/microsoft/bing/websearch/implementation/WebsImpl.java`
#### Snippet
```java
    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
```

## RuleId[ruleID=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `samples/rest/BingSpellCheck.java`
#### Snippet
```java
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `samples/rest/BingEntitySearch.java`
#### Snippet
```java
            System.out.println(prettify(response));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `samples/rest/BingAutosuggest.java`
#### Snippet
```java
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }
```

