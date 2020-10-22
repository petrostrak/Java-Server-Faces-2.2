/*
	Sometimes, you need to pass parameters from a Facelet to a managed bean or to
	another Facelet. In this case, you may need the <f:param> tag, which can be used
	to add query string name-value pairs to a request, or put simply, to send request
	parameters. Commonly, the <f:param> tag is used inside the <h:commandButton>
	and <h:commandLink> tags for sending request parameters to a managed bean.
	For example, the following snippet of code adds two parameters to the request
	when the form is submitted. These parameters are accessed in the PlayersBean
	bean; the first parameter is named playerNameParam and the second one is named
	playerSurnameParam .
*/
<h:form>
	Click to send name, 'Rafael' surname, 'Nadal', with f:param:
	<h:commandButton value="Send Rafael Nadal"
		action="#{playersBean.parametersAction()}">
	<f:param id="playerName" name="playerNameParam" value="Rafael"/>
	<f:param id="playerSurname" name="playerSurnameParam"
		value="Nadal"/>
	</h:commandButton>
</h:form>

...

public String parametersAction() {
	FacesContext fc = FacesContext.getCurrentInstance();
	Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
	playerName = params.get("playerNameParam");
	playerSurname = params.get("playerSurnameParam");
	return "some_page";
}

/*
	The values of both the parameters are stored in the playerName and playerSurname
	managed beans' properties
*/

Name: #{param.playerNameParam}
Surname: #{param.playerSurnameParam}

/*
	The <f:param> tag can also be used inside the <h:outputFormat> tag to substitute
	message parameters; <f:param> is used to pass parameters to a UI component as
	shown in the following code:
*/

<h:outputFormat value="Name: {0} Surname: {1}">
	<f:param value="#{playersBean.playerName}" />
	<f:param value="#{playersBean.playerSurname}" />
</h:outputFormat>

/*
	If you think that it is not a very convenient approach to access the request map in the
	managed bean, then you can use @ManagedProperty , which sets the parameter as a
	managed bean property and links its value to the request parameter:
*/

@ManagedProperty(value = "#{param.playerNameParam}")
private String playerName;
@ManagedProperty(value = "#{param.playerSurnameParam}")
private String playerSurname;

/*
	The values are set immediately after the bean's construction and are available during
	@PostConstruct , but keep in mind that @ManagedProperty is usable only with
	beans managed by JSF ( @ManagedBean ), not with beans managed by CDI ( @Named ).
*/

/*
	The <f:param> tag can be used to pass request parameters directly between Facelets,
	without involving a managed bean. Usually, this happens in the <h:link> tag, as
	shown in the following code:
*/

<h:link value="Send Rafael Nadal" outcome="result">
<f:param id="playerName" name="playerNameParam" value="Rafael"/>
<f:param id="playerSurname" name="playerSurnameParam"
value="Nadal"/>
</h:link>

/*
	When the Send Rafael Nadal link is clicked, JSF will use the prepared URL
	containing the result.xhtml file's resource name and the request parameters,
	playerNameParam and playerSurnameParam . Both the parameters are displayed
	in the result.xhtml file as follows:
*/

Name: #{param.playerNameParam}
Surname: #{param.playerSurnameParam}





































