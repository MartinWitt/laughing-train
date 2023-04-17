# ExoPlayer 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `docs/_includes/extensions/bilibili.html`
#### Snippet
```java
<div class="extensions extensions--video">
  <iframe src="//player.bilibili.com/player.html?aid={{ include.id }}&page=1"
    frameborder="no" scrolling="no" allowfullscreen="true">
  </iframe>
</div>
```
