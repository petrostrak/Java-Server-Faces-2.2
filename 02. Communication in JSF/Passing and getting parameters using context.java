/*
	Context parameters are defined in the web.xml file using the <context-param>
	tag. This tag allows two important children: <param-name> , which indicates the
	parameter name, and <param-value> , which indicates the parameter value. For
	example, a user-defined context parameter looks like the following code:
*/

<context-param>
<param-name>number.one.in.ATP</param-name>
<param-value>Rafael Nadal</param-value>
</context-param>

/*
	Now, in a JSF page, you can access this parameter as shown in the following code:
*/
<h:outputText value="#{initParam['number.one.in.ATP']}"/>
<h:outputText value="#{facesContext.externalContext.
initParameterMap['number.one.in.ATP']}"/>

/*
	In a managed bean, the same context parameter can be accessed via the
	getInitParameter method:
*/

facesContext.getExternalContext().getInitParameter
("number.one.in.ATP");
