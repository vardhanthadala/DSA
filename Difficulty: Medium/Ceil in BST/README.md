<h2><a href="https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card">Ceil in BST</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a&nbsp;BST and a number <strong>X</strong>, find <strong>Ceil of X</strong>.</span><br><span style="font-size: 18px;"><strong>Note:</strong> Ceil(X) is a number that is either equal to X or is immediately greater than X.</span></p>
<p><span style="font-size: 18px;">If Ceil could not be found, return -1.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>      5
&nbsp;   /   \
&nbsp;  1     7
&nbsp;   \
&nbsp;    2 
&nbsp;     \
&nbsp;      3
X = 3
<strong>Output: </strong>3<strong>
Explanation: </strong>We find 3 in BST, so ceil
of 3 is 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>     10
&nbsp;   /  \
&nbsp;  5    11
&nbsp; / \ 
&nbsp;4   7
&nbsp;     \
&nbsp;      8
X = 6
<strong>Output: </strong>7<strong>
Explanation: </strong>We find 7 in BST, so ceil
of 6 is 7.</span></pre>
<p><span style="font-size: 18px;"><strong>Your task:</strong><br>You don't need to read input or print anything. Just complete the function <strong>findCeil</strong>() to implement ceil in BST which returns the ceil of&nbsp;<strong>X&nbsp;</strong>in the given&nbsp;<strong>BST.</strong></span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= Number of nodes &lt;= 10<sup>5</sup><br>1 &lt;= Value of nodes&lt;= 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Samsung</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search Tree</code>&nbsp;<code>Data Structures</code>&nbsp;