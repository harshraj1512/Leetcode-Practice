<h2><a href="https://leetcode.com/problems/find-maximum-number-of-string-pairs/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2744. Find Maximum Number of String Pairs</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> array <code>words</code> consisting of <strong>distinct</strong> strings.</p>

<p>The string <code>words[i]</code> can be paired with the string <code>words[j]</code> if:</p>

<ul>
	<li>The string <code>words[i]</code> is equal to the reversed string of <code>words[j]</code>.</li>
	<li><code>0 &lt;= i &lt; j &lt; words.length</code>.</li>
</ul>

<p>Return <em>the <strong>maximum</strong> number of pairs that can be formed from the array </em><code>words</code><em>.</em></p>

<p>Note that&nbsp;each string can belong in&nbsp;<strong>at most one</strong> pair.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["cd","ac","dc","ca","zz"]
<strong>Output:</strong> 2
<strong>Explanation:</strong> In this example, we can form 2 pair of strings in the following way:
- We pair the 0<sup>th</sup> string with the 2<sup>nd</sup> string, as the reversed string of word[0] is "dc" and is equal to words[2].
- We pair the 1<sup>st</sup> string with the 3<sup>rd</sup> string, as the reversed string of word[1] is "ca" and is equal to words[3].
It can be proven that 2 is the maximum number of pairs that can be formed.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["ab","ba","cc"]
<strong>Output:</strong> 1
<strong>Explanation:</strong> In this example, we can form 1 pair of strings in the following way:
- We pair the 0<sup>th</sup> string with the 1<sup>st</sup> string, as the reversed string of words[1] is "ab" and is equal to words[0].
It can be proven that 1 is the maximum number of pairs that can be formed.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> words = ["aa","ab"]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this example, we are unable to form any pair of strings.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 50</code></li>
	<li><code>words[i].length == 2</code></li>
	<li><code>words</code>&nbsp;consists of distinct strings.</li>
	<li><code>words[i]</code>&nbsp;contains only lowercase English letters.</li>
</ul>
</div>