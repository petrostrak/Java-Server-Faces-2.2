/*
	Collection items (arrays, lists, maps, sets, and so on) can be accessed by 
	specifying a literal value that can be converted to an integeror the [] 
	notation with an integer and without quotes.
*/

private String[] titles_2013 = {"Sao Paulo", "Acapulco", "ATP World Tour Masters 1000 Indian Wells", "Barcelona", ...};
	...
public String[] getTitles_2013() {
	return titles_2013;
}

/*
	You can access the first title from the array by specifying its position in array,
	which is 0 :
	
	#{playersBean.titles_2013[0]}
	
	This is equivalent in Java to getting or setting the value for titles_2013[0] .
	
	To iterate over the array instead of accessing specific item
	
	<c:forEach begin="0"
		end="${fn:length(playersBean.titles_2013)-1}"
		var="i">
		#{playersBean.titles_2013[i]},
	</c:forEach>
	
	You can simplify it as shown in the following code:
	
	<c:forEach var="title" items="#{playersBean.titles_2013}">
		<i>#{title}</i>,
	</c:forEach>
	
	You can also use the <ui:repeat> tag as shown in the following code:
	<ui:repeat var="title" value="#{playersBean.titles_2013}">
		<i>#{title}</i>,
	</ui:repeat>
	
	In the case of collections of type key-value (for example, Map ), the EL expressions
	obtain items by key. For example, let's add a Map in PlayersBean that stores some
	match facts of a player. It can be defined as shown in the following code:
*/

private Map<String, String> matchfacts = new HashMap<>();
	...
	matchfacts.put("Aces", "12");
	matchfacts.put("Double Faults", "2");
	matchfacts.put("1st Serve", "70%");
...
public Map<String, String> getMatchfacts() {
	return matchfacts;
}
/*
	Now, an EL expression that accesses the item with the key Aces can be written like
	the following line of code:
	
	#{playersBean.matchfacts.Aces}

	When the key is not an acceptable variable name (for example, Double Faults ), you
	need to use brackets and quotes, as shown in the following code:
	
	#{playersBean.matchfacts["Double Faults"]}
*/
