<h2><a href="https://leetcode.com/problems/truncate-sentence/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Bloomberg</div><div class="companyTagsContainer--tagOccurence">1</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1816. Truncate Sentence</a></h2><h3>Easy</h3><hr><div><p>A <strong>sentence</strong> is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of <strong>only</strong> uppercase and lowercase English letters (no punctuation).</p>

<ul>
	<li>For example, <code>"Hello World"</code>, <code>"HELLO"</code>, and <code>"hello world hello world"</code> are all sentences.</li>
</ul>

<p>You are given a sentence <code>s</code>​​​​​​ and an integer <code>k</code>​​​​​​. You want to <strong>truncate</strong> <code>s</code>​​​​​​ such that it contains only the <strong>first</strong> <code>k</code>​​​​​​ words. Return <code>s</code>​​​​<em>​​ after <strong>truncating</strong> it.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "Hello how are you Contestant", k = 4
<strong>Output:</strong> "Hello how are you"
<strong>Explanation:</strong>
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "What is the solution to this problem", k = 4
<strong>Output:</strong> "What is the solution"
<strong>Explanation:</strong>
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "chopper is not a tanuki", k = 5
<strong>Output:</strong> "chopper is not a tanuki"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 500</code></li>
	<li><code>k</code> is in the range <code>[1, the number of words in s]</code>.</li>
	<li><code>s</code> consist of only lowercase and uppercase English letters and spaces.</li>
	<li>The words in <code>s</code> are separated by a single space.</li>
	<li>There are no leading or trailing spaces.</li>
</ul>
</div>