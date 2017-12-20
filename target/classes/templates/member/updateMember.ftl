<@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
      <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Update your pesonal inforamtion</h3>
                  <p class="subtitle has-text-grey">Please edit your information.</p>
                  <form  commandName="memberData" action="/member/update" method="post">
                    <div class="field">
                        <div class="control">
                           <input path="firstName" class="input is-large" type="text" placeholder="First Name" autofocus="" />
                           <errors path="firstName" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="lastName" class="input is-large" type="text" placeholder="Surname" autofocus="">
                           <errors path="lastName" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="email" value="${name}" class="input is-large" type="email" placeholder="Your Email" autofocus="">
                           <errors path="email" class="help is-danger" />  

                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="favouriteSports" class="input is-large" type="text" placeholder="Fav. Sports" autofocus="">
                           <errors path="favouriteSports" class="help is-danger" />  

                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="dateOfBirth" class="input is-large" type="date" placeholder="Birth Date" autofocus="">
                           <errors path="dateOfBirth" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="phoneNumber" class="input is-large" type="tel" placeholder="Phone" autofocus="" maxlength="9">
                           <errors path="phoneNumber" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="Address.street" class="input is-large" type="text" placeholder="Address Streeet" autofocus="">
                           <errors path="Address.street" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="Address.cp" class="input is-large" type="number" placeholder="Address number" autofocus="">
                           <errors path="Address.cp" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="Address.city" class="input is-large" type="text" placeholder="City" autofocus="">
                           <errors path="Address.city" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="Address.postCode" class="input is-large" type="number" placeholder="Zip" maxlength="5">
                           <errors path="Address.postCode" class="help is-danger" />  
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input path="password" class="input is-large" type="password" placeholder="Your Password">
                           <errors path="password" class="help is-danger" />  
                        </div>
                     </div>
                     <a type="submit" class="button is-block is-info is-large">Edit information</a>
                  </form>
               </div>
            </div>
         </div>
      </section>
      </@layout.put>
</@layout.extends>