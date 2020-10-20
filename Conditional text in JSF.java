<c:forEach var="title" items="#{playersBean.titles_2013}">
	<i>#{title}</i>,
</c:forEach>

/*
	Everything looks fine except the last comma, which should not appear since the US
	Open term is the last item to display. You can easily fix this issue with the EL ternary
	operator, as shown in the following code:
*/

<c:forEach var="title" items="#{playersBean.titles_2013}"
	varStatus="v">
	<i>#{title}</i>
	#{v.last ? '':','}
</c:forEach>

/*
	Sometimes you just need to show or hide text based on a condition. For this, you
	can place a Boolean expression as the value of the rendered attribute (all JSF UI
	components have this attribute). For example, the following line of code will output
	a player's Facebook address only if such an address exists:
*/

<h:outputText value="Facebook address: #{playersBean.facebook}"
rendered="#{!empty playersBean.facebook}" />

/*
	Another common situation is to display or hide non-HTML text using two buttons
	of type "Show something..." and "Hide something...". For example, you can have
	a button labeled Show Career Prize Money and one labeled Hide Career Prize
	Money. Obviously, you want to display the career prize money when the first button
	is clicked and to hide the career prize money when the second button is clicked. For
	this, you can use the rendered attribute, as shown in the following code:
*/

<h:form id="prizeFormId">
	<h:commandButton value="Show Career Prize Money">
	<f:ajax render="rnprizeid"
	listener="#{playersBean.showPrizeMoney()}"/>
	</h:commandButton>
	<h:panelGrid id="rnprizeid">
		<h:outputText value="#{playersBean.prize}"
		rendered="#{playersBean.show_prize}">
			<f:convertNumber type="currency" currencySymbol="$" />
		</h:outputText>
	</h:panelGrid>
	<h:commandButton value="Hide Career Prize Money">
	<f:ajax render="rnprizeid"
	listener="#{playersBean.hidePrizeMoney()}"/>
	</h:commandButton>
</h:form>

/*
Both the buttons use AJAX mechanism and an EL method expression to call the
showPrizeMoney and hidePrizeMoney methods. These methods just modify the
value of a boolean property, named show_prize , as shown in the following code:
*/

private boolean show_prize = false;
	...
	
public boolean isShow_prize() {
	return show_prize;
}
	...
	
public void showPrizeMoney(){
	this.show_prize = true;
}

public void hidePrizeMoney(){
	this.show_prize = false;	
}
