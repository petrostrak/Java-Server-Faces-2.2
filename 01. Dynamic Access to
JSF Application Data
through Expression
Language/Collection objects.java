# {nr_set = {1,2,3,4,5,6,7,8,9,10}}
# {nr_list = [1,2,3,4,5,6,7,8,9,10]}
# {nr_map = {"one":1,"two":2,"three":3,"four":4,"five":5,"six":6, "seven":7,"eight":8,"nine":9,"ten":10}}

/*
	Sort the list in ascending/descending order. For this,
	we use the stream , sorted (this is like the ORDER BY statement of SQL), and toList
	methods (the latter returns a List that contains the elements of the source stream),
	as shown in the following code:
*/

# {nr_list.stream().sorted((i,j)->i-j).toList()}
# { nr_list.stream().sorted((i,j)->j-i).toList()}

/*
	We can apply 24 percent of VAT and compute the total for costs higher than
	1,000 using the filter (this is like SQL's WHERE and GROUP BY statements), map (this
	is like SQL's SELECT statement), and reduce (this is like the aggregate functions)
	methods. These methods are used as follows:
*/

# {(lambdaBean.costBeforeVAT.stream().filter((cost)-> cost gt
1000).map((cost) -> cost + .24*cost)).reduce((sum, cost) ->
sum + cost).get()}
