<@layout.extends name="based.ftl">
    <@layout.put block="header" type="replace">
        <h2>Registrace</h2>
    </@layout.put>
    <@layout.put block="contents">
        <div align="center">
  <h1>Register Member</h1>
  <table>
<form>
  
  <tr>
  <td>Jmeno:</td>
  <td><s:input path="firstName"/></td>
  <td><s:errors path="firstName" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Prijmeni:</td>
  <td><s:input path="lastName"/></td>
  <td><s:errors path="lastName" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Email:</td>
  <td><s:input path="email"/></td>
  <td><s:errors path="email" cssStyle="color:red;" /></td>
  </tr>

  <tr>
  <td>Datum narozeni:</td>
  <td><s:input path="dateOfBirth"/></td>
  <td><s:errors path="dateOfBirth" cssStyle="color:red;" /></td>
  </tr>
  
  
  <tr>
  <td>Telefoni cislo:</td>
  <td><s:input path="phoneNumber"/></td>
  <td><s:errors path="phoneNumber" cssStyle="color:red;" /></td>
  </tr>
  
  
  
   <tr>
  <td>Oblibene sporty:</td>
  <td><s:input path="favouriteSports"/></td>
  <td><s:errors path="favouriteSports" cssStyle="color:red;" /></td>
  </tr>
  
  
    <tr>
  <td>Password:</td>
  <td><input path="password"/></td>
  <td><s:errors path="password" cssStyle="color:red;" /></td>
  </tr>
  
  <tr></tr>
  
  <tr><td style="background-color: orange">Adresa:</td></tr>
    <tr>
    
    <td>Ulice:</td>
  <td><s:input path="Address.street"/></td>
  <td><s:errors path="Address.street" cssStyle="color:red;" /></td>
  </tr>
  
  <td>Cislo popisne:</td>
  <td><s:input path="Address.cp"/></td>
  <td><s:errors path="Address.cp" cssStyle="color:red;" /></td>
  </tr>
    
  <td>Mesto:</td>
  <td><s:input path="Address.city"/></td>
  <td><s:errors path="Address.city" cssStyle="color:red;" /></td>
  </tr>
  
  <td>PSC:</td>
  <td><s:input path="Address.postCode"/></td>
  <td><s:errors path="Address.postCode" cssStyle="color:red;" /></td>
  </tr>
  
  <td></td>
  <td><input type="submit" value="Register"/></td>
  
  </form>
  
  
  
  </table>







</div>

        
    </@layout.put>
</@layout.extends>