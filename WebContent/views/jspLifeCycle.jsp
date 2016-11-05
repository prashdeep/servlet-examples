<HTML>
  <HEAD>
    <TITLE>Demonstrating jsp life cycle methods</TITLE>
  </HEAD>

  <BODY>
    <H1>Demonstrating jsp life cycle methods</H1>
    <%!
    String username;

    public void jspInit()
    {
    	username = "pradeep";
    }

    public void jspDestroy()
    {
    	username = null;
    }
    %>

    <%= "The username is " + username + "<BR>" %>
  </BODY>
</HTML>