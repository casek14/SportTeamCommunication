<#include "/navBarLogedIn.ftl" />

<@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
      <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Welcome on board</h3>
                  <p class="subtitle has-text-grey">Enjoy a movement!</p>               

                    <b>Name:</b> <p> ${member.firstName }</p>
                    <b>Surname:</b> <p>${member.lastName }</p>
                    <b>E-mail:</b> <p> ${member.email } </p>
                    <b>Birth date:</b> <p>${member.dateOfBirth } </p>
                    <b>Password:</b> <p>${member.password } </p>
                    <b>Fav. Sports:</b> <p>${member.favouriteSports }</p>
                    <b>Address:</b> <p>${member.address.street } - ${member.address.cp } </p>
                    <b>City, Zip:</b> <p>${member.address.city } - PSC: ${member.address.postCode }</p>
               </div>
            </div>
         </div>
      </section>
    </@layout.put>
</@layout.extends>