# team-explorer-everywhere 
 
# Bad smells
I found 12 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| HtmlWrongAttributeValue | 12 | false |
## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/stripped.html`
#### Snippet
```java
<h6 align="left">six</h6>
<hr align="right" size="100px" width="100px" />
<img align="behind" alt="text" border="1px solid marble" height="1in" hspace="ack" ismap="true" longdesc="long text" name="asdf" src="http://some/far/image.png" usemap="false" vspace="something" width="100px" alt2="x" src2="y" />
<ins cite="books" datetime="yesterday">ins</ins>
<li type="item" value="xyz">item</li>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/stripped.html`
#### Snippet
```java
<map name="imagemap?" />
<menu compact="true">choices here?</menu>
<ol compact="false" start="1" type="list"><li>1</li></ol>
<p align="center">text</p>
<pre width="40">formatted text</pre>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/stripped.html`
#### Snippet
```java
<td abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">td</td>
<tfoot align="right" char="d" charoff="4" valign="bottom" />
<th abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">th</th>
<thead align="right" char="d" charoff="4" valign="bottom" />
<tr align="right" char="d" charoff="4" valign="bottom">tr</tr>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<!-- These tags with attributes are safe but the sneaky attributes at the end will be stripped. -->

<a charset="ack" href="http://some:1234/far/off/resource" hreflang="arf" name="xyz" rel="link" rev="1" shape="oblong" tabindex="33" type="weird" unsafeAttribute="true">abc</a>
<blockquote cite="something" anotherUnsafeAttribute="true">four score and seven years ago</blockquote>
<br clear="windows" />
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<br clear="windows" />
<caption align="under">hello!</caption>
<col align="sideways" char="e" charoff="123" span="short" valign="top" width="fat">Ionic</col>
<colgroup align="slanty" char="black" charoff="100" span="slim" valign="low" width="medium" anotherSneakyUnsafe="here" />
<del cite="huh?" datetime="Monday">what's a del?</del>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<caption align="under">hello!</caption>
<col align="sideways" char="e" charoff="123" span="short" valign="top" width="fat">Ionic</col>
<colgroup align="slanty" char="black" charoff="100" span="slim" valign="low" width="medium" anotherSneakyUnsafe="here" />
<del cite="huh?" datetime="Monday">what's a del?</del>
<dir compact="very" ignoreThisAttribute="yes"></dir>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<caption align="under">hello!</caption>
<col align="sideways" char="e" charoff="123" span="short" valign="top" width="fat">Ionic</col>
<colgroup align="slanty" char="black" charoff="100" span="slim" valign="low" width="medium" anotherSneakyUnsafe="here" />
<del cite="huh?" datetime="Monday">what's a del?</del>
<dir compact="very" ignoreThisAttribute="yes"></dir>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<h6 align="left">six</h6>
<hr align="right" size="100px" width="100px" />
<img align="behind" alt="text" border="1px solid marble" height="1in" hspace="ack" ismap="true" longdesc="long text" name="asdf" src="http://some/far/image.png" usemap="false" vspace="something" width="100px" alt2="x" src2="y" scaryUnsafeScriptAttribute="please" />
<ins cite="books" datetime="yesterday">ins</ins>
<li type="item" value="xyz">item</li>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<pre width="40">formatted text</pre>
<q cite="some thing">asdf</q>
<table align="right" border="1" cellpadding="2" cellspacing="4" frame="no" rules="strict" summary="short" width="100" caption="good table">table tags</table>
<tbody align="right" char="a" charoff="3" valign="top" />
<td abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">td</td>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<pre width="40">formatted text</pre>
<q cite="some thing">asdf</q>
<table align="right" border="1" cellpadding="2" cellspacing="4" frame="no" rules="strict" summary="short" width="100" caption="good table">table tags</table>
<tbody align="right" char="a" charoff="3" valign="top" />
<td abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">td</td>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<table align="right" border="1" cellpadding="2" cellspacing="4" frame="no" rules="strict" summary="short" width="100" caption="good table">table tags</table>
<tbody align="right" char="a" charoff="3" valign="top" />
<td abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">td</td>
<tfoot align="right" char="d" charoff="4" valign="bottom" SneakyUnsafeAttribute="here" />
<th abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">th</th>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `source/com.microsoft.tfs.util/tests/com/microsoft/tfs/util/htmlfilter/unsafe.html`
#### Snippet
```java
<td abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">td</td>
<tfoot align="right" char="d" charoff="4" valign="bottom" SneakyUnsafeAttribute="here" />
<th abbr="abbr" align="left" axis="evil" char="e" charoff="3" colspan="2" headers="no" height="some" nowrap="true" rowspan="3" scope="mouthwash" valign="bottom" width="billions">th</th>
<thead align="right" char="d" charoff="4" valign="bottom" SneakyUnsafeAttribute="here" />
<tr align="right" char="d" charoff="4" valign="bottom" SneakyUnsafeAttribute="here">tr</tr>
```

